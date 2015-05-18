package stats_lol;

/*I will only comment things that are new in each class, 
90% of the comments in the "chStatsGUI" can be used in all other classes */

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

//GUI called when the user finishes putting data
public class FinGUI extends JFrame {
    
    JLabel lblFin = new JLabel("Match added successfuly");
    JButton btnFin = new JButton("Finish");
        
    Container cp = getContentPane();
    
    ReadWrite rw = new ReadWrite();
    
    public FinGUI(int d, int a, int b) {
        
        setTitle("LoL Stats Maker " + version);
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
        
        btnFin.addActionListener((ActionEvent e) -> {
            
            if(d == -1){
                
                System.out.println("red");
                rw.readWrite(true, 1, b, 7, 3);//red
            }
            
            else if(d == -2){
                
                System.out.println("tie");
                rw.readWrite(true, 1, a, 7, 1);//tie
                rw.readWrite(true, 1, a, 8, 1);
                rw.readWrite(true, 1, b, 7, 1);
                rw.readWrite(true, 1, b, 8, 1);
            }
            
            else if(d == 3){
                
                System.out.println("blue");
                rw.readWrite(true, 1, a, 7, 3);//blue
            }
            
            else if(d == 4){
                
                System.out.println("tie");
                rw.readWrite(true, 1, a, 7, 1);//tie
                rw.readWrite(true, 1, a, 8, 1);
                rw.readWrite(true, 1, b, 7, 1);
                rw.readWrite(true, 1, b, 8, 1);
            }
            dispose(); //Closes the actual GUI
        });
    }
}