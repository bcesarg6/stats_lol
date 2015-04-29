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
    public String team1 = "O Famoso Clã";
    public String team2 = "Moleques Transantes";
    public String team3 = "ProXdigious";
    public String team4 = "TPMstronda";
    public String team5 = "Vivo Dibra";
    public String team6 = "Não Temos Nome";
    public String team7 = "Cassiolurdes";
    public String team8 = "Team Pulse Gaming";
    
    //Side names
    public String sideB = "Azul";
    public String sideR = "Vermelho";
    
    //Players names
    public String player1 = "Ignatius";
    public String player2 = "Vithrow";
    public String player3 = "esquelda";
    public String player4 = "tij";
    public String player5 = "Leoxes";
    public String player6 = "Xuleta JJ";
    public String player7 = "Trullian";
    public String player8 = "vargas baloso";
    public String player9 = "rS Berta1";
    public String player10 = "WISER Perachi Oz";
    public String player11 = "GHKgustavo";
    public String player12 = "proX KungBANG";
    public String player13 = "farélinho";
    public String player14 = "StarLine";
    public String player15 = "PrimooN";
    public String player16 = "Lukinhas Monxtro";
    public String player17 = "jbiyvh";
    public String player18 = "gahgreguer";
    public String player19 = "Andreeez1nPLAY";
    public String player20 = "KoitOShiro";
    public String player21 = "Jhony o Pedreiro";
    public String player22 = "rS XandimonZ";
    public String player23 = "Minkão desu RXRX";
    public String player24 = "Oceanz";
    public String player25 = "Supremo Sir Goku";
    public String player26 = "Charlie Vraum";
    public String player27 = "WISER médium";
    public String player28 = "Persh";
    public String player29 = "falconkiler";
    public String player30 = "zerovampire730";
    public String player31 = "SooLdaaDOOO";
    public String player32 = "iHamm";
    public String player33 = "SooLdaaDOO";
    public String player34 = "parag41o";
    public String player35 = "kranionakara";;
    public String player36 = "DaarkFighter";
    public String player37 = "BlazeeKryst";
    public String player38 = "xXDownloadXx";
    public String player39 = "xGlhc";
    public String player40 = "ThunderCraash";
    
    //Champions names
    public String Aatrox = "Aatrox";
    public String Ahri = "Ahri";
    public String Akali = "Akali";
    public String Alistar = "Alistar";
    public String Amumu = "Amumu";
    public String Anivia = "Anivia";
    public String Annie = "Annie";
    public String Ashe = "Ashe";
    public String Azir = "Azir";
    public String Bardo = "Bardo";
    public String Blitzcrank = "Blitzcrank";
    public String Brand = "Brand";
    public String Braum = "Braum";
    public String Caitlyn = "Caitlyn";
    public String Cassiopeia = "Cassiopeia";
    public String Cho = "Cho'Gath";
    public String Corki = "Corki";
    public String Darius = "Darius";
    public String Diana = "Diana";
    public String Draven = "Draven";
    public String Dr = "Dr.Mundo";
    public String Elise = "Elise";
    public String Evelynn = "Evelynn";
    public String Ezreal = "Ezreal";
    public String Fiddlesticks = "Fiddlesticks";
    public String Fiora = "Fiora";
    public String Fizz = "Fizz";
    public String Galio = "Galio";
    public String Gangplank = "Gangplank";
    public String Garen = "Garen";
    public String Gnar = "Gnar";
    public String Gragas = "Gragas";
    public String Graves = "Graves";
    public String Hecarim = "Hecarim";
    public String Heimerdinger = "Heimerdinger";
    public String Irelia = "Irelia";
    public String Janna = "Janna";
    public String Jarvan = "Jarvan IV";
    public String Jax = "Jax";
    public String Jayce = "Jayce";
    public String Jinx = "Jinx";
    public String Kalista = "Kalista";
    public String Karma = "Karma";
    public String Karthus = "Karthus";
    public String Kassadin = "Kassadin";
    public String Katarina = "Katarina";
    public String Kayle = "Kayle";
    public String Kennen = "Kennen";
    public String Kha = "Kha'Zix";
    public String Kog = "Kog'Maw";
    public String LeBlanc = "LeBlanc";
    public String Lee = "Lee Sin";
    public String Leona = "Leona";
    public String Lissandra = "Lissandra";
    public String Lucian = "Lucian";
    public String Lulu = "Lulu";
    public String Lux = "Lux";
    public String Malphite = "Malphite";
    public String Malzahar = "Malzahar";
    public String Maokai = "Maokai";
    public String Master = "Master Yi";
    public String Miss = "Miss Fortune";
    public String Mordekaiser = "Mordekaiser";
    public String Morgana = "Morgana";
    public String Nami = "Nami";
    public String Nasus = "Nasus";
    public String Nautilus = "Nautilus";
    public String Nidalee = "Nidalee";
    public String Nocturne = "Nocturne";
    public String Nunu = "Nunu";
    public String Olaf = "Olaf";
    public String Orianna = "Orianna";
    public String Pantheon = "Pantheon";
    public String Poppy = "Poppy";
    public String Quinn = "Quinn";
    public String Rammus = "Rammus";
    public String Rek = "Rek'Sai";
    public String Renekton = "Renekton";
    public String Rengar = "Rengar";
    public String Riven = "Riven";
    public String Rumble = "Rumble";
    public String Ryze = "Ryze";
    public String Sejuani = "Sejuani";
    public String Shaco = "Shaco";
    public String Shen = "Shen";
    public String Shyvana = "Shyvana";
    public String Singed = "Singed";
    public String Sion = "Sion";
    public String Sivir = "Sivir";
    public String Skarner = "Skarner";
    public String Sona = "Sona";
    public String Soraka = "Soraka";
    public String Swain = "Swain";
    public String Syndra = "Syndra";
    public String Talon = "Talon";
    public String Taric = "Taric";
    public String Teemo = "Teemo";
    public String Thresh = "Thresh";
    public String Tristana = "Tristana";
    public String Trundle = "Trundle";
    public String Tryndamere = "Tryndamere";
    public String Twisted = "Twisted Fate";
    public String Twitch = "Tryndamere";
    public String Udyr = "Udyr";
    public String Urgot = "Urgot";
    public String Varus = "Varus";
    public String Vayne = "Vayne";
    public String Veigar = "Veigar";
    public String Vel = "Vel'Koz";
    public String Vi = "Vi";
    public String Viktor = "Viktor";
    public String Vladimir = "Vladimir";
    public String Volibear = "Volibear";
    public String Warwick = "Warwick";
    public String Wukong = "Wukong";
    public String Xerath = "Xerath";
    public String Xin = "Xin'Zhao";
    public String Yasuo = "Yasuo";
    public String Yorick = "Yorick";
    public String Zac = "Zac";
    public String Zed = "Zed";
    public String Ziggs = "Ziggs";
    public String Zilean = "Zilean";
    public String Zyra = "Zyra";
    
 
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
        reB.close();//Ends the writer
        reW.close();//Ends the buffer
        
        new inicialGUI(); //Calls inicialGUI
        
    }
}
