/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package views;

import Entidades.Producto;
import java.util.TreeSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adan3
 */
public class ListadoPrecio extends javax.swing.JInternalFrame {

    private TreeSet<Producto> productos;
    DefaultTableModel modeloTabla = new DefaultTableModel();

    public ListadoPrecio(TreeSet<Producto> productos) {
        initComponents();
        this.productos = productos;
        armarCabecera();
    }

    private void armarCabecera() {
        modeloTabla.addColumn("Codigo");
        modeloTabla.addColumn("Descripcion");
        modeloTabla.addColumn("Precio");
        modeloTabla.addColumn("Stock");
        modeloTabla.addColumn("Rubro");
        jtTablaPrecio.setModel(modeloTabla);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlEntre = new javax.swing.JLabel();
        jtfMenor = new javax.swing.JTextField();
        jlY = new javax.swing.JLabel();
        jtfMayor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaPrecio = new javax.swing.JTable();
        jlListadoporPrecio = new javax.swing.JLabel();
        jbFiltrar = new javax.swing.JButton();

        jlEntre.setText("Entre $:");

        jlY.setText("Y");

        jtTablaPrecio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtTablaPrecio);

        jlListadoporPrecio.setText("Listado por Precio");

        jbFiltrar.setText("Filtrar");
        jbFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jlEntre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlY)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfMayor, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlListadoporPrecio)
                                .addGap(159, 159, 159)))
                        .addGap(38, 38, 38)
                        .addComponent(jbFiltrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlListadoporPrecio)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEntre)
                    .addComponent(jtfMenor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlY)
                    .addComponent(jtfMayor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbFiltrar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFiltrarActionPerformed
        // TODO add your handling code here:
        borrarFilas();
        double mayor = Double.parseDouble(jtfMayor.getText());
        double menor = Double.parseDouble(jtfMenor.getText());

        for (Producto producto : productos) {

            if (producto.getPrecio() > menor && producto.getPrecio() < mayor) {
                Vector renglon = new Vector<>();
                renglon.add(producto.getCodigo());
                renglon.add(producto.getDescripcion());
                renglon.add(producto.getPrecio());
                renglon.add(producto.getStock());
                renglon.add(producto.getRubro());

                modeloTabla.addRow(renglon);
            }
        }
    }//GEN-LAST:event_jbFiltrarActionPerformed

    
    

    private void borrarFilas() {
        int filas = modeloTabla.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modeloTabla.removeRow(f);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbFiltrar;
    private javax.swing.JLabel jlEntre;
    private javax.swing.JLabel jlListadoporPrecio;
    private javax.swing.JLabel jlY;
    private javax.swing.JTable jtTablaPrecio;
    private javax.swing.JTextField jtfMayor;
    private javax.swing.JTextField jtfMenor;
    // End of variables declaration//GEN-END:variables
}
