package stats_lol;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import javax.swing.JOptionPane;
import static stats_lol.Stats_lol.*;

/**
 *
 * @author Cristofer
 */
public class ReadWrite {

    public Object readWrite(boolean wr, int dir, int ar, int ln, Object ad) throws FileNotFoundException, IOException {

        int l = dir == 0 ? 4
                : dir == 1 ? 7
                        : dir == 2 ? 2 : null;

        String directory = dir == 0 ? plDt.getPath() + "/" + player[ar]
                : dir == 1 ? tmDt.getPath() + "/" + team[ar]
                        : dir == 2 ? chDt.getPath() + "/" + champion[ar] : null;

        return readWrite(wr, directory, ln, l, ad);
    }

    public boolean tmpExists() {
        boolean e = false;
        if ((tmp.exists())) {
            final int ex = JOptionPane.showConfirmDialog(null, "<html>Looks like you were adding a game previously, do you want to continue adding that one? (pressing 'no' will start a new insertion)</html>", "Previus insertion not done", JOptionPane.YES_NO_OPTION);
            if (ex == 0) {
                e = true;
            } else if (ex == 1) {
                e = false;
            }
        }
        return e;
    }

    public void tmpReadWrite(int dir, int ar, int ln, int ad) throws IOException {
        String directory, tmpDirectory, tmpArchive;

        int l = dir == 0 ? 4
                : dir == 1 ? 7
                        : dir == 2 ? 2 : null;

        directory = dir == 0 ? plDt.getPath() + "/" + player[ar]
                : dir == 1 ? tmDt.getPath() + "/" + team[ar]
                        : dir == 2 ? chDt.getPath() + "/" + champion[ar] : null;

        tmpDirectory = dir == 0 ? tmp.getPath() + "/" + plDt.getPath()
                : dir == 1 ? tmp.getPath() + "/" + tmDt.getPath()
                        : dir == 2 ? tmp.getPath() + "/" + chDt.getPath() : null;

        tmpArchive = dir == 0 ? tmpDirectory + "/" + player[ar]
                : dir == 1 ? tmpDirectory + "/" + team[ar]
                        : dir == 2 ? tmpDirectory + "/" + champion[ar] : null;

        File dr = new File(directory);
        File tmpDr = new File(tmpDirectory);
        File tmpAr = new File(tmpArchive);

        if (!(tmp.exists())) {
            tmp.mkdir();
            if (!(os.equals(oss[0]))) {
                Runtime.getRuntime().exec("attrib +H " + tmp.getPath());
            }
        }

        if (!(tmpDr.exists())) {
            tmpDr.mkdirs();
        }
        if (!(tmpAr.exists())) {
            Files.copy(dr.toPath(), tmpAr.toPath());
        }
        readWrite(true, tmpArchive, ln, l, ad);
    }

    public int readWrite(boolean wr, String archive, int ln, int l, Object ad) {
        String rl;
        int rL = 0;

        ln -= 1;

        int n = l - ln;

        String lnB[] = new String[ln];
        String lnA[] = new String[n];

        try {
            File te = new File(archive);
            try (FileInputStream fR = new FileInputStream(te);
                    InputStreamReader in = new InputStreamReader(fR); BufferedReader bR = new BufferedReader(in)) {

                if (ln != 0) {
                    for (int i = 0; i < ln; i++) {
                        lnB[i] = bR.readLine();
                        if (lnB[i] == null) {
                            lnB[i] = "0";
                        }
                    }
                }

                rl = bR.readLine();
                if (rl == null) {
                    rl = "0";
                }

                if (n != 0) {
                    for (int i = 0; i < n; i++) {
                        lnA[i] = bR.readLine();
                        if (lnA[i] == null) {
                            lnA[i] = "0";
                        }
                    }
                }
                bR.close();
                in.close();
                fR.close();
            }

            rL = Integer.parseInt(rl) + (int) ad;

            if (wr == true) {

                try (FileWriter fW = new FileWriter(te); BufferedWriter bW = new BufferedWriter(fW)) {

                    if (ln != 0) {
                        for (int i = 0; i < ln; i++) {
                            bW.write(lnB[i]);
                            bW.newLine();
                        }
                    }

                    bW.write(Integer.toString(rL));
                    bW.newLine();

                    if (n != 0) {
                        for (int i = 0; i < n; i++) {
                            bW.write(lnA[i]);
                            bW.newLine();
                        }
                    }
                    bW.close();
                    fW.close();
                }
            }
        } catch (IOException E) {
        }
        return rL;
    }

