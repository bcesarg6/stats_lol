package stats_lol;

import static stats_lol.Stats_lol.*;

/**
 *
 * @author root
 */

class Player{
    public static final String p[] = player();    
    static String[] player(){
        
        String player[];
        ReadWrite rw = new ReadWrite();
        int n = rw.readWrite(false, config.getAbsolutePath(), 1, 3, 0);
        player = rw.readLines((n*5), players);    
        return player;
    }
}