package stats_lol;

/*I will only comment things that are new in each class, 
90% of the comments in the "chStatsGUI" can be used in all other classes */

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import static stats_lol.Stats_lol.*;
import static stats_lol.CheckVersion.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Cristofer
 */

//Here is the second GUI called to insert new game, the user puts the bans, winner side and match time
public class InsIDGUI extends JFrame{
    
    ReadWrite rw = new ReadWrite();
    
    public String ban[], nB, mtT, w1;
    int mtt, t;
    int h = 0;
    
    JLabel lblBans = new JLabel("       Bans        "); //Spacement required to put things in the middle
    JLabel lblWin = new JLabel("Winner side");
    JLabel lblTmp = new JLabel("Match time");
    JLabel lbl = new JLabel("                        ");//See above
    JTextField txtBan[];
    JTextField txtTmp = new JTextField();
    JRadioButton rbtBlue = new JRadioButton(sideB);
    JRadioButton rbtRed = new JRadioButton(sideR);
    ButtonGroup  btgWin = new ButtonGroup(); //This putts the radio buttons inside one thing so they can be used at the same time
    JButton btnNext = new JButton("Next");    
    
    final String toolTipText(int a, int b, int i){
        String[] txt = {"Champion banned in the match "+team[a]+" vs "+team[b],
                        "Select if team "+team[a]+" won",
                        "Select if team "+team[b]+" won",
                        "Time of the match"};
        return txt[i];
    }
    
    Container cp = getContentPane();
    
    public InsIDGUI(int d, int a, int b){ //Recieves the dropboxes index
        
        t = d;
        
        txtBan = new JTextField[6];
        ban = new String[6];
        
        for(int i = 0; i < txtBan.length; i++){
            txtBan[i] = new JTextField();
            txtBan[i].setToolTipText(toolTipText(a, b, 0));
        }
        
        txtTmp.setToolTipText(toolTipText(a, b, 3));
                      
        btgWin.add(rbtBlue); //Puts the radio button blue insede the buttongroup
        btgWin.add(rbtRed); //Same as above gut the red
        
        rbtBlue.setActionCommand(sideB);
        rbtBlue.setToolTipText(toolTipText(a, b, 1));
        rbtRed.setActionCommand(sideR);
        rbtRed.setToolTipText(toolTipText(a, b, 2));
        
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
        
        
        for(int i = 0; i < txtBan.length; i++){
            c.gridx = i < 3 ? i : (i-3);
            c.gridy = i < 3 ? 1 : 2;
            cp.add(txtBan[i], c);
        }
        
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
            
            for(int i = 0; i < ban.length; i++){
                ban[i] = txtBan[i].getText();
            }
            
            mtT = txtTmp.getText();
            mtt = Integer.parseInt(mtT);
            try{
                for(int i = 0; i < 124; i++){
                    for(int j = 0; j < 6; j++){
                    
                        if(ban[j].equals(champion[i])){
                            rw.tmpReadWrite(2, i, 1, 1);
                        }
                    }
                }
                switch (w1) {
                    case "Blue":
                        t++;
                        h++;
                        rw.tmpReadWrite(1, a, 2, 1);
                        rw.tmpReadWrite(1, a, 3, mtt);
                        rw.tmpReadWrite(1, b, 3, mtt);
                        break;
                    case "Red":
                        rw.tmpReadWrite(1, b, 2, 1);
                        rw.tmpReadWrite(1, a, 3, mtt);
                        rw.tmpReadWrite(1, b, 3, mtt);
                        break;
                }
                int par[] = {t, a, b, h};
                rw.tmpSetStage(2, par);
            }catch(IOException ex){}
            InsBDGUI insBDGUI = new InsBDGUI(t, a, b, h); //Drpoboxes index needed to the next class
            
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