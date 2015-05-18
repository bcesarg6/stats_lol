package stats_lol;

/*I will only comment things that are new in each class, 
90% of the comments in the "chStatsGUI" can be used in all other classes */

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static stats_lol.CheckVersion.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Cristofer
 */

//This is the first GUI of the program, here you chose between seeing stats or inserting new data
public class InicialGUI extends JFrame{
           
    JLabel lblTitle = new JLabel("Select your option");
    JButton btnStats = new JButton("See stats");
    JButton btnInsMt = new JButton("Insert new match");
    JButton btnClear = new JButton("Clear all data");
    
    Container cp = getContentPane();
    
    public InicialGUI(){
        
        setTitle("LoL Stats Maker " + version);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setSize(300, 200);
        setLocationRelativeTo(null);
        
        cp.setLayout(new GridBagLayout());
        
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.PAGE_START;
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        cp.add(lblTitle, c);
        
        c.gridy = 1;
        c.anchor = GridBagConstraints.CENTER;
        
        cp.add(btnStats, c);
        
        c.gridy = 2;
        
        cp.add(btnInsMt, c);
        
        c.gridy = 3;
        
        cp.add(btnClear, c);
        
        btnStats.addActionListener((ActionEvent e) -> {
            
            StatsGUI statsGUI = new StatsGUI(); //Opens the StatsGUI if clicked
            
        });
        
        btnInsMt.addActionListener((ActionEvent e) -> {
            
            InsMtGUI insMtGUI = new InsMtGUI(0);
            
        });
        
        btnClear.addActionListener((ActionEvent e) -> {
            int r = 1;
            ClearData cD = new ClearData();
            
            try {
                r = cD.clearData();
            } 
            catch (IOException | URISyntaxException ex) {}
            if(r == 0){
                dispose();
            }
        });
    }
}