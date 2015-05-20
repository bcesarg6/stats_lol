package stats_lol;

import java.util.*;
import javax.swing.JTable;

public class RowSorter {
    
    int a[], b[], d[], row, col;
    Object c[], v[], x[], g[], h[];
    String s[], clas;
    
    public void rowSorter(int colm, double e[], JTable tb, int cl){
        if(cl == 0){
            row = tb.getRowCount();
            col = tb.getColumnCount();
            a = new int[row];
            b = new int[row];
            c = new Object[row];
            d = new int[row];
            x = new String[row];
            g = new String[row];
            v = new Object[row*col];
            s = new String[row];
            clas = tb.getValueAt(0, colm).getClass().getName();
            
            cl = -1;
        }
        
        for(int i = 0; i < c.length; i++){
            c[i] = tb.getValueAt(i, colm);
            if(!(clas.equals("java.lang.String"))){
                d[i] = (int)c[i];
            }
            else{
                s[i] = (String)c[i];
            }
        }
        
        if(!(clas.equals("java.lang.String"))){
            for(int i = 0; i < d.length; i++){
                a[i] = (d.length-1);
                b[i] = 0;
                for(int j = 0; j < d.length; j++){
                    if(d[i] > d[j]){
                        a[i]--;
                        b[i]++;
                    }
                    else if(d[i] == d[j]){
                        if(e[i] > e[j]){
                            a[i]--;
                            b[i]++;
                        }
                    }
                }
            }
        }
        else{
            List<String> data = Arrays.asList(s);
            g = data.toArray();
            Collections.sort(data);
            x = data.toArray();
            
            for(int i = 0; i < row; i++){
                for(int j = 0; j < row; j++){
                    if(g[i].equals(x[j])){
                        a[i] = j;
                        b[i] = -1*(j - (row -1));
                    }
                }
            }
        }
            
            for(int i = 0; i < col; i++){
                for(int j = 0; j < row; j++){
                    v[(i*row)+j] = tb.getValueAt(j, i);
                }
            }

        if(cl%2 == 0){
            
            for(int i = 0; i < col; i++){
                for(int j = 0; j < row; j++){
                    tb.setValueAt(v[(i*row)+j], a[j], i);
                }
            }
        }
        
        else if(cl%2 == 1){
            
            for(int i = 0; i < col; i++){
                for(int j = 0; j < row; j++){
                    tb.setValueAt(v[(i*row)+j], b[j], i);
                }
            }
        }
        
    }
}