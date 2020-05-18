package u1_01_holamundo;

import java.awt.Color;
import java.util.Random;

public class Programa {
    static Random rand = new Random();
    static int r,g,b;
    public static void main(String[] args) {
        Ventana V = new Ventana();
        //Color c = new Color(0,0,0,0);
        V.setLocationRelativeTo(null);
        V.setVisible(true);
        while(true){
        r = rand.nextInt(256);
        g = rand.nextInt(256);
        b = rand.nextInt(256);
        V.getContentPane().setBackground(new Color(r,g,b));
        }
    }   
}