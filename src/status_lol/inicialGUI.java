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
 * @author cristofer
 */
public class inicialGUI extends JFrame{
    
    JLabel lblTitle = new JLabel("Selecione sua opção");
    JButton btnVerStats = new JButton("Ver Stats");
    JButton btnInsJg = new JButton("Inserir novo jogo");
    
    Container cp = getContentPane();
    
    public inicialGUI(){
        setTitle("LOL Stats");
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
        
        cp.add(btnVerStats, c);
        
        c.gridy = 2;
        
        cp.add(btnInsJg, c);
        
        btnVerStats.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               new statsGUI();
            }
            });
        btnInsJg.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               new insJgGUI();
            }
            });
    }
}
