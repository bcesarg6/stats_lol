package stats_lol;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JTable;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import static stats_lol.Stats_lol.*;

/*I will only comment things that are new in each class, 
90% of the comments in the "chStatsGUI" can be used in all other classes */

/**
 *
 * @author Cristofer
 */

public class ScoreTableGUI extends JFrame {
    
    checkVersion checkVersion = new checkVersion();
    
    ReadWrite rw = new ReadWrite();
     
    double[] wr, pa, p, g, w, t, l, tw, tl, tg;
    
    Object data[][];
    
    String[] columnNames =  {"Team",
                        "Points",
                        "Games", 
                        "Wins",
                        "Ties",
                        "Loses",
                        "Total wins",
                        "Total loses",
                        "Win ratio",
                        "%",};
    
    Container cp = getContentPane(); 

    public ScoreTableGUI(){
        
        p = new double[8];
        g = new double[8];
        w = new double[8];
        t = new double[8];
        l = new double[8];
        tw = new double[8];
        tl = new double[8];
        wr = new double[8];
        tg = new double[8];
        pa = new double[8];
        
        for(int i = 0; i < 8; i++){
            rw.readWrite(false, -2, i);
            p[i] = Integer.parseInt(rw.nB);
            rw.readWrite(false, 13, i);
            tg[i] = Integer.parseInt(rw.nB);
            if(tg[i] == 0){
                tg[i] = 1;
            }
            g[i] = tg[i]/2;
            if(g[i] == 0.5){
                g[i] = 0;
            }
            rw.readWrite(false, 1, i);
            tw[i] = Integer.parseInt(rw.nB);
            rw.readWrite(false, 12, i);
            t[i] = Integer.parseInt(rw.nB);
            tl[i] = tg[i] - tw[i];
            wr[i] = 100*(tw[i]/tg[i]);
            pa[i] = g[i] == 0 ? 0 : 100*(p[i]/(g[i]*3));
            w[i] = (tw[i] - t[i])/2;
            l[i] = g[i] - w[i] - t[i];
        }
        
        data = new Object[8][10];
        
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 10; j++){
                if(j == 0){
                    data[i][j] = team[i];
                }
                else if(j == 1){
                    data[i][j] = p[i];
                }
                else if(j == 2){
                    data[i][j] = g[i];
                }
                else if(j == 3){
                    data[i][j] = w[i];
                }
                else if(j == 4){
                    data[i][j] = t[i];
                }
                else if(j == 5){
                    data[i][j] = l[i];
                }
                else if(j == 6){
                    data[i][j] = tw[i];
                }
                else if(j == 7){
                    data[i][j] = tl[i];
                }
                else if(j == 8){
                    data[i][j] = wr[i];
                }
                else if(j == 9){
                    data[i][j] = pa[i];
                }
            }
        }
        
        JTable tblScore = new JTable(data, columnNames);
        
        tblScore.setEnabled(false); 
        
        tblScore.setAutoCreateRowSorter(true);
        
        setTitle("LoL Stats Maker " + checkVersion.version);
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
        
        cp.add(tblScore.getTableHeader());
        
        c.insets = new Insets(0, 10, 10, 10);
        c.gridy = 1;
        
        cp.add(tblScore, c);
        
        pack();
    }
    
}
