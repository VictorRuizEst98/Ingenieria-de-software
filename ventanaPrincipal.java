
package ingenieria.de.software;


public class ventanaPrincipal extends javax.swing.JFrame {

    
    public ventanaPrincipal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonProvedores = new javax.swing.JButton();
        botonInventario = new javax.swing.JButton();
        botonVentas = new javax.swing.JButton();
        botonCompradores = new javax.swing.JButton();
        botonHardware = new javax.swing.JButton();
        botonInstrucciones = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Vendedora de Hardware");

        botonProvedores.setText("Provedores");
        botonProvedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProvedoresActionPerformed(evt);
            }
        });

        botonInventario.setText("Inventario");
        botonInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInventarioActionPerformed(evt);
            }
        });

        botonVentas.setText("Ventas");
        botonVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVentasActionPerformed(evt);
            }
        });

        botonCompradores.setText("Compradores");
        botonCompradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCompradoresActionPerformed(evt);
            }
        });

        botonHardware.setText("Hardware");
        botonHardware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHardwareActionPerformed(evt);
            }
        });

        botonInstrucciones.setText("Instrucciones");

        jLabel3.setText("Por favor elija una opcion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonVentas)
                    .addComponent(botonProvedores)
                    .addComponent(botonHardware))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonCompradores)
                    .addComponent(botonInventario)
                    .addComponent(botonInstrucciones))
                .addGap(87, 87, 87))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonInventario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(botonProvedores))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVentas)
                    .addComponent(botonCompradores))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonHardware)
                    .addComponent(botonInstrucciones))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonProvedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProvedoresActionPerformed
        
        ventanaProvedores interfazProvedores = new ventanaProvedores();
        interfazProvedores.setTitle("Provedores");
        interfazProvedores.setVisible(true);
    }//GEN-LAST:event_botonProvedoresActionPerformed

    private void botonInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInventarioActionPerformed
        ventanaInventario interfazInventario = new ventanaInventario();
        interfazInventario.setTitle("Inventario");
        interfazInventario.setVisible(true);
    }//GEN-LAST:event_botonInventarioActionPerformed

    private void botonCompradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCompradoresActionPerformed
        ventanaCompradores interfazCompradores = new ventanaCompradores();
        interfazCompradores.setTitle("Compradores");
        interfazCompradores.setVisible(true);
    }//GEN-LAST:event_botonCompradoresActionPerformed

    private void botonVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVentasActionPerformed
        ventanaVentas interfazVentas = new ventanaVentas();
        interfazVentas.setTitle("Ventas");
        interfazVentas.setVisible(true);
    }//GEN-LAST:event_botonVentasActionPerformed

    private void botonHardwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHardwareActionPerformed
        ventanaHardware interfazHardware = new ventanaHardware();
        interfazHardware.setTitle("Hardware");
        interfazHardware.setVisible(true);
    }//GEN-LAST:event_botonHardwareActionPerformed

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCompradores;
    private javax.swing.JButton botonHardware;
    private javax.swing.JButton botonInstrucciones;
    private javax.swing.JButton botonInventario;
    private javax.swing.JButton botonProvedores;
    private javax.swing.JButton botonVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
