
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRII_U105;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoPeriod;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thebloneck
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCapital = new javax.swing.JLabel();
        lblIVA = new javax.swing.JLabel();
        lblFechaInicial = new javax.swing.JLabel();
        lblFechaFinal = new javax.swing.JLabel();
        txtfCapital = new javax.swing.JTextField();
        txtfIVA = new javax.swing.JTextField();
        ftxtfFechaInicial = new javax.swing.JFormattedTextField();
        ftxtfFechaFinal = new javax.swing.JFormattedTextField();
        btnOkey = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAAyuda = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCapital.setText("Capital");

        lblIVA.setText("IVA");

        lblFechaInicial.setText("Fecha Inicial");

        lblFechaFinal.setText("Fecha Final");

        txtfCapital.setMinimumSize(new java.awt.Dimension(15, 28));
        txtfCapital.setPreferredSize(new java.awt.Dimension(15, 28));
        txtfCapital.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtfCapitalMouseMoved(evt);
            }
        });
        txtfCapital.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfCapitalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfCapitalFocusLost(evt);
            }
        });

        txtfIVA.setPreferredSize(new java.awt.Dimension(15, 28));
        txtfIVA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtfIVAMouseMoved(evt);
            }
        });
        txtfIVA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfIVAFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfIVAFocusLost(evt);
            }
        });

        ftxtfFechaInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        ftxtfFechaInicial.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ftxtfFechaInicialMouseMoved(evt);
            }
        });
        ftxtfFechaInicial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ftxtfFechaInicialFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ftxtfFechaInicialFocusLost(evt);
            }
        });
        ftxtfFechaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtfFechaInicialActionPerformed(evt);
            }
        });

        ftxtfFechaFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        ftxtfFechaFinal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ftxtfFechaFinalMouseMoved(evt);
            }
        });
        ftxtfFechaFinal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ftxtfFechaFinalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ftxtfFechaFinalFocusLost(evt);
            }
        });

        btnOkey.setText("Calcular");
        btnOkey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkeyActionPerformed(evt);
            }
        });

        txtAAyuda.setColumns(20);
        txtAAyuda.setLineWrap(true);
        txtAAyuda.setRows(5);
        jScrollPane1.setViewportView(txtAAyuda);

        txtAResultado.setColumns(20);
        txtAResultado.setLineWrap(true);
        txtAResultado.setRows(5);
        jScrollPane2.setViewportView(txtAResultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIVA)
                            .addComponent(lblCapital)
                            .addComponent(lblFechaInicial)
                            .addComponent(lblFechaFinal))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ftxtfFechaFinal)
                            .addComponent(ftxtfFechaInicial)
                            .addComponent(txtfIVA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtfCapital, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOkey, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfCapital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCapital))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIVA))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ftxtfFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaInicial))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ftxtfFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaFinal)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOkey)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfCapitalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfCapitalFocusGained
        txtfCapital.setBackground(Color.yellow);
    }//GEN-LAST:event_txtfCapitalFocusGained

    private void txtfCapitalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfCapitalFocusLost
       txtfCapital.setBackground(Color.white);
    }//GEN-LAST:event_txtfCapitalFocusLost

    private void ftxtfFechaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtfFechaInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtfFechaInicialActionPerformed

    private void txtfIVAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfIVAFocusGained
       txtfIVA.setBackground(Color.yellow);
    }//GEN-LAST:event_txtfIVAFocusGained

    private void txtfIVAFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfIVAFocusLost
         txtfIVA.setBackground(Color.white);
    }//GEN-LAST:event_txtfIVAFocusLost

    private void ftxtfFechaInicialFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftxtfFechaInicialFocusGained
        ftxtfFechaInicial.setBackground(Color.yellow);
    }//GEN-LAST:event_ftxtfFechaInicialFocusGained

    private void ftxtfFechaInicialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftxtfFechaInicialFocusLost
       ftxtfFechaInicial.setBackground(Color.white);
    }//GEN-LAST:event_ftxtfFechaInicialFocusLost

    private void ftxtfFechaFinalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftxtfFechaFinalFocusGained
       ftxtfFechaFinal.setBackground(Color.yellow);
    }//GEN-LAST:event_ftxtfFechaFinalFocusGained

    private void ftxtfFechaFinalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftxtfFechaFinalFocusLost
       ftxtfFechaFinal.setBackground(Color.white);
    }//GEN-LAST:event_ftxtfFechaFinalFocusLost

    private void txtfCapitalMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtfCapitalMouseMoved
       txtAAyuda.setText("El capital, desde el punto de vista financiero anual y mensual, "
               + "también denominado capital financiero, es toda suma de dinero que no ha sido consumida por su propietario, "
               + "sino que ha sido ahorrada y trasladada a un mercado financiero, "
               + "con el fin de obtener una renta de la misma.");
    }//GEN-LAST:event_txtfCapitalMouseMoved

    private void txtfIVAMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtfIVAMouseMoved
        txtAAyuda.setText("Es la cantitad a cobrar por el servicio, es una carga fiscal sobre el consumo, es decir, "
                + "financiado por el consumidor como impuesto regresivo");
    }//GEN-LAST:event_txtfIVAMouseMoved

    private void ftxtfFechaInicialMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ftxtfFechaInicialMouseMoved
       txtAAyuda.setText("Fecha inicial, se debe ingresar con la forma dd/MM/yyyy");
    }//GEN-LAST:event_ftxtfFechaInicialMouseMoved

    private void ftxtfFechaFinalMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ftxtfFechaFinalMouseMoved
         txtAAyuda.setText("Fecha Final, se debe ingresar con la forma dd/MM/yyyy");
    }//GEN-LAST:event_ftxtfFechaFinalMouseMoved

    private void btnOkeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkeyActionPerformed
       String f1= ftxtfFechaInicial.getText();                                      
       String f2= ftxtfFechaFinal.getText();
       Date date1 = null;
       Date date2 = null;
       try{
           date1=new SimpleDateFormat("dd/MM/yyyy").parse(f1);
           date2=new SimpleDateFormat("dd/MM/yyyy").parse(f2);
       } catch (ParseException ex){
           Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE,null,ex);
       }
       double dias = (date2.getTime()-date1.getTime())/(24*60*60*1000.0);
        txtAResultado.setText("Dias en total: "+dias+"\n");
       
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        ChronoLocalDate desde = ChronoLocalDate.from(formato.parse(f1));
        ChronoLocalDate hasta = ChronoLocalDate.from(formato.parse(f2));
        ChronoPeriod period = ChronoPeriod.between(desde, hasta);
        txtAResultado.append("Años: " + period.get(java.time.temporal.ChronoUnit.YEARS) + 
                "\nMeses: "+period.get(java.time.temporal.ChronoUnit.MONTHS) +
                "\nDias: "+ period.get(java.time.temporal.ChronoUnit.DAYS));
        
        System.out.printf("%d años, %d meses y %d dias", period.get(java.time.temporal.ChronoUnit.YEARS),
        period.get(java.time.temporal.ChronoUnit.YEARS),period.get(java.time.temporal.ChronoUnit.MONTHS),
        period.get(java.time.temporal.ChronoUnit.DAYS));
        
        //Calculos
        double Capital = Double.parseDouble(txtfCapital.getText());
        double TasaInicial = Double.parseDouble(txtfIVA.getText());
        double TasaDiaria = (TasaInicial/100)/365;
        txtAResultado.append("\nInterés Anual : " + ((TasaDiaria*dias)*Capital));
        txtAResultado.append("\nTotal a pagar : " + ((TasaDiaria*dias)*Capital+Capital));
    }//GEN-LAST:event_btnOkeyActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOkey;
    private javax.swing.JFormattedTextField ftxtfFechaFinal;
    private javax.swing.JFormattedTextField ftxtfFechaInicial;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCapital;
    private javax.swing.JLabel lblFechaFinal;
    private javax.swing.JLabel lblFechaInicial;
    private javax.swing.JLabel lblIVA;
    private javax.swing.JTextArea txtAAyuda;
    private javax.swing.JTextArea txtAResultado;
    private javax.swing.JTextField txtfCapital;
    private javax.swing.JTextField txtfIVA;
    // End of variables declaration//GEN-END:variables
}
