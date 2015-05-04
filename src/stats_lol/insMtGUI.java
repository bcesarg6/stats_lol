package stats_lol;

/*I will only comment things that are new in each class, 
90% of the comments in the "chStatsGUI" can be used in all other classes */

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Cristofer
 */

//First GUI to insert new game. Select the teams.
public class insMtGUI extends JFrame{
    
    int nG;
    String sNg;
    String sp;
    int blueIn;
    int redIn;
    
    Stats_lol tm = new Stats_lol(); //To use Stats_lol variables  
    
    JLabel lblBlue = new JLabel("Blue side:");
    JLabel lblRed = new JLabel("Red side:");
    JComboBox blue = new JComboBox(tm.team); //Creates a combobox (aka dropbox) with the team String (from the main class)
    JComboBox red = new JComboBox(tm.team); //Above
    JButton btnNext = new JButton("Next");
    
    Container cp = getContentPane();
    
    public insMtGUI(){
           
        checkVersion checkVersion = new checkVersion();
        
        setTitle("LoL Stats Maker " + checkVersion.version);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setSize(400, 150);
        setLocationRelativeTo(null);
        
        cp.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.NORTHWEST;
        c.insets = new Insets(5, 5, 5, 5);
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        cp.add(lblBlue, c);
        
        c.gridx = 1;
        c.anchor = GridBagConstraints.EAST;
        
        cp.add(blue, c);
        
        c.anchor = GridBagConstraints.NORTHWEST;
        
        c.gridy = 1;
        c.gridx = 0;
        
        cp.add(lblRed, c);
        
        c.anchor = GridBagConstraints.EAST;
        c.gridx = 1;
        
        cp.add(red, c);
        
        c.anchor = GridBagConstraints.EAST;
        c.gridx = 2;
        c.gridy = 2;
        
        cp.add(btnNext, c);
        pack();
        
        btnNext.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e){
                blueIn = blue.getSelectedIndex();
                redIn = red.getSelectedIndex();
               if(blueIn != redIn){ //If the teams selected are different
                   for(int i = 0; i < 8; i++){
                       if(blueIn == i){
                           try{
                               File te = new File("data/tmData/" + tm.team[i]);
                           
                               try (FileWriter fW = new FileWriter(te)) {
                                   BufferedWriter bW = new BufferedWriter(fW);
                                   
                                   FileInputStream fR = new FileInputStream(te);
                                   InputStreamReader in = new InputStreamReader(fR);
                                   BufferedReader bR = new BufferedReader(in);
                                                                 
                                   sp = bR.readLine();
                                   System.out.println(sp);
                                   if(sp == null){
                                       sp = "0";
                                   }
                                   sNg = bR.readLine();
                                   System.out.println(sNg);
                                   if(sNg == null){
                                       sNg = "0";
                                   }                                                                    
                                                                     
                                   System.out.println(sNg);
                                   
                                   nG++;
                                   
                                   sNg = Integer.toString(nG);
                                   
                                   bW.write(sp);
                                   bW.newLine();
                                   bW.write(sNg);
                                   bW.newLine();
                                   bW.close();
                                   fW.close();
                               }
                               System.out.println(nG);
                               
                           }
                           catch(IOException a){                              
                           }
                       }                                                                                            
                   }
                   dispose();
                   new insIDGUI(blueIn, redIn); //Sends the index to the next class
               }
               else{
                   new errGUI(); //Else calls the error GUI
               }
            }
        });
   
    }
}
