/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status_lol;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author cristofer
 */
public class Status_lol {
    static File arq = new File( "/jogos" );
    static boolean ext = arq.exists();
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        if(ext){
        }
        else{
            arq.mkdir();
        }
        new inicialGUI();
        
    }
}
