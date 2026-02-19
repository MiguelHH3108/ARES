
package ares;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.applet.AudioClip;
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
public class Maestros extends javax.swing.JFrame {
        DefaultTableModel modelo = new DefaultTableModel();
        private String usuarioActual;
        private String rolU;
        private Timer timerReloj;
    
    public Maestros(String usuario, String rol) {
        this.usuarioActual = usuario;
        this.rolU = rol;
        
        initComponents();
        configPermisos();
        
        iniciarReloj();
        
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoAres.jpg")).getImage());
        this.setExtendedState(this.MAXIMIZED_BOTH);
        
        setImageLabel(lblImagen, "/Imagenes/Ares letras.jpg");
        
        cargarMaestro();
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
        lblCitas = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNameT = new javax.swing.JTextField();
        txtApellidopT = new javax.swing.JTextField();
        txtApellidoMT = new javax.swing.JTextField();
        txtTelefonoT = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        btnFoto = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMaestro = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblFechaHora = new javax.swing.JLabel();
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

        lblCitas.setBackground(new java.awt.Color(71, 153, 252));
        lblCitas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCitas.setForeground(new java.awt.Color(255, 255, 255));
        lblCitas.setText("             Citas");
        lblCitas.setOpaque(true);
        lblCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCitasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCitasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCitasMouseExited(evt);
            }
        });
        jPanel4.add(lblCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 180, 100));
        jPanel4.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 0, 820, 100));

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
        jPanel4.add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 0, 180, 100));

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
        jPanel4.add(lblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 0, 190, 100));

        jPanel3.setBackground(new java.awt.Color(196, 36, 4));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nombre:");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Apellido paterno:");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Apellido materno:");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Telefóno:");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nuevo maestro");

        txtNameT.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNameT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNameT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameTKeyTyped(evt);
            }
        });

        txtApellidopT.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtApellidopT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtApellidopT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidopTKeyTyped(evt);
            }
        });

        txtApellidoMT.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtApellidoMT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtApellidoMT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoMTKeyTyped(evt);
            }
        });

        txtTelefonoT.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtTelefonoT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTelefonoT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoTKeyTyped(evt);
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

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Foto:");

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellidoMT, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                    .addComponent(txtTelefonoT)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNameT)
                                    .addComponent(txtApellidopT))))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFoto)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardar)
                            .addComponent(btnEditar)
                            .addComponent(btnEliminar)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnLimpiar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNameT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtApellidopT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtApellidoMT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTelefonoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(btnFoto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(196, 36, 4));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtMaestro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtMaestro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "IdM", "Nombre", "Apellido P", "Apellido M", "Telefóno", "Foto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jtMaestro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMaestroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtMaestro);
        if (jtMaestro.getColumnModel().getColumnCount() > 0) {
            jtMaestro.getColumnModel().getColumn(0).setResizable(false);
            jtMaestro.getColumnModel().getColumn(1).setResizable(false);
            jtMaestro.getColumnModel().getColumn(2).setResizable(false);
            jtMaestro.getColumnModel().getColumn(3).setResizable(false);
            jtMaestro.getColumnModel().getColumn(4).setResizable(false);
            jtMaestro.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Maestros:");

        lblFechaHora.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblFechaHora.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaHora.setText("jLabel9");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Buscar maestro:");

        txtBuscar.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(0, 0, 0));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1045, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(159, 159, 159)
                .addComponent(lblFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(lblFechaHora)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 105, Short.MAX_VALUE))
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
        lblMenu.setBackground(Color.WHITE);
        lblMenu.setForeground(Color.black);
    }//GEN-LAST:event_lblMenuMouseEntered

    private void lblMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseExited
        lblMenu.setBackground(new Color(71, 153, 252));
        lblMenu.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblMenuMouseExited

    private void lblCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCitasMouseClicked
        this.dispose();
        Citas c = new Citas(usuarioActual, rolU);
        c.setVisible(true);
    }//GEN-LAST:event_lblCitasMouseClicked

    private void lblCitasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCitasMouseEntered
        lblCitas.setBackground(Color.WHITE);
        lblCitas.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblCitasMouseEntered

    private void lblCitasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCitasMouseExited
        lblCitas.setBackground(new Color(71, 153, 252));
        lblCitas.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblCitasMouseExited

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

    private void txtTelefonoTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoTKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;
        
        if(!numero){
            evt.consume();
        }
        
        if(txtTelefonoT.getText().length() >= 10){
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error.wav"));
                sonido.play();
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoTKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if("".equals(txtNameT.getText()) || "".equals(txtApellidopT.getText()) 
                || "".equals(txtApellidoMT.getText()) || "".equals(txtTelefonoT.getText()) || lblFoto.getIcon() == null || txtTelefonoT.getText().length() <  10){
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error.wav"));
                sonido.play();
            JOptionPane.showMessageDialog(null, "No dejes campos vacíos",
                    "CAMPOS VACIOS",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/advertencia.png", 40, 40));
        }else{
            try (Connection con = Conexion.CDB();
                    PreparedStatement ps = con.prepareStatement("INSERT INTO Maestro(mnombre,mapellidop,mapellidom,telefono,foto)VALUES(?,?,?,?,?)");
                    PreparedStatement psv = con.prepareStatement("SELECT COUNT(*) FROM Maestro WHERE mnombre = ? AND mapellidop = ? AND mapellidom = ? AND telefono = ?");
                    PreparedStatement setvars = con.prepareStatement("SET app.usuario_rol  TO '"+this.usuarioActual+"'  ");) {

                psv.setString(1, txtNameT.getText());
                psv.setString(2, txtApellidopT.getText());
                psv.setString(3, txtApellidoMT.getText());
                psv.setString(4, txtTelefonoT.getText());
                
                try(ResultSet rs = psv.executeQuery(); ){
                        if(rs.next() && rs.getInt(1) > 0){
                            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error.wav"));
                             sonido.play();
                             JOptionPane.showMessageDialog(null, "Estos datos ya existen",
                                     "DATOS DUPLICADOS", JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/advertencia.png", 40, 40)); 
                        }else{

                            setvars.execute();

                            ps.setString(1, txtNameT.getText());
                            ps.setString(2, txtApellidopT.getText());
                            ps.setString(3, txtApellidoMT.getText());
                            ps.setString(4, txtTelefonoT.getText());
                            ps.setBinaryStream(5, fis,longitudBytes);
                            ps.execute();

                            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/saved.wav"));
                            sonido.play();

                            JOptionPane.showMessageDialog(null,"Datos guardados correctamente",
                                    "Maestro guardado",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/comprobado.png", 40, 40));

                             limpiarDatos();

                            cargarMaestro();
                        }     
                }  
            } catch (Exception e) {
                System.out.println("Error al crear maestro:" + e);
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        FileInputStream fis = null;
        int longitudBytes = 0;
        
        if("".equals(txtNameT.getText()) || "".equals(txtApellidopT.getText()) 
                || "".equals(txtApellidoMT.getText()) || "".equals(txtTelefonoT.getText())  || lblFoto.getIcon() == null || txtTelefonoT.getText().length() <  10 ){
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error.wav"));
                sonido.play();
            JOptionPane.showMessageDialog(null, "No dejes campos vacíos",
                    "CAMPOS VACIOS",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/advertencia.png", 40, 40));
        }else{
            try (Connection con = Conexion.CDB();
                   PreparedStatement ps = con.prepareStatement("UPDATE Maestro SET mNombre = ?, mapellidop = ?,mapellidom = ?,telefono = ?,foto = ? WHERE Idteacher = ?");
                    PreparedStatement ps2 = con.prepareStatement( "UPDATE Maestro SET mNombre = ?, mapellidop = ?,mapellidom = ?,telefono = ? WHERE Idteacher = ?");
                 PreparedStatement setvars = con.prepareStatement("SET app.usuario_rol  TO '"+this.usuarioActual+"'  ");){
                
                int fila = jtMaestro.getSelectedRow();
                int idmaestro = (int) jtMaestro.getModel().getValueAt(fila, 0);

                    if(fis != null){
                        
                        setvars.execute();

                        ps.setString(1, txtNameT.getText());
                        ps.setString(2, txtApellidopT.getText());
                        ps.setString(3, txtApellidoMT.getText());
                        ps.setString(4, txtTelefonoT.getText());
                        ps.setBinaryStream(5, fis,longitudBytes);
                        ps.setInt(6, idmaestro);
                        ps.executeUpdate();
                        
                        ps.close();
                        con.close();

                        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/saved.wav"));
                        sonido.play();
                        JOptionPane.showMessageDialog(null,"Datos guardados correctamente",
                                "Maestro actualizados",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/comprobado.png", 40, 40));

                    }else{
                        
                        setvars.execute();

                        ps2.setString(1, txtNameT.getText());
                        ps2.setString(2, txtApellidopT.getText());
                        ps2.setString(3, txtApellidoMT.getText());
                        ps2.setString(4, txtTelefonoT.getText());
                        ps2.setInt(5, idmaestro);
                        ps2.executeUpdate();

                        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/saved.wav"));
                        sonido.play();
                        JOptionPane.showMessageDialog(null,"Datos guardados correctamente",
                                "Maestro actualizados",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/comprobado.png", 40, 40));
                
                    }
                
                limpiarDatos();
                
                 cargarMaestro();
            } catch (Exception e) {
                System.out.println("Error al actualizar: " + e);
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void jtMaestroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMaestroMouseClicked
        int fila = jtMaestro.getSelectedRow();
        
        if(fila >= 0){
            int idmae = (int) jtMaestro.getModel().getValueAt(fila, 0);
            cargarDatos(idmae);
        }
    }//GEN-LAST:event_jtMaestroMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       
       
       
       int resultado = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el maestro?",
               "¿Eliminar maestro",JOptionPane.YES_NO_OPTION);
       
       if("".equals(txtNameT.getText()) || "".equals(txtApellidopT.getText()) || "".equals(txtApellidoMT.getText()) 
               || "".equals(txtTelefonoT.getText())  || lblFoto.getIcon() == null ){
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error.wav"));
                sonido.play();
                JOptionPane.showMessageDialog(null, "Selecciona un maestro para eliminar",
                    "CAMPOS VACIOS",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/advertencia.png", 40, 40));
        }else{
           
           if(resultado == 0){
               try (Connection con = Conexion.CDB(); 
                      PreparedStatement ps = con.prepareStatement("DELETE FROM Maestro WHERE idteacher = ?"); 
                       PreparedStatement setvars = con.prepareStatement("SET app.usuario_rol  TO '"+this.usuarioActual+"'  ");) {
                   
                   int fila = jtMaestro.getSelectedRow();
                    int idteac = (int) jtMaestro.getModel().getValueAt(fila, 0);
                                        
                    setvars.execute();

                    ps.setInt(1, idteac);
                    ps.execute();

                    modelo.removeRow(fila);
                    
                    limpiarDatos();
                    
                    sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/saved.wav"));
                    sonido.play();
                    
                    JOptionPane.showMessageDialog(null, "Maestro eliminado correctamente",
                            "MAESTRO ELIMINADO",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/comprobado.png", 40, 40));
               } catch (Exception e) {
                   System.out.println("Error al eliminar:" +e);
                   e.printStackTrace();
               }
           }else{
               limpiarDatos();
           }
       }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        btnGuardar.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        btnGuardar.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        btnEditar.setBackground(Color.BLUE);
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
       btnEditar.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setBackground(Color.red);
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnEliminarMouseExited

    private void txtNameTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameTKeyTyped
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
    }//GEN-LAST:event_txtNameTKeyTyped

    private void txtApellidopTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidopTKeyTyped
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
    }//GEN-LAST:event_txtApellidopTKeyTyped

    private void txtApellidoMTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMTKeyTyped
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
    }//GEN-LAST:event_txtApellidoMTKeyTyped

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

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        btnLimpiar.setBackground(new Color(71,153,252));
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
       btnLimpiar.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnLimpiarMouseExited

     private void iniciarReloj(){
        timerReloj = new Timer(1000, (e) -> {
            DateFormat hora = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
            String hora2 = hora.format(new java.util.Date()).toString();
                    lblFechaHora.setText(hora2);
        });
        timerReloj.start();
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
       txtNameT.setText("");
       txtApellidopT.setText("");
       txtApellidoMT.setText("");
       txtTelefonoT.setText("");
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
    
    private void cargarMaestro(){                
        try (Connection con = Conexion.CDB();
                PreparedStatement ps = con.prepareStatement("SELECT * FROM Maestro ORDER BY idteacher DESC");
                ResultSet rs = ps.executeQuery();  ) {
            
            final int LABEL_WIDTH = 160;
            final int LABEL_HEIGHT = 166;

             modelo = new DefaultTableModel() {
                @Override
                public Class<?> getColumnClass(int columnIndex) {
                    if (columnIndex == 5) return ImageIcon.class;
                    return String.class;
                }

                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            
            modelo.setColumnIdentifiers(new String[] {"idteacher","Nombre","Apellido p","Apellido m","telefono","Foto"});
            
            while(rs.next()){
                byte[] imageData = rs.getBytes("foto");
                ImageIcon foto = null;
                
                if(imageData != null && imageData.length > 0){
                    Image originalImage = new ImageIcon(imageData).getImage();
                    Image scaleImage = originalImage.getScaledInstance(LABEL_WIDTH, LABEL_HEIGHT, Image.SCALE_SMOOTH);
                    foto = new ImageIcon(scaleImage);
                }
                
                modelo.addRow(new Object[]{
                    rs.getInt("idteacher"),
                    rs.getString("mnombre"),
                    rs.getString("mapellidop"),
                    rs.getString("mapellidom"),
                    rs.getString("telefono"),
                    foto
                });
            }
            
            jtMaestro.setModel(modelo);
            jtMaestro.removeColumn(jtMaestro.getColumnModel().getColumn(0));
            
            jtMaestro.setDefaultRenderer(ImageIcon.class, new DefaultTableCellRenderer(){
                
                @Override
                protected void setValue(Object value){
                    setIcon((value instanceof  ImageIcon) ? (ImageIcon) value : null);
                    setText("");
                    setHorizontalAlignment(JLabel.CENTER);
                    setVerticalAlignment(JLabel.CENTER);
                }
            });
            
            jtMaestro.getColumnModel().getColumn(4).setPreferredWidth(LABEL_WIDTH + 10);
            jtMaestro.getColumnModel().getColumn(4).setMaxWidth(LABEL_WIDTH + 20);
            jtMaestro.setRowHeight(LABEL_HEIGHT + 10);
             
        } catch (Exception e) {
            System.out.println("Error al cargar los datos: " + e.getMessage());
        }
    }
    
    private void cargarDatos(int idmaestro){
        try (Connection con = Conexion.CDB();
               PreparedStatement ps = con.prepareStatement("SELECT * FROM Maestro WHERE idteacher = ?"); ){
            
            ps.setInt(1, idmaestro);
           
           try(ResultSet rs = ps.executeQuery()){ 
                    if(rs.next()){
                        String nombre = rs.getString(2);
                        String apellidop = rs.getString(3);
                        String apellidom = rs.getString(4);
                        String telefono = rs.getString(5);
                        InputStream is = rs.getBinaryStream(6);

                        if(is != null){
                            BufferedImage bi = ImageIO.read(is);
                            ImageIcon foto = new ImageIcon(bi);
                            Image img = foto.getImage();
                            Image newimg = img.getScaledInstance(160, 166, Image.SCALE_SMOOTH);
                            ImageIcon newicon = new ImageIcon(newimg);
                            lblFoto.setIcon(newicon);
                        }

                        txtNameT.setText(nombre != null ? nombre : "");
                         txtApellidopT.setText(apellidop != null ? apellidop : "");
                         txtApellidoMT.setText(apellidom != null ? apellidom : "");
                         txtTelefonoT.setText(telefono != null ? telefono : "");
                    }
           }     

        } catch (Exception e) {
            System.out.println("Error al cargar los datos:" + e);
            e.printStackTrace();
        }
    }
    
    private void buscarDatos(String valor){
        try (Connection con = Conexion.CDB();
                PreparedStatement ps = con.prepareStatement("SELECT * FROM Maestro WHERE mnombre LIKE '%"+valor+"%' OR mapellidop LIKE '%"+valor+"%' "
                        + "OR mapellidom LIKE '%"+valor+"%' OR CONCAT(mnombre, ' ', mapellidop, ' ', mapellidom) LIKE '%"+valor+"%' OR CONCAT(mapellidop, ' ', mapellidom) LIKE '%"+valor+"%' "
                                + "OR telefono LIKE '%"+valor+"%'  ORDER BY idteacher DESC");
                ResultSet rs = ps.executeQuery(); ){
            
            final int LABEL_WIDTH = 160;
            final int LABEL_HEIGHT = 166;

             modelo = new DefaultTableModel() {
                @Override
                public Class<?> getColumnClass(int columnIndex) {
                    if (columnIndex == 5) return ImageIcon.class;
                    return String.class;
                }

                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            
            modelo.setColumnIdentifiers(new String[] {"idteacher","Nombre","Apellido p","Apellido m","telefono","Foto"});

            while(rs.next()){
                byte[] imageData = rs.getBytes("foto");
                ImageIcon foto = null;
                
                if(imageData != null && imageData.length > 0){
                    Image originalImage = new ImageIcon(imageData).getImage();
                    Image scaleImage = originalImage.getScaledInstance(LABEL_WIDTH, LABEL_HEIGHT, Image.SCALE_SMOOTH);
                    foto = new ImageIcon(scaleImage);
                }
                
                modelo.addRow(new Object[]{
                    rs.getInt("idteacher"),
                    rs.getString("mnombre"),
                    rs.getString("mapellidop"),
                    rs.getString("mapellidom"),
                    rs.getString("telefono"),
                    foto
                });
            }
            
            jtMaestro.setModel(modelo);
            jtMaestro.removeColumn(jtMaestro.getColumnModel().getColumn(0));
            
            jtMaestro.setDefaultRenderer(ImageIcon.class, new DefaultTableCellRenderer(){
                
                @Override
                protected void setValue(Object value){
                    setIcon((value instanceof  ImageIcon) ? (ImageIcon) value : null);
                    setText("");
                    setHorizontalAlignment(JLabel.CENTER);
                    setVerticalAlignment(JLabel.CENTER);
                }
            });
            
            jtMaestro.getColumnModel().getColumn(4).setPreferredWidth(LABEL_WIDTH + 10);
            jtMaestro.getColumnModel().getColumn(4).setMaxWidth(LABEL_WIDTH + 20);
            jtMaestro.setRowHeight(LABEL_HEIGHT + 10);
            
        } catch (Exception e) {
            System.out.println("Error al cargar los datos: " + e.getMessage());
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtMaestro;
    private javax.swing.JLabel lblCitas;
    private javax.swing.JLabel lblFechaHora;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JTextField txtApellidoMT;
    private javax.swing.JTextField txtApellidopT;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtNameT;
    private javax.swing.JTextField txtTelefonoT;
    // End of variables declaration//GEN-END:variables
}