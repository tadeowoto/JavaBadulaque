/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package views;

import Entidades.Producto;
import Entidades.Rubro;
import java.util.TreeSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tDev
 */
public class ListadoRubro extends javax.swing.JInternalFrame {
    private TreeSet<Producto> productos;
    DefaultTableModel modeloTabla = new DefaultTableModel();

    /**
     * Creates new form ListadoRubro
     */
    public ListadoRubro(TreeSet<Producto> productos) {
        initComponents();
        this.productos=productos;
        jtTabla.setModel(modeloTabla);
        cargarComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlRubroTitulo = new javax.swing.JLabel();
        jlElegirRubro = new javax.swing.JLabel();
        jcbRubro = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();

        jlRubroTitulo.setText("Listado de Productos por Rubro");

        jlElegirRubro.setText("Elija rubro:");

        jcbRubro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbRubroItemStateChanged(evt);
            }
        });
        jcbRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbRubroActionPerformed(evt);
            }
        });

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Precio", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jlRubroTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jlElegirRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jcbRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlRubroTitulo)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlElegirRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbRubroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbRubroItemStateChanged
        
        for (Producto prod : productos) {
            if (prod.getRubro().equals(jcbRubro.getSelectedItem())) {
                modeloTabla.addRow(new Object[]{prod.getCodigo(),prod.getDescripcion(),prod.getPrecio(),prod.getStock()});
            }
        }
    }//GEN-LAST:event_jcbRubroItemStateChanged

    private void jcbRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbRubroActionPerformed
                System.out.println("holas");
        for (Producto prod : productos) {
            System.out.println("hola2");
            if (prod.getRubro().equals(jcbRubro.getSelectedItem())) {
                System.out.println("hol3");
                modeloTabla.addRow(new Object[]{(Integer)prod.getCodigo(),prod.getDescripcion(),(Double)prod.getPrecio(),(Integer)prod.getStock()});
            }
        }
    }//GEN-LAST:event_jcbRubroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Rubro> jcbRubro;
    private javax.swing.JLabel jlElegirRubro;
    private javax.swing.JLabel jlRubroTitulo;
    private javax.swing.JTable jtTabla;
    // End of variables declaration//GEN-END:variables

        private void cargarComboBox(){
        Rubro comestible = new Rubro ("Comestible",1);
        Rubro limpieza = new Rubro ("Limpieza",2);
        Rubro perfumeria = new Rubro ("Perfumeria",3);
        jcbRubro.addItem(comestible);
        jcbRubro.addItem(limpieza);
        jcbRubro.addItem(perfumeria);
        
    }

}
