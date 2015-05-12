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
    
    ReadWrite rw = new ReadWrite();
    
    public int t, r, s;
    
    public finGUI(int d, int a, int b) {
        t = d;
        r = a;
        s = b;
        
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
                if(t == -1){
                    System.out.println("red");
                    rw.readWrite(true, -1, s);//red
                    rw.readWrite(true, -3, r);
                }
                else if(t == -2){
                    System.out.println("tie");
                    rw.readWrite(true, -2, s);//tie
                    rw.readWrite(true, -2, r);
                    rw.readWrite(true, 12, s);
                    rw.readWrite(true, 12, r);
                }
                else if(t == 3){
                    System.out.println("blue");
                    rw.readWrite(true, -1, r);//blue
                    rw.readWrite(true, -3, s);
                }
                else if(t == 4){
                    System.out.println("tie");
                    rw.readWrite(true, -2, s);//tie
                    rw.readWrite(true, -2, r);
                    rw.readWrite(true, 12, s);
                    rw.readWrite(true, 12, r);
                }
                dispose(); //Closes the actual GUI
               
            }
        });
    
    }
    
}
