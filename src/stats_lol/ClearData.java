package stats_lol;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;
import static stats_lol.Stats_lol.*;

/**
 *
 * @author Cristofer
 */

public class ClearData {
    
    public int clearData(File dir) throws IOException, URISyntaxException{
        int clear = 1;
        if(dir == dt){
            Stats_lol.main(team);
            clear = JOptionPane.showConfirmDialog(null,"You will be ereasing all data, are you sure?","Clear data",JOptionPane.YES_NO_OPTION);
            if(clear == 0){
                deleteDirectory(dir);
            }
        }
        else{
            deleteDirectory(dir);
        }
        return clear;
        
    }
    
    static public boolean deleteDirectory(File path){
        if(path.exists()) {
            File[] files = path.listFiles();
                
            for(int i=0; i<files.length; i++){
                if(files[i].isDirectory()){
                    deleteDirectory(files[i]);
                }
                else{
                    files[i].delete();
                }
            }
        }
    return(path.delete());
    }
}