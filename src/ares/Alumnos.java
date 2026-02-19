
package ares;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.ImageIcon;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.applet.AudioClip;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author herna
 */
public class Alumnos extends javax.swing.JFrame {
    DefaultTableModel  modelo = new DefaultTableModel();
     private String usuarioActual;
    private String rolU;
    private Timer timerReloj;
    
   public Alumnos(String usuario, String rol) {
    this.usuarioActual = usuario;
    this.rolU = rol;
    
    initComponents();
    configPermisos();
    
    iniciarReloj();
    
    setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoAres.jpg")).getImage());
    
    ajusteRapidoNetbeans();
    
    this.setExtendedState(this.MAXIMIZED_BOTH);
    
    setImageLabel(lblImagen, "/Imagenes/Ares letras.jpg");
    
    cargarDatosTabla();
    
}

private void ajusteRapidoNetbeans() {
    if (jtAlumnoST != null) {
        jtAlumnoST.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
    }
    
    for (Component comp : getContentPane().getComponents()) {
        if (comp instanceof JButton) {
            comp.setMinimumSize(new Dimension(100, 30));
        }
        if (comp instanceof JTextField || comp instanceof JComboBox) {
            comp.setMinimumSize(new Dimension(150, 25));
        }
    }
}
    
    FileInputStream fis = null;
    int longitudBytes = 0;
    AudioClip sonido;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelA = new javax.swing.JPanel();
        lblNA = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellidop = new javax.swing.JLabel();
        lblApellidoM = new javax.swing.JLabel();
        lblTelef = new javax.swing.JLabel();
        lblSFoto = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        txtNombreA = new javax.swing.JTextField();
        txtApellidoPA = new javax.swing.JTextField();
        txtApellidoMA = new javax.swing.JTextField();
        txtTelefonoA = new javax.swing.JTextField();
        lblFoto = new javax.swing.JLabel();
        btnFoto = new javax.swing.JButton();
        btnGuardarA = new javax.swing.JButton();
        txtDate = new com.toedter.calendar.JDateChooser();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jDFiltrodia = new com.toedter.calendar.JDayChooser();
        btnRecargar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAlumnoST = new javax.swing.JTable();
        lblFechaHora = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        lblAlumTutor = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(71, 153, 252));
        jPanel1.setPreferredSize(new java.awt.Dimension(1535, 300));

        panelA.setBackground(new java.awt.Color(196, 36, 4));
        panelA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        panelA.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        lblNA.setBackground(new java.awt.Color(255, 255, 255));
        lblNA.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblNA.setForeground(new java.awt.Color(255, 255, 255));
        lblNA.setText("Nuevo alumno");

        lblNombre.setBackground(new java.awt.Color(255, 255, 255));
        lblNombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre:");

        lblApellidop.setBackground(new java.awt.Color(255, 255, 255));
        lblApellidop.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblApellidop.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidop.setText("Apellido paterno:");

        lblApellidoM.setBackground(new java.awt.Color(255, 255, 255));
        lblApellidoM.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblApellidoM.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidoM.setText("Apellido materno:");

        lblTelef.setBackground(new java.awt.Color(255, 255, 255));
        lblTelef.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTelef.setForeground(new java.awt.Color(255, 255, 255));
        lblTelef.setText("Telefono:");

        lblSFoto.setBackground(new java.awt.Color(255, 255, 255));
        lblSFoto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblSFoto.setForeground(new java.awt.Color(255, 255, 255));
        lblSFoto.setText("Foto:");

        lblDate.setBackground(new java.awt.Color(255, 255, 255));
        lblDate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        lblDate.setText("Fecha de inscipción:");

        txtNombreA.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNombreA.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNombreA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreAKeyTyped(evt);
            }
        });

        txtApellidoPA.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtApellidoPA.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidoPA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtApellidoPA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoPAKeyTyped(evt);
            }
        });

        txtApellidoMA.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtApellidoMA.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidoMA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtApellidoMA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoMAKeyTyped(evt);
            }
        });

        txtTelefonoA.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtTelefonoA.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefonoA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTelefonoA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoAKeyTyped(evt);
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

        btnGuardarA.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardarA.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnGuardarA.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardarA.setText("Guardar alumno");
        btnGuardarA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarAMouseExited(evt);
            }
        });
        btnGuardarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAActionPerformed(evt);
            }
        });

        txtDate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtDate.setForeground(new java.awt.Color(0, 0, 0));
        txtDate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setText("Modificar");
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

        jDFiltrodia.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDFiltrodiaPropertyChange(evt);
            }
        });

        btnRecargar.setBackground(new java.awt.Color(255, 255, 255));
        btnRecargar.setForeground(new java.awt.Color(0, 0, 0));
        btnRecargar.setText("R");
        btnRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelALayout = new javax.swing.GroupLayout(panelA);
        panelA.setLayout(panelALayout);
        panelALayout.setHorizontalGroup(
            panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelALayout.createSequentialGroup()
                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelALayout.createSequentialGroup()
                        .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelALayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelALayout.createSequentialGroup()
                                        .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblApellidop)
                                            .addComponent(lblNombre)
                                            .addComponent(lblApellidoM)
                                            .addComponent(lblTelef)
                                            .addComponent(lblDate)
                                            .addGroup(panelALayout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelALayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(btnLimpiar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnRecargar))
                                            .addGroup(panelALayout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtNombreA)
                                                    .addComponent(txtApellidoPA)
                                                    .addComponent(txtApellidoMA)
                                                    .addComponent(txtTelefonoA)
                                                    .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
                                            .addGroup(panelALayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(btnGuardarA))
                                            .addGroup(panelALayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(btnEditar))
                                            .addGroup(panelALayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(btnEliminar))))
                                    .addGroup(panelALayout.createSequentialGroup()
                                        .addComponent(lblSFoto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnFoto))))
                            .addGroup(panelALayout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(lblNA)))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(panelALayout.createSequentialGroup()
                        .addComponent(jDFiltrodia, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addContainerGap())
        );
        panelALayout.setVerticalGroup(
            panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNA)
                .addGap(23, 23, 23)
                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombreA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidop)
                    .addComponent(txtApellidoPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidoM)
                    .addComponent(txtApellidoMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelef)
                    .addComponent(txtTelefonoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDate)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSFoto)
                    .addComponent(btnFoto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelALayout.createSequentialGroup()
                        .addComponent(btnGuardarA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiar)
                            .addComponent(btnRecargar)))
                    .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jDFiltrodia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(196, 36, 4));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Alumnos sin tutor");

        jtAlumnoST.setBackground(new java.awt.Color(255, 255, 255));
        jtAlumnoST.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtAlumnoST.setForeground(new java.awt.Color(0, 0, 0));
        jtAlumnoST.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Apellido P", "Apellido M", "Telefóno", "Fecha inscripción", "Foto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Byte.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtAlumnoST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtAlumnoSTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtAlumnoST);

        lblFechaHora.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblFechaHora.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaHora.setText("jLabel9");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar alumno:");

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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 134, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(lblFechaHora)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        lblAlumTutor.setBackground(new java.awt.Color(71, 153, 252));
        lblAlumTutor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblAlumTutor.setForeground(new java.awt.Color(255, 255, 255));
        lblAlumTutor.setText("   Alumnos con tutor");
        lblAlumTutor.setOpaque(true);
        lblAlumTutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAlumTutorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAlumTutorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAlumTutorMouseExited(evt);
            }
        });
        jPanel4.add(lblAlumTutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 180, 100));

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
        jPanel4.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 0, 810, 100));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(panelA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1540, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAActionPerformed
         if("".equals(txtNombreA.getText()) || "".equals(txtApellidoPA.getText()) 
            || "".equals(txtApellidoMA.getText()) || "".equals(txtTelefonoA.getText())
            || txtDate.getDate() == null || lblFoto.getIcon() == null || txtTelefonoA.getText().length() <  10){  
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error.wav"));
             sonido.play();
            JOptionPane.showMessageDialog(null, "No dejes campos vacíos","CAMPOS VACÍOS", JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/advertencia.png", 40, 40));
        } else {
                
            try (Connection con = Conexion.CDB();
                    PreparedStatement ps = con.prepareStatement("INSERT INTO Alumno(Nombre,ApellidoP,ApellidoM,Telefono,foto,fechapago)VALUES(?,?,?,?,?,?)");
                    PreparedStatement psc = con.prepareStatement("SELECT COUNT(*) FROM Alumnost WHERE nombre = ? AND apellidop = ? AND apellidom = ? AND telefono = ?");
                   
                    PreparedStatement setvars = con.prepareStatement("SET app.usuario_rol  TO '"+this.usuarioActual+"'  ")) {       

                psc.setString(1, txtNombreA.getText());
                psc.setString(2, txtApellidoPA.getText());
                psc.setString(3, txtApellidoMA.getText());
                psc.setString(4, txtTelefonoA.getText());
                
                try( ResultSet rs = psc.executeQuery()){
                    if(rs.next() && rs.getInt(1) > 0){
                         sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error.wav"));
                         sonido.play();
                         JOptionPane.showMessageDialog(null, "Estos datos ya existen",
                                 "DATOS DUPLICADOS", JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/advertencia.png", 40, 40)); 
                    }else{

                        setvars.execute();

                        java.util.Date selectedDate = txtDate.getDate();
                        java.sql.Date sqlDate = new java.sql.Date(selectedDate.getTime());

                        ps.setString(1, txtNombreA.getText());
                        ps.setString(2, txtApellidoPA.getText());
                        ps.setString(3, txtApellidoMA.getText());
                        ps.setString(4, txtTelefonoA.getText());
                        ps.setBinaryStream(5, fis, longitudBytes);
                        ps.setDate(6, sqlDate);
                        ps.execute();

                        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/saved.wav"));
                        sonido.play();

                        JOptionPane.showMessageDialog(null, "Datos guardados correctamente",
                                "Alumno guardado",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/comprobado.png", 40, 40));

                       limpiarDatos();
                       
                       cargarDatosTabla();
                   }  
                }    
            } catch (Exception e) {
                  System.out.println("Error:" + e);
                  e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnGuardarAActionPerformed

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

    private void jtAlumnoSTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAlumnoSTMouseClicked
     int fila = jtAlumnoST.getSelectedRow();
    if (fila >= 0) {
        int idalumno = (int) jtAlumnoST.getModel().getValueAt(fila, 0);
        cargarDatosAlumno(idalumno);
    }
    }//GEN-LAST:event_jtAlumnoSTMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
               int resultado = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el alumno?",
                "¿Eliminar alumno?",JOptionPane.YES_NO_OPTION);
        
        if("".equals(txtNombreA.getText()) || "".equals(txtApellidoPA.getText()) 
            || "".equals(txtApellidoMA.getText()) || "".equals(txtTelefonoA.getText())
            || txtDate.getDate() == null || lblFoto.getIcon() == null){  
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error.wav"));
                sonido.play();
            JOptionPane.showMessageDialog(null, "Selecciona un alumno para eliminar","CAMPOS VACÍOS",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/advertencia.png", 40, 40));
        } else {
        
            if(resultado == 0){
                try (Connection con = Conexion.CDB();
                        PreparedStatement ps = con.prepareStatement("DELETE FROM Alumno WHERE Idalumno = ?");
                        PreparedStatement setvars = con.prepareStatement("SET app.usuario_rol  TO '"+this.usuarioActual+"'  ")) {
                    
                    int Fila = jtAlumnoST.getSelectedRow();
                    int idalumno = (int) jtAlumnoST.getModel().getValueAt(Fila,0);

                    setvars.execute();

                    ps.setInt(1, idalumno);
                    ps.execute();

                    modelo.removeRow(Fila);

                    limpiarDatos();
                    
                    sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/saved.wav"));
                    sonido.play();
                    JOptionPane.showMessageDialog(null, "Alumno eliminado correctamente",
                            "ALUMNO ELIMINADO",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/comprobado.png", 40, 40));
                    
                    con.close();
                    ps.close();

                } catch (Exception e) {
                    System.out.println("Error al eliminar:" + e);
                }
           }else{
               limpiarDatos();
           }
        }    
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtTelefonoAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoAKeyTyped
         int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;
        
        if(!numero){
            evt.consume();
        }
        
        if(txtTelefonoA.getText().length() >= 10){
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error.wav"));
                sonido.play();
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoAKeyTyped

    private void txtNombreAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreAKeyTyped
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
    }//GEN-LAST:event_txtNombreAKeyTyped

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        PreparedStatement ps = null;
        FileInputStream fis = null;
        int longitudBytes = 0;
       
        if("".equals(txtNombreA.getText()) || "".equals(txtApellidoPA.getText()) 
            || "".equals(txtApellidoMA.getText()) || "".equals(txtTelefonoA.getText())
            || txtDate.getDate() == null || lblFoto.getIcon() == null || txtTelefonoA.getText().length() <  10){  
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error.wav"));
                sonido.play();
                JOptionPane.showMessageDialog(null, "No dejes campos vacíos","CAMPOS VACÍOS",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/advertencia.png", 40, 40));
        } else {
                try (Connection con = Conexion.CDB();
                         PreparedStatement setvars = con.prepareStatement("SET app.usuario_rol  TO '"+this.usuarioActual+"'  ")){

                    java.util.Date selectedDate = txtDate.getDate();
                    java.sql.Date sqlDate = new java.sql.Date(selectedDate.getTime());

                    int Fila = jtAlumnoST.getSelectedRow();
                    int idalumno = (int) jtAlumnoST.getModel().getValueAt(Fila,0);

                    String sql;

                    if(fis != null){
                        setvars.execute();
                        sql = "UPDATE Alumno SET Nombre = ?, ApellidoP = ?, ApellidoM = ?, Telefono = ?, Foto = ?, Fechapago = ? WHERE idalumno = ?";
                        ps = con.prepareStatement(sql);

                        ps.setString(1, txtNombreA.getText());
                        ps.setString(2, txtApellidoPA.getText());
                        ps.setString(3, txtApellidoMA.getText());
                        ps.setString(4, txtTelefonoA.getText());
                        ps.setBinaryStream(5, fis, longitudBytes);
                        ps.setDate(6, sqlDate);
                        ps.setInt(7, idalumno);
                        ps.executeUpdate();
                        
                        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/saved.wav"));
                        sonido.play();
                        JOptionPane.showMessageDialog(null, "Datos actualizados correctamente",
                            "DATOS ACTUALIZADOS",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/comprobado.png", 40, 40));
                        
                    }else{
                         setvars.execute();
                         
                        sql = "UPDATE Alumno SET Nombre = ?, ApellidoP = ?, ApellidoM = ?, Telefono = ?, Fechapago = ? WHERE idalumno = ?";
                        ps = con.prepareStatement(sql);

                        ps.setString(1, txtNombreA.getText());
                        ps.setString(2, txtApellidoPA.getText());
                        ps.setString(3, txtApellidoMA.getText());
                        ps.setString(4, txtTelefonoA.getText());
                        ps.setDate(5, sqlDate);
                        ps.setInt(6, idalumno);
                        ps.executeUpdate();
                        
                        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/saved.wav"));
                        sonido.play();
                        
                        JOptionPane.showMessageDialog(null, "Datos actualizados correctamente",
                            "DATOS ACTUALIZADOS",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/comprobado.png", 40, 40));      
                    }
                    
                    limpiarDatos();

                    cargarDatosTabla();
                } catch (Exception e) {
                    System.out.println("Error al actualizar datos:" + e);
                    e.printStackTrace();
                }finally{
                    try {
                        if(ps != null) ps.close();               
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        this.dispose();  
        System.gc();
        MenuAdmin ma = new MenuAdmin(usuarioActual,rolU);
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

    private void lblAlumTutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlumTutorMouseClicked
        this.dispose();
        System.gc();
        AlumnoTutor alt = new AlumnoTutor(usuarioActual,rolU);
        alt.setVisible(true);
    }//GEN-LAST:event_lblAlumTutorMouseClicked

    private void lblAlumTutorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlumTutorMouseEntered
        lblAlumTutor.setBackground(Color.WHITE);
        lblAlumTutor.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblAlumTutorMouseEntered

    private void lblAlumTutorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlumTutorMouseExited
        lblAlumTutor.setBackground(new Color(71, 153, 252));
        lblAlumTutor.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblAlumTutorMouseExited

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

    private void btnGuardarAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarAMouseEntered
        btnGuardarA.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnGuardarAMouseEntered

    private void btnGuardarAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarAMouseExited
        btnGuardarA.setBackground(Color.white);
    }//GEN-LAST:event_btnGuardarAMouseExited

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        btnEditar.setBackground(Color.BLUE);
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        btnEditar.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setBackground(Color.RED);
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnFotoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFotoMouseEntered
       btnFoto.setBackground(Color.YELLOW);
    }//GEN-LAST:event_btnFotoMouseEntered

    private void btnFotoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFotoMouseExited
       btnFoto.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnFotoMouseExited

    private void txtApellidoPAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoPAKeyTyped
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
    }//GEN-LAST:event_txtApellidoPAKeyTyped

    private void txtApellidoMAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMAKeyTyped
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
    }//GEN-LAST:event_txtApellidoMAKeyTyped

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

    private void jDFiltrodiaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDFiltrodiaPropertyChange
       filtroDia();
    }//GEN-LAST:event_jDFiltrodiaPropertyChange

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed
       cargarDatosTabla();
    }//GEN-LAST:event_btnRecargarActionPerformed
    
    private void iniciarReloj(){
        timerReloj = new Timer(1000, (e) -> {
            DateFormat hora = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
            String hora2 = hora.format(new java.util.Date()).toString();
                    lblFechaHora.setText(hora2);
        });
        timerReloj.start();
    }
    
    private void configPermisos(){
        switch (rolU) {
            case "Administrador":
                
                break;
                
                case "Usuario1":
                    btnGuardarA.setVisible(false);
                    btnGuardarA.setEnabled(false);
                    
                    btnEditar.setVisible(false);
                    btnEditar.setEnabled(false);
                    
                    btnEliminar.setVisible(false);
                    btnEliminar.setEnabled(false);
                    
                    btnFoto.setVisible(false);
                    btnFoto.setEnabled(false);
                    
                break;
                
                case "Usuario2":
                    btnGuardarA.setVisible(false);
                    btnGuardarA.setEnabled(false);
                    
                    btnEditar.setVisible(false);
                    btnEditar.setEnabled(false);
                    
                    btnEliminar.setVisible(false);
                    btnEliminar.setEnabled(false);
                    
                    btnFoto.setVisible(false);
                    btnFoto.setEnabled(false);
                    
                break;
        }
    }
    
    public void limpiarDatos(){
         lblFoto.setIcon(null);
         txtNombreA.setText("");
         txtApellidoPA.setText("");
         txtApellidoMA.setText("");
         txtTelefonoA.setText("");
         txtDate.setDate(null);
    }
    
    private void cargarDatosTabla() {
        try {
            
            try(Connection con = Conexion.CDB(); 
                    PreparedStatement ps = con.prepareStatement("SELECT * FROM AlumnoST ORDER BY idalumno DESC");
                    ResultSet rs = ps.executeQuery() ){
                modelo.setRowCount(0);
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

                modelo.setColumnIdentifiers(new String[]{"id","Nombre", "Apellido P", "Apellido M", "Teléfono", "Foto", "Fecha inscripción"}); 

                while (rs.next()) {
                    byte[] imageData = rs.getBytes("foto");
                    ImageIcon foto = null;

                    if (imageData != null && imageData.length > 0) {
                        Image originalImage = new ImageIcon(imageData).getImage();
                        Image scaledImage = originalImage.getScaledInstance(
                            LABEL_WIDTH, 
                            LABEL_HEIGHT, 
                            Image.SCALE_SMOOTH
                        );
                        foto = new ImageIcon(scaledImage);
                    }

                    modelo.addRow(new Object[]{
                        rs.getInt("idalumno"),
                        rs.getString("nombre"),
                        rs.getString("apellidop"),
                        rs.getString("apellidom"),
                        rs.getString("telefono"),
                        foto,
                        rs.getDate("fechapago")
                    });
                }

                jtAlumnoST.setModel(modelo);
                jtAlumnoST.removeColumn(jtAlumnoST.getColumnModel().getColumn(0));

                jtAlumnoST.setDefaultRenderer(ImageIcon.class, new DefaultTableCellRenderer() {

                    @Override
                    protected void setValue(Object value) {
                        setIcon((value instanceof ImageIcon) ? (ImageIcon) value : null);
                        setText("");
                        setHorizontalAlignment(JLabel.CENTER);
                        setVerticalAlignment(JLabel.CENTER);
                    }
                });

                jtAlumnoST.getColumnModel().getColumn(4).setPreferredWidth(LABEL_WIDTH + 10);
                jtAlumnoST.getColumnModel().getColumn(4).setMaxWidth(LABEL_WIDTH + 20);
                jtAlumnoST.setRowHeight(LABEL_HEIGHT + 10);
            }    
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al cargar datos: " + e.getMessage());
        }
    }

    private void cargarDatosAlumno(int idalumno) {   
        try (Connection con = Conexion.CDB();
                PreparedStatement ps = con.prepareStatement("SELECT * FROM Alumnost WHERE idalumno = ?")){
                
                ps.setInt(1, idalumno);
                
                try(ResultSet rs = ps.executeQuery()){
                    if (rs.next()) {
                        String nombre = rs.getString(2);
                        String apellidop = rs.getString(3);
                        String apellidom = rs.getString(4);
                        String telefono = rs.getString(5);
                        InputStream is = rs.getBinaryStream(6);
                        Date fecha = rs.getDate(7);

                        if (is != null) {
                            BufferedImage bi = ImageIO.read(is);
                            ImageIcon foto = new ImageIcon(bi);
                            Image img = foto.getImage();
                            Image newimg = img.getScaledInstance(160, 166, java.awt.Image.SCALE_SMOOTH);
                            ImageIcon newicon = new ImageIcon(newimg);
                            lblFoto.setIcon(newicon);
                        }

                        txtNombreA.setText(nombre != null ? nombre : "");
                        txtApellidoPA.setText(apellidop != null ? apellidop : "");
                        txtApellidoMA.setText(apellidom != null ? apellidom : "");
                        txtTelefonoA.setText(telefono != null ? telefono : "");

                        if (fecha != null) {
                            txtDate.setDate(fecha);
                        }
                    }
                } 

        } catch (Exception e) {
            System.out.println("Error al cargar datos: " + e);
            e.printStackTrace();
        } 
    }
    
    public void buscarDatos(String valor){
        try {
            try(Connection con = Conexion.CDB(); Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM Alumnost WHERE Nombre LIKE '%"+valor+"%'  OR apellidop LIKE '%"+valor+"%' OR apellidom LIKE '%"+valor+"%' OR CONCAT(Nombre, ' ', apellidop, ' ', apellidom) LIKE '%"+valor+"%' OR CONCAT(apellidop, ' ', apellidom) LIKE '%"+valor+"%'  OR telefono LIKE '%"+valor+"%' ORDER BY idalumno DESC")){
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

                modelo.setColumnIdentifiers(new String[]{"id","Nombre", "Apellido P", "Apellido M", "Teléfono", "Foto", "Fecha inscripción"}); 

                while(rs.next()){
                    byte[] imageData = rs.getBytes("foto");
                    ImageIcon foto = null;

                    if (imageData != null && imageData.length > 0) {
                        Image originalImage = new ImageIcon(imageData).getImage();
                        Image scaledImage = originalImage.getScaledInstance(
                            LABEL_WIDTH, 
                            LABEL_HEIGHT, 
                            Image.SCALE_SMOOTH
                        );
                        foto = new ImageIcon(scaledImage);
                    }

                    modelo.addRow(new Object[]{
                        rs.getInt("idalumno"),
                        rs.getString("nombre"),
                        rs.getString("apellidop"),
                        rs.getString("apellidom"),
                        rs.getString("telefono"),
                        foto,
                        rs.getDate("fechapago")
                    });
                }

                jtAlumnoST.setModel(modelo);
                jtAlumnoST.removeColumn(jtAlumnoST.getColumnModel().getColumn(0));

                jtAlumnoST.setDefaultRenderer(ImageIcon.class, new DefaultTableCellRenderer() {

                    @Override
                    protected void setValue(Object value) {
                        setIcon((value instanceof ImageIcon) ? (ImageIcon) value : null);
                        setText("");
                        setHorizontalAlignment(JLabel.CENTER);
                        setVerticalAlignment(JLabel.CENTER);
                    }
                });

                jtAlumnoST.getColumnModel().getColumn(4).setPreferredWidth(LABEL_WIDTH + 10);
                jtAlumnoST.getColumnModel().getColumn(4).setMaxWidth(LABEL_WIDTH + 20);
                jtAlumnoST.setRowHeight(LABEL_HEIGHT + 10);
            }
        } catch (Exception e) {
            System.out.println("Error buscador");
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
    
    private void filtroDia(){
        try(Connection con = Conexion.CDB();
                PreparedStatement ps = con.prepareStatement("SELECT * FROM alumnost WHERE EXTRACT(DAY FROM fechapago) = ? ORDER BY idalumno DESC")) {
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

                modelo.setColumnIdentifiers(new String[]{"id","Nombre", "Apellido P", "Apellido M", "Teléfono", "Foto", "Fecha inscripción"}); 
                
               int diaSelect = jDFiltrodia.getDay();
               ps.setInt(1, diaSelect);
                
                try(ResultSet rs = ps.executeQuery()){
                        while(rs.next()){
                            byte[] imageData = rs.getBytes("foto");
                            ImageIcon foto = null;

                            if (imageData != null && imageData.length > 0) {
                                Image originalImage = new ImageIcon(imageData).getImage();
                                Image scaledImage = originalImage.getScaledInstance(
                                    LABEL_WIDTH, 
                                    LABEL_HEIGHT, 
                                    Image.SCALE_SMOOTH
                                );
                                foto = new ImageIcon(scaledImage);
                            }

                            modelo.addRow(new Object[]{
                                rs.getInt("idalumno"),
                                rs.getString("nombre"),
                                rs.getString("apellidop"),
                                rs.getString("apellidom"),
                                rs.getString("telefono"),
                                foto,
                                rs.getDate("fechapago")
                            });
                        }
                }   
                jtAlumnoST.setModel(modelo);
                jtAlumnoST.removeColumn(jtAlumnoST.getColumnModel().getColumn(0));

                jtAlumnoST.setDefaultRenderer(ImageIcon.class, new DefaultTableCellRenderer() {

                    @Override
                    protected void setValue(Object value) {
                        setIcon((value instanceof ImageIcon) ? (ImageIcon) value : null);
                        setText("");
                        setHorizontalAlignment(JLabel.CENTER);
                        setVerticalAlignment(JLabel.CENTER);
                    }
                });

                jtAlumnoST.getColumnModel().getColumn(4).setPreferredWidth(LABEL_WIDTH + 10);
                jtAlumnoST.getColumnModel().getColumn(4).setMaxWidth(LABEL_WIDTH + 20);
                jtAlumnoST.setRowHeight(LABEL_HEIGHT + 10);
            
            
        } catch (Exception e) {
            System.out.println("Error filtro dia");
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

            String timestamp = new java.text.SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
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
    private javax.swing.JButton btnGuardarA;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRecargar;
    private com.toedter.calendar.JDayChooser jDFiltrodia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jtAlumnoST;
    private javax.swing.JLabel lblAlumTutor;
    private javax.swing.JLabel lblApellidoM;
    private javax.swing.JLabel lblApellidop;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblFechaHora;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblNA;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSFoto;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblTelef;
    private javax.swing.JPanel panelA;
    private javax.swing.JTextField txtApellidoMA;
    private javax.swing.JTextField txtApellidoPA;
    private javax.swing.JTextField txtBuscar;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtNombreA;
    private javax.swing.JTextField txtTelefonoA;
    // End of variables declaration//GEN-END:variables
}