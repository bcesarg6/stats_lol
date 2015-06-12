package stats_lol;

import static stats_lol.Stats_lol.*;

/**
 *
 * @author root
 */

class Team{
    public static final String t[] = team();
    static String[] team(){
        
        String team[];
        ReadWrite rw = new ReadWrite();
        int n = rw.readWrite(false, config.getAbsolutePath(), 1, 3, 0);
        team = rw.readLines(n, teams);    
        return team;
    }
}