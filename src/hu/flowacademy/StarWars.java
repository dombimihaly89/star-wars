package hu.flowacademy;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StarWars {

    public static List szereplok(String path) throws IOException {
        File file = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        List<Sith> siths = new ArrayList<>();
        while ((st = br.readLine()) != null) {
            String[] szereplok = st.split(" ", 4);
            if (szereplok[0].equals("Anakin")) {
                AnakinSkywalker anakin = new AnakinSkywalker(Integer.parseInt(szereplok[2]), Boolean.parseBoolean(szereplok[3]));
                siths.add(anakin);
            }
            if (szereplok[0].equals("Uralkodo")) {
                Uralkodo uralkodo = new Uralkodo(Integer.parseInt(szereplok[2]));
                siths.add(uralkodo);
            }
        }
        return siths;
    }

    public static void main(String[] args) {
        try {
            System.out.println(szereplok("/home/misi/Desktop/FlowAcademy/starwars2/star-wars/src/hu/flowacademy/szereplok.txt"));
        } catch (IOException e) {
            System.out.println("Nincs ilyen file");
        }

    }
}
