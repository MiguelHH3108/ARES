
package ares;
import java.awt.Color;
import java.awt.Image;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.applet.AudioClip;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import javax.swing.Timer;

public class Recibos extends javax.swing.JFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    private String usuarioActual;
    private String rolU;
    private Timer timerReloj;

    public Recibos(String usuario, String rol) {
        this.usuarioActual = usuario;
        this.rolU = rol;
        
        initComponents();
        
        iniciarReloj();
        
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoAres.jpg")).getImage());
        this.setExtendedState(this.MAXIMIZED_BOTH);
        
        setImageLabel(lblImagen, "/Imagenes/Ares letras.jpg");
        
        cargarSAlumno();
        cargarSGrupo();
        
        cargarAlumno();
        cargarGrupo();
        cargarTicket();
    }
    
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
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtTicket = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        lblFechaHora = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDate = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jcAlumno = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jcGrupo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDetalles = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jButton1 = new javax.swing.JButton();

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
        lblAGrupos.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblAGrupos.setForeground(new java.awt.Color(255, 255, 255));
        lblAGrupos.setText("         Grupos");
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
        jPanel4.add(lblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 0, 180, 100));

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
        jPanel4.add(lblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 0, 180, 100));

        jPanel3.setBackground(new java.awt.Color(196, 36, 4));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtTicket.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtTicket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Fecha", "Nombre", "Apellido p", "Apellido m", "Ciudad", "Cantidad", "Grupo", "Detalles"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtTicket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTicketMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtTicket);
        if (jtTicket.getColumnModel().getColumnCount() > 0) {
            jtTicket.getColumnModel().getColumn(0).setResizable(false);
            jtTicket.getColumnModel().getColumn(1).setResizable(false);
            jtTicket.getColumnModel().getColumn(2).setResizable(false);
            jtTicket.getColumnModel().getColumn(3).setResizable(false);
            jtTicket.getColumnModel().getColumn(4).setResizable(false);
            jtTicket.getColumnModel().getColumn(5).setResizable(false);
            jtTicket.getColumnModel().getColumn(6).setResizable(false);
            jtTicket.getColumnModel().getColumn(7).setResizable(false);
            jtTicket.getColumnModel().getColumn(8).setResizable(false);
        }

        jLabel8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Recibos:");

        lblFechaHora.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblFechaHora.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaHora.setText("jLabel9");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Buscar recibo:");

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
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(jLabel8)
                .addGap(76, 76, 76)
                .addComponent(lblFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(199, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(lblFechaHora)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(196, 36, 4));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Recibo");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha:");

        txtDate.setBackground(new java.awt.Color(255, 255, 255));
        txtDate.setForeground(new java.awt.Color(0, 0, 0));
        txtDate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Alumno:");

        jcAlumno.setBackground(new java.awt.Color(255, 255, 255));
        jcAlumno.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jcAlumno.setForeground(new java.awt.Color(0, 0, 0));
        jcAlumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alumno" }));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ciudad:");

        txtCiudad.setBackground(new java.awt.Color(255, 255, 255));
        txtCiudad.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtCiudad.setForeground(new java.awt.Color(0, 0, 0));
        txtCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCiudadKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cantidad:");

        txtCantidad.setBackground(new java.awt.Color(255, 255, 255));
        txtCantidad.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(0, 0, 0));
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        jcGrupo.setBackground(new java.awt.Color(255, 255, 255));
        jcGrupo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jcGrupo.setForeground(new java.awt.Color(0, 0, 0));
        jcGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grupo" }));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Grupo:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Detalles:");

        txtDetalles.setBackground(new java.awt.Color(255, 255, 255));
        txtDetalles.setColumns(20);
        txtDetalles.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtDetalles.setForeground(new java.awt.Color(0, 0, 0));
        txtDetalles.setRows(5);
        jScrollPane1.setViewportView(txtDetalles);

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

        btnPrint.setBackground(new java.awt.Color(255, 255, 255));
        btnPrint.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(0, 0, 0));
        btnPrint.setText("Imprimir");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
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

        jMonthChooser1.setForeground(new java.awt.Color(0, 0, 0));
        jMonthChooser1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMonthChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jMonthChooser1PropertyChange(evt);
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
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addGap(53, 112, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminar))
                                .addComponent(jcGrupo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcAlumno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCiudad, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addComponent(jLabel6))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(28, 28, 28)
                                            .addComponent(btnEditar)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addComponent(btnLimpiar))
                                                    .addComponent(btnPrint)))))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrint))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(503, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 104, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        btnGuardar.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        btnGuardar.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(txtDate.getDate() == null || "".equals(txtCiudad.getText()) || "".equals(txtCantidad.getText()) || jcAlumno.getSelectedIndex() == 0 ||
            jcGrupo.getSelectedIndex() == 0){
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error.wav"));
            sonido.play();
            JOptionPane.showMessageDialog(null, "No dejes campos vacíos",
                "CAMPOS VACIOS",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/advertencia.png", 40, 40));
        }else{
            try ( Connection con = Conexion.CDB();
                    PreparedStatement ps = con.prepareStatement("INSERT INTO recibos(fecha,alumnofk,ciudad,cantidad,grupofk,detalles)VALUES(?,?,?,?,?,?) returning idrecibo");
                    PreparedStatement setvars = con.prepareStatement("SET app.usuario_rol  TO '"+this.usuarioActual+"'  ");){
                
                java.util.Date selectedDate = txtDate.getDate();
                java.sql.Date sqlDate = new java.sql.Date(selectedDate.getTime());
                
                 String alumnoselec = jcAlumno.getSelectedItem().toString();
                int idalumno = rolMapA.get(alumnoselec);
                
                String gruposelect = jcGrupo.getSelectedItem().toString();
                int idgrupo = rolMapA.get(gruposelect);
                
                Double cantidad = Double.parseDouble(txtCantidad.getText());
                 
                 setvars.execute();

               ps.setDate(1, sqlDate);
               ps.setInt(2, idalumno);
               ps.setString(3, txtCiudad.getText());
               ps.setDouble(4, cantidad);
               ps.setInt(5, idgrupo);
               ps.setString(6, txtDetalles.getText());
                
               int idreciboInsert = 0;
              try(ResultSet rs = ps.executeQuery()){                   
                    if(rs.next()){
                        idreciboInsert = rs.getInt("idrecibo");
                    }
              }     
               
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/saved.wav"));
                sonido.play();

                JOptionPane.showMessageDialog(null,"Datos guardados correctamente",
                    "Recibo guardado",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/comprobado.png", 40, 40));

                limpiarDatos();
                
                cargarTicket();
                
                Ticket ti = new Ticket(idreciboInsert);
                ti.setVisible(true);
                
            } catch (Exception e) {
                System.out.println("Error al crear ticket:" + e);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        btnEditar.setBackground(Color.BLUE);
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        btnEditar.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       if(txtDate.getDate() == null || "".equals(txtCiudad.getText()) || "".equals(txtCantidad.getText()) || jcAlumno.getSelectedIndex() == 0 ||
        jcGrupo.getSelectedIndex() == 0){
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error.wav"));
            sonido.play();
            JOptionPane.showMessageDialog(null, "No dejes campos vacíos",
                "CAMPOS VACIOS",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/advertencia.png", 40, 40));
        }else{
            try ( Connection con = Conexion.CDB();
                    PreparedStatement ps = con.prepareStatement("UPDATE Recibos SET fecha = ?,  alumnofk = ?, ciudad = ?, cantidad = ?, grupofk = ?, detalles = ? WHERE idrecibo = ? returning idrecibo");
                    PreparedStatement setvars = con.prepareStatement("SET app.usuario_rol  TO '"+this.usuarioActual+"'  ");) {
                
                 java.util.Date selectedDate = txtDate.getDate();
                java.sql.Date sqlDate = new java.sql.Date(selectedDate.getTime());
                
                String alumnoselec = jcAlumno.getSelectedItem().toString();
                int idalumno = rolMapA.get(alumnoselec);
                
                String gruposelect = jcGrupo.getSelectedItem().toString();
                int idgrupo = rolMapA.get(gruposelect);
                
                Double cantidad = Double.parseDouble(txtCantidad.getText());
                
                int fila = jtTicket.getSelectedRow();
                int idrecibo = (int) jtTicket.getModel().getValueAt(fila, 0);
                
                
                 setvars.execute();
                
                ps.setDate(1, sqlDate);
                ps.setInt(2, idalumno);
                ps.setString(3, txtCiudad.getText());
                ps.setDouble(4, cantidad);
                ps.setInt(5, idgrupo);
                ps.setString(6, txtDetalles.getText());
                ps.setInt(7, idrecibo);                
                
                int idreciboInsert = 0;
                
                try(ResultSet rs = ps.executeQuery()){
                        if(rs.next()){
                            idreciboInsert = rs.getInt("idrecibo");
                        }
                }      
                
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/saved.wav"));
                    sonido.play();
                
                JOptionPane.showMessageDialog(null, "Datos actualizados correctamente",
                            "DATOS ACTUALIZADOS",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/comprobado.png", 40, 40));
                
                limpiarDatos();
                
                Ticket ti = new Ticket(idreciboInsert);
                ti.setVisible(true);
                
                cargarTicket();
            } catch (Exception e) {
                System.out.println("Error al actualizar: " + e);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setBackground(Color.red);
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int resultado = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el recibo?",
            "¿Eliminar recibo",JOptionPane.YES_NO_OPTION);

         if(txtDate.getDate() == null || "".equals(txtCiudad.getText()) || "".equals(txtCantidad.getText()) || jcAlumno.getSelectedIndex() == 0 ||
        jcGrupo.getSelectedIndex() == 0){
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error.wav"));
            sonido.play();
            JOptionPane.showMessageDialog(null, "Selecciona un recibo para eliminar",
                "CAMPOS VACIOS",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/advertencia.png", 40, 40));
        }else{

            if(resultado == 0){
                try (Connection con = Conexion.CDB();
                       PreparedStatement ps = con.prepareStatement("DELETE FROM Recibos WHERE idrecibo = ?"); 
                        PreparedStatement setvars = con.prepareStatement("SET app.usuario_rol  TO '"+this.usuarioActual+"'  ");) {
                    
                    int fila = jtTicket.getSelectedRow();
                    int idrecibo = (int) jtTicket.getModel().getValueAt(fila, 0);
                    
                    setvars.execute();

                    ps.setInt(1, idrecibo);
                    ps.execute();
                    
                    modelo.removeRow(fila);

                    limpiarDatos();

                    sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/saved.wav"));
                    sonido.play();

                    JOptionPane.showMessageDialog(null, "Recibo eliminado correctamente",
                        "RECIBO ELIMINADO",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/comprobado.png", 40, 40));
                    
                } catch (Exception e) {
                    System.out.println("Error al eliminar:" +e);
                    e.printStackTrace();
                }
            }else{
                   limpiarDatos();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        int fila = jtTicket.getSelectedRow();
        if(fila >= 0){
            int idticket = (int) jtTicket.getModel().getValueAt(fila, 0);
            Ticket t = new Ticket(idticket);
            t.setVisible(true);
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void jtTicketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTicketMouseClicked
        int fila = jtTicket.getSelectedRow();
        if(fila >= 0){
            int idticket = (int) jtTicket.getModel().getValueAt(fila, 0);
            cargarRecibo(idticket);
        }
    }//GEN-LAST:event_jtTicketMouseClicked

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

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;
        
        if(!numero){
            evt.consume();
        }
        
        if(txtCantidad.getText().length() >= 10){
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCiudadKeyTyped
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
    }//GEN-LAST:event_txtCiudadKeyTyped

    private void jMonthChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jMonthChooser1PropertyChange
      filtroDia();
    }//GEN-LAST:event_jMonthChooser1PropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       cargarTicket();
    }//GEN-LAST:event_jButton1ActionPerformed

    private Map<String,Integer> rolMapA = new HashMap<>();
    
     private void iniciarReloj(){
        timerReloj = new Timer(1000, (e) -> {
            DateFormat hora = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
            String hora2 = hora.format(new java.util.Date()).toString();
                    lblFechaHora.setText(hora2);
        });
        timerReloj.start();
    }
    
    public void limpiarDatos(){
        txtDate.setDate(null);
        txtCantidad.setText("");
        txtCiudad.setText("");
        txtDetalles.setText("");
        jcAlumno.setSelectedIndex(0);
        jcGrupo.setSelectedIndex(0);
    }
    
    private void cargarAlumno(){
        try (Connection con = Conexion.CDB();
               Statement  st = con.createStatement(); 
                ResultSet rs = st.executeQuery("SELECT idalumno,nombre,apellidop,apellidom FROM Alumno")) {

            while (rs.next()) {                
                int ida = rs.getInt("idalumno");
                String nombre = rs.getString("nombre");
                String apellidop = rs.getString("apellidop");
                String apellidom = rs.getString("apellidom");

                String nombreCompleto = nombre + " " + apellidop + " " + apellidom;
                rolMapA.put(nombreCompleto, ida);
                jcAlumno.addItem(nombreCompleto);
            }
            
        } catch (Exception e) {
            System.out.println("Error al encontrar alumno:" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    private void cargarSAlumno(){
        AutoCompleteDecorator.decorate(jcAlumno);
    }
    
    private void cargarGrupo(){
            try (Connection con = Conexion.CDB();
              Statement st = con.createStatement();   
               ResultSet rs = st.executeQuery("SELECT idcg,nombreg FROM cgrupos") ){

            while(rs.next()){
                int idg = rs.getInt("idcg");
                String ngrupo = rs.getString("nombreg");
                
                rolMapA.put(ngrupo, idg);
                jcGrupo.addItem(ngrupo);
            }

        } catch (Exception e) {
            System.out.println("Error al econtrar grupo:" +e.getMessage());
            e.printStackTrace();
        }
    }
    
    private void cargarSGrupo(){
        AutoCompleteDecorator.decorate(jcGrupo);
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
    
   private void cargarTicket(){      
       try (Connection con = Conexion.CDB();
               PreparedStatement ps = con.prepareStatement("SELECT * FROM ticket ORDER BY Fecha DESC");
                ResultSet rs = ps.executeQuery();){
           
           modelo.setRowCount(0);
           modelo.setColumnIdentifiers(new String[]{"id","Fecha","Nombre","Apellido p","ApellidoM","Ciudad","Cantidad","Grupo","Detalles"});
           
           while(rs.next()){
               modelo.addRow(new Object[]{
                   rs.getInt("idrecibo"),
                   rs.getDate("fecha"),
                   rs.getString("nombre"),
                   rs.getString("apellidop"),
                   rs.getString("apellidom"),
                   rs.getString("ciudad"),
                   rs.getDouble("cantidad"),
                   rs.getString("nombreg"),
                   rs.getString("detalles")
               });
               
           }
           
           jtTicket.setModel(modelo);
           jtTicket.removeColumn(jtTicket.getColumnModel().getColumn(0));
           
       } catch (Exception e) {
           System.out.println("Error a cargar los datos");
           e.printStackTrace();
       }
   }
   
   private void cargarRecibo(int idrecibo){
       try (Connection con = Conexion.CDB(); 
               PreparedStatement ps = con.prepareStatement("SELECT * FROM Ticket WHERE idrecibo = ?"); ){
           
           ps.setInt(1, idrecibo);
           
           try(ResultSet rs = ps.executeQuery()){
                if(rs.next()){
                    Date fecha = rs.getDate(2);
                    String nombrec = rs.getString("nombre") + " " + rs.getString("apellidop") + " " + rs.getString("apellidom");
                    selectItem(jcAlumno, nombrec);
                    String ciudad = rs.getString(6);
                    Double cantidad = rs.getObject(7) != null ? rs.getDouble(7) : null;
                    String grupo = rs.getString("nombreg");
                    selectItem(jcGrupo, grupo);
                    String detalles = rs.getString(9);

                    if(fecha != null){
                        txtDate.setDate(fecha);
                    }

                    txtCiudad.setText(ciudad != null ? ciudad : "");
                    txtCantidad.setText(cantidad != null ? String.valueOf(cantidad) : "");
                    txtDetalles.setText(detalles != null ? detalles : "");
                }
           }   
           
       } catch (Exception e) {
           System.out.println("Error al cargar los datos:");
           e.printStackTrace();
       }
   }
   
   private void selectItem(JComboBox<String> comboB, String valor){
       for(int i = 0; i < comboB.getItemCount(); i++){
           if(comboB.getItemAt(i).equals(valor)){
               comboB.setSelectedIndex(i);
               return;
           }
       }
   }
   
   private void buscarDatos(String valor){
        
       try (Connection con = Conexion.CDB();
            PreparedStatement ps = con.prepareStatement( "SELECT * FROM ticket WHERE Nombre LIKE '%"+valor+"%'  OR apellidop LIKE '%"+valor+"%' OR apellidom LIKE '%"+valor+"%' "
                    + "OR CONCAT(Nombre, ' ', apellidop, ' ', apellidom) LIKE '%"+valor+"%' OR CONCAT(apellidop, ' ', apellidom) LIKE '%"+valor+"%'  OR ciudad LIKE '%"+valor+"%'  "
                   + "OR nombreg LIKE '%"+valor+"%' OR detalles LIKE '%"+valor+"%'  ORDER BY idrecibo DESC");
            ResultSet rs = ps.executeQuery(); ){
           
           modelo.setRowCount(0);
           modelo.setColumnIdentifiers(new String[]{"id","Fecha","Nombre","Apellido p","ApellidoM","Ciudad","Cantidad","Grupo","Detalles"});
           
           while(rs.next()){
               modelo.addRow(new Object[]{
                   rs.getInt("idrecibo"),
                   rs.getDate("fecha"),
                   rs.getString("nombre"),
                   rs.getString("apellidop"),
                   rs.getString("apellidom"),
                   rs.getString("ciudad"),
                   rs.getDouble("cantidad"),
                   rs.getString("nombreg"),
                   rs.getString("detalles")
               });
               
           }
           
           jtTicket.setModel(modelo);
           jtTicket.removeColumn(jtTicket.getColumnModel().getColumn(0));
           
       } catch (Exception e) {
           System.out.println("Error a cargar los datos");
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
    
    private void filtroDia(){
        try (Connection con = Conexion.CDB();
                PreparedStatement ps = con.prepareStatement("SELECT * FROM ticket WHERE EXTRACT(MONTH FROM fecha) = ? ORDER BY fecha ASC");){
            modelo.setRowCount(0);
           modelo.setColumnIdentifiers(new String[]{"id","Fecha","Nombre","Apellido p","ApellidoM","Ciudad","Cantidad","Grupo","Detalles"});
           
           int mesSelect = jMonthChooser1.getMonth()+1;
           ps.setInt(1, mesSelect);
           
           try(ResultSet rs = ps.executeQuery()){
                while(rs.next()){
                    modelo.addRow(new Object[]{
                        rs.getInt("idrecibo"),
                        rs.getDate("fecha"),
                        rs.getString("nombre"),
                        rs.getString("apellidop"),
                        rs.getString("apellidom"),
                        rs.getString("ciudad"),
                        rs.getDouble("cantidad"),
                        rs.getString("nombreg"),
                        rs.getString("detalles")
                    });

                }
           }   
           
           jtTicket.setModel(modelo);
           jtTicket.removeColumn(jtTicket.getColumnModel().getColumn(0));
        } catch (Exception e) {
            System.out.println("Error filtro día");
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
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox<String> jcAlumno;
    private javax.swing.JComboBox<String> jcGrupo;
    private javax.swing.JTable jtTicket;
    private javax.swing.JLabel lblAGrupos;
    private javax.swing.JLabel lblFechaHora;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCiudad;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextArea txtDetalles;
    // End of variables declaration//GEN-END:variables
}