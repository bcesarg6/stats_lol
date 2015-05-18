package stats_lol;

import java.awt.Container; //Imports the container that the GUI is in
import java.awt.GridBagConstraints; //The constrains of the conatainer
import java.awt.GridBagLayout; //The layout of the container
import java.awt.Insets; //Spacements
import javax.swing.JButton;
import javax.swing.JFrame; //The frame
import javax.swing.JScrollPane;
import javax.swing.JTable; //Table
import static stats_lol.Stats_lol.*;
import static stats_lol.CheckVersion.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE; //Imports the class that closes the program when you hit the "x"
import javax.swing.table.TableColumn;

/**
 *
 * @author Cristofer
 */

//Table with the champion stats
public class ChStatsGUI extends JFrame{
    
    ReadWrite rw = new ReadWrite();
    RowSorter rs = new RowSorter();
    
    Object data[][], v[];
    double[] pr, br, wr, p, b, w, g;
    int tGames;
    String[] columnNames =  {"champion",//Set the column Names
                        "pick %", 
                        "ban %",
                        "win ratio",};
    
    Container cp = getContentPane(); //Calls the container
    
    public ChStatsGUI(){
        
        JButton[] btn;
        TableColumn[] tc;
        JTable tblCh;
        
        v = new Object[columnNames.length];
        
        v[0] = champion;
        v[1] = pr = new double[124];
        v[2] = br = new double[124];
        v[3] = wr = new double[124];
        b = new double[124];
        p = new double[124];
        w = new double[124];
        g = new double[124];
        
        data = new Object[124][4];
        
        btn = new JButton[v.length];
        tc = new TableColumn[v.length];
        
        for(int i = 0; i< v.length; i++){
            btn[i] = new JButton(columnNames[i]);
        }
        
        //this part reads the data of the archives and make the calcs to show the stats
        for(int i = 0; i < 8; i++){
            rw.readWrite(false, 1, i, 1, 0);
            tGames += Integer.parseInt(rw.rl);
        }
        
        if(tGames == 0){
            tGames = 2;
        }
        
        tGames = tGames/2;
        
        for(int i = 0; i < 124; i++){
            rw.readWrite(false, 2, i, 2, 0);
            p[i] = Integer.parseInt(rw.rl);
            rw.readWrite(false, 2, i, 1, 0);
            b[i] = Integer.parseInt(rw.rl);
            rw.readWrite(false, 2, i, 3, 0);
            w[i] = Integer.parseInt(rw.rl);
            g[i] = p[i];
            if(g[i] == 0){
                g[i] = 1;
            }
        }
        
        for(int i = 0; i < 124; i++){
            pr[i] = 100*(p[i]/tGames);
            br[i] = 100*(b[i]/tGames);
            wr[i] = 100*(w[i]/g[i]);
        }
                                        //Set the content of each column in respective order
        for(int i = 0; i < 124; i++){
            for(int j = 0; j < 4; j++){
                if(j == 0){
                    data[i][j] = champion[i];
                }
                else if(j == 1){
                    data[i][j] = pr[i];
                }
                else if(j == 2){
                    data[i][j] = br[i];
                }
                else if(j == 3){
                    data[i][j] = wr[i];
                }
            }
        }
        
        tblCh = new JTable(data, columnNames); //Calls the table
        
        for(int i = 1; i < (v.length); i++){
            tc[i] = tblCh.getColumnModel().getColumn(i);
            tc[i].setHeaderRenderer(new EditableHeaderRenderer(btn[i], (double[])v[i], (double[])v[2], tblCh));               
        }
        
        for (int c = 0; c < tblCh.getColumnCount(); c++){
            Class<?> col_class = tblCh.getColumnClass(c);
            tblCh.setDefaultEditor(col_class, null);        // remove editor
        }
        
        JScrollPane scroll = new JScrollPane(tblCh); //Puts the table inside of a scroll panel
        
        setTitle("LoL Stats Maker " + version); //Sets the tile off the frame in case "LoL Stats Maker #.##"
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); //Closes the frame if hit the "x"
        setVisible(true); //Now you can see the GUI
        setSize(500, 500); //Inicial size
        setLocationRelativeTo(null); //Opens in the center of the screen
        
        cp.setLayout(new GridBagLayout()); //Sets the layout of the frame
        
        GridBagConstraints c = new GridBagConstraints();
        
        c.anchor = GridBagConstraints.CENTER;
        c.insets = new Insets(0, 10, 0, 10); //The distance between each thing inside the frame
        c.gridx = 0; 
        c.gridy = 0;
        c.gridwidth = 0;
        
        cp.add(tblCh.getTableHeader()); //Adds the table inside the frame
        
        c.insets = new Insets(0, 10, 10, 10);
        c.gridy = 1;
        
        cp.add(scroll, c); //With "c" restrictions
        
        pack(); //Resizes the frame to the necessary size to the necessary size           
    }
}