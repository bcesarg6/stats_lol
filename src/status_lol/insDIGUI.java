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
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
/**
 *
 * @author root
 */
public class insDIGUI extends JFrame{
    
    JLabel lblbans = new JLabel("       Bans        ");
    JLabel lblwin = new JLabel("Lado ganhador");
    JLabel lbltmp = new JLabel("Tempo de jogo");
    JLabel lbl = new JLabel("                        ");
    JTextField txtban1 = new JTextField();
    JTextField txtban2 = new JTextField();
    JTextField txtban3 = new JTextField();
    JTextField txtban4 = new JTextField();
    JTextField txtban5 = new JTextField();
    JTextField txtban6 = new JTextField();
    JTextField txttmp = new JTextField();
    JRadioButton rbtazul = new JRadioButton("Azul");
    JRadioButton rbtverm = new JRadioButton("Vermelho");
    ButtonGroup  btgwin = new ButtonGroup();
    JButton btnprox = new JButton("Próximo");    
    
    Container cp = getContentPane();
    
    public insDIGUI(int a, int b){
        
        btgwin.add(rbtazul);
        btgwin.add(rbtverm);
        
        checkVersion checkVersion = new checkVersion();
        
        setTitle("LoL Stats " + checkVersion.version);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setSize(400, 150);
        setLocationRelativeTo(null);
        
        cp.setLayout(new GridBagLayout());
        
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.NORTH;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 1;
        
        cp.add(lblbans, c);
        
        c.gridx = 2;
        
        cp.add(lbl);
        
        c.gridx = 3;
        
        cp.add(lblwin, c);
        
        c.gridx = 0;
        c.gridy = 1;
        // c.gridwidth = 2;
        
        cp.add(txtban1, c);
        
        c.gridx = 1;
        
        cp.add(txtban2, c);
        
        c.gridx = 2;
        
        cp.add(txtban3, c);
        
        c.gridx = 0;
        c.gridy = 2;
        
        cp.add(txtban4, c);
        
        c.gridx = 1;
        
        cp.add(txtban5, c);
        
        c.gridx = 2;
        
        cp.add(txtban6, c);
        
        c.gridx = 3;
        c.gridy = 1;
        c.gridwidth = 1;
        
        cp.add(rbtazul, c);
        
        c.gridy = 2;
        
        cp.add(rbtverm, c);
        
        c.gridx = 0;
        c.gridy = 3;
        
        cp.add(lbltmp, c);
        
        c.gridx = 1;
        //c.gridwidth = 2;
        
        cp.add(txttmp, c);
        
        c.gridx = 3;
        c.gridwidth = 1;
        
        cp.add(btnprox, c);
        
        pack();
        btnprox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              new insDdaGUI(a, b);
              dispose();
               
            }
        });
    }
    
}
