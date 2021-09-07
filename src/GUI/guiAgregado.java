package GUI;

import Logica.logicaMascota;
import static javax.swing.JOptionPane.showMessageDialog;
import Persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matias
 */
public class guiAgregado extends javax.swing.JFrame {

    ControladoraPersistencia persistControl;
    List <logicaMascota> mascotasLista;
    
    public guiAgregado(ControladoraPersistencia controlPersist) {
        this.persistControl = controlPersist;
        this.mascotasLista = actualizarLista();
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        lbClienteNum = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbRaza = new javax.swing.JLabel();
        lbColor = new javax.swing.JLabel();
        lbAlergico = new javax.swing.JLabel();
        lbAtencionEsp = new javax.swing.JLabel();
        lbNombreDuenio = new javax.swing.JLabel();
        lbCelDuenio = new javax.swing.JLabel();
        lbObs = new javax.swing.JLabel();
        num_cliente = new javax.swing.JTextField();
        nombre_perro = new javax.swing.JTextField();
        color = new javax.swing.JTextField();
        raza = new javax.swing.JTextField();
        atención_especial = new javax.swing.JComboBox<>();
        alergico = new javax.swing.JComboBox<>();
        nombre_duenio = new javax.swing.JTextField();
        celular_duenio = new javax.swing.JTextField();
        observaciones = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(840, 640));

        jPanel2.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/dogImg.jpg"))); // NOI18N

        lbTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(0, 204, 204));
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Peluqueria Canina");

        lbClienteNum.setText("Cliente N°:");

        lbNombre.setText("Nombre:");

        lbRaza.setText("Raza:");

        lbColor.setText("Color:");

        lbAlergico.setText("Alergico:");

        lbAtencionEsp.setText("Atencion Especial:");

        lbNombreDuenio.setText("Nombre Dueño:");

        lbCelDuenio.setText("Cel. Dueño:");

        lbObs.setText("Observaciones:");

        num_cliente.setEditable(false);
        num_cliente.setNextFocusableComponent(nombre_perro);

        nombre_perro.setNextFocusableComponent(raza);

        color.setNextFocusableComponent(alergico);

        raza.setNextFocusableComponent(color);

        atención_especial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        atención_especial.setSelectedIndex(-1);
        atención_especial.setNextFocusableComponent(nombre_duenio);

        alergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        alergico.setSelectedIndex(-1);
        alergico.setNextFocusableComponent(atención_especial);

        nombre_duenio.setNextFocusableComponent(celular_duenio);
        nombre_duenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_duenioActionPerformed(evt);
            }
        });

        celular_duenio.setNextFocusableComponent(observaciones);

        observaciones.setNextFocusableComponent(btnGuardar);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.setNextFocusableComponent(num_cliente);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.setNextFocusableComponent(btnLimpiar);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.setNextFocusableComponent(btnLimpiar);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.setNextFocusableComponent(num_cliente);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbAlergico)
                                    .addComponent(lbColor)
                                    .addComponent(lbAtencionEsp)
                                    .addComponent(lbNombreDuenio))
                                .addComponent(lbObs, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbCelDuenio, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(lbRaza)
                            .addComponent(lbNombre)
                            .addComponent(lbClienteNum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(num_cliente)
                            .addComponent(nombre_perro)
                            .addComponent(raza)
                            .addComponent(color)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(atención_especial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(alergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 364, Short.MAX_VALUE))
                            .addComponent(nombre_duenio)
                            .addComponent(celular_duenio)
                            .addComponent(observaciones))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbTitulo)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbClienteNum)
                            .addComponent(num_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNombre)
                            .addComponent(nombre_perro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbRaza)
                            .addComponent(raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbColor)
                            .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbAlergico)
                            .addComponent(alergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbAtencionEsp)
                            .addComponent(atención_especial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNombreDuenio)
                            .addComponent(nombre_duenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCelDuenio)
                            .addComponent(celular_duenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(observaciones)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbObs)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private List <logicaMascota> actualizarLista (){
        List <logicaMascota> principal = persistControl.findMascotas();
        List <logicaMascota> auxiliar;
        auxiliar = new ArrayList();
        int j = 0;
        for (int i = 0; i < principal.size(); i++){
            if (principal.get(i).isEliminado() == false){
                auxiliar.add(j, principal.get(i));
                j++;
            }
        }
        return auxiliar;
    }
    private void LimpiarCampos(){
        num_cliente.setText("");
        nombre_perro.setText("");
        raza.setText("");
        color.setText("");
        alergico.setSelectedIndex(-1);
        atención_especial.setSelectedIndex(-1);
        nombre_duenio.setText("");
        celular_duenio.setText("");
        observaciones.setText("");
    }
    private void nombre_duenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_duenioActionPerformed

    }//GEN-LAST:event_nombre_duenioActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (!"".equals(num_cliente.getText()))
        {
            if (!"".equals(nombre_perro.getText()))
            {
                if (!"".equals(raza.getText()))
                {
                    if (!"".equals(color.getText()))
                    {
                        if (!"".equals((String) alergico.getSelectedItem()))
                        {
                            if (!"".equals((String) atención_especial.getSelectedItem()))
                            {
                                if (!"".equals(nombre_duenio.getText()))
                                {
                                    if (!"".equals(celular_duenio.getText()))
                                    {
                                        if (!"".equals(observaciones.getText()))
                                        {
                                            try
                                            {
                                                String numero = num_cliente.getText(); 
                                                String nombre = nombre_perro.getText();
                                                String _raza = raza.getText();
                                                String _color = color.getText();
                                                String _alergico = (String) alergico.getSelectedItem();
                                                String atencionEsp = (String) atención_especial.getSelectedItem();
                                                String nombreDuenio = nombre_duenio.getText();
                                                String celDuenio = celular_duenio.getText();
                                                String observacion = observaciones.getText();
                                                persistControl.crearMascota(persistControl.agregarDatosMascota(numero, nombre, _raza, _color, _alergico, atencionEsp, nombreDuenio, celDuenio, observacion, false));
                                                LimpiarCampos();
                                                showMessageDialog(null,"Datos guardados exitosamente");
                                            }
                                            catch (NumberFormatException e)
                                            {
                                                showMessageDialog(null, "Ocurrió un error inesperado en el guardado de datos, por favor verifique los campos cargados");
                                            }
                                        }
                                        else
                                        {
                                            showMessageDialog(null, "Ingrese alguna observacion");
                                        }
                                    }
                                    else
                                    {
                                        showMessageDialog(null, "Ingrese celular del duenio");
                                    }
                                }
                                else
                                {
                                    showMessageDialog(null, "Ingrese nombre del duenio");
                                }
                            }
                            else
                            {
                                showMessageDialog(null, "Especifique si la mascota requiere atencion especial");
                            }
                        }
                        else
                        {
                            showMessageDialog(null, "Especifique si la mascota tiene alergias");
                        }
                    }
                    else
                    {
                        showMessageDialog(null, "Ingrese color");
                    }
                }
                else
                {
                    showMessageDialog(null, "Ingrese raza");
                }
            }
            else
            {
                showMessageDialog(null, "Ingrese un nombre");
            }
        }
        else
        {
            showMessageDialog(null, "Ingrese un nuevo registro");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        GUI.guiMain Main = new GUI.guiMain();
        Main.setTitle("Peluqueria Canina");
        Main.setLocationRelativeTo(null);
        Main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        LimpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        LimpiarCampos();
        if (!persistControl.findMascotas().isEmpty()){
            mascotasLista = persistControl.findMascotas();
            num_cliente.setText(String.valueOf((Integer.parseInt(mascotasLista.get(mascotasLista.size() - 1).getNumero())) + 1)); 
            mascotasLista = actualizarLista();
        }
        else{
            num_cliente.setText("1");
        }
    }//GEN-LAST:event_btnNuevoActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> alergico;
    private javax.swing.JComboBox<String> atención_especial;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField celular_duenio;
    private javax.swing.JTextField color;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbAlergico;
    private javax.swing.JLabel lbAtencionEsp;
    private javax.swing.JLabel lbCelDuenio;
    private javax.swing.JLabel lbClienteNum;
    private javax.swing.JLabel lbColor;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbNombreDuenio;
    private javax.swing.JLabel lbObs;
    private javax.swing.JLabel lbRaza;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField nombre_duenio;
    private javax.swing.JTextField nombre_perro;
    private javax.swing.JTextField num_cliente;
    private javax.swing.JTextField observaciones;
    private javax.swing.JTextField raza;
    // End of variables declaration//GEN-END:variables
}
