
package ingenieria.de.software;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ventanaInventario extends javax.swing.JFrame {

    DefaultTableModel modeloTablaInventario;
            
    public ventanaInventario() {
        initComponents();
        modeloTablaInventario = new DefaultTableModel();
        modeloTablaInventario.addColumn("Tipo");
        modeloTablaInventario.addColumn("Marca");
        modeloTablaInventario.addColumn("Modelo");
        modeloTablaInventario.addColumn("Piezas vendidas");
        modeloTablaInventario.addColumn("Piezas disponibles");
        modeloTablaInventario.addColumn("Precio");
        this.tablaInventario.setModel(modeloTablaInventario);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInventario = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tipoInventario = new javax.swing.JTextField();
        marcaInventario = new javax.swing.JTextField();
        modeloInventario = new javax.swing.JTextField();
        piezasDisponiblesInventario = new javax.swing.JTextField();
        piezasVendidasInventario = new javax.swing.JTextField();
        precioInventario = new javax.swing.JTextField();
        botonInsertarInventario = new javax.swing.JButton();
        botonEliminarInventario = new javax.swing.JButton();
        botonModificarInventario = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        filaModificar = new javax.swing.JTextField();
        columnaModificar = new javax.swing.JTextField();
        nuevoModificar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inventario");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tablaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaInventario);

        jLabel1.setText("Tipo");

        jLabel2.setText("Marca");

        jLabel3.setText("Modelo");

        jLabel4.setText("Piezas vendidas");

        jLabel5.setText("Piezas disponibles");

        jLabel6.setText("Precio");

        botonInsertarInventario.setText("Insertar");
        botonInsertarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarInventarioActionPerformed(evt);
            }
        });

        botonEliminarInventario.setText("Eliminar");
        botonEliminarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarInventarioActionPerformed(evt);
            }
        });

        botonModificarInventario.setText("Modificar");
        botonModificarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarInventarioActionPerformed(evt);
            }
        });

        jLabel7.setText("Fila");

        jLabel8.setText("Columna");

        jLabel9.setText("Nuevo");

        filaModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filaModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(piezasVendidasInventario)
                            .addComponent(precioInventario)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(piezasDisponiblesInventario)
                            .addComponent(modeloInventario)
                            .addComponent(marcaInventario)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tipoInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(78, 78, 78)
                .addComponent(botonModificarInventario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(columnaModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                            .addComponent(filaModificar)
                            .addComponent(nuevoModificar)))
                    .addComponent(jLabel8))
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(botonInsertarInventario)
                                .addGap(113, 113, 113)
                                .addComponent(botonEliminarInventario)))
                        .addGap(0, 358, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(marcaInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(modeloInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(piezasDisponiblesInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(filaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(piezasVendidasInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonModificarInventario)
                    .addComponent(jLabel8)
                    .addComponent(columnaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(precioInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(nuevoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonInsertarInventario)
                    .addComponent(botonEliminarInventario))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInsertarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarInventarioActionPerformed
        
        //Acciones del boton "Insertar"
        //Usamos un arreglo de String para almacenar ahi los datos de los cuadros de texto y los limpiamos
        String[] datos = new String[6];
        datos[0] = tipoInventario.getText();
        tipoInventario.setText(null);
        datos[1] = marcaInventario.getText();
        marcaInventario.setText(null);
        datos[2] = modeloInventario.getText();
        modeloInventario.setText(null);
        datos[3] = piezasDisponiblesInventario.getText();
        piezasDisponiblesInventario.setText(null);
        datos[4] = piezasVendidasInventario.getText();
        piezasVendidasInventario.setText(null);
        datos[5] = precioInventario.getText();
        precioInventario.setText(null);
        //Movemos los datos del arreglo a la tabla
        modeloTablaInventario.addRow(datos);
        
    }//GEN-LAST:event_botonInsertarInventarioActionPerformed

    private void filaModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filaModificarActionPerformed
        
    }//GEN-LAST:event_filaModificarActionPerformed

    private void botonEliminarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarInventarioActionPerformed
        int seleccionFila = tablaInventario.getSelectedRow();
        if(seleccionFila >= 0){
            //Remueve la fila sleccionada
            modeloTablaInventario.removeRow(seleccionFila);
        }
        else{ //Escribe el mensaje de advertencia
            JOptionPane.showMessageDialog(null, "Tabla no encontrada o entrada invalida, por favor intente de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonEliminarInventarioActionPerformed

    private void botonModificarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarInventarioActionPerformed
        int fila = Integer.parseInt(filaModificar.getText());
        int columna = Integer.parseInt(columnaModificar.getText());
        modeloTablaInventario.setValueAt(nuevoModificar.getText(), fila, columna);
    }//GEN-LAST:event_botonModificarInventarioActionPerformed

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminarInventario;
    private javax.swing.JButton botonInsertarInventario;
    private javax.swing.JButton botonModificarInventario;
    private javax.swing.JTextField columnaModificar;
    private javax.swing.JTextField filaModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField marcaInventario;
    private javax.swing.JTextField modeloInventario;
    private javax.swing.JTextField nuevoModificar;
    private javax.swing.JTextField piezasDisponiblesInventario;
    private javax.swing.JTextField piezasVendidasInventario;
    private javax.swing.JTextField precioInventario;
    private javax.swing.JTable tablaInventario;
    private javax.swing.JTextField tipoInventario;
    // End of variables declaration//GEN-END:variables
}
