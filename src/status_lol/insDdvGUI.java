/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status_lol;

import java.lang.String;
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
public class insDdvGUI extends JFrame{
    
    public String jogador1;
    public String jogador2;
    public String jogador3;
    public String jogador4;
    public String jogador5;
    
    JLabel lblTitle = new JLabel("Lado Vermelho");
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
    
    public insDdvGUI(int a){
       switch(a){
           case 0:
               jogador1 = "Ignatius";
               jogador2 = "Vithrow";
               jogador3 = "esquelda";
               jogador4 = "tij";
               jogador5 = "Leoxes";
               break;
           case 1:
               jogador1 = "Xuleta JJ";
               jogador2 = "Trullian";
               jogador3 = "vargas baloso";
               jogador4 = "rS Berta1";
               jogador5 = "WISER Perachi Oz";
               break;
           case 2:
               jogador1 = "GHKgustavo";
               jogador2 = "proX KungBANG";
               jogador3 = "farélinho";
               jogador4 = "StarLine";
               jogador5 = "PrimooN";
               break;
           case 3:
               jogador1 = "Lukinhas Monxtro";
               jogador2 = "jbiyvh";
               jogador3 = "gahgreguer";
               jogador4 = "Andreeez1nPLAY";
               jogador5 = "KoitOShiro";
               break;
           case 4:
               jogador1 = "Jhony o Pedreiro";
               jogador2 = "rS XandimonZ";
               jogador3 = "Minkão desu RXRX";
               jogador4 = "Oceanz";
               jogador5 = "Supremo Sir Goku";
               break;
           case 5:
               jogador1 = "Charlie Vraum";
               jogador2 = "WISER médium";
               jogador3 = "Persh";
               jogador4 = "falconkiler";
               jogador5 = "zerovampire730";
               break;
           case 6:
               jogador1 = "SooLdaaDOOO";
               jogador2 = "iHamm";
               jogador3 = "SooLdaaDOO";
               jogador4 = "parag41o";
               jogador5 = "kranionakara";
               break;
           case 7:
               jogador1 = "DaarkFighter";
               jogador2 = "BlazeeKryst";
               jogador3 = "xXDownloadXx";
               jogador4 = "xGlhc";
               jogador5 = "ThunderCraash";
               break;
        }
       
        JLabel lbljogador1 = new JLabel("" + jogador1);
        JLabel lbljogador2 = new JLabel("" + jogador2);
        JLabel lbljogador3 = new JLabel("" + jogador3);
        JLabel lbljogador4 = new JLabel("" + jogador4);
        JLabel lbljogador5 = new JLabel("" + jogador5);
        
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
        //----------------------------
        c.gridy = 8;
        c.fill = GridBagConstraints.NONE;
        
        cp.add(btnProx, c);
        
        pack();
        
        btnProx.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              dispose();
            }
        });
   
    }
}
