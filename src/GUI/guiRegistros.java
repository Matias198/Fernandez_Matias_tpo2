package GUI;

import Logica.logicaMascota;
import Persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.List;
import static javax.swing.JOptionPane.showMessageDialog;

public class guiRegistros extends javax.swing.JFrame {

    ControladoraPersistencia persistControl;
    int indiceLista;
    boolean root;
    List <logicaMascota> mascotasLista;
    
    public guiRegistros(ControladoraPersistencia controlPersist) {
        this.root = false;
        this.indiceLista = 0;
        this.persistControl = controlPersist;
        this.mascotasLista = actualizarLista();
        initComponents();
        cargarRegistros(indiceLista);
        btnRestaurar.setVisible(false);
        btnEliminar.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
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
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnBorrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnAdelante = new javax.swing.JButton();
        lbIndiceInfo = new javax.swing.JLabel();
        lbIndexLabel = new javax.swing.JLabel();
        lbInfo1 = new javax.swing.JLabel();
        txtClienteNumBuscar = new javax.swing.JTextField();
        btnToggleAdmin = new javax.swing.JToggleButton();
        lbHint = new javax.swing.JLabel();
        btnRestaurar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(840, 660));
        setSize(new java.awt.Dimension(0, 0));

        jPanel2.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 600));

        lbTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(0, 204, 204));
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Registro");

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

        nombre_perro.setEditable(false);

        color.setEditable(false);

        raza.setEditable(false);

        atención_especial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        atención_especial.setSelectedIndex(-1);
        atención_especial.setEnabled(false);

        alergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        alergico.setSelectedIndex(-1);
        alergico.setEnabled(false);

        nombre_duenio.setEditable(false);
        nombre_duenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_duenioActionPerformed(evt);
            }
        });

        celular_duenio.setEditable(false);

        observaciones.setEditable(false);
        observaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                observacionesActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/recycle.png"))); // NOI18N
        btnBorrar.setToolTipText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Editar.png"))); // NOI18N
        btnEditar.setToolTipText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/search.png"))); // NOI18N
        btnBuscar.setToolTipText("Buscar");
        btnBuscar.setMaximumSize(new java.awt.Dimension(100, 100));
        btnBuscar.setMinimumSize(new java.awt.Dimension(100, 100));
        btnBuscar.setPreferredSize(new java.awt.Dimension(100, 100));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAtras.setText("<<");
        btnAtras.setToolTipText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnAdelante.setText(">>");
        btnAdelante.setToolTipText("Adelante");
        btnAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdelanteActionPerformed(evt);
            }
        });

        lbIndiceInfo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbIndiceInfo.setText("Registro num:");

        lbIndexLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIndexLabel.setText("0");

        lbInfo1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbInfo1.setText("Numero de cliente a buscar:");

        btnToggleAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/rootExplorer.png"))); // NOI18N
        btnToggleAdmin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnToggleAdmin.setMaximumSize(new java.awt.Dimension(100, 100));
        btnToggleAdmin.setMinimumSize(new java.awt.Dimension(100, 100));
        btnToggleAdmin.setPreferredSize(new java.awt.Dimension(100, 100));
        btnToggleAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToggleAdminActionPerformed(evt);
            }
        });

        lbHint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHint.setText("root desactivado");

        btnRestaurar.setText("Restaurar");
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar [Root]");
        btnEliminar.setActionCommand("Eliminar\n[Root]");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAtras, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbIndiceInfo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbIndexLabel))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAdelante)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbHint, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnToggleAdmin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(14, 14, 14))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtClienteNumBuscar)
                            .addComponent(lbInfo1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRestaurar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lbInfo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtClienteNumBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdelante, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnToggleAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbIndiceInfo)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbHint)
                        .addComponent(lbIndexLabel)))
                .addGap(18, 18, 18)
                .addComponent(btnRestaurar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbAlergico)
                                    .addComponent(lbColor)
                                    .addComponent(lbAtencionEsp)
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
                                            .addComponent(alergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(atención_especial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 350, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbCelDuenio)
                                        .addComponent(lbObs))
                                    .addComponent(lbNombreDuenio))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(celular_duenio)
                                    .addComponent(observaciones)
                                    .addComponent(nombre_duenio, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbTitulo)
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbAlergico)
                            .addComponent(alergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbAtencionEsp)
                            .addComponent(atención_especial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre_duenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNombreDuenio))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCelDuenio)
                            .addComponent(celular_duenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbObs)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(observaciones))))
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
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    
    private void cargarRegistros (int indiceRegistro){
        if (!mascotasLista.isEmpty()){
            lbIndexLabel.setText(String.valueOf(indiceRegistro + 1));
            num_cliente.setText(mascotasLista.get(indiceRegistro).getNumero());
            nombre_perro.setText(mascotasLista.get(indiceRegistro).getNombre());
            raza.setText(mascotasLista.get(indiceRegistro).getRaza());
            color.setText(mascotasLista.get(indiceRegistro).getColor());
            alergico.setSelectedItem(mascotasLista.get(indiceRegistro).getAlergico());
            atención_especial.setSelectedItem(mascotasLista.get(indiceRegistro).getAtencionEsp());
            nombre_duenio.setText(mascotasLista.get(indiceRegistro).getNombreDuenio());
            celular_duenio.setText(mascotasLista.get(indiceRegistro).getCelDuenio());
            observaciones.setText(mascotasLista.get(indiceRegistro).getObservacion()); 
            if (mascotasLista.get(indiceRegistro).isEliminado() == true){
                observaciones.setText(observaciones.getText() + " [REGISTRO ELIMINADO]");
            }
        }
        else
        {
            lbIndexLabel.setText("");
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
    }
    
    private void enabledDisabled (boolean condicion){
       
        btnGuardar.setEnabled(!condicion);
        btnCancelar.setEnabled(!condicion);
        btnBuscar.setEnabled(condicion);
        btnAdelante.setEnabled(condicion);
        btnAtras.setEnabled(condicion);
        btnEditar.setEnabled(condicion);
        btnBorrar.setEnabled(condicion);
        nombre_perro.setEditable(!condicion);
        raza.setEditable(!condicion);
        color.setEditable(!condicion);
        alergico.setEnabled(!condicion);
        atención_especial.setEnabled(!condicion);
        nombre_duenio.setEditable(!condicion);
        celular_duenio.setEditable(!condicion);
        observaciones.setEditable(!condicion);
        btnToggleAdmin.setEnabled(condicion);
    }
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        boolean encontrado = false;
        if (!"".equals(txtClienteNumBuscar.getText()))
        {
            for (int i = 0; i < mascotasLista.size(); i++)
            {
                if ((mascotasLista.get(i).getNumero()).equals(txtClienteNumBuscar.getText()))
                {
                    indiceLista = i; 
                    cargarRegistros(indiceLista);  
                    i = mascotasLista.size();
                    encontrado = true;
                }
            }
            if (encontrado == true)
            {
                showMessageDialog(null, "Encontrado con exito");
            }else
            {
                showMessageDialog(null, "No se encontró el cliente especificado");               
            }
        }      
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        GUI.guiMain Main = new GUI.guiMain();
        Main.setTitle("Peluqueria Canina");
        Main.setLocationRelativeTo(null);
        Main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdelanteActionPerformed
        if (mascotasLista.size() - 1 > indiceLista)
        {
            indiceLista++;
            cargarRegistros(indiceLista);     
        }
        else
        {
            indiceLista = 0;
            cargarRegistros(indiceLista);  
        }
    }//GEN-LAST:event_btnAdelanteActionPerformed

    private void observacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_observacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_observacionesActionPerformed

    private void nombre_duenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_duenioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_duenioActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        if (indiceLista > 0)
        {
            indiceLista--;
            cargarRegistros(indiceLista);
        }
        else
        {
            indiceLista = mascotasLista.size() - 1;
            cargarRegistros(indiceLista);  
        }
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        mascotasLista = actualizarLista();
        if (!mascotasLista.isEmpty())
        {
            
            persistControl.eliminarMascota(mascotasLista.get(indiceLista));
            mascotasLista = actualizarLista();
            indiceLista = 0;
            showMessageDialog(null, "Eliminado exitosamente");
            cargarRegistros(indiceLista);  
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (indiceLista >= 0)
        {
            enabledDisabled(false);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

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
                                                persistControl.modificarMascota(persistControl.agregarDatosMascota(numero, nombre, _raza, _color, _alergico, atencionEsp, nombreDuenio, celDuenio, observacion, false));
                                                mascotasLista = actualizarLista();
                                                cargarRegistros(indiceLista);
                                                showMessageDialog(null,"Datos actualizados exitosamente");
                                                enabledDisabled(true);
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

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        cargarRegistros(indiceLista);
        enabledDisabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnToggleAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToggleAdminActionPerformed
        if (root)
        {
            mascotasLista = actualizarLista();
            lbHint.setText("root desactivado");
            
            
        }
        else{
            mascotasLista = persistControl.findMascotas();
            lbHint.setText("root activado");
        }
        btnRestaurar.setVisible(!root);
        btnEliminar.setVisible(!root);
        btnEditar.setEnabled(root);
        btnBorrar.setEnabled(root);
        indiceLista = 0;
        cargarRegistros(indiceLista);
        root = !root;
    }//GEN-LAST:event_btnToggleAdminActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
        if (!mascotasLista.isEmpty())
        {
            persistControl.restaurarMascota(mascotasLista.get(indiceLista));
            cargarRegistros(indiceLista); 
            showMessageDialog(null, "Restaurado exitosamente");
        }
    }//GEN-LAST:event_btnRestaurarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (!mascotasLista.isEmpty()){
            persistControl.eliminarMascotaId(mascotasLista.get(indiceLista).getNumero());
            mascotasLista = persistControl.findMascotas();
            indiceLista = 0;
            cargarRegistros(indiceLista); 
            showMessageDialog(null, "Se eliminó el registro de forma permanente.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> alergico;
    private javax.swing.JComboBox<String> atención_especial;
    private javax.swing.JButton btnAdelante;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JToggleButton btnToggleAdmin;
    private javax.swing.JTextField celular_duenio;
    private javax.swing.JTextField color;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbAlergico;
    private javax.swing.JLabel lbAtencionEsp;
    private javax.swing.JLabel lbCelDuenio;
    private javax.swing.JLabel lbClienteNum;
    private javax.swing.JLabel lbColor;
    private javax.swing.JLabel lbHint;
    private javax.swing.JLabel lbIndexLabel;
    private javax.swing.JLabel lbIndiceInfo;
    private javax.swing.JLabel lbInfo1;
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
    private javax.swing.JTextField txtClienteNumBuscar;
    // End of variables declaration//GEN-END:variables
}
