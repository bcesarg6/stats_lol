/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status_lol;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

/**
 *
 * @author cristofer
 */
public class Stats_lol {
    
    public String time1 = "O Famoso Clã";
    public String time2 = "Moleques Transantes";
    public String time3 = "ProXdigious";
    public String time4 = "TPMstronda";
    public String time5 = "Vivo Dibra";
    public String time6 = "Não Temos Nome";
    public String time7 = "Cassiolurdes";
    public String time8 = "Team Pulse Gaming";
    
    public String sideA = "Azul";
    public String sideV = "Vermelho";
    
    public String jogador1 = "Ignatius";
    public String jogador2 = "Vithrow";
    public String jogador3 = "esquelda";
    public String jogador4 = "tij";
    public String jogador5 = "Leoxes";
    public String jogador6 = "Xuleta JJ";
    public String jogador7 = "Trullian";
    public String jogador8 = "vargas baloso";
    public String jogador9 = "rS Berta1";
    public String jogador10 = "WISER Perachi Oz";
    public String jogador11 = "GHKgustavo";
    public String jogador12 = "proX KungBANG";
    public String jogador13 = "farélinho";
    public String jogador14 = "StarLine";
    public String jogador15 = "PrimooN";
    public String jogador16 = "Lukinhas Monxtro";
    public String jogador17 = "jbiyvh";
    public String jogador18 = "gahgreguer";
    public String jogador19 = "Andreeez1nPLAY";
    public String jogador20 = "KoitOShiro";
    public String jogador21 = "Jhony o Pedreiro";
    public String jogador22 = "rS XandimonZ";
    public String jogador23 = "Minkão desu RXRX";
    public String jogador24 = "Oceanz";
    public String jogador25 = "Supremo Sir Goku";
    public String jogador26 = "Charlie Vraum";
    public String jogador27 = "WISER médium";
    public String jogador28 = "Persh";
    public String jogador29 = "falconkiler";
    public String jogador30 = "zerovampire730";
    public String jogador31 = "SooLdaaDOOO";
    public String jogador32 = "iHamm";
    public String jogador33 = "SooLdaaDOO";
    public String jogador34 = "parag41o";
    public String jogador35 = "kranionakara";;
    public String jogador36 = "DaarkFighter";
    public String jogador37 = "BlazeeKryst";
    public String jogador38 = "xXDownloadXx";
    public String jogador39 = "xGlhc";
    public String jogador40 = "ThunderCraash";
    
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
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        File jg = new File("jogos");
        if(!jg.exists()){
            jg.mkdir();
        } //Verifies if the directory exists, if not create a new
        
        File rdm = new File("README");
        if(!rdm.exists()){
            rdm.mkdir();
        } //Same as before
        
        
            File rd = new File(rdm, "README.txt");
            if(!rd.exists()){
                rd.createNewFile();
            }
        //Create a README file into the README directory if it doesn't exists
        
        FileWriter reW = new FileWriter(rd);
        BufferedWriter reB = new BufferedWriter(reW); //Set the writer to the REAMDE file
        reB.write("Programa feito para criar estatísticas a partir de jogos de League of Legends.");
        reB.newLine();
        reB.write("Escolha entre ver as estatísticas ou entrar os dados de um jogo.");
        reB.newLine();
        reB.write("As estatísticas são mostradas através de tabelas.");
        reB.newLine();
        reB.write("Os dados dos jogos deverão ser colocados nos campos mostrados e então serão salvos nos arquivos .txt.");
        reB.newLine();
        reB.write("Qualquer problema me contate e tire um screenshot se possível.");
        reB.close();
        reW.close();
        new inicialGUI();
        
    }
}
