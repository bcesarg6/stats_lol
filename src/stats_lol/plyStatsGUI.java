/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stats_lol;

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
    
    Stats_lol pl  = new Stats_lol();
    String[] columnNames =  {"Player",
                        "KDA",
                        "Averge farm",
                        "Farm per minute",
                        "Gold",
                        "Gold per minute",
                        "kill participation",};
        Object[][] data = { 
    {pl.player1, 5,
     200, 10, 19.4, 250, 75},
    {pl.player2, 5,
     200, 10, 19.4, 250, 75},
    {pl.player3, 5,
     200, 10, 19.4, 250, 75},
    {pl.player4, 5,
     200, 10, 19.4, 250, 75},
    {pl.player5, 5,
     200, 10, 19.4, 250, 75},
    {pl.player6, 5,
     200, 10, 19.4, 250, 75},
    {pl.player7, 5,
     200, 10, 19.4, 250, 75},
    {pl.player8, 5,
     200, 10, 19.4, 250, 75},
    {pl.player9, 5,
     200, 10, 19.4, 250, 75},
    {pl.player10, 5,
     200, 10, 19.4, 250, 75},
    {pl.player11, 5,
     200, 10, 19.4, 250, 75},
    {pl.player12, 5,
     200, 10, 19.4, 250, 75},
    {pl.player13, 5,
     200, 10, 19.4, 250, 75},
    {pl.player14, 5,
     200, 10, 19.4, 250, 75},
    {pl.player15, 5,
     200, 10, 19.4, 250, 75},
    {pl.player16, 5,
     200, 10, 19.4, 250, 75},
    {pl.player17, 5,
     200, 10, 19.4, 250, 75},
    {pl.player18, 5,
     200, 10, 19.4, 250, 75},
    {pl.player19, 5,
     200, 10, 19.4, 250, 75},
    {pl.player20, 5,
     200, 10, 19.4, 250, 75},
    {pl.player21, 5,
     200, 10, 19.4, 250, 75},
    {pl.player22, 5,
     200, 10, 19.4, 250, 75},
    {pl.player23, 5,
     200, 10, 19.4, 250, 75},
    {pl.player24, 5,
     200, 10, 19.4, 250, 75},
    {pl.player25, 5,
     200, 10, 19.4, 250, 75},
    {pl.player26, 5,
     200, 10, 19.4, 250, 75},
    {pl.player27, 5,
     200, 10, 19.4, 250, 75},
    {pl.player28, 5,
     200, 10, 19.4, 250, 75},
    {pl.player29, 5,
     200, 10, 19.4, 250, 75},
    {pl.player30, 5,
     200, 10, 19.4, 250, 75},
    {pl.player31, 5,
     200, 10, 19.4, 250, 75},
    {pl.player32, 5,
     200, 10, 19.4, 250, 75},
    {pl.player33, 5,
     200, 10, 19.4, 250, 75},
    {pl.player34, 5,
     200, 10, 19.4, 250, 75},
    {pl.player35, 5,
     200, 10, 19.4, 250, 75},
    {pl.player36, 5,
     200, 10, 19.4, 250, 75},
    {pl.player37, 5,
     200, 10, 19.4, 250, 75},
    {pl.player38, 5,
     200, 10, 19.4, 250, 75},
    {pl.player39, 5,
     200, 10, 19.4, 250, 75},
    {pl.player40, 5,
     200, 10, 19.4, 250, 75},
    
};
    
    JTable tblPly = new JTable(data, columnNames);
    
    Container cp = getContentPane();
    
    public plyStatsGUI(){
        
        
        tblPly.setEnabled(false);
             
        checkVersion checkVersion = new checkVersion();
        
        setTitle("LoL Stats Maker " + checkVersion.version);
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
        
        cp.add(tblPly.getTableHeader());
        
        c.insets = new Insets(0, 10, 10, 10);
        c.gridy = 1;
        
        cp.add(tblPly, c);
        
        pack();
        
     
    }
}
