/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kaan
 */
public class Veri {

    public List<String> veriler = new ArrayList<String>();
    public Set<String> silinenVeriler = new HashSet<String>();

    public List<String> getAll() throws IOException {

        File file = new File("data.txt");

        BufferedReader bf = new BufferedReader(new FileReader(file));
        bf.lines().forEach((line) -> {
            veriler.add(line);
        });
        return veriler;
    }

    public List<String> sayidaVeriOlsun(int n) {
        List<String> tmp = new ArrayList<>();
        Random random = new Random();
        try {
            veriler = getAll();
        } catch (IOException ex) {
        }
        for (int i = 0; i < n; i++) {
            int rand = (int) (random.nextFloat() * veriler.size());
            tmp.add(veriler.get(rand));
        }
        return tmp;
    }

    public void dosyayaYaz(String veriler, String dosyaAdi) {
        try {
            FileWriter fr = new FileWriter(dosyaAdi, true);

            fr.write(veriler);
            fr.close();
            System.out.println("dosyaya yazıldı");
        } catch (IOException ex) {
            Logger.getLogger(Veri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
