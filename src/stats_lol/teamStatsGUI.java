package stats_lol;

/*I will only comment things that are new in each class, 
90% of the comments in the "chStatsGUI" can be used in all other classes */

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JTable;
import static stats_lol.Stats_lol.*;
import static stats_lol.checkVersion.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Cristofer
 */

//Teams stats GUI
public class teamStatsGUI extends JFrame {
    
    Object data[][];
    
    ReadWrite rw = new ReadWrite();
    
    double[] at, ad, ab, am, wr, t, d, b, mt, w, games;
    
    String[] columnNames =  {"Team",
                        "Averge turrets",
                        "Averge dragons",
                        "Averge Barons",
                        "Averge match time",
                        "Win ratio",};
    
    Container cp = getContentPane();
    
    public teamStatsGUI(){
        
        at = new double[8];
        ad = new double[8];
        ab = new double[8];
        am = new double[8];
        wr = new double[8];
        t = new double[8];
        d = new double[8];
        b = new double[8];
        mt = new double[8];
        w = new double[8];
        games = new double[8];
        
        for(int i = 0; i < 8; i++){
            rw.readWrite(false, 1, i, 4, 0);
            t[i] = Integer.parseInt(rw.rl);
            rw.readWrite(false, 1, i, 5, 0);
            d[i] = Integer.parseInt(rw.rl);
            rw.readWrite(false, 1, i, 6, 0);
            b[i] = Integer.parseInt(rw.rl);
            rw.readWrite(false, 1, i, 3, 0);
            mt[i] = Integer.parseInt(rw.rl);
            rw.readWrite(false, 1, i, 2, 0);
            w[i] = Integer.parseInt(rw.rl);
            rw.readWrite(false, 1, i, 1, 0);
            games[i] = Integer.parseInt(rw.rl);
            if(games[i] == 0){
                games[i] = 1;
            }
        }
        
        for(int i = 0; i < 8; i++){
            at[i] = t[i]/games[i];
            ad[i] = d[i]/games[i];
            ab[i] = b[i]/games[i];
            am[i] = mt[i]/games[i];
            wr[i] = 100*(w[i]/games[i]);
        }
        
        
        data = new Object[8][6];
                                        
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 6; j++){
                if(j == 0){
                    data[i][j] = team[i];
                }
                else if(j == 1){
                    data[i][j] = at[i];
                }
                else if(j == 2){
                    data[i][j] = ad[i];
                }
                else if(j == 3){
                    data[i][j] = ab[i];
                }
                else if(j == 4){
                    data[i][j] = am[i];
                }
                else if(j == 5){
                    data[i][j] = wr[i];                  
                }
            }
        }
        
        JTable tblTeam = new JTable(data, columnNames);
        
        tblTeam.setEnabled(false);
        tblTeam.setAutoCreateRowSorter(true);
        
        setTitle("LoL Stats Maker " +version);
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
        
        cp.add(tblTeam.getTableHeader());
        
        c.insets = new Insets(0, 10, 10, 10);
        c.gridy = 1;
        
        cp.add(tblTeam, c);
        
        pack();
    }
}
