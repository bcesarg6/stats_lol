package stats_lol;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JTable;
import static stats_lol.Stats_lol.*;
import static stats_lol.CheckVersion.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.TableColumn;

/*I will only comment things that are new in each class, 
90% of the comments in the "chStatsGUI" can be used in all other classes */

/**
 *
 * @author Cristofer
 */

public class ScoreTableGUI extends JFrame {
    
    ReadWrite rw = new ReadWrite();
    RowSorter rs = new RowSorter();

    double[] wr, pa, p, g, w, t, l, tw, tl, tg;
    Object data[][], v[];
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
    int colm = columnNames.length;
    
    Container cp = getContentPane();

    public ScoreTableGUI(){
        
        JButton[] btn;
        TableColumn[] tc;
        JTable tblScore;
        
        v = new Object[colm];
        
        v[0] = team;
        v[1] = p = new double[8];
        v[2] = g = new double[8];
        v[3] = w = new double[8];
        v[4] = t = new double[8];
        v[5] = l = new double[8];
        v[6] = tw = new double[8];
        v[7] = tl = new double[8];
        v[8] = wr = new double[8];
        v[9] = pa = new double[8];
        tg = new double[8];
        
        data = new Object[8][10];
       
        btn = new JButton[v.length];
        tc = new TableColumn[v.length];
        
        
        for(int i = 0; i< v.length; i++){
            btn[i] = new JButton(columnNames[i]);
        }
        
        for(int i = 0; i < 8; i++){
            rw.readWrite(false, 1, i, 7, 0);
            p[i] = Integer.parseInt(rw.rl);
            rw.readWrite(false, 1, i, 1, 0);
            tg[i] = Integer.parseInt(rw.rl);
            if(tg[i] == 0){
                tg[i] = 1;
            }
            g[i] = tg[i]/2;
            if(g[i] == 0.5){
                g[i] = 0;
            }
            rw.readWrite(false, 1, i, 2, 0);
            tw[i] = Integer.parseInt(rw.rl);
            rw.readWrite(false, 1, i, 8, 0);
            t[i] = Integer.parseInt(rw.rl);
            tl[i] = tg[i] - tw[i];
            wr[i] = 100*(tw[i]/tg[i]);
            pa[i] = g[i] == 0 ? 0 : 100*(p[i]/(g[i]*3));
            w[i] = tw[i] == 0 ? 0 :(tw[i] - (t[i]))/2;
            l[i] = g[i] - w[i] - t[i];
        }
        
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 10; j++){
                if(j == 0){
                    data[i][j] = team[i];
                }
                else if(j == 1){
                    data[i][j] = (int)p[i];
                }
                else if(j == 2){
                    data[i][j] = (int)g[i];
                }
                else if(j == 3){
                    data[i][j] = (int)w[i];
                }
                else if(j == 4){
                    data[i][j] = (int)t[i];
                }
                else if(j == 5){
                    data[i][j] = (int)l[i];
                }
                else if(j == 6){
                    data[i][j] = (int)tw[i];
                }
                else if(j == 7){
                    data[i][j] = (int)tl[i];
                }
                else if(j == 8){
                    data[i][j] = Math.round(wr[i]);
                }
                else if(j == 9){
                    data[i][j] = Math.round(pa[i]);
                }
            }
        }
        
        tblScore = new JTable(data, columnNames);
        
        for(int i = 1; i < v.length; i++){
            tc[i] = tblScore.getColumnModel().getColumn(i);
            tc[i].setHeaderRenderer(new EditableHeaderRenderer(btn[i], (double[])v[i], (double[])v[1], tblScore));               
        }   //sets the type of sorter for each column    

        for (int c = 0; c < tblScore.getColumnCount(); c++){
            
            Class<?> col_class = tblScore.getColumnClass(c);
            tblScore.setDefaultEditor(col_class, null);        // remove editor
        }

        setTitle("LoL Stats Maker " + version);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setSize(200, 200);
        setLocationRelativeTo(null);
        
        cp.setLayout(new GridBagLayout());
        
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        c.insets = new Insets(10, 10, 0, 10);
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 0;
        
        cp.add(tblScore.getTableHeader(), c);
        
        
        c.insets = new Insets(0, 10, 10, 10);
        c.gridy = 1;
        
        cp.add(tblScore, c);
        
        pack(); 
    }
}