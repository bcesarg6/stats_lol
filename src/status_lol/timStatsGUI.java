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
public class timStatsGUI extends JFrame {
    
    Stats_lol tm = new Stats_lol();
    
    String[] columnNames =  {"Time",
                        "Torres por jogo",
                        "Dragões por jogo",
                        "Barões por jogo",
                        "Tempo médio de jogo",
                        "% de vitórias",};
        Object[][] data = {
    {tm.time1, 5,
     3, 1, 35, 70},
    {tm.time2, 5,
     3, 1, 35, 70},
    {tm.time3, 5,
     3, 1, 35, 70},
    {tm.time4, 5,
     3, 1, 35, 70},
    {tm.time5, 5,
     3, 1, 35, 70},
    {tm.time6, 5,
     3, 1, 35, 70},
    {tm.time7, 5,
     3, 1, 35, 70},
    {tm.time8, 5,
     3, 1, 35, 70},
};
    
    JTable tblply = new JTable(data, columnNames);
    
    Container cp = getContentPane();
    
    public timStatsGUI(){
        
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
