package stats_lol;

/*I will only comment things that are new in each class, 
90% of the comments in the "chStatsGUI" can be used in all other classes */

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static stats_lol.CheckVersion.*;
import static stats_lol.Stats_lol.*;
import static stats_lol.Lang.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Cristofer
 */

//This is the first GUI of the program, here you chose between seeing stats or inserting new data
public class InicialGUI extends JFrame{
    ReadWrite rw = new ReadWrite();
           
    JLabel lblTitle = new JLabel(selecOption);
    JButton[] btn;
    
    String btnTxt[] = {"See stats",
                    "Insert new match",
                    "Clear all data"};
    String btnToolTipTxt[] = {"Opens a new interface with stats options",
                        "Starts the insertion of a new game",
                        "Clears all data made untill now"};
    
    Container cp = getContentPane();
    
    public InicialGUI(){
        
        btn = new JButton[3];
        
        for(int i = 0; i < btn.length; i++){
            btn[i] = new JButton(btnTxt[i]);
            btn[i].setToolTipText(btnToolTipTxt[i]);
        }
        
        setTitle("LoL Stats Maker " + version);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setSize(300, 200);
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
        
        cp.add(btn[0], c);
        
        c.gridy = 2;
        
        cp.add(btn[1], c);
        
        c.gridy = 3;
        
        cp.add(btn[2], c);
        
        btn[0].addActionListener((ActionEvent e) -> {
            
            StatsGUI statsGUI = new StatsGUI(); //Opens the StatsGUI if clicked
            
        });
        
        btn[1].addActionListener((ActionEvent e) -> {

            boolean ex = rw.tmpExists();
            if(ex){
                int[] s;
                String[] r;
                r = rw.readLines(5, tmpStage);
                s = new int[r.length];
                for (int i = 0; i < r.length; i++) {
                    s[i] = r[i] != null ? Integer.parseInt(r[i]) : 0;                
                }
                switch(s[0]){
                    case 1:
                        InsIDGUI insIDGUI = new InsIDGUI(s[1], s[2], s[3]);
                        break;
                    case 2:
                        InsBDGUI insBDGUI = new InsBDGUI(s[1], s[2], s[3], s[4]);
                        break;
                    case 3:
                        InsRDGUI insRDGUI = new InsRDGUI(s[1], s[2], s[3], s[4]);
                        break;
                    case 4:
                        FinGUI finGUI = new FinGUI(s[1], s[2], s[3]);
                }
            }
            else{
                InsMtGUI insMtGUI = new InsMtGUI(0);
            }
        });
        
        btn[2].addActionListener((ActionEvent e) -> {
            int r = 1;
            ClearData cD = new ClearData();
            
            try {
                r = cD.clearData(dt);
            } 
            catch (IOException | URISyntaxException ex) {}
            if(r == 0){
                dispose();
            }
        });
    }
}