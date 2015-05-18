package stats_lol;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import static stats_lol.Stats_lol.*;

/**
 *
 * @author Cristofer
 */
public class ReadWrite {
    
    String[] lnB, lnA;
    String rl, directory;
    int l, n, rL;
    
    public void readWrite(boolean wr, int dir, int ar, int ln, int ad){
        
        ln -= 1;
        
        l = dir == 0 ? 4 :
            dir == 1 ? 7 :
            dir == 2 ? 2 : null;
        
        n = l - ln;
        
        lnB = new String[ln];
        lnA = new String[n];
        
        directory = dir == 0 ? "data/plData/"+player[ar] : 
                    dir == 1 ? "data/tmData/"+team[ar] :
                    dir == 2 ? "data/chData/"+champion[ar] : null;
                
        try{
            File te = new File(directory);
            try (FileInputStream fR = new FileInputStream(te); 
                 InputStreamReader in = new InputStreamReader(fR); BufferedReader bR = new BufferedReader(in)) {
                
                if(ln != 0){
                    for(int i = 0; i < ln; i++){
                        lnB[i] = bR.readLine();
                        if(lnB[i] == null){
                            lnB[i] = "0";
                        }
                    }
                }
                
                rl = bR.readLine();
                if(rl == null){
                    rl = "0";
                }
                
                if(n != 0){
                    for(int i = 0; i < n; i++){
                        lnA[i] = bR.readLine();
                        if(lnA[i] == null){
                            lnA[i] = "0";
                        }
                    }
                }
                
            }
            
            if(wr == true){
                rL = Integer.parseInt(rl) + ad;
                
                try (FileWriter fW = new FileWriter(te); BufferedWriter bW = new BufferedWriter(fW)) {
                    
                    if(ln != 0){
                        for(int i = 0; i < ln; i++){
                            bW.write(lnB[i]);
                            bW.newLine();
                        }
                    }
                    
                    bW.write(Integer.toString(rL));
                    bW.newLine();
                    
                    if(n != 0){
                        for(int i = 0; i < n; i++){
                            bW.write(lnA[i]);
                            bW.newLine();
                        }
                    }              
                }
            }
        }
        catch(IOException E){}       
    }    
}