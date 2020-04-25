
package ingenieria.de.software;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ventanaProvedores extends javax.swing.JFrame {
    
    DefaultTableModel modelo;
    
    public ventanaProvedores() {
        //Damos nombre a las columnas
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("Empresa");
        modelo.addColumn("Contacto");
        modelo.addColumn("Ultima visita");
        modelo.addColumn("Pieza recibida");
        modelo.addColumn("Cantidad");
        this.tablaProvedores.setModel(modelo);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProvedores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cuadroEmpresa = new javax.swing.JTextField();
        cuadroContacto = new javax.swing.JTextField();
        cuadroUltimaVisita = new javax.swing.JTextField();
        cuadroPiezaRecibida = new javax.swing.JTextField();
        cuadroCantidad = new javax.swing.JTextField();
        botonInsertarProvedores = new javax.swing.JButton();
        botonEliminarProvedores = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        botonModificarProvedores = new javax.swing.JButton();
        filaModificar = new javax.swing.JTextField();
        columnaModificar = new javax.swing.JTextField();
        valorModificar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Provedores");

        tablaProvedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaProvedores);

        jLabel1.setText("Empresa");

        jLabel2.setText("Contacto");

        jLabel3.setText("Ultima visita");

        jLabel4.setText("Pieza recibida");

        jLabel5.setText("Cantidad");

        cuadroPiezaRecibida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadroPiezaRecibidaActionPerformed(evt);
            }
        });

        cuadroCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadroCantidadActionPerformed(evt);
            }
        });

        botonInsertarProvedores.setText("Insertar");
        botonInsertarProvedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarProvedoresActionPerformed(evt);
            }
        });

        botonEliminarProvedores.setText("Eliminar");
        botonEliminarProvedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarProvedoresActionPerformed(evt);
            }
        });

        jLabel6.setText("Instrucciones");

        jLabel7.setText("Para insertar datos primero llene todos los campos y despues oprima \"Insertar\".");

        jLabel8.setText("Para eliminar de click en la fila deseada y oprima \"eliminar\".");

        botonModificarProvedores.setText("Modificar");
        botonModificarProvedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarProvedoresActionPerformed(evt);
            }
        });

        filaModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filaModificarActionPerformed(evt);
            }
        });

        jLabel9.setText("Fila");

        jLabel10.setText("Columna");

        jLabel11.setText("Nuevo");

        jLabel12.setText("Para modificar escriba la fila, columna y el nuevo dato en los campos marcados");

        jLabel13.setText("despues oprima \"Modificar\".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(30, 30, 30)
                                        .addComponent(cuadroContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(33, 33, 33)
                                        .addComponent(cuadroEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botonModificarProvedores)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addComponent(jLabel11)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(columnaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(valorModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(filaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(135, 135, 135))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cuadroPiezaRecibida, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel6))
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cuadroCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cuadroUltimaVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(76, 76, 76))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonEliminarProvedores)
                        .addGap(49, 49, 49)
                        .addComponent(botonInsertarProvedores)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cuadroEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cuadroContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cuadroUltimaVisita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addGap(3, 3, 3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cuadroPiezaRecibida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cuadroCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonInsertarProvedores)
                            .addComponent(botonEliminarProvedores))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(botonModificarProvedores)
                            .addComponent(columnaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(valorModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(196, 196, 196))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInsertarProvedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarProvedoresActionPerformed
        //Acciones del boton "Insertar"
        //Usamos un arreglo de String para almacenar ahi los datos de los cuadros de texto y los limpiamos
        String[] datos = new String[5];
        datos[0] = cuadroEmpresa.getText();
        cuadroEmpresa.setText(null);
        datos[1] = cuadroContacto.getText();
        cuadroContacto.setText(null);
        datos[2] = cuadroUltimaVisita.getText();
        cuadroUltimaVisita.setText(null);
        datos[3] = cuadroPiezaRecibida.getText();
        cuadroPiezaRecibida.setText(null);
        datos[4] = cuadroCantidad.getText();
        cuadroCantidad.setText(null);
        //Movemos los datos del arreglo a la tabla
        modelo.addRow(datos);
        
    }//GEN-LAST:event_botonInsertarProvedoresActionPerformed

    private void cuadroCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadroCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuadroCantidadActionPerformed

    private void botonEliminarProvedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarProvedoresActionPerformed
        //Obtiene la seleccion del mouse
        int seleccionFila = tablaProvedores.getSelectedRow();
        if(seleccionFila >= 0){
            //Remueve la fila sleccionada
            modelo.removeRow(seleccionFila);
       
        }
        else{ //Escribe el mensaje de advertencia
            JOptionPane.showMessageDialog(null, "Tabla no encontrada o entrada invalida, por favor intente de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonEliminarProvedoresActionPerformed

    private void cuadroPiezaRecibidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadroPiezaRecibidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuadroPiezaRecibidaActionPerformed

    private void botonModificarProvedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarProvedoresActionPerformed
        int fila = Integer.parseInt(filaModificar.getText());
        int columna = Integer.parseInt(columnaModificar.getText());
        modelo.setValueAt(valorModificar.getText(), fila, columna);
    }//GEN-LAST:event_botonModificarProvedoresActionPerformed

    private void filaModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filaModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filaModificarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminarProvedores;
    private javax.swing.JButton botonInsertarProvedores;
    private javax.swing.JButton botonModificarProvedores;
    private javax.swing.JTextField columnaModificar;
    private javax.swing.JTextField cuadroCantidad;
    private javax.swing.JTextField cuadroContacto;
    private javax.swing.JTextField cuadroEmpresa;
    private javax.swing.JTextField cuadroPiezaRecibida;
    private javax.swing.JTextField cuadroUltimaVisita;
    private javax.swing.JTextField filaModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProvedores;
    private javax.swing.JTextField valorModificar;
    // End of variables declaration//GEN-END:variables
}
