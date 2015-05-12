package stats_lol;

/*I will only comment things that are new in each class, 
90% of the comments in the "chStatsGUI" can be used in all other classes */

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Cristofer
 */

//This is the second GUI, here you chose witch stat you want to see
public class statsGUI extends JFrame{
    
    JLabel lblTitle = new JLabel("Chose your option");
    JButton btnPlySts = new JButton("Players stats");
    JButton btnTeamSts = new JButton("Teams stats");
    JButton btnChSts = new JButton("Champions stats");
    JButton btnTable = new JButton("Score table");
    
    Container cp = getContentPane();
    
    public statsGUI(){
        checkVersion checkVersion = new checkVersion();
        
        setTitle("LoL Stats Maker " + checkVersion.version);
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
        
        btnPlySts.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                new plyStatsGUI(); //Opens the player table
               
                }
        });
        btnTeamSts.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                new teamStatsGUI(); //Opens the teams table
               
                }
        });
        btnChSts.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                new chStatsGUI(); //Opens the champion table
               
                }
        });
        btnTable.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                new ScoreTableGUI(); //Opens the player table
               
                }
        });
    }
}
