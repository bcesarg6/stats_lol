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
import javax.swing.JTextField;
import static stats_lol.Stats_lol.*;
import static stats_lol.CheckVersion.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Cristofer
 */

/*Here the user inserts the red side data (after the blue data). 
(The code here is almost the same as in the insBDGUI, just a few chages (commented))*/
public class InsRDGUI extends JFrame{
    
    String[] ch, kl, as, dt, cr, gl, ply;
    int tr, dr, br, t;
    int[] kill, death, assist, creep, gold;
    
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
    
    final int pl(int i, int a){
        a = (a*5)+i; 
        return a;
    }
   /**
    * Creates the tooltip
    * @param pl string
    * @param i the archive
    * @return the string
    */
    final String txtToolTip(String pl, int i) {
       
        String[] txt = {"Champion used by " + pl,
                        "Total kills of " + pl,
                        "Total assists of " + pl,
                        "Total deaths of" + pl,
                        "Total farm of " + pl,
                        "Total gold of " + pl};
        return txt[i];
    }
    
    Container cp = getContentPane();
    
    public InsRDGUI(int d, int a, int b, int h){//Gets the second index 
        
        ch = new String[5];
        kl = new String[5];
        dt = new String[5];
        as = new String[5];
        cr = new String[5];
        gl = new String[5];
        ply = new String[5];
        
        kill = new int[5];
        death = new int[5];
        assist = new int[5];
        creep = new int[5];
        gold = new int[5];

        lblPlayer = new JLabel[5];
        
        txtChamp = new JTextField[5];
        txtKill = new JTextField[5];
        txtAssist = new JTextField[5];
        txtDeath = new JTextField[5];
        txtCreep = new JTextField[5];
        txtGold = new JTextField[5];
        
        for(int i = 0; i < 5; i++){
            ply[i] = player[pl(i, b)];
            lblPlayer[i] = new JLabel(ply[i]);
            
            txtChamp[i] = new JTextField();
            txtChamp[i].setToolTipText(txtToolTip(ply[i], 0));
            
            txtKill[i] = new JTextField();
            txtKill[i].setToolTipText(txtToolTip(ply[i], 1));
            
            txtAssist[i] = new JTextField();
            txtAssist[i].setToolTipText(txtToolTip(ply[i], 2));
            
            txtDeath[i] = new JTextField();
            txtDeath[i].setToolTipText(txtToolTip(ply[i], 3));
            
            txtCreep[i] = new JTextField();
            txtCreep[i].setToolTipText(txtToolTip(ply[i], 4));
            
            txtGold[i] = new JTextField();
            txtGold[i].setToolTipText(txtToolTip(ply[i], 5));
        }
        
        txtTurret.setToolTipText("Turrets destroyed by "+ team[b]);
        txtDrag.setToolTipText("Turrets destroyed by "+ team[b]);
        txtBaron.setToolTipText("Turrets destroyed by "+ team[b]);
        
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
        for(int i = 0; i < 5; i++){
            c.gridy = i+2;
            cp.add(lblPlayer[i], c);
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
        //------------------
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
            
            try{
                
                for(int i = 0; i < 5; i++){
                    ch[i] = txtChamp[i].getText();
                    kill[i] = Integer.parseInt(txtKill[i].getText());
                    death[i] = Integer.parseInt(txtDeath[i].getText());
                    assist[i] = Integer.parseInt(txtAssist[i].getText());
                    creep[i] = Integer.parseInt(txtCreep[i].getText());
                    gold[i] = Integer.parseInt(txtGold[i].getText());
                }
            
                for(int i = 0; i < 5; i++){
                    int j = 1;
                
                    rw.tmpReadWrite(0, pl(i, b), j++, kill[i]);
                    rw.tmpReadWrite(0, pl(i, b), j++, death[i]);
                    rw.tmpReadWrite(0, pl(i, b), j++, assist[i]);
                    rw.tmpReadWrite(0, pl(i, b), j++, creep[i]);
                    rw.tmpReadWrite(0, pl(i, b), j, gold[i]);
                
                }
            
                for(int i = 0; i < 124; i++){
                    for(int j = 0; j < 5; j++){
                        if(ch[j].equals(champion[i])){
                            rw.tmpReadWrite(2, i, 2, 1);
                            if(h == 0){
                                rw.tmpReadWrite(2, i, 3, 1);
                            }
                        }
                    }
                }
            
                tr = Integer.parseInt(txtTurret.getText());
                dr = Integer.parseInt(txtDrag.getText());
                br = Integer.parseInt(txtBaron.getText());
            
            
                rw.tmpReadWrite(1, b, 4, tr);
                rw.tmpReadWrite(1, b, 5, dr);
                rw.tmpReadWrite(1, b, 6, br);
                
                if(d == 1){
                    int par[] = {d+2, b, a};
                    rw.tmpSetStage(1, par);
                    InsIDGUI insIDGUI = new InsIDGUI((d+2), b, a);
                
                    dispose();
                }
                
                else if(d == 0){
                    int par[] = {d-2, b, a};
                    rw.tmpSetStage(1, par);
                    InsIDGUI insIDGUI = new InsIDGUI((d-2), b, a);
                
                    dispose();
                }
            
                else if((d == -1) || (d == -2) || (d == 3) || (d == 4)){ 
                    int par[] = {d, b, a};
                    rw.tmpSetStage(4, par);
                    FinGUI finGUI = new FinGUI(d, b, a); //Calls the final GUI
                
                    dispose();              
                }
            }catch(IOException ex){}
        });
    }
}