package stats_lol;

/*I will only comment things that are new in each class, 
90% of the comments in the "chStatsGUI" can be used in all other classes */

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import static stats_lol.Stats_lol.*;
import static stats_lol.CheckVersion.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.TableColumn;

/**
 *
 * @author Cristofer
 */

//Teams stats GUI
public class TeamStatsGUI extends JFrame {
    
    ReadWrite rw = new ReadWrite();
    
    Object data[][], v[];
    double[] at, ad, ab, am, wr, t, d, b, mt, w, games;
    String[] columnNames =  {"Team",
                        "Averge turrets",
                        "Averge dragons",
                        "Averge Barons",
                        "Averge match time",
                        "Win ratio",};
    String[] toolTipText = {"Team name",
                        "Total turrets/total games",
                        "Total dragons/total games",
                        "Total barons/total games",
                        "Total time played/total games",
                        "Total wins/total games"};
    
    Container cp = getContentPane();
    
    public TeamStatsGUI(){
        
        JButton[] btn;
        TableColumn[] tc;
        JTable tblTeam;
        
        v = new Object[columnNames.length];
        
        v[0] = team;
        v[1] = at = new double[8];
        v[2] = ad = new double[8];
        v[3] = ab = new double[8];
        v[4] = am = new double[8];
        v[5] = wr = new double[8];
        t = new double[8];
        d = new double[8];
        b = new double[8];
        mt = new double[8];
        w = new double[8];
        games = new double[8];
        
        data = new Object[8][6];
        
        btn = new JButton[v.length];
        tc = new TableColumn[v.length];
        
        for(int i = 0; i< v.length; i++){
            btn[i] = new JButton(columnNames[i]);
        }
        
        for(int i = 0; i < 8; i++){
            t[i] = rw.readWrite(false, 1, i, 4, 0);
            d[i] = rw.readWrite(false, 1, i, 5, 0);
            b[i] = rw.readWrite(false, 1, i, 6, 0);
            mt[i] = rw.readWrite(false, 1, i, 3, 0);
            w[i] = rw.readWrite(false, 1, i, 2, 0);
            games[i] = rw.readWrite(false, 1, i, 1, 0);
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
                                        
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 6; j++){
                if(j == 0){
                    data[i][j] = team[i];
                }
                else if(j == 1){
                    data[i][j] = (int)at[i];
                }
                else if(j == 2){
                    data[i][j] = (int)ad[i];
                }
                else if(j == 3){
                    data[i][j] = (int)ab[i];
                }
                else if(j == 4){
                    data[i][j] = (int)am[i];
                }
                else if(j == 5){
                    data[i][j] = (int)wr[i];                  
                }
            }
        }
        
        tblTeam = new JTable(data, columnNames);
        
        for(int i = (v.length-1); i > -1; i--){
            tc[i] = tblTeam.getColumnModel().getColumn(i);
            tc[i].setHeaderRenderer(new EditableHeaderRenderer(btn[i], i, 0, tblTeam, toolTipText[i]));
        }
        
        for (int c = 0; c < tblTeam.getColumnCount(); c++){
            Class<?> col_class = tblTeam.getColumnClass(c);
            tblTeam.setDefaultEditor(col_class, null);        // remove editor
        }
        
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