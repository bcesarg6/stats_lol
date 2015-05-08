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
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Cristofer
 */

/*Here the user inserts the red side data (after the blue data). 
(The code here is almost the same as in the insBDGUI, just a few chages (commented))*/
public class insRDGUI extends JFrame{
    
    int i = 0;
    int tr, dr, br;
    public String[] ch, kl, as, dt, cr, gl;
    
    Stats_lol pl = new Stats_lol();
    ReadWrite rw = new ReadWrite();
    
    public JLabel[] lblPlayer;
    public JTextField[] txtChamp, txtKill, txtAssist, txtDeath, txtCreep, txtGold;
   
    JLabel lblTitle = new JLabel("Red side"); //Other side
    JLabel lblPlayers = new JLabel("Player");
    JLabel lblTurret = new JLabel("Turrets:");
    JLabel lblDrag = new JLabel("Dragons:");
    JLabel lblBaron = new JLabel("Barons:");
    JLabel lblChamp = new JLabel("Champion");
    JLabel lblKill = new JLabel("Kills");
    JLabel lblAssist = new JLabel("Assists");
    JLabel lblDeath = new JLabel("Deaths");
    JLabel lblCreep = new JLabel("Creeps");
    JLabel lblGold = new JLabel("Gold");
    
    JTextField txtTurret = new JTextField();
    JTextField txtDrag = new JTextField();
    JTextField txtBaron = new JTextField();
    JButton btnNext = new JButton("Next");
    
    Container cp = getContentPane();
    public int t, r, s;
    
