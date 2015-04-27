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
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author root
 */
public class finGUI extends JFrame {
    
    JLabel lblfin = new JLabel("Jogo adicionado com sucesso");
    JButton btnfin = new JButton("Terminar");
        
    Container cp = getContentPane();
    
    public finGUI() {
       checkVersion checkVersion = new checkVersion();
        
        setTitle("LoL Stats " + checkVersion.version);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setSize(300, 100);
        setLocationRelativeTo(null);
        
        cp.setLayout(new GridBagLayout());
        
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.NORTH;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        
        cp.add(lblfin, c);
        
        c.gridy = 1;
        
        cp.add(btnfin, c);
        
        btnfin.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              
                dispose();
               
            }
        });
    
    }
    
}
