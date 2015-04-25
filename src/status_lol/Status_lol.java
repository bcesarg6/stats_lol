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
public class Status_lol {
    
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
