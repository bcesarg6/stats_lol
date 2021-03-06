package stats_lol;

/*I will only comment things that are new in each class, 
90% of the comments in the "chStatsGUI" can be used in all other classes */

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import static stats_lol.Stats_lol.*;
import static stats_lol.CheckVersion.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.TableColumn;

/**
 *
 * @author Crisofer
 */

//Player stats table
public class PlyStatsGUI extends JFrame {
    
    ReadWrite rw = new ReadWrite();
    
    Object data[][], v[];
    double[] k, af, f, g, gm, kp,
             kl, dt, as, cr, gl,
             games, time, tk;
    String[] columnNames =  {"Player",
                        "KDA",
                        "Averge farm",
                        "Farm per minute",
                        "Gold",
                        "Gold per minute",
                        "Kill participation",};
    String[] toolTipText = {"Player name", 
                        "(Kill + assists)/deaths",
                        "Total farm/total games",
                        "Total farm/total time played",
                        "Total gold/total games",
                        "Total gold/total time played",
                        "Total kill of the team/player's kill+assists"};
    
    Container cp = getContentPane();
    
    public PlyStatsGUI() throws IOException{
        
        JButton[] btn;
        TableColumn[] tc;
        JTable tblPly;
        
        v = new Object[columnNames.length];
        
        v[0] = player;
        v[1] = k = new double[40];
        v[2] = af = new double[40];
        v[3] = f = new double[40];
        v[4] = g = new double[40];
        v[5] = gm = new double[40];
        v[6] = kp = new double[40];
        kl = new double[40];
        dt = new double[40];
        as = new double[40];
        cr = new double[40];
        gl = new double[40];
        games = new double[8];
        time = new double[8];
        tk = new double[8];
        
        data = new Object[40][7];
        
        btn = new JButton[v.length];
        tc = new TableColumn[v.length];
        
        for(int i = 0; i< v.length; i++){
            btn[i] = new JButton(columnNames[i]);
        }
        
        for(int i = 0; i < 40; i++){
            for(int h = 1; h < 6; h++){
                int rl = (int)rw.readWrite(false, 0, i, h, 0);
                if(h == 1){
                    kl[i] = rl;
                }
                else if(h == 2){
                    dt[i] = rl;
                    if(dt[i] == 0){
                        dt[i] = 1;
                    }
                }
                else if(h == 3){
                    as[i] = rl;
                }
                else if(h == 4){
                    cr[i] = rl;
                }
                else if(h == 5){
                    gl[i] = rl;
                }
            }
        }
               
        for(int i = 0; i < 8; i++){
            int h = i*5;
            for(int j = 0; j < 5; j++){
                tk[i] += k[j+h];   
            }
            games[i] = (int)rw.readWrite(false, 1, i, 1, 0);
            time[i] = (int)rw.readWrite(false, 1, i, 3, 0);
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
            int j = i/5;
            k[i] = (int) ((kl[i] + as[i])/dt[i]);
            af[i] = (int) (cr[i]/games[j]);
            f[i] = (int) (cr[i]/time[j]);
            g[i] = (int) (gl[i]/games[j]);
            gm[i] = (int) ((1000*gl[i])/time[j]);
            kp[i] = (int) ((kl[i] + as[i])/tk[j]) ;
        }
                                        
        for(int i = 0; i < 40; i++){
            for(int j = 0; j < 7; j++){
                if(j == 0){
                    data[i][j] = player[i];
                }
                else if(j == 1){
                    data[i][j] = (int)k[i];
                }
                else if(j == 2){
                    data[i][j] = (int)af[i];
                }
                else if(j == 3){
                    data[i][j] = (int)f[i];
                }
                else if(j == 4){
                    data[i][j] = (int)g[i];
                }
                else if(j == 5){
                    data[i][j] = (int)gm[i];                  
                }
                else if(j == 6){
                    data[i][j] = (int)kp[i];                   
                }
            }
        }
        
        tblPly = new JTable(data, columnNames); 
        
        for(int i = (v.length-1); i > -1; i--){
            tc[i] = tblPly.getColumnModel().getColumn(i);
            tc[i].setHeaderRenderer(new EditableHeaderRenderer(btn[i], i, 0, tblPly, toolTipText[i]));
        }
        
        for (int c = 0; c < tblPly.getColumnCount(); c++){           
            Class<?> col_class = tblPly.getColumnClass(c);
            tblPly.setDefaultEditor(col_class, null);        // remove editor
        }
        
        JScrollPane scroll = new JScrollPane(tblPly);
        
        setTitle("LoL Stats Maker " + version);
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