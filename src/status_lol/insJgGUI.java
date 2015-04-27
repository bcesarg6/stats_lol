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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
/**
 *
 * @author cristofer
 */
public class insJgGUI extends JFrame{
    
    Stats_lol tm = new Stats_lol();
    
    String [] teams = {tm.time1, tm.time2, tm.time3, tm.time4, tm.time5,
            tm.time6, tm.time7, tm.time8};
    
    JLabel lblazul = new JLabel("Lado azul:");
    JLabel lblvermelho = new JLabel("Lado vermelho:");
    JComboBox blue = new JComboBox(teams);
    JComboBox red = new JComboBox(teams);
    JButton btnProx = new JButton("Próximo");
    
    Container cp = getContentPane();
    
    public insJgGUI(){
        setTitle("LOL Stats");
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
        cp.add(lblazul, c);
        
        c.gridx = 1;
        c.anchor = GridBagConstraints.EAST;
        
        cp.add(blue, c);
        
        c.anchor = GridBagConstraints.NORTHWEST;
        
        c.gridy = 1;
        c.gridx = 0;
        
        cp.add(lblvermelho, c);
        
        c.anchor = GridBagConstraints.EAST;
        c.gridx = 1;
        
        cp.add(red, c);
        
        c.anchor = GridBagConstraints.EAST;
        c.gridx = 2;
        c.gridy = 2;
        
        cp.add(btnProx, c);
        pack();
        
        btnProx.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               if((blue.getSelectedIndex()) != (red.getSelectedIndex())){
                   dispose();
                   new insDIGUI(blue.getSelectedIndex(), red.getSelectedIndex());
               }
               else{
                   new errGUI();
               }
            }
        });
   
    }
}
