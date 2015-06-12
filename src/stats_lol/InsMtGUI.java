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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static stats_lol.Stats_lol.*;
import static stats_lol.CheckVersion.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Cristofer
 */

//First GUI to insert new game. Select the teams.
public class InsMtGUI extends JFrame{
    
    int blueIn;
    int redIn;
    
    ReadWrite rw = new ReadWrite();
    ClearData cl = new ClearData();
    
    JLabel lblBlue = new JLabel("Blue side:");
    JLabel lblRed = new JLabel("Red side:");
    JComboBox blue = new JComboBox<>(team); //Creates a combobox (aka dropbox) with the team String (from the main class)
    JComboBox red = new JComboBox<>(team); //Above
    JButton btnNext = new JButton("Next");
    
    Container cp = getContentPane();
    
    public InsMtGUI(int d){
        
        try {
            cl.clearData(tmp);
        } catch (IOException | URISyntaxException ex) {}
       
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
        cp.add(lblBlue, c);
        
        c.gridx = 1;
        c.anchor = GridBagConstraints.EAST;
        
        cp.add(blue, c);
        
        c.anchor = GridBagConstraints.NORTHWEST;
        
        c.gridy = 1;
        c.gridx = 0;
        
        cp.add(lblRed, c);
        
        c.anchor = GridBagConstraints.EAST;
        c.gridx = 1;
        
        cp.add(red, c);
        
        c.anchor = GridBagConstraints.EAST;
        c.gridx = 2;
        c.gridy = 2;
        
        cp.add(btnNext, c);
        
        pack();
        
        btnNext.addActionListener((ActionEvent e) -> {
            
            blueIn = blue.getSelectedIndex();
            redIn = red.getSelectedIndex();
            
            if(blueIn != redIn){ //If the teams selected are different
                
                for(int i = 0; i < 8; i++){
                    try{
                        if(blueIn == i){
                            rw.tmpReadWrite(1, i, 1, 2);
                        }
                    
                        else if(redIn == i){
                            rw.tmpReadWrite(1, i, 1, 2);
                        }
                    }catch(IOException ex){}
                }
                
                dispose();
                int par[] = {d, blueIn, redIn};
                rw.tmpSetStage(1, par);
                InsIDGUI insIDGUI = new InsIDGUI(d, blueIn, redIn); //Sends the index to the next class
            }
            
            else{
                JOptionPane.showMessageDialog(cp, "Same teams, select different teams", "Error", JOptionPane.OK_OPTION);
            }
        });
    }
}