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
import javax.swing.JTextField;
import static stats_lol.Stats_lol.*;
import static stats_lol.checkVersion.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Cristofer
 */

//After the 2º GUI the user inserts the blue side data here
public class insBDGUI extends JFrame{
    
    String[] ch, kl, as, dt, cr, gl;
    int tr, dr, br, t;
    int[] kill, death, assist, creep, gold;
    
    ReadWrite rw = new ReadWrite();
    
    JLabel[] lblPlayer;
    JTextField[] txtChamp, txtKill, txtAssist, txtDeath, txtCreep, txtGold;
        
    JLabel lblTitle = new JLabel("Blue side");
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
    
    //The text camp that the user will use
    JTextField txtTurret = new JTextField();
    JTextField txtDrag = new JTextField();
    JTextField txtBaron = new JTextField();
    JButton btnNext = new JButton("Next");
    
    Container cp = getContentPane();
    
    public insBDGUI(int d, int a, int b, int h){ //Recieves the data of the insMtGUI (dropbox index 1 and dropbox index 2)
        
        ch = new String[5];
        kl = new String[5];
        dt = new String[5];
        as = new String[5];
        cr = new String[5];
        gl = new String[5];
        
        kill = new int[5];
        death = new int[5];
        assist = new int[5];
        creep = new int[5];
        gold = new int[5];
        
        lblPlayer = new JLabel[40];
        
        txtChamp = new JTextField[5];
        txtKill = new JTextField[5];
        txtAssist = new JTextField[5];
        txtDeath = new JTextField[5];
        txtCreep = new JTextField[5];
        txtGold = new JTextField[5];
        
        for(int i = 0; i < 40; i++){
            lblPlayer[i] = new JLabel(player[i]);
        }
        
        for(int i = 0; i < 5; i++){
            txtChamp[i] = new JTextField();
        }
        
        for(int i = 0; i < 5; i++){
            txtKill[i] = new JTextField();
        }
        
        for(int i = 0; i < 5; i++){
            txtAssist[i] = new JTextField();
        }
        
        for(int i = 0; i < 5; i++){
            txtDeath[i] = new JTextField();
        }
        
        for(int i = 0; i < 5; i++){
            txtCreep[i] = new JTextField();
        }
        
        for(int i = 0; i < 5; i++){
            txtGold[i] = new JTextField();
        }
        
        setTitle("LoL Stats Maker " + version);
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
        switch(a){ //Case team X labels a, b, c, d and e will be put
            case 0:
                for(int i = 0; i < 5; i++){
                    c.gridy = i+2;
                    cp.add(lblPlayer[i], c);
                }
                break;
                
            case 1:
                for(int i = 5; i < 10; i++){
                    c.gridy = i-3;
                    cp.add(lblPlayer[i], c);
                }
                break;
                
            case 2:
                for(int i = 10; i < 15; i++){
                    c.gridy = i-8;
                    cp.add(lblPlayer[i], c);                    
                }
                break;
                
            case 3:
                for(int i = 15; i < 20; i++){
                    c.gridy = i-13;
                    cp.add(lblPlayer[i], c);
                }
                break;
                
            case 4:
                for(int i = 20; i < 25; i++){
                    c.gridy = i-18;
                    cp.add(lblPlayer[i], c);
                }
                break;
                
            case 5:
                for(int i = 25; i < 30; i++){
                    c.gridy = i-23;
                    cp.add(lblPlayer[i], c);
                }
                break;
                
            case 6:
                for(int i = 30; i < 35; i++){
                    c.gridy = i-28;
                    cp.add(lblPlayer[i], c);
                }
                break;
                
            case 7:
                for(int i = 35; i < 40; i++){
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
        
        cp.add(lblDeath, c);
        
        c.gridx = 4;
        
        cp.add(lblAssist, c);
        
        c.gridx = 5;
        
        cp.add(lblCreep, c);
        
        c.gridx = 6;
        
        cp.add(lblGold, c);
        //--------------------------
        c.gridwidth = 1;
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.WEST;
        //------------------ All the text camps
        c.gridx = 1;
        
        for(int i = 0; i < 5; i++){
            c.gridy = i+2;
            cp.add(txtChamp[i], c);
        }
        //----------------------------
        c.gridx = 2;
        
        for(int i = 0; i < 5; i++){
            c.gridy = i+2;
            cp.add(txtKill[i], c);
        }
        //-----------------------
        c.gridx = 3;
        
        for(int i = 0; i < 5; i++){
            c.gridy = i+2;
            cp.add(txtDeath[i], c);
        }
        //------------------
        c.gridx = 4;
        
        for(int i = 0; i < 5; i++){
            c.gridy = i+2;
            cp.add(txtAssist[i], c);
        }        
        //-----------------------
        c.gridx = 5;
        
        for(int i = 0; i < 5; i++){
            c.gridy = i+2;
            cp.add(txtCreep[i], c);
        } 
        //---------------------
        c.gridx = 6;
        
        for(int i = 0; i < 5; i++){
            c.gridy = i+2;
            cp.add(txtGold[i], c);
        } 
        //----------------------------
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
        
        btnNext.addActionListener((ActionEvent e) -> {
            
            for(int i = 0; i < 5; i++){
                ch[i] = txtChamp[i].getText();
                kill[i] = Integer.parseInt(txtKill[i].getText());
                death[i] = Integer.parseInt(txtDeath[i].getText());
                assist[i] = Integer.parseInt(txtAssist[i].getText());
                creep[i] = Integer.parseInt(txtCreep[i].getText());
                gold[i] = Integer.parseInt(txtGold[i].getText());
            }
            
            switch(a){
                case 0:
                    t = 0;
                    for(int i = 0; i < 5; i++){
                        int j = 1;
                        rw.readWrite(true, 0, i, j++, kill[i-t]);
                        rw.readWrite(true, 0, i, j++, death[i-t]);
                        rw.readWrite(true, 0, i, j++, assist[i-t]);
                        rw.readWrite(true, 0, i, j++, creep[i-t]);
                        rw.readWrite(true, 0, i, j, gold[i-t]);
                    }
                    break;
                case 1:
                    t = 5;
                    for(int i = 5; i < 10; i++){
                        int j = 1;
                        rw.readWrite(true, 0, i, j++, kill[i-t]);
                        rw.readWrite(true, 0, i, j++, death[i-t]);
                        rw.readWrite(true, 0, i, j++, assist[i-t]);
                        rw.readWrite(true, 0, i, j++, creep[i-t]);
                        rw.readWrite(true, 0, i, j, gold[i-t]);
                    }
                    break;
                case 2:
                    t = 10;
                    for(int i = 10; i < 15; i++){
                        int j = 1;
                        rw.readWrite(true, 0, i, j++, kill[i-t]);
                        rw.readWrite(true, 0, i, j++, death[i-t]);
                        rw.readWrite(true, 0, i, j++, assist[i-t]);
                        rw.readWrite(true, 0, i, j++, creep[i-t]);
                        rw.readWrite(true, 0, i, j, gold[i-t]);
                    }
                    break;
                case 3:
                    t = 15;
                    for(int i = 15; i < 20; i++){
                        int j = 1;
                        rw.readWrite(true, 0, i, j++, kill[i-t]);
                        rw.readWrite(true, 0, i, j++, death[i-t]);
                        rw.readWrite(true, 0, i, j++, assist[i-t]);
                        rw.readWrite(true, 0, i, j++, creep[i-t]);
                        rw.readWrite(true, 0, i, j, gold[i-t]);
                    }
                    break;
                case 4:
                    t = 20;
                    for(int i = 20; i < 25; i++){
                        int j = 1;
                        rw.readWrite(true, 0, i, j++, kill[i-t]);
                        rw.readWrite(true, 0, i, j++, death[i-t]);
                        rw.readWrite(true, 0, i, j++, assist[i-t]);
                        rw.readWrite(true, 0, i, j++, creep[i-t]);
                        rw.readWrite(true, 0, i, j, gold[i-t]);
                    }
                    break;
                case 5:
                    t = 25;
                    for(int i = 25; i < 30; i++){
                        int j = 1;
                        rw.readWrite(true, 0, i, j++, kill[i-t]);
                        rw.readWrite(true, 0, i, j++, death[i-t]);
                        rw.readWrite(true, 0, i, j++, assist[i-t]);
                        rw.readWrite(true, 0, i, j++, creep[i-t]);
                        rw.readWrite(true, 0, i, j, gold[i-t]);
                    }
                    break;
                case 6:
                    t = 30;
                    for(int i = 30; i < 35; i++){
                        int j = 1;
                        rw.readWrite(true, 0, i, j++, kill[i-t]);
                        rw.readWrite(true, 0, i, j++, death[i-t]);
                        rw.readWrite(true, 0, i, j++, assist[i-t]);
                        rw.readWrite(true, 0, i, j++, creep[i-t]);
                        rw.readWrite(true, 0, i, j, gold[i-t]);
                    }
                    break;
                case 7:
                    t = 35;
                    for(int i = 35; i < 40; i++){
                        int j = 1;
                        rw.readWrite(true, 0, i, j++, kill[i-t]);
                        rw.readWrite(true, 0, i, j++, death[i-t]);
                        rw.readWrite(true, 0, i, j++, assist[i-t]);
                        rw.readWrite(true, 0, i, j++, creep[i-t]);
                        rw.readWrite(true, 0, i, j, gold[i-t]);
                    }
                    break;
            }
            
            for(int i = 0; i < 124; i++){
                for(int j = 0; j < 5; j++){
                    if(ch[j].equals(champion[i])){
                        rw.readWrite(true, 2, i, 2, 1);
                        if(h == 1){
                            rw.readWrite(true, 2, i, 3, 1);
                        }
                    }
                }
            }
            
            tr = Integer.parseInt(txtTurret.getText());
            dr = Integer.parseInt(txtDrag.getText());
            br = Integer.parseInt(txtBaron.getText());
            
            rw.readWrite(true, 1, a, 4, tr);
            rw.readWrite(true, 1, a, 5, dr);
            rw.readWrite(true, 1, a, 6, br);
            
            insRDGUI insRDGUI = new insRDGUI(d, a, b, h); //Go to the next step giving the information of the dropbox index
            
            dispose();
        });
    }
}