package stats_lol;

/*I will only comment things that are new in each class, 
90% of the comments in the "ChStatsGUI" can be used in all other classes */

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static stats_lol.CheckVersion.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Cristofer
 */

//This is the second GUI, here you chose witch stat you want to see
public class StatsGUI extends JFrame{
    
    JLabel lblTitle = new JLabel("Chose your option");
    JButton btnPlySts = new JButton("Players stats");
    JButton btnTeamSts = new JButton("Teams stats");
    JButton btnChSts = new JButton("Champions stats");
    JButton btnTable = new JButton("Score table");
    
    String[] toolTipText = {"Opens a table with all players stats",
                            "Opens a table with all teams stats",
                            "Opens a table with all champion stats",
                            "Opens the score table"};
    
    Container cp = getContentPane();
    
    public StatsGUI(){
        
        btnPlySts.setToolTipText(toolTipText[0]);
        btnTeamSts.setToolTipText(toolTipText[1]);
        btnChSts.setToolTipText(toolTipText[2]);
        btnTable.setToolTipText(toolTipText[3]);
        
        setTitle("LoL Stats Maker " + version);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setSize(300, 250);
        setLocationRelativeTo(null);
        
        cp.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.PAGE_START;
        c.insets = new Insets(8, 8, 8, 8);
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        cp.add(lblTitle, c);
        
        c.gridy = 1;
        c.anchor = GridBagConstraints.CENTER;
        
        cp.add(btnPlySts, c);
        
        c.gridy = 2;
        
        cp.add(btnTeamSts, c);
        
        c.gridy = 3;
        
        cp.add(btnChSts, c);
        
        c.gridy = 4;
        
        cp.add(btnTable, c);
        
        btnPlySts.addActionListener((ActionEvent e) -> {
            PlyStatsGUI plyStatsGUI = new PlyStatsGUI(); //Opens the player table
        });
        
        btnTeamSts.addActionListener((ActionEvent e) -> {
            TeamStatsGUI teamStatsGUI = new TeamStatsGUI(); //Opens the teams table
        });
        
        btnChSts.addActionListener((ActionEvent e) -> {
            ChStatsGUI chStatsGUI = new ChStatsGUI(); //Opens the champion table
        });
        
        btnTable.addActionListener((ActionEvent e) -> {
            ScoreTableGUI scoreTableGUI = new ScoreTableGUI(); //Opens the player table
        });
    }
}