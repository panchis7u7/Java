package supermercado2;
import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
import javax.swing.*;

public class Util implements Serializable {
        static String formato(String msg, int ancho){
        for(int i = msg.length(); i < ancho; i++)
                msg = msg.concat(" ");
        return msg;
    }
    
    static String formato(double valor, int ancho){
        DecimalFormat fto = new DecimalFormat("0.00");
        return formato(fto.format(valor), ancho);
    }  
}
