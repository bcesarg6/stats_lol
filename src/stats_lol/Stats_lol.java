package stats_lol;

import java.io.File; //Imports Java file creator
import java.io.FileWriter; //Imports java file writer
import java.io.BufferedWriter; //Writer too
import java.io.IOException; //IOException
import java.net.URISyntaxException;

/**
 *
 * @author Cristofer
 */

//This is the main class of the program. This will call the main GUI
public class Stats_lol {
    
    //Gets user OS
    public static String os = System.getProperty("os.name").toLowerCase();
    
    //Gets the user home
    public static final String appdata = System.getProperty("user.home")+"/LoL Stats Maker/";
    
    //OSs
    public static String[] oss = {"linux", "windows 7", "windows 8", "windows 8.1", "mac"};
    
    //Team names
    public static String team[] = {"O Famoso Clã", "Moleques Transantes", "ProXdigious", "TPMstronda",
                            "Vivo Dibra", "Não Temos Nome", "Cassiolurdes", "Team Pulse Gaming"};
    
    //Side names
    public static String sideB = "Blue";
    public static String sideR = "Red";
    
    //Players names
    public static String player[] = {"Ignatius", "Vithrow", "esquelda", "tij", "Leoxes",
                              "Xuleta JJ", "Trullian", "vargas baloso", "rS Berta1", "WISER Perachi Oz",
                              "GHKgustavo", "proX KungBANG", "farélinho", "StarLine", "PrimooN",
                              "Lukinhas Monxtro", "jbiyvh", "gahgreguer", "Andreeez1nPLAY", "KoitOShiro",
                              "Jhony o Pedreiro", "rS XandimonZ", "Minkão desu RXRX", "Oceanz", "Supremo Sir Goku",
                              "Charlie Vraum", "WISER médium", "Persh", "falconkiler", "zerovampire730",
                              "SooLdaaDOOO", "iHamm", "SooLdaaDOO", "parag41o", "kranionakara", 
                              "DaarkFighter", "BlazeeKryst", "xXDownloadXx", "xGlhc", "ThunderCraash"};
    
    //Champions names
    public static String champion[] = {"Aatrox", "Ahri", "Akali", "Alistar","Amumu",
                                 "Anivia", "Annie", "Ashe", "Azir", "Bardo", "Blitzcrank",
                                 "Brand", "Braum", "Caitlyn", "Cassiopeia","Cho'Gath",
                                 "Corki", "Darius", "Diana", "Draven", "Dr.Mundo", "Elise",
                                 "Evelynn", "Ezreal", "Fiddlesticks", "Fiora", "Fizz", "Galio",
                                 "Gangplank", "Garen", "Gnar", "Gragas", "Graves", "Hecarim",
                                 "Heimerdinger", "Irelia", "Janna", "Jarvan IV", "Jax", "Jayce",
                                 "Jinx", "Kalista", "Karma", "Karthus", "Kassadin", "Katarina",
                                 "Kayle", "Kennen", "Kha'Zix","Kog'Maw", "LeBlanc", "Lee Sin",
                                 "Leona", "Lissandra", "Lucian", "Lulu", "Lux", "Malphite",
                                 "Malzahar",  "Maokai", "Master Yi", "Miss Fortune", "Mordekaiser",
                                 "Morgana", "Nami", "Nasus", "Nautilus","Nidalee", "Nocturne", "Nunu",
                                 "Olaf", "Orianna", "Pantheon", "Poppy", "Quinn", "Rammus",  "Rek'Sai",
                                 "Renekton", "Rengar", "Riven",  "Rumble", "Ryze", "Sejuani", "Shaco",
                                 "Shen", "Shyvana", "Singed", "Sion", "Sivir", "Skarner", "Sona", 
                                 "Soraka", "Swain", "Syndra", "Talon", "Taric", "Teemo", "Thresh",
                                 "Tristana", "Trundle", "Tryndamere", "Twisted Fate", "Tryndamere",
                                 "Udyr", "Urgot", "Varus", "Vayne", "Veigar", "Vel'Koz", "Vi",
                                 "Viktor", "Vladimir", "Volibear", "Warwick", "Wukong", "Xerath",
                                 "Xin'Zhao", "Yasuo", "Yorick", "Zac", "Zed", "Ziggs", "Zilean", "Zyra"};
    
    public static final File dt = new File(appdata+"data");
    public static final File plDt = new File(appdata+"data/plData/");
    public static final File tmDt = new File(appdata+"data/tmData/");
    public static final File chDt = new File(appdata+"data/chData/");
    public static final File rdm = new File(appdata+"data/README");
    public static final File tmp = new File(appdata+"data/.temp/");
    public static final File tmpStage = new File(tmp.getAbsolutePath()+"/stage");
    public static final File rd = new File(rdm, "README.txt");
    public static final File[] dirs = {plDt, tmDt, chDt};
    
    public static void main(String args[]) throws IOException, URISyntaxException{
        System.out.println(appdata);
        CheckVersion checkVersion = new CheckVersion();
        checkVersion.checkVersion(); //Verifies if the program version is the actual version

        if(!dt.exists()){
            
            dt.mkdir();        //Creates data directory             

            if(!plDt.exists()){
                plDt.mkdir();     //Creates plData directory
            }
            
            if(!tmDt.exists()){
                tmDt.mkdir();     //Creates tmData directory
            }
            
            if(!chDt.exists()){
                chDt.mkdir();    //Creates chData directory
            }
            
            if(!rdm.exists()){
                rdm.mkdir();    //Creates README directory
            }
            
        }

        if(!rd.exists()){           
            rd.createNewFile(); //Creates README.txt file
        }
        
        for(int i = 0; i < 40; i++){
            
            File pl = new File(plDt, player[i]);
            
            if(!pl.exists()){
                pl.createNewFile(); //Creates README.txt file
            }            
        }
        
        for(int i = 0; i < 8; i++){
            
            File tm = new File(tmDt, team[i]);
            
            if(!tm.exists()){
                tm.createNewFile(); //Creates README.txt file
            }           
        }
        
        for(int i = 0; i < 124; i++){
            
            File ch = new File(chDt, champion[i]);
            
            if(!ch.exists()){
                ch.createNewFile(); //Creates README.txt file
            }          
        }
        
        try (FileWriter reW = new FileWriter(rd); BufferedWriter reB = new BufferedWriter(reW)) { //Set the writer to the REAMDE file
            
            reB.write("Program made to create statistics for championships of the League of Legends game."); //Write this
            reB.newLine(); //Jumps to the next line
            reB.write("Chose between seeing actual championship stats or insert new game stats.");
            reB.newLine();
            reB.write("The stats will be shown in tables.");
            reB.newLine();
            reB.write("The game data will be stored in .txt files.");
            reB.newLine();
            reB.write("If you find any problem contact me and, if possible, take a screenshot.");
            reB.newLine();
        }
        
        InicialGUI inicialGUI = new InicialGUI(); //Calls InicialGUI        
    }
}