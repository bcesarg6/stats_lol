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
    
    Stats_lol pl = new Stats_lol();
    
    
    JLabel lblTitle = new JLabel("Red side"); //Other side
    JLabel lblPlayer = new JLabel("Player");
    JLabel lblTurret = new JLabel("Turrets:");
    JLabel lblDrag = new JLabel("Dragons:");
    JLabel lblBaron = new JLabel("Barons:");
    JLabel lblChamp = new JLabel("Champion");
    JLabel lblKill = new JLabel("Kills");
    JLabel lblAssist = new JLabel("Assists");
    JLabel lblDeath = new JLabel("Deaths");
    JLabel lblCreep = new JLabel("Creeps");
    JLabel lblGold = new JLabel("Gold");
    JLabel lblPlayer1 = new JLabel("" + pl.player1);
    JLabel lblPlayer2 = new JLabel("" + pl.player2);
    JLabel lblPlayer3 = new JLabel("" + pl.player3);
    JLabel lblPlayer4 = new JLabel("" + pl.player4);
    JLabel lblPlayer5 = new JLabel("" + pl.player5);
    JLabel lblPlayer6 = new JLabel("" + pl.player6);
    JLabel lblPlayer7 = new JLabel("" + pl.player7);
    JLabel lblPlayer8 = new JLabel("" + pl.player8);
    JLabel lblPlayer9 = new JLabel("" + pl.player9);
    JLabel lblPlayer10 = new JLabel("" + pl.player10);
    JLabel lblPlayer11 = new JLabel("" + pl.player11);
    JLabel lblPlayer12 = new JLabel("" + pl.player12);
    JLabel lblPlayer13 = new JLabel("" + pl.player13);
    JLabel lblPlayer14 = new JLabel("" + pl.player14);
    JLabel lblPlayer15 = new JLabel("" + pl.player15);
    JLabel lblPlayer16 = new JLabel("" + pl.player16);
    JLabel lblPlayer17 = new JLabel("" + pl.player17);
    JLabel lblPlayer18 = new JLabel("" + pl.player18);
    JLabel lblPlayer19 = new JLabel("" + pl.player19);
    JLabel lblPlayer20 = new JLabel("" + pl.player20);
    JLabel lblPlayer21 = new JLabel("" + pl.player21);
    JLabel lblPlayer22 = new JLabel("" + pl.player22);
    JLabel lblPlayer23 = new JLabel("" + pl.player23);
    JLabel lblPlayer24 = new JLabel("" + pl.player24);
    JLabel lblPlayer25 = new JLabel("" + pl.player25);
    JLabel lblPlayer26 = new JLabel("" + pl.player26);
    JLabel lblPlayer27 = new JLabel("" + pl.player27);
    JLabel lblPlayer28 = new JLabel("" + pl.player28);
    JLabel lblPlayer29 = new JLabel("" + pl.player29);
    JLabel lblPlayer30 = new JLabel("" + pl.player30);
    JLabel lblPlayer31 = new JLabel("" + pl.player31);
    JLabel lblPlayer32 = new JLabel("" + pl.player32);
    JLabel lblPlayer33 = new JLabel("" + pl.player33);
    JLabel lblPlayer34 = new JLabel("" + pl.player34);
    JLabel lblPlayer35 = new JLabel("" + pl.player35);
    JLabel lblPlayer36 = new JLabel("" + pl.player36);
    JLabel lblPlayer37 = new JLabel("" + pl.player37);
    JLabel lblPlayer38 = new JLabel("" + pl.player38);
    JLabel lblPlayer39 = new JLabel("" + pl.player39);
    JLabel lblPlayer40 = new JLabel("" + pl.player40);
    JTextField txtChamp1 = new JTextField();
    JTextField txtChamp2 = new JTextField();
    JTextField txtChamp3 = new JTextField();
    JTextField txtChamp4 = new JTextField();
    JTextField txtChamp5 = new JTextField();
    JTextField txtKill1 = new JTextField();
    JTextField txtKill2 = new JTextField();
    JTextField txtKill3 = new JTextField();
    JTextField txtKill4 = new JTextField();
    JTextField txtKill5 = new JTextField();
    JTextField txtAssist1 = new JTextField();
    JTextField txtAssist2 = new JTextField();
    JTextField txtAssist3 = new JTextField();
    JTextField txtAssist4 = new JTextField();
    JTextField txtAssist5 = new JTextField();
    JTextField txtDeath1 = new JTextField();
    JTextField txtDeath2 = new JTextField();
    JTextField txtDeath3 = new JTextField();
    JTextField txtDeath4 = new JTextField();
    JTextField txtDeath5 = new JTextField();
    JTextField txtCreep1 = new JTextField();
    JTextField txtCreep2 = new JTextField();
    JTextField txtCreep3 = new JTextField();
    JTextField txtCreep4 = new JTextField();
    JTextField txtCreep5 = new JTextField();
    JTextField txtGold1 = new JTextField();
    JTextField txtGold2 = new JTextField();
    JTextField txtGold3 = new JTextField();
    JTextField txtGold4 = new JTextField();
    JTextField txtGold5 = new JTextField();
    JTextField txtTurret = new JTextField();
    JTextField txtDrag = new JTextField();
    JTextField txtBaron = new JTextField();
    JButton btnNext = new JButton("Next");
    
    Container cp = getContentPane();
    
    public insRDGUI(int b){ //Gets the second index
        
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
 
        cp.add(lblPlayer, c);
       //------------------------
        switch(b){
            case 0:
                c.gridy = 2;
        
                cp.add(lblPlayer1, c);
        
                c.gridy = 3;
        
                cp.add(lblPlayer2, c);
        
                c.gridy = 4;
        
                cp.add(lblPlayer3, c);
        
                c.gridy = 5;
        
                cp.add(lblPlayer4, c);
        
                c.gridy = 6;
        
                cp.add(lblPlayer5, c);
                
                break;
                
            case 1:
                c.gridy = 2;
        
                cp.add(lblPlayer6, c);
        
                c.gridy = 3;
        
                cp.add(lblPlayer7, c);
        
                c.gridy = 4;
        
                cp.add(lblPlayer8, c);
        
                c.gridy = 5;
        
                cp.add(lblPlayer9, c);
        
                c.gridy = 6;
        
                cp.add(lblPlayer10, c);
                
                break;
                
            case 2:
                c.gridy = 2;
        
                cp.add(lblPlayer11, c);
        
                c.gridy = 3;
        
                cp.add(lblPlayer12, c);
        
                c.gridy = 4;
        
                cp.add(lblPlayer13, c);
        
                c.gridy = 5;
        
                cp.add(lblPlayer14, c);
        
                c.gridy = 6;
        
                cp.add(lblPlayer15, c);
                
                break;
                
            case 3:
                c.gridy = 2;
        
                cp.add(lblPlayer16, c);
        
                c.gridy = 3;
        
                cp.add(lblPlayer17, c);
        
                c.gridy = 4;
        
                cp.add(lblPlayer18, c);
        
                c.gridy = 5;
        
                cp.add(lblPlayer19, c);
        
                c.gridy = 6;
        
                cp.add(lblPlayer20, c);
                
                break;
                
            case 4:
                c.gridy = 2;
        
                cp.add(lblPlayer21, c);
        
                c.gridy = 3;
        
                cp.add(lblPlayer22, c);
        
                c.gridy = 4;
        
                cp.add(lblPlayer23, c);
        
                c.gridy = 5;
        
                cp.add(lblPlayer24, c);
        
                c.gridy = 6;
        
                cp.add(lblPlayer25, c);
                
                break;
                
            case 5:
                c.gridy = 2;
        
                cp.add(lblPlayer26, c);
        
                c.gridy = 3;
        
                cp.add(lblPlayer27, c);
        
                c.gridy = 4;
        
                cp.add(lblPlayer28, c);
        
                c.gridy = 5;
        
                cp.add(lblPlayer29, c);
        
                c.gridy = 6;
        
                cp.add(lblPlayer30, c);
                
                break;
                
            case 6:
                c.gridy = 2;
        
                cp.add(lblPlayer31, c);
        
                c.gridy = 3;
        
                cp.add(lblPlayer32, c);
        
                c.gridy = 4;
        
                cp.add(lblPlayer33, c);
        
                c.gridy = 5;
        
                cp.add(lblPlayer34, c);
        
                c.gridy = 6;
        
                cp.add(lblPlayer35, c);
                
                break;
                
            case 7:
                c.gridy = 2;
        
                cp.add(lblPlayer36, c);
        
                c.gridy = 3;
        
                cp.add(lblPlayer37, c);
        
                c.gridy = 4;
        
                cp.add(lblPlayer38, c);
        
                c.gridy = 5;
        
                cp.add(lblPlayer39, c);
        
                c.gridy = 6;
        
                cp.add(lblPlayer40, c);
                
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
        c.gridy = 2;
        
        cp.add(txtChamp1, c);
        
        c.gridy = 3;
        
        cp.add(txtChamp2, c);
        
        c.gridy = 4;
        
        cp.add(txtChamp3, c);
        
        c.gridy = 5;
        
        cp.add(txtChamp4, c);
        
        c.gridy = 6;
        
        cp.add(txtChamp5, c);
        //----------------------------
        c.gridx = 2;
        c.gridy = 2;
        
        cp.add(txtKill1, c);
        
        c.gridy = 3;
        
        cp.add(txtKill2, c);
        
        c.gridy = 4;
        
        cp.add(txtKill3, c);
        
        c.gridy = 5;
        
        cp.add(txtKill4, c);
        
        c.gridy = 6;
        
        cp.add(txtKill5, c);
        //------------------
        c.gridx = 3;
        c.gridy = 2;
        
        cp.add(txtAssist1, c);
        
        c.gridy = 3;
        
        cp.add(txtAssist2, c);
        
        c.gridy = 4;
        
        cp.add(txtAssist3, c);
        
        c.gridy = 5;
        
        cp.add(txtAssist4, c);
        
        c.gridy = 6;
        
        cp.add(txtAssist5, c);
        //-----------------------
        c.gridx = 4;
        c.gridy = 2;
        
        cp.add(txtDeath1, c);
        
        c.gridy = 3;
        
        cp.add(txtDeath2, c);
        
        c.gridy = 4;
        
        cp.add(txtDeath3, c);
        
        c.gridy = 5;
        
        cp.add(txtDeath4, c);
        
        c.gridy = 6;
        
        cp.add(txtDeath5, c);
        //-----------------------
        c.gridx = 5;
        c.gridy = 2;
        
        cp.add(txtCreep1, c);
        
        c.gridy = 3;
        
        cp.add(txtCreep2, c);
        
        c.gridy = 4;
        
        cp.add(txtCreep3, c);
        
        c.gridy = 5;
        
        cp.add(txtCreep4, c);
        
        c.gridy = 6;
        
        cp.add(txtCreep5, c);
        //---------------------
        c.gridx = 6;
        c.gridy = 2;
        
        cp.add(txtGold1, c);
        
        c.gridy = 3;
        
        cp.add(txtGold2, c);
        
        c.gridy = 4;
        
        cp.add(txtGold3, c);
        
        c.gridy = 5;
        
        cp.add(txtGold4, c);
        
        c.gridy = 6;
        
        cp.add(txtGold5, c);
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
        
        btnNext.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              new finGUI(); //Calls the final GUI
              dispose();
               
            }
        });
   
    }
}
