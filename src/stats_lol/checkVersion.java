/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stats_lol;

import java.io.*;
import java.net.*;
import javax.swing.*;

/**
 *
 * @author root
 */
public class checkVersion {
    
    public String version = "a1.0"; //Version of the program
    public String currentVersion; //Atual version
    public String os = System.getProperty("os.name").toLowerCase(); //Gets user OS
    public String[] ops = {"linux", "windows 7", "windows 8", "windows 8.1", "mac"}; //OSs
    public String versionURL = "http://pastebin.com/raw.php?i=tqZcCMdQ"; //URL that is checked to see the version
    public String downloadURL = "http://pastebin.com/raw.php?i=tqZcCMdQ"; //Download URL
    Runtime runtime = Runtime.getRuntime(); //CMD
    
    public boolean checkVersion() throws URISyntaxException{
        try{
            URL checkPage = new URL(versionURL);
            BufferedReader reader = new BufferedReader(new InputStreamReader(new BufferedInputStream(checkPage.openConnection().getInputStream()))); //Reader
            currentVersion = reader.readLine().trim(); //Puts the read data inside the currentVersion String
            reader.close(); //Closes the reader
        } 
        catch (Exception E){};
        if(currentVersion.equals(version)){ //Verifys the program version and the actual version
            return true;
        }
        else{
            final int updateQ = JOptionPane.showConfirmDialog(null,"LoL Stats Maker is outdated, update to the current version?","New Version avaible " + os,JOptionPane.YES_NO_OPTION); //Opens an window if the versions are diferent
            if(updateQ==0){
                if(os.equals(ops[0])){
                    try{
                        String[] browsers = {"epiphany", "firefox", "mozilla", "konqueror",
                                                        "netscape","opera","links","lynx"};
                        StringBuffer cmd = new StringBuffer();
                        for (int i=0; i<browsers.length; i++)
                        cmd.append( (i==0  ? "" : " || " ) + browsers[i] +" \"" + downloadURL + "\" ");
                        runtime.exec(new String[] { "sh", "-c", cmd.toString() });
                    }
                    catch(Exception E){
                        
                    }
                }
                else if(os.equals(ops[1]) || os.equals(ops[2]) || os.equals(ops[3])){
                    try{
                        runtime.exec("rundll32 url.dll,FileProtocolHandler " + downloadURL);
                    }
                    catch(Exception E){
                        
                    }
                }
                else if(os.equals(ops[3])){
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
