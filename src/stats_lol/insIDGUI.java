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
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
/**
 *
 * @author root
 */
public class insIDGUI extends JFrame{
    
    JLabel lblBans = new JLabel("       Bans        ");
    JLabel lblWin = new JLabel("Winner side");
    JLabel lblTmp = new JLabel("Match time");
    JLabel lbl = new JLabel("                        ");
    JTextField txtBan1 = new JTextField();
    JTextField txtBan2 = new JTextField();
    JTextField txtBan3 = new JTextField();
    JTextField txtBan4 = new JTextField();
    JTextField txtBan5 = new JTextField();
    JTextField txtBan6 = new JTextField();
    JTextField txtTmp = new JTextField();
    JRadioButton rbtBlue = new JRadioButton("Blue");
    JRadioButton rbtRed = new JRadioButton("Red");
    ButtonGroup  btgWin = new ButtonGroup();
    JButton btnNext = new JButton("Next");    
    
    Container cp = getContentPane();
    
    public insIDGUI(int a, int b){
        
        btgWin.add(rbtBlue);
        btgWin.add(rbtRed);
        
        checkVersion checkVersion = new checkVersion();
        
        setTitle("LoL Stats Maker " + checkVersion.version);
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
        
        cp.add(lblBans, c);
        
        c.gridx = 2;
        
        cp.add(lbl);
        
        c.gridx = 3;
        
        cp.add(lblWin, c);
        
        c.gridx = 0;
        c.gridy = 1;
        
        cp.add(txtBan1, c);
        
        c.gridx = 1;
        
        cp.add(txtBan2, c);
        
        c.gridx = 2;
        
        cp.add(txtBan3, c);
        
        c.gridx = 0;
        c.gridy = 2;
        
        cp.add(txtBan4, c);
        
        c.gridx = 1;
        
        cp.add(txtBan5, c);
        
        c.gridx = 2;
        
        cp.add(txtBan6, c);
        
        c.gridx = 3;
        c.gridy = 1;
        c.gridwidth = 1;
        
        cp.add(rbtBlue, c);
        
        c.gridy = 2;
        
        cp.add(rbtRed, c);
        
        c.gridx = 0;
        c.gridy = 3;
        
        cp.add(lblTmp, c);
        
        c.gridx = 1;
        
        cp.add(txtTmp, c);
        
        c.gridx = 3;
        c.gridwidth = 1;
        
        cp.add(btnNext, c);
        
        pack();
        btnNext.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              new insBDGUI(a, b);
              dispose();
               
            }
        });
    }
    
}
