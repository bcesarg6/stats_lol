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
import static stats_lol.Stats_lol.tmp;
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
    
    public FinGUI(int d, int a, int b){
        
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
            try{
                if(d == -1){

                    rw.tmpReadWrite(1, b, 7, 3);//red
                
                }
            
                else if(d == -2){

                    rw.tmpReadWrite(1, a, 7, 1);//tie
                    rw.tmpReadWrite(1, a, 8, 1);
                    rw.tmpReadWrite(1, b, 7, 1);
                    rw.tmpReadWrite(1, b, 8, 1);
                
                }
            
                else if(d == 3){
                    
                    rw.tmpReadWrite(1, a, 7, 3);//blue
                
                }
            
                else if(d == 4){
                    
                    rw.tmpReadWrite(1, a, 7, 1);//tie
                    rw.tmpReadWrite(1, a, 8, 1);
                    rw.tmpReadWrite(1, b, 7, 1);
                    rw.tmpReadWrite(1, b, 8, 1);
                
                }
                rw.tmpToReal();

                ClearData cl = new ClearData();
                cl.clearData(tmp);
            
                dispose(); //Closes the actual GUI
            }catch(IOException | URISyntaxException ex){System.out.println(ex);}
        });
    }
}