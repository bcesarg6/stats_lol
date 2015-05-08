package stats_lol;

/*I will only comment things that are new in each class, 
90% of the comments in the "chStatsGUI" can be used in all other classes */

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Cristofer
 */

//This is the first GUI of the program, here you chose between seeing stats or inserting new data
public class inicialGUI extends JFrame{
           
    JLabel lblTitle = new JLabel("Select your option");
    JButton btnStats = new JButton("See stats");
    JButton btnInsMt = new JButton("Insert new match");
    JButton btnClear = new JButton("Clear all data");
    
    Container cp = getContentPane();
    
    public inicialGUI(){
        
        checkVersion checkVersion = new checkVersion();
        
        setTitle("LoL Stats Maker " + checkVersion.version);
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
        
        btnStats.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               new statsGUI(); //Opens the statsGUI if clicked
            }
        });
        btnInsMt.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new insMtGUI(0);
            }
        });
        btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ClearData cD = new ClearData();
                try {
                    cD.clearData();
                } catch (IOException | URISyntaxException ex) {}
                dispose();
            }
        });
    }
}
