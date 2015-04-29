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
    
    Stats_lol tm = new Stats_lol();
    
    String[] columnNames =  {"Team",
                        "Averge turrets",
                        "Averge dragons",
                        "Averge Barons",
                        "Averge match time",
                        "Win ratio",};
        Object[][] data = {
    {tm.team1, 5,
     3, 1, 35, 70},
    {tm.team2, 5,
     3, 1, 35, 70},
    {tm.team3, 5,
     3, 1, 35, 70},
    {tm.team4, 5,
     3, 1, 35, 70},
    {tm.team5, 5,
     3, 1, 35, 70},
    {tm.team6, 5,
     3, 1, 35, 70},
    {tm.team7, 5,
     3, 1, 35, 70},
    {tm.team8, 5,
     3, 1, 35, 70},
};
    
    JTable tblTeam = new JTable(data, columnNames);
    
    Container cp = getContentPane();
    
    public teamStatsGUI(){
        
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
