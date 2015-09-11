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
        team = (String[])rw.readLines(teams);    
        return team;
    }
}