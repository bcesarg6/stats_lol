/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status_lol;

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
 * @author cristofer
 */
public class insDdaGUI extends JFrame{
    
    Stats_lol jg = new Stats_lol();
    
    
    JLabel lblTitle = new JLabel("Lado Azul");
    JLabel lbljogador = new JLabel("Jogador");
    JLabel lbltorre = new JLabel("Torres:");
    JLabel lbldrag = new JLabel("Dragões:");
    JLabel lblbaron = new JLabel("Barões:");
    JLabel lblchamp = new JLabel("Campeão");
    JLabel lblkill = new JLabel("Abates");
    JLabel lblassist = new JLabel("Assistências");
    JLabel lbldeath = new JLabel("Mortes");
    JLabel lblcreep = new JLabel("Tropas");
    JLabel lblgold = new JLabel("Ouro");
    JLabel lbljogador1 = new JLabel("" + jg.jogador1);
    JLabel lbljogador2 = new JLabel("" + jg.jogador2);
    JLabel lbljogador3 = new JLabel("" + jg.jogador3);
    JLabel lbljogador4 = new JLabel("" + jg.jogador4);
    JLabel lbljogador5 = new JLabel("" + jg.jogador5);
    JLabel lbljogador6 = new JLabel("" + jg.jogador6);
    JLabel lbljogador7 = new JLabel("" + jg.jogador7);
    JLabel lbljogador8 = new JLabel("" + jg.jogador8);
    JLabel lbljogador9 = new JLabel("" + jg.jogador9);
    JLabel lbljogador10 = new JLabel("" + jg.jogador10);
    JLabel lbljogador11 = new JLabel("" + jg.jogador11);
    JLabel lbljogador12 = new JLabel("" + jg.jogador12);
    JLabel lbljogador13 = new JLabel("" + jg.jogador13);
    JLabel lbljogador14 = new JLabel("" + jg.jogador14);
    JLabel lbljogador15 = new JLabel("" + jg.jogador15);
    JLabel lbljogador16 = new JLabel("" + jg.jogador16);
    JLabel lbljogador17 = new JLabel("" + jg.jogador17);
    JLabel lbljogador18 = new JLabel("" + jg.jogador18);
    JLabel lbljogador19 = new JLabel("" + jg.jogador19);
    JLabel lbljogador20 = new JLabel("" + jg.jogador20);
    JLabel lbljogador21 = new JLabel("" + jg.jogador21);
    JLabel lbljogador22 = new JLabel("" + jg.jogador22);
    JLabel lbljogador23 = new JLabel("" + jg.jogador23);
    JLabel lbljogador24 = new JLabel("" + jg.jogador24);
    JLabel lbljogador25 = new JLabel("" + jg.jogador25);
    JLabel lbljogador26 = new JLabel("" + jg.jogador26);
    JLabel lbljogador27 = new JLabel("" + jg.jogador27);
    JLabel lbljogador28 = new JLabel("" + jg.jogador28);
    JLabel lbljogador29 = new JLabel("" + jg.jogador29);
    JLabel lbljogador30 = new JLabel("" + jg.jogador30);
    JLabel lbljogador31 = new JLabel("" + jg.jogador31);
    JLabel lbljogador32 = new JLabel("" + jg.jogador32);
    JLabel lbljogador33 = new JLabel("" + jg.jogador33);
    JLabel lbljogador34 = new JLabel("" + jg.jogador34);
    JLabel lbljogador35 = new JLabel("" + jg.jogador35);
    JLabel lbljogador36 = new JLabel("" + jg.jogador36);
    JLabel lbljogador37 = new JLabel("" + jg.jogador37);
    JLabel lbljogador38 = new JLabel("" + jg.jogador38);
    JLabel lbljogador39 = new JLabel("" + jg.jogador39);
    JLabel lbljogador40 = new JLabel("" + jg.jogador40);
    JTextField txtchamp1 = new JTextField();
    JTextField txtchamp2 = new JTextField();
    JTextField txtchamp3 = new JTextField();
    JTextField txtchamp4 = new JTextField();
    JTextField txtchamp5 = new JTextField();
    JTextField txtkill1 = new JTextField();
    JTextField txtkill2 = new JTextField();
    JTextField txtkill3 = new JTextField();
    JTextField txtkill4 = new JTextField();
    JTextField txtkill5 = new JTextField();
    JTextField txtassist1 = new JTextField();
    JTextField txtassist2 = new JTextField();
    JTextField txtassist3 = new JTextField();
    JTextField txtassist4 = new JTextField();
    JTextField txtassist5 = new JTextField();
    JTextField txtdeath1 = new JTextField();
    JTextField txtdeath2 = new JTextField();
    JTextField txtdeath3 = new JTextField();
    JTextField txtdeath4 = new JTextField();
    JTextField txtdeath5 = new JTextField();
    JTextField txtcreep1 = new JTextField();
    JTextField txtcreep2 = new JTextField();
    JTextField txtcreep3 = new JTextField();
    JTextField txtcreep4 = new JTextField();
    JTextField txtcreep5 = new JTextField();
    JTextField txtgold1 = new JTextField();
    JTextField txtgold2 = new JTextField();
    JTextField txtgold3 = new JTextField();
    JTextField txtgold4 = new JTextField();
    JTextField txtgold5 = new JTextField();
    JTextField txttorre = new JTextField();
    JTextField txtdrag = new JTextField();
    JTextField txtbaron = new JTextField();
    JButton btnProx = new JButton("Próximo");
    
