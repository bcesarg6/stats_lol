package stats_lol;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.nio.file.Files;
import javax.swing.JOptionPane;
import static stats_lol.Stats_lol.*;

/**
 *
 * @author Cristofer
 */

public class ReadWrite {
    
    public int readWrite(boolean wr, int dir, int ar, int ln, Object ad){
        
        int l = dir == 0 ? 4 :
            dir == 1 ? 7 :
            dir == 2 ? 2 : null;
        
        String directory = dir == 0 ? plDt.getPath()+"/"+player[ar] : 
                    dir == 1 ? tmDt.getPath()+"/"+team[ar] :
                    dir == 2 ? chDt.getPath()+"/"+champion[ar] : null;
        
        return readWrite(wr, directory, ln, l, ad);
    }
    
    public boolean tmpExists(){
        boolean e = false;
        if((tmp.exists())){
            final int ex = JOptionPane.showConfirmDialog(null,"<html>Looks like you were adding a game previously, do you want to continue adding that one? (pressing 'no' will start a new insertion)</html>","Previus insertion not done",JOptionPane.YES_NO_OPTION);
            if(ex == 0){
                e = true;
            }
            else if(ex == 1){
                ClearData cl = new ClearData();
                try {
                    cl.clearData(tmp);
                } catch (IOException | URISyntaxException ex1) {}
                e = false;
            }
        }
        return e;
    }
    
    public void tmpReadWrite(int dir, int ar, int ln, int ad) throws IOException{
        String directory, tmpDirectory, tmpArchive;
        
        int l = dir == 0 ? 4 :
            dir == 1 ? 7 :
            dir == 2 ? 2 : null;
        
        directory = dir == 0 ? plDt.getPath()+"/"+player[ar] : 
                    dir == 1 ? tmDt.getPath()+"/"+team[ar] :
                    dir == 2 ? chDt.getPath()+"/"+champion[ar] : null;
        
        tmpDirectory = dir == 0 ? tmp.getPath()+"/"+plDt.getPath(): 
                    dir == 1 ? tmp.getPath()+"/"+tmDt.getPath():
                    dir == 2 ? tmp.getPath()+"/"+chDt.getPath(): null;
        
        tmpArchive = dir == 0 ? tmpDirectory+"/"+player[ar] : 
                    dir == 1 ? tmpDirectory+"/"+team[ar] :
                    dir == 2 ? tmpDirectory+"/"+champion[ar] : null;
        
        File dr = new File(directory);
        File tmpDr = new File(tmpDirectory);
        File tmpAr = new File(tmpArchive);
        
        if(!(tmp.exists())){
                tmp.mkdir();   
            if(!(os.equals(oss[0]))){
                Runtime.getRuntime().exec("attrib +H "+tmp.getPath());
            }
        }
        
        if(!(tmpDr.exists())){
            tmpDr.mkdirs();
        }
        if(!(tmpAr.exists())){
            Files.copy(dr.toPath(), tmpAr.toPath());
        }
        readWrite(true, tmpArchive, ln, l, ad);
    }
    
    public int readWrite(boolean wr, String archive, int ln, int l, int ad){
        String rl;
        int rL = 0;
        
        ln -= 1;
        
        int n = l - ln;
        
        String lnB[] = new String[ln];
        String lnA[] = new String[n];
        
        try{
            File te = new File(archive);
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
            bR.close();
            in.close();
            fR.close();
            }
            
            rL = Integer.parseInt(rl) + ad;

            if(wr == true){
                
                try (FileWriter fW = new FileWriter(te); BufferedWriter bW = new BufferedWriter(fW)){
                    
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
                    bW.close();
                    fW.close();
                }
            }
        }
        catch(IOException E){}
    return rL;    
    }
    
    public int[] tmpGetStage(){
        int line[];
        line = new int[5];
        String lin;
        try (FileInputStream fR = new FileInputStream(tmpStage);
                 InputStreamReader in = new InputStreamReader(fR); BufferedReader bR = new BufferedReader(in)){
            for (int i = 0; i < line.length; i++){
                lin = bR.readLine();
                line[i] = lin != null ? Integer.parseInt(lin) : 0;   
            }
        bR.close();
        in.close();
        fR.close();    
        }catch(IOException ex){}
        return line;
    }
    
    public void tmpSetStage(int stage, int par[]){
        try (FileWriter fW = new FileWriter(tmpStage); BufferedWriter bW = new BufferedWriter(fW)){
            for (int i = 0; i < par.length; i++){
                if(i == 0){
                    bW.write(Integer.toString(stage));
                    bW.newLine();
                    bW.write(Integer.toString(par[i]));
                    bW.newLine();
                }
                else{
                    bW.write(Integer.toString(par[i]));
                    bW.newLine();
                }
            }
            bW.close();
            fW.close();
        }catch(IOException ex){}
    }
    
    public boolean tmpToReal() throws IOException{
        
        File tmpPl = new File(tmp.getPath()+"/"+plDt.getPath());
        File tmpTm = new File(tmp.getPath()+"/"+tmDt.getPath());
        File tmpCh = new File(tmp.getPath()+"/"+chDt.getPath());
        File[] tmpDir= {tmpPl, tmpTm, tmpCh};
        File[] tmpPlAr = null;
        File[] tmpTmAr = null;
        File[] tmpChAr = null;
        File[][] tmpAr = {tmpPlAr, tmpTmAr, tmpChAr};
        for (int i = 0; i < tmpDir.length; i++) {
            tmpAr[i] =  tmpDir[i].listFiles();
        }
        for (int i = 0; i < tmpAr.length; i++) {
            if(tmpAr[i] != null){
                for (int j = 0; j < tmpAr[i].length; j++) {
                    File dir = new File(dirs[i]+"/"+tmpAr[i][j].getAbsoluteFile().getName());
                    dir.delete();
                    Files.copy(tmpAr[i][j].toPath(), dir.toPath());
                }
            }
        }
        return true;
    }
}