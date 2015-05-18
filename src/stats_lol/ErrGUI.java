package stats_lol;

/*I will only comment things that are new in each class, 
90% of the comments in the "chStatsGUI" can be used in all other classes */

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static stats_lol.CheckVersion.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Cristofer
 */

//This GUI is called if the teams selected in the insMTGUI are equal

public class ErrGUI extends JFrame{
    
    JLabel lblErr = new JLabel("Same teams, select different teams"); //Sets the label and the content on it
    
    Container cp = getContentPane();
    
    public ErrGUI(){
        
        setTitle("LoL Stats Maker " + version);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setSize(400, 150);
        setLocationRelativeTo(null);
        
        cp.setLayout(new GridBagLayout());
        
        GridBagConstraints c = new GridBagConstraints();
        
        c.anchor = GridBagConstraints.NORTHWEST;
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        
        cp.add(lblErr, c);
        
        pack();
    }
}