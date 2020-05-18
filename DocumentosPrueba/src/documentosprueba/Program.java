package documentosprueba;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.*;
import java.io.FileOutputStream;
import java.util.*;
import com.aspose.pdf.Document;
import com.aspose.pdf.TextFragment;
import com.aspose.pdf.TextFragmentAbsorber;
import com.aspose.pdf.TextFragmentCollection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Program {
    public static void main(String[] args){
        /*try {
            PdfReader reader = new PdfReader(new FileInputStream("E:/oficioPrueba.pdf"));
            PdfStamper stamper = new PdfStamper(reader, new FileOutputStream("E:/oficioPrueba.pdf"),'1',true);
            
            stamper.close();
            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
        */
       Document pdfDocument = new Document("E:/oficioPrueba.pdf");
       TextFragmentAbsorber tfabs = new TextFragmentAbsorber("<coordTut>");
       pdfDocument.getPages().accept(tfabs);
       TextFragmentCollection tfcol = tfabs.getTextFragments();
       for(TextFragment tfrags : (Iterable<TextFragment>)tfcol){
           tfrags.setText("Carlos Sebastian Madrigal Rodriguez");
       }
      pdfDocument.save("E:/oficioPrueba.pdf");
    } 
    public Map<String, String> rellenar(){
        Map<String,String> mapa = new HashMap<>();
        return mapa;
    }
}