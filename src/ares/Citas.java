
package ares;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.applet.AudioClip;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import javax.swing.table.DefaultTableModel;
import javax.swing.Timer;

/**
 *
 * @author herna
 */
public class Citas extends javax.swing.JFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    private String usuarioActual;
    private String rolU;
    private Timer timerReloj;

    public Citas(String usuario, String rol) {
        this.usuarioActual = usuario;
        this.rolU = rol;
        
        initComponents();
        
        iniciarReloj();
        
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoAres.jpg")).getImage());
        this.setExtendedState(this.MAXIMIZED_BOTH);
        
        setImageLabel(lblImagen, "/Imagenes/Ares letras.jpg");
        
        cargarCitas();
    }
    
    AudioClip sonido;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        lblMaesto = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAsunto = new javax.swing.JTextArea();
        btnEditar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtCitas = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        lblFechaHora = new javax.swing.JLabel();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(71, 153, 252));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMenu.setBackground(new java.awt.Color(71, 153, 252));
        lblMenu.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblMenu.setText("           Menú");
        lblMenu.setOpaque(true);
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMenuMouseExited(evt);
            }
        });
        jPanel4.add(lblMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 101));

        lblMaesto.setBackground(new java.awt.Color(71, 153, 252));
        lblMaesto.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblMaesto.setForeground(new java.awt.Color(255, 255, 255));
        lblMaesto.setText("         Maestros");
        lblMaesto.setOpaque(true);
        lblMaesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaestoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMaestoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMaestoMouseExited(evt);
            }
        });
        jPanel4.add(lblMaesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 180, 100));
        jPanel4.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 0, 840, 100));

        lblMinimizar.setBackground(new java.awt.Color(71, 153, 252));
        lblMinimizar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        lblMinimizar.setText("             __");
        lblMinimizar.setOpaque(true);
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseExited(evt);
            }
        });
        jPanel4.add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 0, 180, 100));

        lblSalir.setBackground(new java.awt.Color(71, 153, 252));
        lblSalir.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblSalir.setForeground(new java.awt.Color(255, 255, 255));
        lblSalir.setText("               X");
        lblSalir.setOpaque(true);
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSalirMouseExited(evt);
            }
        });
        jPanel4.add(lblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 0, 180, 100));

        jPanel2.setBackground(new java.awt.Color(196, 36, 4));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nueva cita");

        jdFecha.setBackground(new java.awt.Color(255, 255, 255));
        jdFecha.setForeground(new java.awt.Color(0, 0, 0));
        jdFecha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha cita:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hora cita:");

        txtHora.setBackground(new java.awt.Color(255, 255, 255));
        txtHora.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtHora.setForeground(new java.awt.Color(0, 0, 0));
        txtHora.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Asunto:");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        txtAsunto.setBackground(new java.awt.Color(255, 255, 255));
        txtAsunto.setColumns(20);
        txtAsunto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtAsunto.setForeground(new java.awt.Color(0, 0, 0));
        txtAsunto.setRows(5);
        jScrollPane1.setViewportView(txtAsunto);

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setText("Editar");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarMouseExited(evt);
            }
        });
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setText("Guardar");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseExited(evt);
            }
        });
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("R");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jdFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                    .addComponent(txtHora)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(btnGuardar))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnEliminar)
                                            .addComponent(btnEditar)
                                            .addComponent(btnLimpiar)
                                            .addComponent(jButton1))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addGap(12, 12, 12)
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(196, 36, 4));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtCitas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtCitas.setForeground(new java.awt.Color(0, 0, 0));
        jtCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Fecha", "Hora", "Asunto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCitasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtCitas);
        if (jtCitas.getColumnModel().getColumnCount() > 0) {
            jtCitas.getColumnModel().getColumn(0).setResizable(false);
            jtCitas.getColumnModel().getColumn(1).setResizable(false);
            jtCitas.getColumnModel().getColumn(2).setResizable(false);
            jtCitas.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Citas");

        lblFechaHora.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblFechaHora.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaHora.setText("jLabel9");

        jMonthChooser1.setForeground(new java.awt.Color(0, 0, 0));
        jMonthChooser1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMonthChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jMonthChooser1PropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(378, 378, 378)
                        .addComponent(jLabel5)
                        .addGap(101, 101, 101)
                        .addComponent(lblFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 114, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(lblFechaHora))
                    .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        this.dispose();
        MenuAdmin ma = new MenuAdmin(usuarioActual, rolU);
        ma.setVisible(true);
    }//GEN-LAST:event_lblMenuMouseClicked

    private void lblMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseEntered
        lblMenu.setBackground(Color.white);
        lblMenu.setForeground(Color.black);
    }//GEN-LAST:event_lblMenuMouseEntered

    private void lblMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseExited
        lblMenu.setBackground(new Color(71, 153, 252));
        lblMenu.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblMenuMouseExited

    private void lblMaestoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaestoMouseClicked
        this.dispose();
        Maestros m = new Maestros(usuarioActual, rolU);
        m.setVisible(true);
    }//GEN-LAST:event_lblMaestoMouseClicked

    private void lblMaestoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaestoMouseEntered
        lblMaesto.setBackground(Color.WHITE);
        lblMaesto.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblMaestoMouseEntered

    private void lblMaestoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaestoMouseExited
        lblMaesto.setBackground(new Color(71, 153, 252));
        lblMaesto.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblMaestoMouseExited

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        setState(this.ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseEntered
        lblMinimizar.setBackground(Color.WHITE);
        lblMinimizar.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblMinimizarMouseEntered

    private void lblMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseExited
        lblMinimizar.setBackground(new Color(71, 153, 252));
        lblMinimizar.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblMinimizarMouseExited

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        int a =  JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(this,"           ¿Desea salir?","Salir",a);
        if(resultado == 0){
            copiaSQL();
            System.exit(0);
        }else{}
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseEntered
        lblSalir.setBackground(Color.red);
    }//GEN-LAST:event_lblSalirMouseEntered

    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
        lblSalir.setBackground(new Color(71, 153, 252));
    }//GEN-LAST:event_lblSalirMouseExited

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(jdFecha.getDate() == null || "".equals(txtHora.getText()) || "".equals(txtAsunto.getText()) ){
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error.wav"));
                sonido.play();
            JOptionPane.showMessageDialog(null, "No dejes campos vacíos","CAMPOS VACÍOS",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/advertencia.png", 40, 40));
        }else{
                
                
            try (Connection con = Conexion.CDB(); 
                  PreparedStatement ps = con.prepareStatement("INSERT INTO Citas(fecha,hora,asunto)VALUES(?,?,?)");  
                    PreparedStatement setvars = con.prepareStatement("SET app.usuario_rol  TO '"+this.usuarioActual+"'  ");) {

                 setvars.execute();

                java.util.Date selectedDate = jdFecha.getDate();
                java.sql.Date sqlDate = new java.sql.Date(selectedDate.getTime());

                ps.setDate(1, sqlDate);
                ps.setString(2, txtHora.getText());
                ps.setString(3, txtAsunto.getText());
                ps.execute();
                
                limpiarDatos();
                
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/saved.wav"));
                sonido.play();
                JOptionPane.showMessageDialog(null, "Cita creada correctamente","CITA CREADA",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/comprobado.png", 40, 40));

            cargarCitas();

            } catch (Exception e) {
                System.out.println("Error al crear la cita:");
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        btnGuardar.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        btnGuardar.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(jdFecha.getDate() == null || "".equals(txtHora.getText()) || "".equals(txtAsunto.getText())){
             sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error.wav"));
                sonido.play();
            JOptionPane.showMessageDialog(null, "No dejes campos vaciós","CAMPOS VACÍOS"
                    ,JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/advertencia.png", 40, 40));
        }else{
                
            try (Connection con = Conexion.CDB(); 
                  PreparedStatement ps = con.prepareStatement("UPDATE Citas SET fecha = ?,hora = ?,asunto = ? WHERE idcita = ?");   
                  PreparedStatement setvars = con.prepareStatement("SET app.usuario_rol  TO '"+this.usuarioActual+"'  ")) {
                
                java.util.Date selectDate = jdFecha.getDate();
                java.sql.Date sqlDate = new java.sql.Date(selectDate.getTime());
                
                int fila = jtCitas.getSelectedRow();
                int idcita = (int) jtCitas.getModel().getValueAt(fila, 0);
                
                setvars.execute();
                
                ps.setDate(1, sqlDate);
                ps.setString(2, txtHora.getText());
                ps.setString(3, txtAsunto.getText());
                ps.setInt(4, idcita);
                ps.executeUpdate();
                
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/saved.wav"));
                 sonido.play();
                
                 JOptionPane.showMessageDialog(null, "Datos actualizados correctamente",
                            "DATOS ACTUALIZADOS",JOptionPane.PLAIN_MESSAGE, 
                            icono("/Imagenes/comprobado.png", 40, 40));

                 limpiarDatos();
                 
                 cargarCitas();
            } catch (Exception e) {
                System.out.println("Error al actualizar los datos");
                e.printStackTrace();
            }
       }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        btnEditar.setBackground(Color.BLUE);
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        btnEditar.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        
        int resultado = JOptionPane.showConfirmDialog(null, "¿Desea eliminar la cita?",
                "¿Eliminar cita?",JOptionPane.YES_NO_OPTION);
        
        if(jdFecha.getDate() == null || "".equals(txtHora.getText()) || "".equals(txtAsunto.getText())){
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error.wav"));
                sonido.play();
            JOptionPane.showMessageDialog(null, "Selecciona una cita para eliminar","CAMPOS VACÍOS"
                    ,JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/advertencia.png", 40, 40));
        }else{
            if(resultado == 0){
                try (Connection con = Conexion.CDB(); 
                       PreparedStatement ps = con.prepareStatement("DELETE FROM Citas WHERE idcita = ?"); 
                         PreparedStatement setvars = con.prepareStatement("SET app.usuario_rol  TO '"+this.usuarioActual+"'  ");
                        ) {
                    
                    int fila = jtCitas.getSelectedRow();
                    int idcita = (int) jtCitas.getModel().getValueAt(fila, 0);
                    
                    setvars.execute();

                    ps.setInt(1, idcita);
                    ps.execute();
                    
                    modelo.removeRow(fila);
                    
                    limpiarDatos();
                    
                    sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/saved.wav"));
                    sonido.play();
                    JOptionPane.showMessageDialog(null, "Cita eliminada correctamente",
                            "CITA ELIMINADA",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/comprobado.png", 40, 40));

                } catch (Exception e) {
                    System.out.println("Error al eliminar");
                    e.printStackTrace();
                }
            }else{
                limpiarDatos();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setBackground(Color.RED);
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnEliminarMouseExited

    private void jtCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCitasMouseClicked
        int fila = jtCitas.getSelectedRow();
        if(fila >= 0){
            int idcita = (int) jtCitas.getModel().getValueAt(fila, 0);
            cargarDates(idcita);
        }
    }//GEN-LAST:event_jtCitasMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarDatos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        btnLimpiar.setBackground(new Color(71,153,252));
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        btnLimpiar.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void jMonthChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jMonthChooser1PropertyChange
        filtroMes();
    }//GEN-LAST:event_jMonthChooser1PropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      cargarCitas();
    }//GEN-LAST:event_jButton1ActionPerformed

     private void iniciarReloj(){
        timerReloj = new Timer(1000, (e) -> {
            DateFormat hora = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
            String hora2 = hora.format(new java.util.Date()).toString();
                    lblFechaHora.setText(hora2);
        });
        timerReloj.start();
    }
    
    public void limpiarDatos(){
        jdFecha.setDate(null);
        txtHora.setText("");
        txtAsunto.setText("");
    }
    
    private void cargarCitas(){
        try (Connection con = Conexion.CDB(); 
               PreparedStatement ps = con.prepareStatement("SELECT * FROM Citas ORDER BY idcita DESC");  
                ResultSet rs =  ps.executeQuery();) {
            
            modelo.setRowCount(0);
            modelo.setColumnIdentifiers(new String[]{"Id","Fecha","Hora","Asunto"});

            while(rs.next()){
                modelo.addRow(new Object[]{
                    rs.getInt("idcita"),
                    rs.getDate("fecha"),
                    rs.getString("hora"),
                    rs.getString("asunto")
                });
            }
            
            jtCitas.setModel(modelo);
            jtCitas.removeColumn(jtCitas.getColumnModel().getColumn(0));

        } catch (Exception e) {
            System.out.println("Error al cargar los datos");
            e.printStackTrace();
        }
    }
    
    private void cargarDates(int idcita){
        try (Connection con = Conexion.CDB(); 
              PreparedStatement ps = con.prepareStatement("SELECT * FROM Citas WHERE idcita = ?");  ){
            
            ps.setInt(1, idcita);
            
            try(ResultSet rs = ps.executeQuery();){
                    if(rs.next()){
                        Date fecha = rs.getDate(2);
                        String hora = rs.getString(3);
                        String asunto = rs.getString(4);

                        txtHora.setText(hora != null ? hora : "");
                        txtAsunto.setText(asunto != null ? asunto :"");

                        if(fecha != null){
                            jdFecha.setDate(fecha);
                        }
                    }
            }    

        } catch (Exception e) {
            System.out.println("Error al cargar la cita");
            e.printStackTrace();
        }
    }
    
     private String encontrarPgDump() {
            String[] searchPaths = {
                "C:\\Program Files\\PostgreSQL\\16\\bin\\pg_dump.exe",
                "C:\\Program Files\\PostgreSQL\\15\\bin\\pg_dump.exe",
                "C:\\Program Files\\PostgreSQL\\14\\bin\\pg_dump.exe", 
                "C:\\Program Files\\PostgreSQL\\13\\bin\\pg_dump.exe",
                "C:\\Program Files\\PostgreSQL\\12\\bin\\pg_dump.exe",
                "C:\\Program Files\\PostgreSQL\\11\\bin\\pg_dump.exe",
                "C:\\Program Files\\PostgreSQL\\10\\bin\\pg_dump.exe"
            };

            for (String path : searchPaths) {
                if (new File(path).exists()) {
                    return path;
                }
            }

            try {
                Process process = Runtime.getRuntime().exec("where pg_dump");
                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                String path = reader.readLine();
                if (path != null && new File(path).exists()) {
                    return path;
                }
            } catch (Exception e) {
                // Ignorar error, continuar con otros métodos
            }

        return null;
    }
    
    private void copiaSQL(){
        try{
            String pgDumpPath = encontrarPgDump();

            if (pgDumpPath == null) {
                JOptionPane.showMessageDialog(null, 
                    "No se pudo encontrar pg_dump.\n\n" +
                    "Solución:\n" +
                    "1. Verifica que PostgreSQL esté instalado\n" +
                    "2. Agrega la ruta de PostgreSQL al PATH del sistema\n" +
                    "3. O especifica la ruta manualmente en el código",
                    "Error - pg_dump no encontrado", 
                    JOptionPane.ERROR_MESSAGE);
                return;
            }

            String backupDir = "backups";
            new File(backupDir).mkdirs(); 

             String timestamp = new java.text.SimpleDateFormat("yyyyMMdd_HHmmss").format(new java.util.Date());
            String backupFile = backupDir + File.separator + "ARES_backup_" + timestamp + ".sql";

            String[] cmd = {
                pgDumpPath,
                "-h", "localhost",
                "-U", "postgres", 
                "-d", "ares",
                "-f", backupFile,
                "-w"
            };

            System.out.println("Ejecutando backup con: " + String.join(" ", cmd));

            ProcessBuilder pb = new ProcessBuilder(cmd);
            pb.environment().put("PGPASSWORD", "12345");
            pb.redirectErrorStream(true);

            Process prc = pb.start();

            Thread outputReader = new Thread(() -> {
                try (BufferedReader reader = new BufferedReader(
                     new InputStreamReader(prc.getInputStream()))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println("PG_DUMP: " + line);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            outputReader.start();

            boolean completed = prc.waitFor(30, TimeUnit.SECONDS);
            outputReader.join(5000); 

            if (completed && prc.exitValue() == 0) {
                JOptionPane.showMessageDialog(null, 
                    "Copia de seguridad exitosa:\n" + backupFile,
                    "Backup Completado", 
                    JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/comprobado.png", 40, 40));
            } else {
                throw new Exception("Backup falló o timeout. Código: " + 
                    (completed ? prc.exitValue() : "TIMEOUT"));
            }
        
    } catch(Exception e){
        JOptionPane.showMessageDialog(null, 
            "Error en copia de seguridad:\n" + e.getMessage(),
            "Error", 
            JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
}
    
    private void filtroMes(){
        try (Connection con = Conexion.CDB();
                PreparedStatement ps = con.prepareStatement("SELECT * FROM citas WHERE EXTRACT(MONTH FROM fecha) = ?  ORDER BY fecha ASC");){
            
            modelo.setRowCount(0);
            modelo.setColumnIdentifiers(new String[]{"Id","Fecha","Hora","Asunto"});
            
            int mesSelect = jMonthChooser1.getMonth() + 1;
            ps.setInt(1, mesSelect);

            try(ResultSet rs = ps.executeQuery()){
                    while(rs.next()){
                        modelo.addRow(new Object[]{
                            rs.getInt("idcita"),
                            rs.getDate("fecha"),
                            rs.getString("hora"),
                            rs.getString("asunto")
                        });
                    }
            }  
            
            jtCitas.setModel(modelo);
            jtCitas.removeColumn(jtCitas.getColumnModel().getColumn(0));
            
        } catch (Exception e) {
            System.out.println("Error filtro mes");
            e.printStackTrace();
        }
    }    
    private void setImageLabel(JLabel labelname, String ruta) {
        try {
            java.net.URL imageURL = getClass().getResource(ruta);
            if (imageURL != null) {
                ImageIcon image = new ImageIcon(imageURL);
                Icon icon = new ImageIcon(
                    image.getImage().getScaledInstance(labelname.getWidth(), labelname.getHeight(), Image.SCALE_DEFAULT)
                );
                labelname.setIcon(icon);
            } else {
                System.err.println("No se pudo encontrar la imagen: " + ruta);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Icon icono(String ruta, int width, int heigth){
        Icon img = new ImageIcon (new ImageIcon(getClass().getResource(ruta)).getImage()  
                        .getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return img;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JTable jtCitas;
    private javax.swing.JLabel lblFechaHora;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblMaesto;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JTextArea txtAsunto;
    private javax.swing.JTextField txtHora;
    // End of variables declaration//GEN-END:variables
}