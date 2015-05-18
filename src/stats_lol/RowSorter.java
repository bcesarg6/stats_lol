package stats_lol;

import javax.swing.JTable;

public class RowSorter {
    
    double[] x;
    int a[], b[], row, col;
    Object v[];
    
    public void rowSorter(double d[], double e[], JTable tb, int cl){
        
        if(cl == 0){
            row = tb.getRowCount();
            col = tb.getColumnCount();
            a = new int[d.length];
            b = new int[d.length];
            x = new double[d.length];
            v = new Object[row*col];
        }
        
        for(int i = 0; i < d.length; i++){
            a[i] = 7;
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

        for(int i = 0; i < d.length; i++){
            x[a[i]] = d[i];   
        }
        
        if((cl == 0)){           
            for(int i = 0; i < col; i++){
                for(int j = 0; j < row; j++){
                    v[(i*row)+j] = tb.getValueAt(j, i);
                }
            }
            cl = -1;
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