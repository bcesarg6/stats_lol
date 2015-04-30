package stats_lol;

/*I will only comment things that are new in each class, 
90% of the comments in the "chStatsGUI" can be used in all other classes */

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JTable;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Cristofer
 */

//Teams stats GUI
public class teamStatsGUI extends JFrame {
    
    Object data[][];
    
    Stats_lol tm = new Stats_lol();
    
    String[] columnNames =  {"Team",
                        "Averge turrets",
                        "Averge dragons",
                        "Averge Barons",
                        "Averge match time",
                        "Win ratio",};
    
    Container cp = getContentPane();
    
    public teamStatsGUI(){
        
        data = new Object[8][6];
                                        //Set the content of each column in respective order (not done yet)
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 6; j++){
                if(j == 0){
                    data[i][j] = tm.team[i];
                }
                else if(j == 1){
                    data[i][j] = 5;
                }
                else if(j == 2){
                    data[i][j] = 3;
                }
                else if(j == 3){
                    data[i][j] = 1;
                }
                else if(j == 4){
                    data[i][j] = 35;
                }
                else if(j == 5){
                    data[i][j] = 60;                  
                }
            }
        }
        
        JTable tblTeam = new JTable(data, columnNames);
        
        tblTeam.setEnabled(false);
             
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
        
        cp.add(tblTeam.getTableHeader());
        
        c.insets = new Insets(0, 10, 10, 10);
        c.gridy = 1;
        
        cp.add(tblTeam, c);
        
        pack();
        
     
    }
}
