package stats_lol;

import java.util.*;
import javax.swing.JTable;

public class RowSorter {
    
    int cres[], decres[], intValue[], untierIntValue[], row, col;
    Object value[], untierValue[], tableValues[], nonSortedValue[], sortedValue[];
    String stringValue[], untierStringValue[], columnToBeSortedClass, untierColumnClass;
    List<String> data;
    
    public void rowSorter(int columnToBeSorted, int untierColumn, JTable table, int time){
        if(time == 0){
            
            row = table.getRowCount();
            col = table.getColumnCount();
            cres = new int[row];
            decres = new int[row];
            value = new Object[row];
            untierValue = new Object[row];
            intValue = new int[row];
            untierIntValue = new int[row];
            stringValue = new String[row];
            untierStringValue = new String[row];
            sortedValue = new String[row];
            nonSortedValue = new String[row];
            tableValues = new Object[row*col];
            columnToBeSortedClass = table.getValueAt(0, columnToBeSorted).getClass().getName();
            untierColumnClass = table.getValueAt(0, untierColumn).getClass().getName();
            
            time = -1;
        }
        
        for(int i = 0; i < value.length; i++){
            
            value[i] = table.getValueAt(i, columnToBeSorted);
            untierValue[i] = table.getValueAt(i, untierColumn);
            
            if(!(columnToBeSortedClass.equals("java.lang.String"))){

                intValue[i] = (int)value[i];
                
                if(!(untierColumnClass.equals("java.lang.String"))){
                    untierIntValue[i] = (int)untierValue[i];
                }
                
                else{
                    untierStringValue[i] = (String)untierValue[i];
                }
                
            }
            else{
                stringValue[i] = (String)value[i];
            }
        }
        
        if(!(columnToBeSortedClass.equals("java.lang.String"))){
            
            if(!(untierColumnClass.equals("java.lang.String"))){
                cres = intSorter(intValue, untierIntValue, row);
            }
                
            else{
                cres = intSorter(intValue, untierStringValue, row);
            }
            
        }
        else{
            data = Arrays.asList(stringValue);
            nonSortedValue = data.toArray();
            Collections.sort(data);
            sortedValue = data.toArray();
            
            cres = stringSorter((String[])nonSortedValue, (String[])sortedValue, row);
            
        }

        for(int i = 0; i < cres.length; i++){
            decres[i] = -1*(cres[i] - (cres.length-1));
        }
   
        for(int i = 0; i < col; i++){
            for(int j = 0; j < row; j++){
                tableValues[(i*row)+j] = table.getValueAt(j, i);
            }
        }

        if(time%2 == 0){
            
            for(int i = 0; i < col; i++){
                for(int j = 0; j < row; j++){
                    table.setValueAt(tableValues[(i*row)+j], cres[j], i);
                }
            }
        }
        
        else if(time%2 == 1){
            
            for(int i = 0; i < col; i++){
                for(int j = 0; j < row; j++){
                    table.setValueAt(tableValues[(i*row)+j], decres[j], i);
                }
            }
        }     
    }
    
    int[] intSorter(int d[], String[] g, int row){
        
        int[] ab = new int[row];
        
        String compare[];
        compare = new String[2];
        
        for(int i = 0; i < d.length; i++){
            
            ab[i] = (d.length-1);
            
            for(int j = 0; j < d.length; j++){
                
                if(d[i] > d[j]){
                    ab[i]--;
                }
                
                else if((d[i] == d[j]) && (i != j)){
                    
                    compare[0] = g[i];
                    compare[1] = g[j];
                    
                    if(stringComparer(compare)){
                        ab[i]--;
                    }
                }
            }
        }
        return ab;
    }
    
    int[] intSorter(int d[], int[] g, int row){
        
        int[] ab = new int[row];
        
        
        for(int i = 0; i < d.length; i++){
            
            ab[i] = (d.length-1);
            
            for(int j = 0; j < d.length; j++){
                
                if(d[i] > d[j]){
                    ab[i]--;
                }
                
                else if((d[i] == d[j]) && (i != j)){
                    
                }
                
            }
        }
        return ab;
    }
    
    int[] stringSorter(String[] g, String[] x, int row){
        
        int[] ab;
        ab = new int[row];
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < row; j++){
                if(g[i].equals(x[j])){
                    ab[i] = j;
                }
            }
        }
        return ab;
    }
    
    boolean stringComparer(String[] sort){
        
        boolean x = false;
        String sorted[] = new String[sort.length];
        
        System.arraycopy(sort, 0, sorted, 0, sort.length);
        
        List<String> list = Arrays.asList(sorted);
        Collections.sort(list);
        
        sorted = (String[])list.toArray();
        
        if((sorted[0].equals(sort[0]))){
            x = true;
        }
        return x;
    }
}