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
  
    public static void main(String[] args) throws IOException, URISyntaxException{
        
        checkVersion checkVersion = new checkVersion();
        checkVersion.checkVersion(); //Verifies if the program version is the actual version
        
        File dt = new File("data");
        File plDt = new File("data/plData");
        File tmDt = new File("data/tmData");
        File chDt = new File("data/chData");
        File rdm = new File("data/README");
        
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
        
        File rd = new File(rdm, "README.txt");
        
        if(!rd.exists()){
            rd.createNewFile(); //Creates README.txt file
        }
        
        for(int i = 0; i < 40; i++){
            File pl = new File(plDt, player[i]);
            
            if(!pl.exists()){
                pl.createNewFile(); //Creates README.txt file
            }
            //pl.delete();
            
        }
        
        for(int i = 0; i < 8; i++){
            File tm = new File(tmDt, team[i]);
            
            if(!tm.exists()){
                tm.createNewFile(); //Creates README.txt file
            }
            //tm.delete();
            
        }
        
        for(int i = 0; i < 124; i++){
            File ch = new File(chDt, champion[i]);
            
            if(!ch.exists()){
                ch.createNewFile(); //Creates README.txt file
            }
            //ch.delete();
            
        }
        
        
        FileWriter reW = new FileWriter(rd);
        BufferedWriter reB = new BufferedWriter(reW); //Set the writer to the REAMDE file
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
        reB.close();//Ends the buffer
        reW.close();//Ends the writer
        
        new inicialGUI(); //Calls inicialGUI
        
    }
}
