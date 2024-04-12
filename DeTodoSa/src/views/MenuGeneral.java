/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import Entidades.Producto;
import java.util.TreeSet;


/**
 *
 * @author tDev
 */
public class MenuGeneral extends javax.swing.JFrame {
    protected TreeSet<Producto> productos = new TreeSet<Producto>();
    /**
     * Creates new form MenuGeneral
     */
    public MenuGeneral() {
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

        jdpEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAdministracion = new javax.swing.JMenu();
        jmiProductos = new javax.swing.JMenuItem();
        jmiConsultas = new javax.swing.JMenu();
        jmiRubro = new javax.swing.JMenuItem();
        jmiNombre = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jdpEscritorioLayout = new javax.swing.GroupLayout(jdpEscritorio);
        jdpEscritorio.setLayout(jdpEscritorioLayout);
        jdpEscritorioLayout.setHorizontalGroup(
            jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 669, Short.MAX_VALUE)
        );
        jdpEscritorioLayout.setVerticalGroup(
            jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
        );

        jmAdministracion.setText("Administracion");
        jmAdministracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAdministracionActionPerformed(evt);
            }
        });

        jmiProductos.setText("Productos");
        jmiProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProductosActionPerformed(evt);
            }
        });
        jmAdministracion.add(jmiProductos);

        jMenuBar1.add(jmAdministracion);

        jmiConsultas.setText("Consultas");

        jmiRubro.setText("Por Rubro");
        jmiRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRubroActionPerformed(evt);
            }
        });
        jmiConsultas.add(jmiRubro);

        jmiNombre.setText("Por Nombre");
        jmiNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNombreActionPerformed(evt);
            }
        });
        jmiConsultas.add(jmiNombre);

        jMenuItem3.setText("Por Precio");
        jmiConsultas.add(jMenuItem3);

        jMenuBar1.add(jmiConsultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNombreActionPerformed
       ListadoNombre n = new ListadoNombre();
       jdpEscritorio.removeAll();
       jdpEscritorio.repaint();
       n.setVisible(true);
       jdpEscritorio.add(n);
       n.moveToFront();
    }//GEN-LAST:event_jmiNombreActionPerformed

    private void jmiProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProductosActionPerformed
        GestionDeProductos m =  new GestionDeProductos(productos);
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        m.setVisible(true);
        jdpEscritorio.add(m);
       
    }//GEN-LAST:event_jmiProductosActionPerformed

    private void jmAdministracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAdministracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmAdministracionActionPerformed

    private void jmiRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRubroActionPerformed
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        ListadoRubro l = new ListadoRubro(productos);
        l.setVisible(true);
        jdpEscritorio.add(l);
    }//GEN-LAST:event_jmiRubroActionPerformed

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
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JDesktopPane jdpEscritorio;
    private javax.swing.JMenu jmAdministracion;
    private javax.swing.JMenu jmiConsultas;
    private javax.swing.JMenuItem jmiNombre;
    private javax.swing.JMenuItem jmiProductos;
    private javax.swing.JMenuItem jmiRubro;
    // End of variables declaration//GEN-END:variables
}