    public insRDGUI(int d, int a, int b){ //Gets the second index
        
        ch = new String[5];
        kl = new String[5];
        dt = new String[5];
        as = new String[5];
        cr = new String[5];
        gl = new String[5];
        
        t = d;
        r = a;
        s = b;
        
        lblPlayer = new JLabel[40];
        
        txtChamp = new JTextField[5];
        txtKill = new JTextField[5];
        txtAssist = new JTextField[5];
        txtDeath = new JTextField[5];
        txtCreep = new JTextField[5];
        txtGold = new JTextField[5];
        
        for(i = 0; i < 40; i++){
            lblPlayer[i] = new JLabel("" + pl.player[i]);
        }
        
        for(i = 0; i < 5; i++){
            txtChamp[i] = new JTextField();
        }
        for(i = 0; i < 5; i++){
            txtKill[i] = new JTextField();
        }
        for(i = 0; i < 5; i++){
            txtAssist[i] = new JTextField();
        }
        for(i = 0; i < 5; i++){
            txtDeath[i] = new JTextField();
        }
        for(i = 0; i < 5; i++){
            txtCreep[i] = new JTextField();
        }
        for(i = 0; i < 5; i++){
            txtGold[i] = new JTextField();
        }
        
        checkVersion checkVersion = new checkVersion();
        
        setTitle("LoL Stats Maker " + checkVersion.version);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setSize(400, 150);
        setLocationRelativeTo(null);
        
        cp.setLayout(new GridBagLayout());
        
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.NORTH;
        c.fill = GridBagConstraints.NONE;
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 3;
        c.gridy = 0;
        c.gridwidth = 1;
        
        cp.add(lblTitle, c);
        //--------------
        c.gridx = 0;
        c.gridy = 1;
 
        cp.add(lblPlayers, c);
       //------------------------
        switch(b){ //Case team X labels a, b, c, d and e will be put
            case 0:
                for(i = 0; i < 5; i++){
                    c.gridy = i+2;
                    cp.add(lblPlayer[i], c);
                }
                break;
                
            case 1:
                for(i = 5; i < 10; i++){
                    c.gridy = i-3;
                    cp.add(lblPlayer[i], c);
                }
                break;
                
            case 2:
                for(i = 10; i < 15; i++){
                    c.gridy = i-8;
                    cp.add(lblPlayer[i], c);                    
                }
                break;
                
            case 3:
                for(i = 15; i < 20; i++){
                    c.gridy = i-13;
                    cp.add(lblPlayer[i], c);
                }
                break;
                
            case 4:
                for(i = 20; i < 25; i++){
                    c.gridy = i-18;
                    cp.add(lblPlayer[i], c);
                }
                break;
                
            case 5:
                for(i = 25; i < 30; i++){
                    c.gridy = i-23;
                    cp.add(lblPlayer[i], c);
                }
                break;
                
            case 6:
                for(i = 30; i < 35; i++){
                    c.gridy = i-28;
                    cp.add(lblPlayer[i], c);
                }
                break;
                
            case 7:
                for(i = 35; i < 40; i++){
                    c.gridy = i-33;
                    cp.add(lblPlayer[i], c);
                }
                break;               
        }
        //------------------
        c.gridy = 1;
        c.gridx = 1;
        
        cp.add(lblChamp, c);
        
        c.gridx = 2;
        
        cp.add(lblKill, c);
        
        c.gridx = 3;
        
        cp.add(lblAssist, c);
        
        c.gridx = 4;
        
        cp.add(lblDeath, c);
        
        c.gridx = 5;
        
        cp.add(lblCreep, c);
        
        c.gridx = 6;
        
        cp.add(lblGold, c);
        //--------------------------
        c.gridwidth = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.WEST;
        //------------------
        c.gridx = 1;
        
       for(i = 0; i < 5; i++){
            c.gridy = i+2;
            cp.add(txtChamp[i], c);
        }
        //----------------------------
        c.gridx = 2;
        
        for(i = 0; i < 5; i++){
            c.gridy = i+2;
            cp.add(txtKill[i], c);
        }
        //-----------------------
        c.gridx = 3;
        for(i = 0; i < 5; i++){
            c.gridy = i+2;
            cp.add(txtDeath[i], c);
        }
        //------------------
        c.gridx = 4;
        for(i = 0; i < 5; i++){
            c.gridy = i+2;
            cp.add(txtAssist[i], c);
        }        
        //-----------------------
        c.gridx = 5;
         for(i = 0; i < 5; i++){
            c.gridy = i+2;
            cp.add(txtCreep[i], c);
        } 
        //---------------------
        c.gridx = 6;
         for(i = 0; i < 5; i++){
            c.gridy = i+2;
            cp.add(txtGold[i], c);
        } 
        c.gridx = 1;
        c.gridy = 7;
        
        cp.add(lblTurret, c);
        
        c.gridx = 2;
        
        cp.add(txtTurret, c);
        
        c.gridx = 3;
        
        cp.add(lblDrag, c);
        
        c.gridx = 4;
        
        cp.add(txtDrag, c);
        
        c.gridx = 5;
        
        cp.add(lblBaron, c);
        
        c.gridx = 6;
        
        cp.add(txtBaron, c);
        //--------------------------
        c.gridy = 8;
        c.fill = GridBagConstraints.NONE;
        
        cp.add(btnNext, c);
        
        pack();
        
        btnNext.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                for(i = 0; i < 5; i++){
                    ch[i] = txtChamp[i].getText();
                    rw.kl[i] = Integer.parseInt(txtKill[i].getText());
                    rw.dt[i] = Integer.parseInt(txtDeath[i].getText());
                    rw.as[i] = Integer.parseInt(txtAssist[i].getText());
                    rw.cr[i] = Integer.parseInt(txtCreep[i].getText());
                    rw.gl[i] = Integer.parseInt(txtGold[i].getText());
                }
                switch(b){
                    case 0:
                        rw.p = 0;
                        for(i = 0; i < 5; i++){
                            for(int j = 7;j < 12;j++){                              
                                rw.readWrite(true, j, i);                                
                            }
                            rw.p++;
                        }
                        break;
                    case 1:
                        rw.p = 0;
                        for(i = 5; i < 10; i++){
                            for(int j = 7;j < 12;j++){                              
                                rw.readWrite(true, j, i);                                
                            }
                            rw.p++;
                        }
                        break;
                    case 2:
                        rw.p = 0;
                        for(i = 10; i < 15; i++){
                            for(int j = 7;j < 12;j++){                              
                                rw.readWrite(true, j, i);                                
                            }
                            rw.p++;
                        }
                        break;
                    case 3:
                        rw.p = 0;
                        for(i = 15; i < 20; i++){
                            for(int j = 7;j < 12;j++){                              
                                rw.readWrite(true, j, i);                                
                            }
                            rw.p++;
                        }
                        break;
                    case 4:
                        rw.p = 0;
                        for(i = 20; i < 25; i++){
                           for(int j = 7;j < 12;j++){                              
                                rw.readWrite(true, j, i);                                
                            }
                           rw.p++;
                        }
                        break;
                    case 5:
                        rw.p = 0;
                        for(i = 25; i < 30; i++){
                            for(int j = 7;j < 12;j++){                              
                                rw.readWrite(true, j, i);                                
                            }
                            rw.p++;
                        }
                        break;
                    case 6:
                        rw.p = 0;
                        for(i = 30; i < 35; i++){
                            for(int j = 7;j < 12;j++){                              
                                rw.readWrite(true, j, i);                                
                            }
                            rw.p++;
                        }
                        break;
                    case 7:
                        rw.p = 0;
                        for(i = 35; i < 40; i++){
                            for(int j = 7;j < 12;j++){                              
                                rw.readWrite(true, j, i);                                
                            }
                            rw.p++;
                        }
                        break;
                }
                for(i = 0; i < 124; i++){
                    for(int j = 0; j < 5; j++){
                        if(ch[j].equals(pl.champion[i])){
                        rw.readWrite(true, -4, i);
                        }
                    }
                }
                //--------------------------------------------------
                rw.tr = Integer.parseInt(txtTurret.getText());
                rw.dr = Integer.parseInt(txtDrag.getText());
                rw.br = Integer.parseInt(txtBaron.getText());
                rw.readWrite(true, 3, b);
                rw.readWrite(true, 4, b);
                rw.readWrite(true, 5, b);
                if(t == 1){
                    t += 2;
                    new insIDGUI(t, s, r);
                    dispose();
                }
                else if(t == 0){
                    t -= 2;
                    new insIDGUI(t, s, r);
                    dispose();
                }
                else if((t == -1) || (t == -2) || (t == 3) || (t == 4)){
                    new finGUI(t, s, r); //Calls the final GUI
                    dispose();
                }              
            }
        });
   
    }
}