    public Object[] readLines(File dir) {
        int l = 0;
        try {
            l = countLines(dir.getAbsolutePath());
        } catch (IOException ex) {
        }
        String line[];
        line = new String[l];
        try (FileInputStream fR = new FileInputStream(dir);
                InputStreamReader in = new InputStreamReader(fR); BufferedReader bR = new BufferedReader(in)) {
            for (int i = 0; i < line.length; i++) {
                line[i] = bR.readLine();
            }
            bR.close();
            in.close();
            fR.close();
        } 
        catch (IOException ex) {
        }
        return line;
    }
    
    public Object readLine(File dir, int n){
        Object[] lines;
        lines = readLines(dir);
        return lines[(n-1)];
    }

    public void tmpSetStage(int stage, int par[]) {
        try (FileWriter fW = new FileWriter(tmpStage); BufferedWriter bW = new BufferedWriter(fW)) {
            for (int i = 0; i < par.length; i++) {
                if (i == 0) {
                    bW.write(Integer.toString(stage));
                    bW.newLine();
                    bW.write(Integer.toString(par[i]));
                    bW.newLine();
                } else {
                    bW.write(Integer.toString(par[i]));
                    bW.newLine();
                }
            }
            bW.close();
            fW.close();
        } catch (IOException ex) {
        }
    }

    public boolean tmpToReal() throws IOException {

        File tmpPl = new File(tmp.getPath() + "/" + plDt.getPath());
        File tmpTm = new File(tmp.getPath() + "/" + tmDt.getPath());
        File tmpCh = new File(tmp.getPath() + "/" + chDt.getPath());
        File[] tmpDir = {tmpPl, tmpTm, tmpCh};
        File[] tmpPlAr = null;
        File[] tmpTmAr = null;
        File[] tmpChAr = null;
        File[][] tmpAr = {tmpPlAr, tmpTmAr, tmpChAr};
        for (int i = 0; i < tmpDir.length; i++) {
            tmpAr[i] = tmpDir[i].listFiles();
        }
        for (int i = 0; i < tmpAr.length; i++) {
            if (tmpAr[i] != null) {
                for (int j = 0; j < tmpAr[i].length; j++) {
                    File dir = new File(dirs[i] + "/" + tmpAr[i][j].getAbsoluteFile().getName());
                    dir.delete();
                    Files.copy(tmpAr[i][j].toPath(), dir.toPath());
                }
            }
        }
        return true;
    }

    public int countLines(String filename) throws IOException {
        InputStream is = new BufferedInputStream(new FileInputStream(filename));
        try {
            byte[] c = new byte[1024];
            int count = 0;
            int readChars = 0;
            boolean endsWithoutNewLine = false;
            while ((readChars = is.read(c)) != -1) {
                for (int i = 0; i < readChars; ++i) {
                    if (c[i] == '\n') {
                        ++count;
                    }
                }
                endsWithoutNewLine = (c[readChars - 1] != '\n');
            }
            if (endsWithoutNewLine) {
                ++count;
            }
            return count;
        } finally {
            is.close();
        }
    }

    public void write(File file, int l, String line) throws IOException {
        int n = countLines(file.getAbsolutePath()) != 0 ? countLines(file.getAbsolutePath()) : l;
        int ln = n - l;
        l--;
        String[] read;
        read = (String[])readLines(file);
        try (FileWriter fW = new FileWriter(file); BufferedWriter bW = new BufferedWriter(fW)) {

            if (l != 0) {
                for (int i = 0; i < ln; i++) {
                    bW.write(read[i]);
                    bW.newLine();
                }
            }

            bW.write(line);
            bW.newLine();

            if (ln != 0) {
                for (int i = (l+1); i < n; i++) {
                    bW.write(read[i]);
                    bW.newLine();
                }
            }
            bW.close();
            fW.close();
        }
    }
    public void write(File file, int l, int ad) throws IOException {
        int n = countLines(file.getAbsolutePath()) != 0 ? countLines(file.getAbsolutePath()) : l;
        int ln = n - l;
        l--;
        String[] read;
        read = (String[])readLines(file);
        int line = (int)readLines(file)[l]+ad;
        try (FileWriter fW = new FileWriter(file); BufferedWriter bW = new BufferedWriter(fW)) {

            if (l != 0) {
                for (int i = 0; i < ln; i++) {
                    bW.write(read[i]);
                    bW.newLine();
                }
            }

            bW.write(Integer.toString(line));
            bW.newLine();

            if (ln != 0) {
                for (int i = (l+1); i < n; i++) {
                    bW.write(read[i]);
                    bW.newLine();
                }
            }
            bW.close();
            fW.close();
        }
    }
}
