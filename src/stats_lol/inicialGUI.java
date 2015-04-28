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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;


/**
 *
 * @author cristofer
 */
public class inicialGUI extends JFrame{
    
    
    
    JLabel lblTitle = new JLabel("Select your option");
    JButton btnStats = new JButton("See stats");
    JButton btnInsMt = new JButton("Insert new match");
    
    Container cp = getContentPane();
    
    public inicialGUI(){
        checkVersion checkVersion = new checkVersion();
        
        setTitle("LoL Stats Maker " + checkVersion.version);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setSize(300, 150);
        setLocationRelativeTo(null);
        
        cp.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.PAGE_START;
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        cp.add(lblTitle, c);
        
        c.gridy = 1;
        c.anchor = GridBagConstraints.CENTER;
        
        cp.add(btnStats, c);
        
        c.gridy = 2;
        
        cp.add(btnInsMt, c);
        
        btnStats.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               new statsGUI();
            }
            });
        btnInsMt.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               new insMtGUI();
            }
            });
    }
}
