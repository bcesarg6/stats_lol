package stats_lol;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import static stats_lol.Stats_lol.*;

/**
 *
 * @author Cristofer
 */

public class ClearData {
    
    public void clearData() throws IOException, URISyntaxException{
        
        File plDt = new File("data/plData");
        File tmDt = new File("data/tmData");
        File chDt = new File("data/chData");
        
        for(int i = 0; i < 40; i++){
            File pl = new File(plDt, player[i]);
            pl.delete();           
        }       
        
        for(int i = 0; i < 8; i++){
            File tm = new File(tmDt, team[i]);
            tm.delete();
            
        }
        
        for(int i = 0; i < 124; i++){
            File ch = new File(chDt, champion[i]);
            ch.delete();          
        }
        
        Stats_lol.main(team);
        
    }
    
}
