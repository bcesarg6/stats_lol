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
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import static stats_lol.Stats_lol.*;
import static stats_lol.checkVersion.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Cristofer
 */

//Here is the second GUI called to insert new game, the user puts the bans, winner side and match time
public class insIDGUI extends JFrame{
    
    ReadWrite rw = new ReadWrite();
    
    public String ban1, ban2, ban3, ban4, ban5, ban6, nB, mtT, w1;
    int mtt, i, t;
    int h = 0;
    JLabel lblBans = new JLabel("       Bans        "); //Spacement required to put things in the middle
    JLabel lblWin = new JLabel("Winner side");
    JLabel lblTmp = new JLabel("Match time");
    JLabel lbl = new JLabel("                        ");//See above
    JTextField txtBan1 = new JTextField();
    JTextField txtBan2 = new JTextField();
    JTextField txtBan3 = new JTextField();
    JTextField txtBan4 = new JTextField();
    JTextField txtBan5 = new JTextField();
    JTextField txtBan6 = new JTextField();
    JTextField txtTmp = new JTextField();
    JRadioButton rbtBlue = new JRadioButton(sideB);
    JRadioButton rbtRed = new JRadioButton(sideR);
    ButtonGroup  btgWin = new ButtonGroup(); //This putts the radio buttons inside one thing so they can be used at the same time
    JButton btnNext = new JButton("Next");    
    
    Container cp = getContentPane();
    
    public insIDGUI(int d, int a, int b){ //Recieves the dropboxes index
        
        t = d;
                      
        btgWin.add(rbtBlue); //Puts the radio button blue insede the buttongroup
        btgWin.add(rbtRed); //Same as above gut the red
        
        rbtBlue.setActionCommand(sideB);
        rbtRed.setActionCommand(sideR);
        
        setTitle("LoL Stats Maker " + version);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setSize(400, 150);
        setLocationRelativeTo(null);
        
        cp.setLayout(new GridBagLayout());
        
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.NORTH;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 1;
        
        cp.add(lblBans, c);
        
        c.gridx = 2;
        
        cp.add(lbl);
        
        c.gridx = 3;
        
        cp.add(lblWin, c);
        
        c.gridx = 0;
        c.gridy = 1;
        
        cp.add(txtBan1, c);
        
        c.gridx = 1;
        
        cp.add(txtBan2, c);
        
        c.gridx = 2;
        
        cp.add(txtBan3, c);
        
        c.gridx = 0;
        c.gridy = 2;
        
        cp.add(txtBan4, c);
        
        c.gridx = 1;
        
        cp.add(txtBan5, c);
        
        c.gridx = 2;
        
        cp.add(txtBan6, c);
        
        c.gridx = 3;
        c.gridy = 1;
        c.gridwidth = 1;
        
        cp.add(rbtBlue, c);
        
        c.gridy = 2;
        
        cp.add(rbtRed, c);
        
        c.gridx = 0;
        c.gridy = 3;
        
        cp.add(lblTmp, c);
        
        c.gridx = 1;
        
        cp.add(txtTmp, c);
        
        c.gridx = 3;
        c.gridwidth = 1;
        
        cp.add(btnNext, c);
        
        pack();
        
        btnNext.addActionListener((ActionEvent e) -> {
            
            ban1 = txtBan1.getText();
            ban2 = txtBan2.getText();
            ban3 = txtBan3.getText();
            ban4 = txtBan4.getText();
            ban5 = txtBan5.getText();
            ban6 = txtBan6.getText();
            
            mtT = txtTmp.getText();
            mtt = Integer.parseInt(mtT);
            
            for(i = 0; i < 124; i++){
                
                if(ban1.equals(champion[i])){
                    rw.readWrite(true, 2, i, 1, 1);
                }
                else if(ban2.equals(champion[i])){
                    rw.readWrite(true, 2, i, 1, 1);
                }
                else if(ban3.equals(champion[i])){
                    rw.readWrite(true, 2, i, 1, 1);
                }
                else if(ban4.equals(champion[i])){
                    rw.readWrite(true, 2, i, 1, 1);
                }
                else if(ban5.equals(champion[i])){
                    rw.readWrite(true, 2, i, 1, 1);
                }
                else if(ban6.equals(champion[i])){
                    rw.readWrite(true, 2, i, 1, 1);
                }
            }
            
            switch (w1) {
                case "Blue":
                    t++;
                    h++;
                    rw.readWrite(true, 1, a, 2, 1);
                    rw.readWrite(true, 1, a, 3, mtt);
                    rw.readWrite(true, 1, b, 3, mtt);
                    break;
                case "Red":
                    rw.readWrite(true, 1, b, 2, 1);
                    rw.readWrite(true, 1, a, 3, mtt);
                    rw.readWrite(true, 1, b, 3, mtt);
                    break;
            }
            
            insBDGUI insBDGUI = new insBDGUI(t, a, b, h); //Drpoboxes index needed to the next class
            
            dispose();
        });
        
        rbtBlue.addActionListener((ActionEvent e) -> {
            
            w1 = e.getActionCommand();     
        });
        
        rbtRed.addActionListener((ActionEvent e) -> {
            
            w1 = e.getActionCommand();
        });
    }   
}