package GUI;

import Persistencia.ControladoraPersistencia;


/**
 *
 * @author Matias
 */
public class guiMain extends javax.swing.JFrame {
    
    ControladoraPersistencia persistControl = new ControladoraPersistencia();
  
    public guiMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        btnVerReg = new javax.swing.JButton();
        btnAgregarN = new javax.swing.JButton();
        infoCreator = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(420, 239));
        setMinimumSize(new java.awt.Dimension(420, 239));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(420, 239));
        jPanel1.setMinimumSize(new java.awt.Dimension(420, 239));

        lbTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(0, 204, 204));
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Menu Principal");

        btnVerReg.setText("Ver registrados");
        btnVerReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerRegActionPerformed(evt);
            }
        });

        btnAgregarN.setText("Agregar nuevo");
        btnAgregarN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarNActionPerformed(evt);
            }
        });

        infoCreator.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoCreator.setText("Fernández Matias Daniel - TPO2 - 2021");
        infoCreator.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(infoCreator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregarN, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btnVerReg, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbTitulo)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarN, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerReg, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(infoCreator)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerRegActionPerformed
        GUI.guiRegistros Registro = new GUI.guiRegistros(persistControl);
        Registro.setTitle("Peluqueria Canina - Registros");
        Registro.setLocationRelativeTo(null);
        Registro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVerRegActionPerformed

    private void btnAgregarNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarNActionPerformed
        GUI.guiAgregado Agregado = new GUI.guiAgregado(persistControl);
        Agregado.setTitle("Peluqueria Canina - Agregar mascotas");
        Agregado.setLocationRelativeTo(null);
        Agregado.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregarNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarN;
    private javax.swing.JButton btnVerReg;
    private javax.swing.JLabel infoCreator;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
