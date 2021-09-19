/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Dao.veterinariaDao;
import Model.mascota;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author JuanManuel
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    veterinariaDao vet=null;
    ArrayList<mascota> mascotas = null;
    public View() {
        vet = new veterinariaDao();
        initComponents();
        ImageIcon icon = new ImageIcon(this.getClass().getResource("logo.png"));
        this.setIconImage(icon.getImage());
        this.setTitle("Veterinaria Pooopis");
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize  = getSize();
        this.setLocation((screenSize.width  - frameSize.width)  / 2, 
                    (screenSize.height - frameSize.height) / 2);
        mascotas = vet.getMascotas();
        mostrar();
        btnAdd.setFocusable(false);
        btnBuscarMascota1.setFocusable(false);
        btnBuscarTodo1.setFocusable(false);
        btnBuscarUser.setFocusable(false);
        btnUpdate1.setFocusable(false);
        this.getContentPane().setBackground(new java.awt.Color(153,223,224));
    }

                


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnBuscarTodo1 = new javax.swing.JButton();
        lblNombreBuscar = new javax.swing.JLabel();
        txtNombreBuscar1 = new javax.swing.JTextField();
        btnBuscarMascota1 = new javax.swing.JButton();
        txtNombreUpd = new javax.swing.JTextField();
        lblNombreUpd = new javax.swing.JLabel();
        lblIdUpd = new javax.swing.JLabel();
        txtUsuarioUpd = new javax.swing.JTextField();
        lblUsuarioUpd = new javax.swing.JLabel();
        txtIdUpd = new javax.swing.JTextField();
        btnUpdate1 = new javax.swing.JButton();
        lblUsuarioBuscar = new javax.swing.JLabel();
        txtUsuarioBuscar = new javax.swing.JTextField();
        btnBuscarUser = new javax.swing.JButton();
        lblNombreAdd = new javax.swing.JLabel();
        txtNombreAdd = new javax.swing.JTextField();
        lblUsuarioAdd = new javax.swing.JLabel();
        txtUsuarioAdd = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        txtIdDel = new javax.swing.JTextField();
        lblIdDel = new javax.swing.JLabel();
        btnDel1 = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 109, 104));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID mascota", "Nombre mascota", "Usuario", "Nombre", "Apellido", "Teléfono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setRowHeight(25);
        jScrollPane1.setViewportView(tabla);

        jScrollPane3.setViewportView(jScrollPane1);

        jPanel1.setBackground(new java.awt.Color(232, 233, 241));

        btnBuscarTodo1.setText("Buscar todas las mascotas");
        btnBuscarTodo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTodo1ActionPerformed(evt);
            }
        });

        lblNombreBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreBuscar.setText("Nombre mascota");

        txtNombreBuscar1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreBuscar1ActionPerformed(evt);
            }
        });

        btnBuscarMascota1.setText("Buscar");
        btnBuscarMascota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMascota1ActionPerformed(evt);
            }
        });

        txtNombreUpd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreUpd.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtNombreUpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUpdActionPerformed(evt);
            }
        });

        lblNombreUpd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreUpd.setText("Nombre mascota");

        lblIdUpd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIdUpd.setText("ID mascota");

        txtUsuarioUpd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuarioUpd.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtUsuarioUpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioUpdActionPerformed(evt);
            }
        });

        lblUsuarioUpd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuarioUpd.setText("Usuario");

        txtIdUpd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdUpd.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtIdUpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdUpdActionPerformed(evt);
            }
        });

        btnUpdate1.setText("Actualizar mascota");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        lblUsuarioBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuarioBuscar.setText("Usuario");

        txtUsuarioBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuarioBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioBuscarActionPerformed(evt);
            }
        });

        btnBuscarUser.setText("Buscar por usuario");
        btnBuscarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUserActionPerformed(evt);
            }
        });

        lblNombreAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreAdd.setText("Nombre mascota");

        txtNombreAdd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreAdd.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtNombreAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreAddActionPerformed(evt);
            }
        });

        lblUsuarioAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuarioAdd.setText("Usuario");

        txtUsuarioAdd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuarioAdd.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtUsuarioAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioAddActionPerformed(evt);
            }
        });

        btnAdd.setText("Agregar mascota");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtIdDel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdDel.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtIdDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdDelActionPerformed(evt);
            }
        });

        lblIdDel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIdDel.setText("ID mascota");

        btnDel1.setText("Eliminar mascota");
        btnDel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDel1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBuscarTodo1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNombreBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarMascota1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNombreBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(198, 198, 198)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsuarioBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUsuarioBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreUpd, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombreUpd, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdUpd)
                            .addComponent(txtIdUpd, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombreAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsuarioAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtUsuarioAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtIdDel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDel1))
                                    .addComponent(lblIdDel)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsuarioUpd, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(txtUsuarioUpd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnBuscarTodo1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreBuscar)
                            .addComponent(lblUsuarioBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarMascota1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuarioBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreUpd)
                            .addComponent(lblIdUpd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreUpd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdUpd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuarioUpd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblUsuarioUpd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNombreAdd)
                        .addGap(7, 7, 7)
                        .addComponent(txtNombreAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblUsuarioAdd)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsuarioAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblIdDel)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdDel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        lblTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 16));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Búsqueda de mascotas");
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lblTitulo)
                            .addGap(207, 207, 207)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdDelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdDelActionPerformed

    private void txtNombreBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreBuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreBuscar1ActionPerformed

    private void txtNombreUpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUpdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUpdActionPerformed

    private void txtUsuarioUpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioUpdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioUpdActionPerformed

    private void txtIdUpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdUpdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdUpdActionPerformed

    private void txtNombreAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreAddActionPerformed

    private void txtUsuarioAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioAddActionPerformed

    private void btnBuscarTodo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTodo1ActionPerformed
        // TODO add your handling code here:
        mascotas = vet.getMascotas();
        mostrar();
    }//GEN-LAST:event_btnBuscarTodo1ActionPerformed

    private void btnBuscarMascota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMascota1ActionPerformed
        // TODO add your handling code here:
        String NombreBuscar = txtNombreBuscar1.getText();
        mascota m = vet.getMascota(NombreBuscar);
        mascotas = new ArrayList<>();
        mascotas.add(m);
        mostrar();
        txtNombreBuscar1.setText("");
    }//GEN-LAST:event_btnBuscarMascota1ActionPerformed

    private void btnBuscarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUserActionPerformed
        // TODO add your handling code here:
        String user = txtUsuarioBuscar.getText();
        mascotas = vet.getMascotasByUser(user);
        mostrar();
        txtUsuarioBuscar.setText("");
    }//GEN-LAST:event_btnBuscarUserActionPerformed

    private void txtUsuarioBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioBuscarActionPerformed

    private void btnDel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDel1ActionPerformed
        // TODO add your handling code here:
        int IdDel = Integer.parseInt(txtIdDel.getText());
        vet.deleteMascota(IdDel);
        mascotas = vet.getMascotas();
        mostrar();
        txtIdDel.setText("");
        
    }//GEN-LAST:event_btnDel1ActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        // TODO add your handling code here:
        String idUpd = txtIdUpd.getText();
        String nombreUpd = txtNombreUpd.getText();
        String userUpd = txtUsuarioUpd.getText();
        mascota m = new mascota(Integer.parseInt(idUpd), nombreUpd, userUpd);
        vet.updateMascota(m);
        mascotas = vet.getMascotas();
        mostrar();
        txtIdUpd.setText("");
        txtNombreUpd.setText("");
        txtUsuarioUpd.setText("");
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String nombreAdd = txtNombreAdd.getText();
        String usuarioAdd = txtUsuarioAdd.getText();
        mascota m = new mascota(nombreAdd, usuarioAdd);
        vet.addMascota(m);
        mascotas = vet.getMascotas();
        mostrar();
        txtNombreAdd.setText("");
        txtUsuarioAdd.setText("");
        
    }//GEN-LAST:event_btnAddActionPerformed

    public void mostrar(){
        String [][] matriz = new String[mascotas.size()][6];
        for (int i = 0; i < mascotas.size(); i++){
            matriz[i][0] = mascotas.get(i).getMascotaId() + "";
            matriz[i][1] = mascotas.get(i).getMascotaNombre();
            matriz[i][2] = mascotas.get(i).getPropUsuario();
            matriz[i][3] = mascotas.get(i).getPropNombre();
            matriz[i][4] = mascotas.get(i).getPropApellido();
            matriz[i][5] = mascotas.get(i).getPropTelefono();
        }
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "ID mascota", "Nombre mascota", "Usuario", "Nombre", "Apellido", "Teléfono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
    }
    
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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBuscarMascota1;
    private javax.swing.JButton btnBuscarTodo1;
    private javax.swing.JButton btnBuscarUser;
    private javax.swing.JButton btnDel1;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblIdDel;
    private javax.swing.JLabel lblIdUpd;
    private javax.swing.JLabel lblNombreAdd;
    private javax.swing.JLabel lblNombreBuscar;
    private javax.swing.JLabel lblNombreUpd;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuarioAdd;
    private javax.swing.JLabel lblUsuarioBuscar;
    private javax.swing.JLabel lblUsuarioUpd;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtIdDel;
    private javax.swing.JTextField txtIdUpd;
    private javax.swing.JTextField txtNombreAdd;
    private javax.swing.JTextField txtNombreBuscar1;
    private javax.swing.JTextField txtNombreUpd;
    private javax.swing.JTextField txtUsuarioAdd;
    private javax.swing.JTextField txtUsuarioBuscar;
    private javax.swing.JTextField txtUsuarioUpd;
    // End of variables declaration//GEN-END:variables
}
