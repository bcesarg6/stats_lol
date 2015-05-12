package stats_lol;

/*I will only comment things that are new in each class, 
90% of the comments in the "chStatsGUI" can be used in all other classes */

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Crisofer
 */

//Player stats table
public class plyStatsGUI extends JFrame {
    
    Object data[][];
    
    double[] k, af, f, g, gm, kp,
             kl, dt, as, cr, gl,
             games, time, tk;
    
    ReadWrite rw = new ReadWrite();
    
    Stats_lol pl  = new Stats_lol();
    
    String[] columnNames =  {"Player",
                        "KDA",
                        "Averge farm",
                        "Farm per minute",
                        "Gold",
                        "Gold per minute",
                        "kill participation",};
    
    Container cp = getContentPane();
    
    public plyStatsGUI(){
        
        kl = new double[40];
        dt = new double[40];
        as = new double[40];
        cr = new double[40];
        gl = new double[40];
        k = new double[40];
        af = new double[40];
        f = new double[40];
        g = new double[40];
        gm = new double[40];
        kp = new double[40];
        games = new double[8];
        time = new double[8];
        tk = new double[8];
        
        for(int i = 0; i < 40; i++){
            for(int h = 7; h < 12; h++){
                rw.readWrite(false, h, i);
                if(h == 7){
                    kl[i] = Integer.parseInt(rw.nB);
                }
                else if(h == 8){
                    dt[i] = Integer.parseInt(rw.nB);
                    if(dt[i] == 0){
                        dt[i] = 1;
                    }
                }
                else if(h == 9){
                    as[i] = Integer.parseInt(rw.nB);
                }
                else if(h == 10){
                    cr[i] = Integer.parseInt(rw.nB);
                }
                else if(h == 11){
                    gl[i] = Integer.parseInt(rw.nB);
                }
            }
        }
               
        for(int i = 0; i < 8; i++){
            int h = i*5;
            for(int j = 0; j < 5; j++){
                tk[i] += k[j+h];   
            }
            rw.readWrite(false, 13, i);
            games[i] = Integer.parseInt(rw.nB);
            rw.readWrite(false, 2, i);
            time[i] = Integer.parseInt(rw.nB);
            if(games[i] == 0){
                games[i] = 1;
            }
            if(time[i] == 0){
                time[i] = 1;
            }
            if(tk[i] == 0){
                tk[i] = 1;
            }
        }
        
        for(int i = 0; i < 40; i++){
            int j = i < 5 ? 0 :(
                    (i > 4) && (i < 10) ? 1 : 
                        (j = (i > 9) && (i < 15) ? 2 : 
                            (j = (i > 14) && (i < 20) ? 3 :
                                (j = (i > 19) && (i < 25) ? 4 :
                                    (j = (i > 24) && (i < 30) ? 5 :
                                        (j = (i > 29) && (i < 35) ? 6 :
                                            (j = (i > 34) && (i < 40) ? 7 : null)))))));
            k[i] = (int) ((kl[i] + as[i])/dt[i]);
            af[i] = (int) (cr[i]/games[j]);
            f[i] = (int) (cr[i]/time[j]);
            g[i] = (int) (gl[i]/games[j]);
            gm[i] = (int) (1000*(gl[i]/time[j]));
            kp[i] = (int) ((kl[i] + as[i])/tk[j]) ;
        }
        
        data = new Object[40][7];
                                        
        for(int i = 0; i < 40; i++){
            for(int j = 0; j < 7; j++){
                if(j == 0){
                    data[i][j] = pl.player[i];
                }
                else if(j == 1){
                    data[i][j] = k[i];
                }
                else if(j == 2){
                    data[i][j] = af[i];
                }
                else if(j == 3){
                    data[i][j] = f[i];
                }
                else if(j == 4){
                    data[i][j] = g[i];
                }
                else if(j == 5){
                    data[i][j] = gm[i];                  
                }
                else if(j == 6){
                    data[i][j] = kp[i];                   
                }
            }
        }
        
        JTable tblPly = new JTable(data, columnNames);
        
        JScrollPane scroll = new JScrollPane(tblPly);
        
        tblPly.setEnabled(false);
             
        checkVersion checkVersion = new checkVersion();
        
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
        
        cp.add(tblPly.getTableHeader());
        
        c.insets = new Insets(0, 10, 10, 10);
        c.gridy = 1;
        
        cp.add(scroll, c);
        
        pack();       
     
    }
}
//Nothing new to comment here