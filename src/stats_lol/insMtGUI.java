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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
/**
 *
 * @author cristofer
 */
public class insMtGUI extends JFrame{
    
    Stats_lol tm = new Stats_lol();
    
    String [] teams = {tm.team1, tm.team2, tm.team3, tm.team4, tm.team5,
            tm.team6, tm.team7, tm.team8};
    
    JLabel lblBlue = new JLabel("Blue side:");
    JLabel lblRed = new JLabel("Red side:");
    JComboBox blue = new JComboBox(teams);
    JComboBox red = new JComboBox(teams);
    JButton btnNext = new JButton("Next");
    
    Container cp = getContentPane();
    
    public insMtGUI(){
        checkVersion checkVersion = new checkVersion();
        
        setTitle("LoL Stats Maker " + checkVersion.version);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setSize(400, 150);
        setLocationRelativeTo(null);
        
        cp.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.NORTHWEST;
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        cp.add(lblBlue, c);
        
        c.gridx = 1;
        c.anchor = GridBagConstraints.EAST;
        
        cp.add(blue, c);
        
        c.anchor = GridBagConstraints.NORTHWEST;
        
        c.gridy = 1;
        c.gridx = 0;
        
        cp.add(lblRed, c);
        
        c.anchor = GridBagConstraints.EAST;
        c.gridx = 1;
        
        cp.add(red, c);
        
        c.anchor = GridBagConstraints.EAST;
        c.gridx = 2;
        c.gridy = 2;
        
        cp.add(btnNext, c);
        pack();
        
        btnNext.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               if((blue.getSelectedIndex()) != (red.getSelectedIndex())){
                   dispose();
                   new insIDGUI(blue.getSelectedIndex(), red.getSelectedIndex());
               }
               else{
                   new errGUI();
               }
            }
        });
   
    }
}
