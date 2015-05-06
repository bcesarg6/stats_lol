package stats_lol;

import java.awt.Container; //Imports the container that the GUI is in
import java.awt.GridBagConstraints; //The constrains of the conatainer
import java.awt.GridBagLayout; //The layout of the container
import java.awt.Insets; //Spacements
import javax.swing.JFrame; //The frame
import javax.swing.JScrollPane;
import javax.swing.JTable; //Table
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE; //Imports the class that closes the program when you hit the "x"

/**
 *
 * @author Cristofer
 */

//Table with the champion stats
public class chStatsGUI extends JFrame{
    
    Object data[][];
    
    Stats_lol ch = new Stats_lol(); //Takes the Stats_lol variables
    
    String[] columnNames =  {"champion",//Set the column Names
                        "pick %", 
                        "ban %",
                        "win ratio",
                        "lose ratio",};
    
    Container cp = getContentPane(); //Calls the container
    
    public chStatsGUI(){
                
        data = new Object[124][5];
                                        //Set the content of each column in respective order
        for(int i = 0; i < 124; i++){
            for(int j = 0; j < 5; j++){
                if(j == 0){
                    data[i][j] = ch.champion[i];
                }
                else if(j == 1){
                    data[i][j] = 35;
                }
                else if(j == 2){
                    data[i][j] = 10;
                }
                else if(j == 3){
                    data[i][j] = 70;
                }
                else if(j == 4){
                    data[i][j] = 30;
                }
            }
        }
        
        JTable tblPly = new JTable(data, columnNames); //Calls the table
        
        tblPly.setEnabled(false); //You can't edit the cells (false)
        
        JScrollPane scroll = new JScrollPane(tblPly); //Puts the table inside of a scroll panel
             
        checkVersion checkVersion = new checkVersion(); //To use the version variable
        
        setTitle("LoL Stats Maker " + checkVersion.version); //Sets the tile off the frame in case "LoL Stats Maker #.##"
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); //Closes the frame if hit the "x"
        setVisible(true); //Now you can see the GUI
        setSize(200, 200); //Inicial size
        setLocationRelativeTo(null); //Opens in the center of the screen
        
        cp.setLayout(new GridBagLayout()); //Sets the layout of the frame
        
        GridBagConstraints c = new GridBagConstraints();
        
        c.anchor = GridBagConstraints.CENTER;
        c.insets = new Insets(0, 10, 0, 10); //The distance between each thing inside the frame
        c.gridx = 0; 
        c.gridy = 0;
        c.gridwidth = 0;
        
        cp.add(tblPly.getTableHeader()); //Adds the table inside the frame
        
        c.insets = new Insets(0, 10, 10, 10);
        c.gridy = 1;
        
        cp.add(scroll, c); //With "c" restrictions
        
        pack(); //Resizes the frame to the necessary size to the necessary size           
    }
}