package prii_u207_ventanasmdi;

import static java.lang.System.exit;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
/**
 * @author Katherine Arzate Serrano
 * @author Carlos Sebastian Madrigal Rodriguez
 */
public class VentanaPadre extends javax.swing.JFrame {

    private final JDesktopPane escritorio;
    public VentanaPadre() {
        escritorio = new JDesktopPane();
        this.setContentPane(escritorio);
        this.pack();
        initComponents();
        this.setSize(720,720);
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mi_nueva_orden = new javax.swing.JMenuItem();
        mi_salir = new javax.swing.JMenuItem();
        menu_acerca_de = new javax.swing.JMenu();
        mi_autores = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Orden de Trabajo");

        mi_nueva_orden.setText("Nueva Orden");
        mi_nueva_orden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_nueva_ordenActionPerformed(evt);
            }
        });
        jMenu1.add(mi_nueva_orden);

        mi_salir.setText("Salir");
        mi_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_salirActionPerformed(evt);
            }
        });
        jMenu1.add(mi_salir);

        jMenuBar1.add(jMenu1);

        menu_acerca_de.setText("Acerca de");

        mi_autores.setText("Autores");
        mi_autores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_autoresActionPerformed(evt);
            }
        });
        menu_acerca_de.add(mi_autores);

        jMenuBar1.add(menu_acerca_de);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mi_nueva_ordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_nueva_ordenActionPerformed
        // TODO add your handling code here:
        JInternalFrame vhija= new JInternalFrame("Orden de trabajo",false,true,false,false);
        PanelHijo hijo=new PanelHijo();
        vhija.add(hijo);
        vhija.pack();
        vhija.setVisible(true);

        escritorio.add(vhija); 
    }//GEN-LAST:event_mi_nueva_ordenActionPerformed

    private void mi_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_salirActionPerformed
        // TODO add your handling code here:
        exit(0);
    }//GEN-LAST:event_mi_salirActionPerformed

    private void mi_autoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_autoresActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Autores: \n Katherine Arzate Serrano. \n Carlos Sebastian Madrigal Rodriguez.");
    }//GEN-LAST:event_mi_autoresActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPadre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPadre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPadre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPadre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPadre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menu_acerca_de;
    private javax.swing.JMenuItem mi_autores;
    private javax.swing.JMenuItem mi_nueva_orden;
    private javax.swing.JMenuItem mi_salir;
    // End of variables declaration//GEN-END:variables
}
