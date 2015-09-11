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
        player = (String[])rw.readLines(players);    
        return player;
        
    }
}