    Container cp = getContentPane();
    
    public insDdaGUI(int a, int b){
        
        setTitle("LOL Stats");
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
 
        cp.add(lbljogador, c);
       //------------------------
        switch(a){
            case 0:
                c.gridy = 2;
        
                cp.add(lbljogador1, c);
        
                c.gridy = 3;
        
                cp.add(lbljogador2, c);
        
                c.gridy = 4;
        
                cp.add(lbljogador3, c);
        
                c.gridy = 5;
        
                cp.add(lbljogador4, c);
        
                c.gridy = 6;
        
                cp.add(lbljogador5, c);
                
                break;
                
            case 1:
                c.gridy = 2;
        
                cp.add(lbljogador6, c);
        
                c.gridy = 3;
        
                cp.add(lbljogador7, c);
        
                c.gridy = 4;
        
                cp.add(lbljogador8, c);
        
                c.gridy = 5;
        
                cp.add(lbljogador9, c);
        
                c.gridy = 6;
        
                cp.add(lbljogador10, c);
                
                break;
                
            case 2:
                c.gridy = 2;
        
                cp.add(lbljogador11, c);
        
                c.gridy = 3;
        
                cp.add(lbljogador12, c);
        
                c.gridy = 4;
        
                cp.add(lbljogador13, c);
        
                c.gridy = 5;
        
                cp.add(lbljogador14, c);
        
                c.gridy = 6;
        
                cp.add(lbljogador15, c);
                
                break;
                
            case 3:
                c.gridy = 2;
        
                cp.add(lbljogador16, c);
        
                c.gridy = 3;
        
                cp.add(lbljogador17, c);
        
                c.gridy = 4;
        
                cp.add(lbljogador18, c);
        
                c.gridy = 5;
        
                cp.add(lbljogador19, c);
        
                c.gridy = 6;
        
                cp.add(lbljogador20, c);
                
                break;
                
            case 4:
                c.gridy = 2;
        
                cp.add(lbljogador21, c);
        
                c.gridy = 3;
        
                cp.add(lbljogador22, c);
        
                c.gridy = 4;
        
                cp.add(lbljogador23, c);
        
                c.gridy = 5;
        
                cp.add(lbljogador24, c);
        
                c.gridy = 6;
        
                cp.add(lbljogador25, c);
                
                break;
                
            case 5:
                c.gridy = 2;
        
                cp.add(lbljogador26, c);
        
                c.gridy = 3;
        
                cp.add(lbljogador27, c);
        
                c.gridy = 4;
        
                cp.add(lbljogador28, c);
        
                c.gridy = 5;
        
                cp.add(lbljogador29, c);
        
                c.gridy = 6;
        
                cp.add(lbljogador30, c);
                
                break;
                
            case 6:
                c.gridy = 2;
        
                cp.add(lbljogador31, c);
        
                c.gridy = 3;
        
                cp.add(lbljogador32, c);
        
                c.gridy = 4;
        
                cp.add(lbljogador33, c);
        
                c.gridy = 5;
        
                cp.add(lbljogador34, c);
        
                c.gridy = 6;
        
                cp.add(lbljogador35, c);
                
                break;
                
            case 7:
                c.gridy = 2;
        
                cp.add(lbljogador36, c);
        
                c.gridy = 3;
        
                cp.add(lbljogador37, c);
        
                c.gridy = 4;
        
                cp.add(lbljogador38, c);
        
                c.gridy = 5;
        
                cp.add(lbljogador39, c);
        
                c.gridy = 6;
        
                cp.add(lbljogador40, c);
                
                break;
                
        }
        //------------------
        c.gridy = 1;
        c.gridx = 1;
        
        cp.add(lblchamp, c);
        
        c.gridx = 2;
        
        cp.add(lblkill, c);
        
        c.gridx = 3;
        
        cp.add(lblassist, c);
        
        c.gridx = 4;
        
        cp.add(lbldeath, c);
        
        c.gridx = 5;
        
        cp.add(lblcreep, c);
        
        c.gridx = 6;
        
        cp.add(lblgold, c);
        //--------------------------
        c.gridwidth = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.WEST;
        //------------------
        c.gridx = 1;
        c.gridy = 2;
        
        cp.add(txtchamp1, c);
        
        c.gridy = 3;
        
        cp.add(txtchamp2, c);
        
        c.gridy = 4;
        
        cp.add(txtchamp3, c);
        
        c.gridy = 5;
        
        cp.add(txtchamp4, c);
        
        c.gridy = 6;
        
        cp.add(txtchamp5, c);
        //----------------------------
        c.gridx = 2;
        c.gridy = 2;
        
        cp.add(txtkill1, c);
        
        c.gridy = 3;
        
        cp.add(txtkill2, c);
        
        c.gridy = 4;
        
        cp.add(txtkill3, c);
        
        c.gridy = 5;
        
        cp.add(txtkill4, c);
        
        c.gridy = 6;
        
        cp.add(txtkill5, c);
        //------------------
        c.gridx = 3;
        c.gridy = 2;
        
        cp.add(txtassist1, c);
        
        c.gridy = 3;
        
        cp.add(txtassist2, c);
        
        c.gridy = 4;
        
        cp.add(txtassist3, c);
        
        c.gridy = 5;
        
        cp.add(txtassist4, c);
        
        c.gridy = 6;
        
        cp.add(txtassist5, c);
        //-----------------------
        c.gridx = 4;
        c.gridy = 2;
        
        cp.add(txtdeath1, c);
        
        c.gridy = 3;
        
        cp.add(txtdeath2, c);
        
        c.gridy = 4;
        
        cp.add(txtdeath3, c);
        
        c.gridy = 5;
        
        cp.add(txtdeath4, c);
        
        c.gridy = 6;
        
        cp.add(txtdeath5, c);
        //-----------------------
        c.gridx = 5;
        c.gridy = 2;
        
        cp.add(txtcreep1, c);
        
        c.gridy = 3;
        
        cp.add(txtcreep2, c);
        
        c.gridy = 4;
        
        cp.add(txtcreep3, c);
        
        c.gridy = 5;
        
        cp.add(txtcreep4, c);
        
        c.gridy = 6;
        
        cp.add(txtcreep5, c);
        //---------------------
        c.gridx = 6;
        c.gridy = 2;
        
        cp.add(txtgold1, c);
        
        c.gridy = 3;
        
        cp.add(txtgold2, c);
        
        c.gridy = 4;
        
        cp.add(txtgold3, c);
        
        c.gridy = 5;
        
        cp.add(txtgold4, c);
        
        c.gridy = 6;
        
        cp.add(txtgold5, c);
        //----------------------------
        c.gridx = 1;
        c.gridy = 7;
        
        cp.add(lbltorre, c);
        
        c.gridx = 2;
        
        cp.add(txttorre, c);
        
        c.gridx = 3;
        
        cp.add(lbldrag, c);
        
        c.gridx = 4;
        
        cp.add(txtdrag, c);
        
        c.gridx = 5;
        
        cp.add(lblbaron, c);
        
        c.gridx = 6;
        
        cp.add(txtbaron, c);
        //--------------------------
        c.gridy = 8;
        c.fill = GridBagConstraints.NONE;
        
        cp.add(btnProx, c);
        
        pack();
        
        btnProx.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              new insDdvGUI(b);
              dispose();
               
            }
        });
   
    }
}
