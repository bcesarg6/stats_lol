package stats_lol;

/*I will only comment things that are new in each class, 
90% of the comments in the "chStatsGUI" can be used in all other classes */

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Crisofer
 */

//Player stats table
public class plyStatsGUI extends JFrame {
    
    Object data[][];
    
    Stats_lol pl  = new Stats_lol();
    
    String[] columnNames =  {"Player",
                        "KDA",
                        "Averge farm",
                        "Farm per minute",
                        "Gold",
                        "Gold per minute",
                        "kill participation",};
    
    Container cp = getContentPane();
    
    public plyStatsGUI(){
        
         data = new Object[40][7];
                                        
        for(int i = 0; i < 40; i++){
            for(int j = 0; j < 7; j++){
                if(j == 0){
                    data[i][j] = pl.player[i];
                }
                else if(j == 1){
                    data[i][j] = 5;
                }
                else if(j == 2){
                    data[i][j] = 234;
                }
                else if(j == 3){
                    data[i][j] = 12;
                }
                else if(j == 4){
                    data[i][j] = 13.4;
                }
                else if(j == 5){
                    data[i][j] = 250;                  
                }
                else if(j == 6){
                    data[i][j] = 75;                   
                }
            }
        }
        
        JTable tblPly = new JTable(data, columnNames);
        
        JScrollPane scroll = new JScrollPane(tblPly);
        
        tblPly.setEnabled(false);
             
        checkVersion checkVersion = new checkVersion();
        
        setTitle("LoL Stats Maker " + checkVersion.version);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setSize(200, 200);
        setLocationRelativeTo(null);
        
        cp.setLayout(new GridBagLayout());
        
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.CENTER;
        c.insets = new Insets(0, 10, 0, 10);
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 0;
        
        cp.add(tblPly.getTableHeader());
        
        c.insets = new Insets(0, 10, 10, 10);
        c.gridy = 1;
        
        cp.add(scroll, c);
        
        pack();       
     
    }
}
//Nothing new to comment here