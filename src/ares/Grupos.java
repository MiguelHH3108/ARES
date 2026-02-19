
package ares;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.applet.AudioClip;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.Timer;

/**
 *
 * @author herna
 */
public class Grupos extends javax.swing.JFrame {
            DefaultTableModel modelo = new DefaultTableModel();
            private String usuarioActual;
            private String rolU;
            private Timer timerReloj;
    
    public Grupos(String usuario, String rol) {
        this.usuarioActual = usuario;
        this.rolU = rol;
        
        initComponents();
        configPermisos();
        
        iniciarReloj();
        
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoAres.jpg")).getImage());
        this.setExtendedState(this.MAXIMIZED_BOTH);
        
        setImageLabel(lblImagen, "/Imagenes/Ares letras.jpg");
        
        cargarDatos();
    }
    
    FileInputStream fis;
    int longitudBytes;
    AudioClip sonido;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        lblAGrupos = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreg = new javax.swing.JTextField();
        txtHorario = new javax.swing.JTextField();
        txtDias = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblFoto = new javax.swing.JLabel();
        btnFoto = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCgrupos = new javax.swing.JTable();
        lblReloj = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();

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

        lblAGrupos.setBackground(new java.awt.Color(71, 153, 252));
        lblAGrupos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblAGrupos.setForeground(new java.awt.Color(255, 255, 255));
        lblAGrupos.setText("   Agregar a grupos");
        lblAGrupos.setOpaque(true);
        lblAGrupos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAGruposMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAGruposMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAGruposMouseExited(evt);
            }
        });
        jPanel4.add(lblAGrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 180, 100));
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
        jPanel4.add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 0, 180, 100));

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
        jPanel4.add(lblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 0, 180, 100));

        jPanel2.setBackground(new java.awt.Color(196, 36, 4));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo grupo");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Días:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Horario:");

        txtNombreg.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreg.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNombreg.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombregKeyTyped(evt);
            }
        });

        txtHorario.setBackground(new java.awt.Color(255, 255, 255));
        txtHorario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtHorario.setForeground(new java.awt.Color(0, 0, 0));

        txtDias.setBackground(new java.awt.Color(255, 255, 255));
        txtDias.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtDias.setForeground(new java.awt.Color(0, 0, 0));
        txtDias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiasKeyTyped(evt);
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

        lblFoto.setBackground(new java.awt.Color(255, 255, 255));
        lblFoto.setOpaque(true);

        btnFoto.setBackground(new java.awt.Color(255, 255, 255));
        btnFoto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnFoto.setForeground(new java.awt.Color(0, 0, 0));
        btnFoto.setText("Seleccionar foto");
        btnFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFotoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFotoMouseExited(evt);
            }
        });
        btnFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoActionPerformed(evt);
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
        btnLimpiar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLimpiarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(txtNombreg, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFoto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar)
                            .addComponent(btnGuardar)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLimpiar)
                                    .addComponent(btnEditar))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(196, 36, 4));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Grupos:");

        jtCgrupos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtCgrupos.setForeground(new java.awt.Color(0, 0, 0));
        jtCgrupos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Días", "Horario", "Foto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtCgrupos.setOpaque(false);
        jtCgrupos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCgruposMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtCgrupos);
        if (jtCgrupos.getColumnModel().getColumnCount() > 0) {
            jtCgrupos.getColumnModel().getColumn(0).setResizable(false);
            jtCgrupos.getColumnModel().getColumn(1).setResizable(false);
            jtCgrupos.getColumnModel().getColumn(2).setResizable(false);
            jtCgrupos.getColumnModel().getColumn(3).setResizable(false);
            jtCgrupos.getColumnModel().getColumn(4).setResizable(false);
        }

        lblReloj.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblReloj.setForeground(new java.awt.Color(255, 255, 255));
        lblReloj.setText("jLabel6");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Buscar grupo:");

        txtBuscar.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(0, 0, 0));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(93, 93, 93)
                .addComponent(lblReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblReloj)
                        .addComponent(jLabel15)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 110, Short.MAX_VALUE))
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

    private void lblAGruposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAGruposMouseClicked
        this.dispose();
        AlumnoGrupos ag = new AlumnoGrupos(usuarioActual, rolU);
        ag.setVisible(true);
    }//GEN-LAST:event_lblAGruposMouseClicked

    private void lblAGruposMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAGruposMouseEntered
        lblAGrupos.setBackground(Color.WHITE);
        lblAGrupos.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblAGruposMouseEntered

    private void lblAGruposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAGruposMouseExited
        lblAGrupos.setBackground(new Color(71, 153, 252));
        lblAGrupos.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblAGruposMouseExited

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
        if(resultado==0){
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
         if("".equals(txtNombreg.getText()) || "".equals(txtDias.getText()) || "".equals(txtHorario.getText()) || lblFoto.getIcon() == null ){
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error.wav"));
             sonido.play();
            JOptionPane.showMessageDialog(null, "No dejes campos vacíos","CAMPOS VACÍOS",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/advertencia.png", 40, 40));
        }else{
            
            try (Connection con = Conexion.CDB();
                   PreparedStatement psv = con.prepareStatement("SELECT COUNT(*) FROM Cgrupos WHERE nombreg = ? AND dias = ? AND horario = ?"); 
                   PreparedStatement setvars = con.prepareStatement("SET app.usuario_rol  TO '"+this.usuarioActual+"'  ");
                    PreparedStatement ps = con.prepareStatement("INSERT INTO cgrupos(nombreg,dias,horario,fotogrupo)VALUES(?,?,?,?)") ) {
                
                psv.setString(1, txtNombreg.getText());
                psv.setString(2, txtDias.getText());
                psv.setString(3, txtHorario.getText());
                
                try(ResultSet rs = psv.executeQuery(); ){
                        if(rs.next() && rs.getInt(1) > 0){
                         sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error.wav"));
                             sonido.play();
                             JOptionPane.showMessageDialog(null, "Estos datos ya existen",
                                     "DATOS DUPLICADOS", JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/advertencia.png", 40, 40)); 
                        }else{   

                                setvars.execute();

                                ps.setString(1, txtNombreg.getText());
                                ps.setString(2, txtDias.getText());
                                ps.setString(3, txtHorario.getText());
                                ps.setBinaryStream(4, fis, longitudBytes);
                                ps.execute();

                                 sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/saved.wav"));
                                sonido.play();

                                JOptionPane.showMessageDialog(null, "Grupo creado correctamente",
                                        "GRUPO CREADO",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/comprobado.png", 40, 40));

                                limpiarDatos();

                                cargarDatos();
                        }      
                }  
            } catch (Exception e) {
                System.out.println("Error grupo:" + e);
                //e.printStackTrace();
                 sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error.wav"));
             sonido.play();
            JOptionPane.showMessageDialog(null, "Estos datos ya existen","DATOS YA EXISTENTES",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/advertencia.png", 40, 40));
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
       FileInputStream fis = null;
        int longitudBytes = 0;
        
        if("".equals(txtNombreg.getText()) || "".equals(txtDias.getText()) 
                || "".equals(txtHorario.getText()) || lblFoto.getIcon() == null){
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error.wav"));
             sonido.play();
                JOptionPane.showMessageDialog(null, "No dejes campos vacíos",
                        "CAMPOS VACIOS",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/advertencia.png", 40, 40));
        }else{
            try (Connection con = Conexion.CDB(); 
                   PreparedStatement ps = con.prepareStatement("UPDATE cgrupos SET Nombreg = ?,dias = ?,horario = ?,fotogrupo = ? WHERE idcg = ?");
                    PreparedStatement ps2 = con.prepareStatement( "UPDATE cgrupos SET Nombreg = ?,dias = ?,horario = ? WHERE idcg = ?");
                   PreparedStatement setvars = con.prepareStatement("SET app.usuario_rol  TO '"+this.usuarioActual+"'  "); ) {
                
                int fila = jtCgrupos.getSelectedRow();
                int idg = (int) jtCgrupos.getModel().getValueAt(fila, 0);
                
                    if(fis != null){
                        
                        setvars.execute();

                        ps.setString(1, txtNombreg.getText());
                        ps.setString(2, txtDias.getText());
                        ps.setString(3, txtHorario.getText());
                        ps.setBinaryStream(4, fis, longitudBytes);
                        ps.setInt(5, idg);
                        ps.executeUpdate();

                        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/saved.wav"));
                        sonido.play();

                        JOptionPane.showMessageDialog(null, "Datos actualizados correctamente",
                                "DATOS ACTUALIZADOS",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/comprobado.png", 40, 40));
                    }else{
                        setvars.execute();

                        ps2.setString(1, txtNombreg.getText());
                        ps2.setString(2, txtDias.getText());
                        ps2.setString(3, txtHorario.getText());
                        ps2.setInt(4, idg);
                        ps2.executeUpdate();

                        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/saved.wav"));
                        sonido.play();

                        JOptionPane.showMessageDialog(null, "Datos actualizados correctamente",
                                "DATOS ACTUALIZADOS",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/comprobado.png", 40, 40));
                    }
                
                 limpiarDatos();
                
                  cargarDatos();
            } catch (Exception e) {
                System.out.println("Error al actualizar:" + e);
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
        int resultado = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el grupo",
                "¿Eliminar grupo?",JOptionPane.YES_NO_OPTION);
        
        if("".equals(txtNombreg.getText()) || "".equals(txtDias.getText()) || "".equals(txtHorario.getText()) ){
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error.wav"));
             sonido.play();
                JOptionPane.showMessageDialog(null, "Selecciona un grupo para eliminar",
                        "CAMPOS VACIOS",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/advertencia.png", 40, 40));
        }else{
            if(resultado == 0){
                try (Connection con = Conexion.CDB();
                        PreparedStatement ps = con.prepareStatement("DELETE FROM Cgrupos WHERE Idcg = ?");
                        PreparedStatement setvars = con.prepareStatement("SET app.usuario_rol  TO '"+this.usuarioActual+"'  ");) {
                    
                    int fila = jtCgrupos.getSelectedRow();
                    int id = (int) jtCgrupos.getModel().getValueAt(fila, 0);
                    
                    setvars.execute();

                    ps.setInt(1, id);
                    ps.execute();

                    modelo.removeRow(fila);
                    
                    sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/saved.wav"));
                    sonido.play();
                    
                    JOptionPane.showMessageDialog(null, "Grupo eliminado correctamente",
                            "GRUPO ELIMINADO",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/comprobado.png", 40, 40));
                    
                    limpiarDatos();
                    
                } catch (Exception e) {
                    System.out.println("Error al eliminar:" +e);
                    e.printStackTrace();
                }
            }else{
                    limpiarDatos();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setBackground(Color.red);
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnEliminarMouseExited

    private void jtCgruposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCgruposMouseClicked
        int fila = jtCgrupos.getSelectedRow();

        if(fila >= 0){
            int id = (int) jtCgrupos.getModel().getValueAt(fila, 0);
            cargarDatos(id);
        }
    }//GEN-LAST:event_jtCgruposMouseClicked

    private void btnFotoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFotoMouseEntered
        btnFoto.setBackground(Color.YELLOW);
    }//GEN-LAST:event_btnFotoMouseEntered

    private void btnFotoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFotoMouseExited
        btnFoto.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnFotoMouseExited

    private void btnFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoActionPerformed
        lblFoto.setIcon(null);
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int estado = j.showOpenDialog(null);

        if(estado == JFileChooser.APPROVE_OPTION){
            try {
                fis = new FileInputStream(j.getSelectedFile());
                this.longitudBytes = (int) j.getSelectedFile().length();
                System.out.println("" + j.getSelectedFile().length());

                try {
                    Image icono = ImageIO.read(j.getSelectedFile())
                    .getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_DEFAULT);

                    lblFoto.setIcon(new ImageIcon(icono));
                    lblFoto.updateUI();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "imagen " + e);
                }catch(NullPointerException ex){
                    sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error.wav"));
                    sonido.play();
                    JOptionPane.showMessageDialog(null, "Utiliza solo fotos JPG o PNG",
                        "ERROR",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/error.png", 40, 40));
                }

            } catch (FileNotFoundException e) {
                System.out.println("Erro de archivo:" + e);
            }
        }
    }//GEN-LAST:event_btnFotoActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        buscarDatos(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarDatos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnLimpiarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLimpiarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarKeyPressed

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        btnLimpiar.setBackground(new Color(71,153,252));
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
       btnLimpiar.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void txtNombregKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombregKeyTyped
         if(!(Character.isLetter(evt.getKeyChar())) && !(evt.getKeyChar() == KeyEvent.VK_SPACE) ){
            evt.consume();
        }
         
         JTextField txtname = (JTextField)evt.getComponent();
         String texto = txtname.getText();
         
          if(texto.length() > 0){
            texto = texto.toLowerCase();
            StringBuilder resultado = new StringBuilder();
            boolean capitalizar = true;
            
            for(char c : texto.toCharArray()){
                if(Character.isWhitespace(c)){
                    resultado.append(c);
                    capitalizar = true;
                }else{
                    if(capitalizar){
                        resultado.append(Character.toUpperCase(c));
                        capitalizar = false;
                    }else{
                        resultado.append(c);
                    }
                }
            }
            txtname.setText(resultado.toString());
        }
    }//GEN-LAST:event_txtNombregKeyTyped

    private void txtDiasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiasKeyTyped
        if(!(Character.isLetter(evt.getKeyChar())) && !(evt.getKeyChar() == KeyEvent.VK_SPACE) ){
            evt.consume();
        }
    }//GEN-LAST:event_txtDiasKeyTyped

    private void iniciarReloj(){
        timerReloj = new Timer(1000, (e) -> {
            DateFormat hora = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
            String hora2 = hora.format(new java.util.Date()).toString();
                    lblReloj.setText(hora2);
        });
        timerReloj.start();
    }
    
     public void dispose(){
         if(timerReloj != null && timerReloj.isRunning()){
             timerReloj.stop();
         }
         super.dispose();
     }
    
    private void configPermisos(){
        switch(rolU){
            case "Administrador":
                
                break;
                
                case "Usuario1":
                    
                break;
                
                case "Usuario2":
                   btnGuardar.setVisible(false);
                    btnGuardar.setEnabled(false);
                    
                    btnEditar.setVisible(false);
                    btnEditar.setEnabled(false);
                    
                    btnEliminar.setVisible(false);
                    btnEliminar.setEnabled(false);
                break;
        }
    }
    
    public void limpiarDatos(){
        txtNombreg.setText("");
         txtDias.setText("");
         txtHorario.setText("");
         lblFoto.setIcon(null);
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
    
    private void cargarDatos(){
        try (Connection con = Conexion.CDB(); 
               PreparedStatement ps = con.prepareStatement("SELECT * FROM CGRUPOS ORDER BY idcg DESC");  
                ResultSet rs = ps.executeQuery()) {
            final int label_w = 160;
            final int label_h = 166;
            
            modelo = new DefaultTableModel(){
                
                @Override
                public Class<?> getColumnClass(int columIndex){
                    if(columIndex == 4) return ImageIcon.class;
                    return String.class;
                }
                
                @Override
                public boolean isCellEditable(int row, int column){
                    return false;
                }
            };
            
            modelo.setColumnIdentifiers(new String[] {"Id","Nombre","Días","Horario","Foto"});
            
            while(rs.next()){
                byte[] imageData = rs.getBytes("fotogrupo");
                ImageIcon foto = null;
                
                if(imageData != null && imageData.length > 0){
                    Image originalImage = new ImageIcon(imageData).getImage();
                    Image scaleImage = originalImage.getScaledInstance(label_w, label_h, Image.SCALE_SMOOTH);
                    foto = new ImageIcon(scaleImage);
                }
                
                modelo.addRow(new Object[]{
                    rs.getInt("idcg"),
                    rs.getString("nombreg"),
                    rs.getString("dias"),
                    rs.getString("horario"),
                    foto,
                });
            }
            
            jtCgrupos.setModel(modelo);
            jtCgrupos.removeColumn(jtCgrupos.getColumnModel().getColumn(0));
            
            jtCgrupos.setDefaultRenderer(ImageIcon.class, new DefaultTableCellRenderer(){
                    
                 @Override
                 protected void setValue(Object value) {
                    setIcon((value instanceof ImageIcon) ? (ImageIcon) value : null);
                    setText("");
                    setHorizontalAlignment(JLabel.CENTER);
                    setVerticalAlignment(JLabel.CENTER);
                }
            });
            
            jtCgrupos.getColumnModel().getColumn(3).setPreferredWidth(label_w + 10);
            jtCgrupos.getColumnModel().getColumn(3).setMaxWidth(label_w + 20);
            jtCgrupos.setRowHeight(label_h + 10);

        } catch (Exception e) {
            System.out.println("Error al cargar los datos:" + e);
            e.printStackTrace();
        }
    }
    
    private void cargarDatos(int idcg){
           try (Connection con = Conexion.CDB(); 
               PreparedStatement ps = con.prepareStatement("SELECT * FROM Cgrupos WHERE Idcg = ?");  ) {

            ps.setInt(1, idcg);
            
            try(ResultSet rs = ps.executeQuery()){
            
                    if(rs.next()){
                        String nombre = rs.getString(2);
                        String dias  = rs.getString(3);
                        String hora = rs.getString(4);
                        InputStream is = rs.getBinaryStream(5);

                        if(is != null){
                            BufferedImage bi = ImageIO.read(is);
                            ImageIcon foto = new ImageIcon(bi);
                            Image img = foto.getImage();
                            Image newimg = img.getScaledInstance(160, 166, Image.SCALE_SMOOTH);
                            ImageIcon newIcon = new ImageIcon(newimg);
                            lblFoto.setIcon(newIcon);
                        }

                        txtNombreg.setText(nombre != null ? nombre : "");
                        txtDias.setText(dias != null ? dias : "");
                        txtHorario.setText(hora != null ? hora : "");

                    }
            }     
            
        } catch (Exception e) {
            System.out.println("Error al cargar los datos:" + e);
            e.printStackTrace();
        }
    }
    
    private void buscarDatos(String valor){
         try (Connection con = Conexion.CDB();
                PreparedStatement ps = con.prepareStatement("SELECT * FROM CGRUPOS WHERE nombreg LIKE '%"+valor+"%' OR dias LIKE '%"+valor+"%' OR horario LIKE '%"+valor+"%' ORDER BY idcg DESC");
                 ResultSet rs = ps.executeQuery(); ){
                  
            final int label_w = 160;
            final int label_h = 166;
            
            modelo = new DefaultTableModel(){
                
                @Override
                public Class<?> getColumnClass(int columIndex){
                    if(columIndex == 4) return ImageIcon.class;
                    return String.class;
                }
                
                @Override
                public boolean isCellEditable(int row, int column){
                    return false;
                }
            };
            
            modelo.setColumnIdentifiers(new String[] {"Id","Nombre","Días","Horario","Foto"});
            
            while(rs.next()){
                byte[] imageData = rs.getBytes("fotogrupo");
                ImageIcon foto = null;
                
                if(imageData != null && imageData.length > 0){
                    Image originalImage = new ImageIcon(imageData).getImage();
                    Image scaleImage = originalImage.getScaledInstance(label_w, label_h, Image.SCALE_SMOOTH);
                    foto = new ImageIcon(scaleImage);
                }
                
                modelo.addRow(new Object[]{
                    rs.getInt("idcg"),
                    rs.getString("nombreg"),
                    rs.getString("dias"),
                    rs.getString("horario"),
                    foto,
                });
            }
            
            jtCgrupos.setModel(modelo);
            jtCgrupos.removeColumn(jtCgrupos.getColumnModel().getColumn(0));
            
            jtCgrupos.setDefaultRenderer(ImageIcon.class, new DefaultTableCellRenderer(){
                    
                 @Override
                 protected void setValue(Object value) {
                    setIcon((value instanceof ImageIcon) ? (ImageIcon) value : null);
                    setText("");
                    setHorizontalAlignment(JLabel.CENTER);
                    setVerticalAlignment(JLabel.CENTER);
                }
            });
            
            jtCgrupos.getColumnModel().getColumn(3).setPreferredWidth(label_w + 10);
            jtCgrupos.getColumnModel().getColumn(3).setMaxWidth(label_w + 20);
            jtCgrupos.setRowHeight(label_h + 10);
            
        } catch (Exception e) {
            System.out.println("Error al cargar los datos:" + e);
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
    
    public Icon icono(String ruta, int width, int heigth){
        Icon img = new ImageIcon (new ImageIcon(getClass().getResource(ruta)).getImage()  
                        .getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return img;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFoto;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtCgrupos;
    private javax.swing.JLabel lblAGrupos;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDias;
    private javax.swing.JTextField txtHorario;
    private javax.swing.JTextField txtNombreg;
    // End of variables declaration//GEN-END:variables
}