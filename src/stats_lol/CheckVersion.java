package stats_lol;

import java.io.*;
import java.net.*;
import javax.swing.*;

/**
 *
 * @author Cristofer
 */

//Checks if the version is compatible, if not asks to download the new one
public class CheckVersion {
    
    public static String version = "a1.1.2"; //Version of the program
    public String currentVersion; //Atual version
    public String os = System.getProperty("os.name").toLowerCase(); //Gets user OS
    public String[] ops = {"linux", "windows 7", "windows 8", "windows 8.1", "mac"}; //OSs
    public String versionURL = "http://pastebin.com/raw.php?i=tqZcCMdQ"; //URL that is checked to see the version
    public String downloadURL = "http://lolstatsmaker.webs.com/LoL%20Stats%20Maker.rar"; //Download URL
    Runtime runtime = Runtime.getRuntime(); //CMD
    
    public boolean checkVersion() throws URISyntaxException{
        try{
            URL checkPage = new URL(versionURL);
            try (BufferedReader reader = new BufferedReader(new InputStreamReader
                                         (new BufferedInputStream(checkPage.openConnection().getInputStream())))) {
                currentVersion = reader.readLine().trim(); //Puts the read data inside the currentVersion String
                reader.close(); //Closes the reader
            } //Puts the read data inside the currentVersion String
        } 
        catch (Exception E){}
        
        if(currentVersion.equals(version)){ //Verifys the program version and the actual version
            return true;
        }
        
        else{ //Opens an window if the versions are diferent
            final int updateQ = JOptionPane.showConfirmDialog(null,"LoL Stats Maker is outdated, update to the current version?","New Version avaible" + os,JOptionPane.YES_NO_OPTION); 
            if(updateQ==0){
                if(os.equals(ops[0])){ //If it is linux
                    try{
                        String[] browsers = {"epiphany", "firefox", "mozilla", "konqueror",
                                                        "netscape","opera","links","lynx"};
                        StringBuilder cmd = new StringBuilder();
                        for (int i=0; i<browsers.length; i++)
                        cmd.append(i==0  ? "" : " || ").append(browsers[i]).append(" \"").append(downloadURL).append("\" ");
                        runtime.exec(new String[] { "sh", "-c", cmd.toString()});
                    }
                    catch(Exception E){   
                    }
                }
                
                else if(os.equals(ops[1]) || os.equals(ops[2]) || os.equals(ops[3])){ //if it is Windows
                    try{
                        runtime.exec("rundll32 url.dll,FileProtocolHandler " + downloadURL);
                    }
                    catch(Exception E){
                        
                    }
                }
                
                else if(os.equals(ops[3])){ //If it is Mac
                    try{
                        runtime.exec( "open" + downloadURL);
                    }
                    catch(Exception E){
                        
                    }
                }
            }
        }                               
        return false;
    }   
}