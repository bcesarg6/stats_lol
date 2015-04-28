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
    
    public String version = "a1.0";
    public String currentVersion;
    public String os = System.getProperty("os.name").toLowerCase();
    public String[] ops = {"linux", "windows 7", "windows 8", "mac"};
    public String versionURL = "http://pastebin.com/raw.php?i=tqZcCMdQ";
    public String downloadURL = "http://pastebin.com/raw.php?i=tqZcCMdQ";
    Runtime runtime = Runtime.getRuntime();
    
    public boolean checkVersion() throws URISyntaxException{
        try{
            URL checkPage = new URL(versionURL);
            BufferedReader reader = new BufferedReader(new InputStreamReader(new BufferedInputStream(checkPage.openConnection().getInputStream())));
            currentVersion = reader.readLine().trim(); 
            reader.close();
        } 
        catch (Exception E){};
        if(currentVersion.equals(version)){
            return true;
        }
        else{
            final int updateQ = JOptionPane.showConfirmDialog(null,"LoL Stats Maker is outdated, update to the current version?","New Version avaible " + os,JOptionPane.YES_NO_OPTION);
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
                else if(os.equals(ops[1]) || os.equals(ops[2])){
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
