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
import javax.swing.JFrame;
import javax.swing.JTable;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
/**
 *
 * @author root
 */
public class plyStatsGUI extends JFrame {
    
    Stats_lol jg  = new Stats_lol();
    String[] columnNames =  {"Jogador",
                        "KDA",
                        "Farm médio",
                        "Farm por minuto",
                        "Ouro",
                        "Ouro por minuto",
                        "% paticipação de abates",};
        Object[][] data = { 
    {jg.jogador1, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador2, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador3, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador4, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador5, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador6, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador7, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador8, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador9, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador10, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador11, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador12, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador13, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador14, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador15, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador16, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador17, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador18, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador19, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador20, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador21, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador22, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador23, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador24, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador25, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador26, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador27, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador28, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador29, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador30, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador31, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador32, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador33, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador34, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador35, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador36, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador37, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador38, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador39, 5,
     200, 10, 19.4, 250, 75},
    {jg.jogador40, 5,
     200, 10, 19.4, 250, 75},
    
};
    
    JTable tblply = new JTable(data, columnNames);
    
    Container cp = getContentPane();
    
    public plyStatsGUI(){
        
        
        tblply.setEnabled(false);
             
        checkVersion checkVersion = new checkVersion();
        
        setTitle("LoL Stats " + checkVersion.version);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setSize(200, 200);
        setLocationRelativeTo(null);
        
        cp.setLayout(new GridBagLayout());
        
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.CENTER;
        c.insets = new Insets(0, 10, 0, 10);
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 0;
        
        cp.add(tblply.getTableHeader());
        
        c.insets = new Insets(0, 10, 10, 10);
        c.gridy = 1;
        
        cp.add(tblply, c);
        
        pack();
        
     
    }
}
