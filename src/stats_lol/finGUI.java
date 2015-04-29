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

//GUI called when the user finishes putting data
public class finGUI extends JFrame {
    
    JLabel lblFin = new JLabel("Match added successfuly");
    JButton btnFin = new JButton("Finish");
        
    Container cp = getContentPane();
    
    public finGUI() {
       checkVersion checkVersion = new checkVersion();
        
        setTitle("LoL Stats Maker " + checkVersion.version);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setSize(300, 100);
        setLocationRelativeTo(null);
        
        cp.setLayout(new GridBagLayout());
        
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.NORTH;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        
        cp.add(lblFin, c);
        
        c.gridy = 1;
        
        cp.add(btnFin, c);
        
        btnFin.addActionListener(new ActionListener() { //"Listens" to the button click

            @Override
            public void actionPerformed(ActionEvent e) {              
                dispose(); //Closes the actual GUI
               
            }
        });
    
    }
    
}
