/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stats_lol;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import static stats_lol.Stats_lol.*;

/**
 *
 * @author root
 */
public class ReadWrite {
    
    public String nB, mtT, s1, s2;
    public String[] sp, sps; 
    int nb, mtt, x, s, n, t, g, tr, dr, br;
    int p = 0;
    public int kl[] = {0, 0, 0, 0, 0};
    public int dt[] = {0, 0, 0, 0, 0};
    public int as[] = {0, 0, 0, 0, 0};
    public int cr[] = {0, 0, 0, 0, 0};
    public int gl[] = {0, 0, 0, 0, 0};
    

    
    public void readWrite(boolean w, int x, int i){
        n = 6;
        t = 1;
        g = 0;
        sps = new String[n];
        try{
            if((x == 0) || (x < -3)){
                s1 = "chData/";
                s2 = champion[i];
            }
            else if((x > -4) && (x != 0) && ((x < 7 || x > 11))){
                s1 = "tmData/";
                s2 = team[i];
            }
            else if((x > 6) && (x <12)){
                s1 = "plData/";
                s2 = player[i];
            }
            File te = new File("data/" +s1 + s2);
            FileInputStream fR = new FileInputStream(te);
            InputStreamReader in = new InputStreamReader(fR);
            BufferedReader bR = new BufferedReader(in);
            if((x > 6) && (x < 12)){
                g = x -7; 
            }
            else if(x == 13){
                t = 2;
                x = 0;
            }
            else if(x == -1){
                x = 6;
                t = 3;
            }
            else if(x == -2){
                x = 6;
            }
            else if(x == -3){
                x = 6;
                t = 0;
            }
            else if(x == -4){
                x = 1;
            }
            if((x < 7) || (x > 11)){
                sp = new String[x];
                if(x != 0){
                    for(int j = 0;j < x;j++){
                        sp[j] = bR.readLine();
                        if(sp[j] == null){
                            sp[j] = "0";
                        }
                    }
                }
            }
            else{
                sp = new String[g];
                if(g != 0){
                    for(int j = 0;j < g;j++){
                        sp[j] = bR.readLine();
                        if(sp[j] == null){
                            sp[j] = "0";
                        }
                    }
                }
            }
            nB = bR.readLine();
            System.out.println("nB="+nB);
            if(nB == null){                                                               
                nB = "0";
            }
            if ((x < 7) || (x > 11)){
                n -= x;
            }
            else{
                n -= g;
            }
            if(n != 0){
                for(int j = 0; j < n; j++){
                    sps[j] = bR.readLine();
                    if(g != 0){
                        System.out.println("sps="+sps[j]);
                    }
                    if(sps[j] == null){                       
                        sps[j] = "0";
                    }
                }
            }
            bR.close();
            in.close();
            fR.close();
            System.out.println("-----------------------------");
            if(w == true){
                nb = Integer.parseInt(nB);
                if (x == 2){
                    nb += mtt;
                }
                else if(x == 3){
                    nb += tr;
                }
                else if(x == 4){
                    nb += dr;
                }
                else if(x == 5){
                    nb += br;
                }
                else if((x > 6) && (x < 12)){
                    switch(x){
                        case 7:
                            System.out.println("7");
                            nb += kl[p];
                            break;
                        case 8:
                            System.out.println("8");
                            nb += dt[p];
                            break;
                        case 9:
                            System.out.println("9");
                            nb += as[p];
                            break;
                        case 10:
                            System.out.println("10");
                            nb += cr[p];
                            break;
                        case 11:
                            System.out.println("11");
                            nb += gl[p];
                            break;
                    }
                    x -= 7;
                }
                else{
                    nb = nb + t;
                }
                System.out.println(nb);
                nB = Integer.toString(nb);
                FileWriter fW = new FileWriter(te);  
                BufferedWriter bW = new BufferedWriter(fW);
            
                if(x != 0){
                    for(int j = 0;j < x;j++){
                        bW.write(sp[j]);
                        bW.newLine();
                    }                   
                }
                bW.write(nB);
                bW.newLine();
                if(n != 0){
                    for(int j = 0; j < n; j++){
                        bW.write(sps[j]);
                        bW.newLine();
                    }
                }                               
                bW.close();
                fW.close();
                System.out.println("++++++++++++++++++");
            }                                
        }catch(IOException a){}        
    }    
}
