
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
import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.applet.AudioClip;
import java.awt.Component;
import java.awt.Dimension;
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
public class AlumnoTutor extends javax.swing.JFrame {
    DefaultTableModel  modelo = new DefaultTableModel();
    private String usuarioActual;
    private String rolU;
    private Timer timerReloj;
    
    public AlumnoTutor(String usuario,String rol) {
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
    if (jtAlumnoT != null) {
        jtAlumnoT.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
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
    
    FileInputStream fis;
    int longitudBytes;
    AudioClip sonido;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNombreT = new javax.swing.JTextField();
        txtApellidopT = new javax.swing.JTextField();
        txtApellidoMT = new javax.swing.JTextField();
        txtTelefonoT = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        lblAlumST = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAlumnoT = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        lblReloj = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreA = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellidoPA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellidoMA = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefonoA = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDate = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        btnGuardarA = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblFoto = new javax.swing.JLabel();
        btnFoto = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        btnRecargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(71, 153, 252));
        jPanel1.setPreferredSize(new java.awt.Dimension(1550, 934));

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
        jLabel12.setText("Tutor");

        txtNombreT.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNombreT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNombreT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreTKeyTyped(evt);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellidoMT, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(txtTelefonoT)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreT)
                            .addComponent(txtApellidopT))))
                .addGap(26, 26, 26))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNombreT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(13, Short.MAX_VALUE))
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

        lblAlumST.setBackground(new java.awt.Color(71, 153, 252));
        lblAlumST.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblAlumST.setForeground(new java.awt.Color(255, 255, 255));
        lblAlumST.setText("   Alumnos sin tutor");
        lblAlumST.setOpaque(true);
        lblAlumST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAlumSTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAlumSTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAlumSTMouseExited(evt);
            }
        });
        jPanel4.add(lblAlumST, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 180, 100));
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
        jPanel4.add(lblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 0, 180, 100));

        jPanel5.setBackground(new java.awt.Color(196, 36, 4));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtAlumnoT.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jtAlumnoT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "IdAl", "Nombrea", "Apellidopa", "Apellidoma", "Telefonoa", "Foto", "Fecha inscripción", "IdT", "Nombre", "ApellidoP", "ApellidoM", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtAlumnoT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtAlumnoTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtAlumnoT);
        if (jtAlumnoT.getColumnModel().getColumnCount() > 0) {
            jtAlumnoT.getColumnModel().getColumn(0).setResizable(false);
            jtAlumnoT.getColumnModel().getColumn(1).setResizable(false);
            jtAlumnoT.getColumnModel().getColumn(2).setResizable(false);
            jtAlumnoT.getColumnModel().getColumn(3).setResizable(false);
            jtAlumnoT.getColumnModel().getColumn(4).setResizable(false);
            jtAlumnoT.getColumnModel().getColumn(5).setResizable(false);
            jtAlumnoT.getColumnModel().getColumn(6).setResizable(false);
            jtAlumnoT.getColumnModel().getColumn(7).setResizable(false);
            jtAlumnoT.getColumnModel().getColumn(8).setResizable(false);
            jtAlumnoT.getColumnModel().getColumn(9).setResizable(false);
            jtAlumnoT.getColumnModel().getColumn(10).setResizable(false);
            jtAlumnoT.getColumnModel().getColumn(11).setResizable(false);
        }

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Alumno");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Tutor");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Buscar alumno:");

        txtBuscar.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(0, 0, 0));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        lblReloj.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblReloj.setForeground(new java.awt.Color(255, 255, 255));
        lblReloj.setText("jLabel16");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblReloj, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addGap(270, 270, 270))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(lblReloj))
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(196, 36, 4));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo alumno");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        txtNombreA.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNombreA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNombreA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreAKeyTyped(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido paterno:");

        txtApellidoPA.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtApellidoPA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtApellidoPA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoPAKeyTyped(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellido materno:");

        txtApellidoMA.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtApellidoMA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtApellidoMA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoMAKeyTyped(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefóno:");

        txtTelefonoA.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtTelefonoA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTelefonoA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoAKeyTyped(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha inscipción:");

        txtDate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Foto:");

        btnGuardarA.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardarA.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnGuardarA.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardarA.setText("Guardar");
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

        jDayChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDayChooser1PropertyChange(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtApellidoMA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(txtApellidoPA, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreA, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefonoA))
                .addGap(72, 72, 72))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFoto))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRecargar))
                            .addComponent(btnEditar)
                            .addComponent(btnGuardarA)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jDayChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidoPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellidoMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefonoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnFoto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnGuardarA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiar)
                            .addComponent(btnRecargar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDayChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1028, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnGuardarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAActionPerformed
        int idtutor = 0;

        if("".equals(txtNombreT.getText())|| "".equals(txtApellidopT.getText()) || "".equals(txtTelefonoT.getText()) ||
                "".equals(txtNombreA.getText()) || "".equals(txtApellidoPA.getText())
            || "".equals(txtApellidoMA.getText()) || txtDate.getDate() == null || lblFoto.getIcon() == null || txtTelefonoT.getText().length() <  10){
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error.wav"));
                sonido.play();
                JOptionPane.showMessageDialog(null, "No dejes campos vacíos o incompletos","CAMPOS VACÍOS O ICOMPLETOS", JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/advertencia.png", 40, 40));
                
        } else {
            try (Connection con = Conexion.CDB();
                    PreparedStatement ps = con.prepareStatement("SELECT COUNT(*) FROM AlumnoT WHERE nombrea = ? AND apellidopa = ? AND apellidoma = ? AND telefonoa = ? AND nombre = ? AND apellidop = ? AND apellidom = ? AND telefono = ?");                   
                   PreparedStatement pst = con.prepareStatement("INSERT INTO Tutor(Nombre,Apellidop,ApellidoM,Telefono) VALUES (?,?,?,?)",PreparedStatement.RETURN_GENERATED_KEYS);
                    PreparedStatement psa = con.prepareStatement("INSERT INTO Alumno(Nombre,ApellidoP,ApellidoM,telefono,foto,fechapago,idtutorfk)VALUES(?,?,?,?,?,?,?)");
                    PreparedStatement setvar = con.prepareStatement("SET app.usuario_rol  TO "+this.usuarioActual+" ");){
           
                ps.setString(1, txtNombreA.getText());
                ps.setString(2, txtApellidoPA.getText());
                ps.setString(3, txtApellidoMA.getText());
                ps.setString(4, txtTelefonoA.getText());
                ps.setString(5, txtNombreT.getText());
                ps.setString(6, txtApellidopT.getText());
                ps.setString(7, txtApellidoMT.getText());
                ps.setString(8, txtTelefonoT.getText());
                
                 try(ResultSet  rs = ps.executeQuery();){
                        if(rs.next() && rs.getInt(1) > 0){
                             sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error.wav"));
                             sonido.play();
                             JOptionPane.showMessageDialog(null, "Estos datos ya existen",
                                     "DATOS DUPLICADOS", JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/advertencia.png", 40, 40)); 
                        }else{ 

                            setvar.execute();

                            pst.setString(1, txtNombreT.getText());
                            pst.setString(2, txtApellidopT.getText());
                            pst.setString(3, txtApellidoMT.getText());
                            pst.setString(4, txtTelefonoT.getText());
                            pst.executeUpdate();

                            try(var generatedKeys = pst.getGeneratedKeys()){
                                if(generatedKeys.next()){
                                    idtutor = generatedKeys.getInt(1);
                                }else{
                                    throw new SQLException("No se pudo obtener el id");
                                }
                            }

                            java.util.Date selectedDate = txtDate.getDate();
                            java.sql.Date sqlDate = new java.sql.Date(selectedDate.getTime());

                            psa.setString(1, txtNombreA.getText());
                            psa.setString(2, txtApellidoPA.getText());
                            psa.setString(3, txtApellidoMA.getText());
                            psa.setString(4, txtTelefonoA.getText());
                            psa.setBinaryStream(5, fis, longitudBytes);
                            psa.setDate(6, sqlDate);
                            psa.setInt(7, idtutor);
                            psa.executeUpdate();

                            limpiarDatos();

                            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/saved.wav"));
                            sonido.play();

                            JOptionPane.showMessageDialog(null, "Datos guardados correctamente",
                                "Alumno guardado",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/comprobado.png", 40, 40));

                            cargarDatosTabla();
                        }
                 }   
                } catch (Exception e) {
                    System.out.println("Error:" + e);
                    e.printStackTrace();
                }
            } 
    }//GEN-LAST:event_btnGuardarAActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        CallableStatement ps = null;
        FileInputStream fis = null;
        int longitudBytes = 0;
        
    if("".equals(txtNombreT.getText())|| "".equals(txtApellidopT.getText()) || "".equals(txtTelefonoT.getText()) ||
                   "".equals(txtNombreA.getText()) || "".equals(txtApellidoPA.getText())
               || "".equals(txtApellidoMA.getText()) || txtDate.getDate() == null || lblFoto.getIcon() == null 
                || txtTelefonoT.getText().length() <  10){
               sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error.wav"));
                sonido.play();
               JOptionPane.showMessageDialog(null, "No dejes campos vacíos o incompletos","CAMPOS VACÍOS O ICOMPLETOS", JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/advertencia.png", 40, 40));
           } else {
            try (Connection con = Conexion.CDB();
                    PreparedStatement setvar = con.prepareStatement("SET app.usuario_rol  TO "+this.usuarioActual+" ");) {

                java.util.Date selectedDate = txtDate.getDate();
                java.sql.Date sqlDate = new java.sql.Date(selectedDate.getTime());

                int fila = jtAlumnoT.getSelectedRow();
                int idtutor = (int) jtAlumnoT.getModel().getValueAt(fila, 7);

                String sql;

                if(fis != null){
                     
                     setvar.execute();
                     
                    sql = "SELECT UpdateTutorAlumno(?,?,?,?,?,?,?,?,?,?,?)";
                    ps = con.prepareCall(sql);

                    ps.setInt(1, idtutor);
                    ps.setString(2, txtNombreT.getText());
                    ps.setString(3, txtApellidopT.getText());
                    ps.setString(4, txtApellidoMT.getText());
                    ps.setString(5, txtTelefonoT.getText());
                    ps.setString(6, txtNombreA.getText());
                    ps.setString(7, txtApellidoPA.getText());
                    ps.setString(8, txtApellidoMA.getText());
                    ps.setString(9, txtTelefonoA.getText());
                    ps.setBinaryStream(10, fis, longitudBytes);
                    ps.setDate(11, sqlDate);
                    ps.execute();

                    JOptionPane.showMessageDialog(null, "Datos actualizados correctamente",
                    "DATOS ACTUALIZADOS",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/comprobado.png", 40, 40));

                }else{
                    setvar.execute();
                    
                    sql = "SELECT DeleteTutorAlumnoFoto(?,?,?,?,?,?,?,?,?,?)";
                    ps = con.prepareCall(sql);

                    ps.setInt(1, idtutor);
                    ps.setString(2, txtNombreT.getText());
                    ps.setString(3, txtApellidopT.getText());
                    ps.setString(4, txtApellidoMT.getText());
                    ps.setString(5, txtTelefonoT.getText());
                    ps.setString(6, txtNombreA.getText());
                    ps.setString(7, txtApellidoPA.getText());
                    ps.setString(8, txtApellidoMA.getText());
                    ps.setString(9, txtTelefonoA.getText());
                    ps.setDate(10, sqlDate);
                    ps.execute();
                    
                    sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/saved.wav"));
                    sonido.play();
                    
                    JOptionPane.showMessageDialog(null, "Datos actualizados correctamente",
                    "DATOS ACTUALIZADOS",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/comprobado.png", 40, 40));

                }

                    limpiarDatos() ;

                cargarDatosTabla();
            } catch (Exception e) {
                System.out.println("Error al actualizar datos:" + e);
                e.printStackTrace();
            }
    }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         int resultado = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el alumno?",
            "¿Eliminar alumno?",JOptionPane.YES_NO_OPTION);
        
        if("".equals(txtNombreT.getText())|| "".equals(txtApellidopT.getText()) || "".equals(txtTelefonoT.getText()) ||
                "".equals(txtNombreA.getText()) || "".equals(txtApellidoPA.getText())
            || "".equals(txtApellidoMA.getText()) 
            || txtDate.getDate() == null || lblFoto.getIcon() == null){
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error.wav"));
                sonido.play();
                JOptionPane.showMessageDialog(null, "Selecciona un alumno para eliminar","CAMPOS VACÍOS",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/advertencia.png", 40, 40));
        } else {
        
            if(resultado == 0){
                try (Connection con = Conexion.CDB();
                        PreparedStatement setvar = con.prepareStatement("SET app.usuario_rol  TO "+this.usuarioActual+" ");
                        PreparedStatement ps = con.prepareStatement("SELECT DeleteTutorAlumno(?)")){

                    int Fila = jtAlumnoT.getSelectedRow();
                    int idalumno = (int) jtAlumnoT.getModel().getValueAt(Fila, 7);

                    setvar.execute();

                    ps.setInt(1, idalumno);
                    ps.execute();

                    modelo.removeRow(Fila);

                    limpiarDatos();
                        
                    sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/saved.wav"));
                    sonido.play();

                    JOptionPane.showMessageDialog(null, "Alumno eliminado correctamente",
                        "ALUMNO ELIMINADO",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/comprobado.png", 40, 40));


                } catch (Exception e) {
                    System.out.println("Error al eliminar:" + e);
                }
            }else{
                limpiarDatos();
            }
       }
    }//GEN-LAST:event_btnEliminarActionPerformed

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

    private void lblAlumSTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlumSTMouseClicked
        this.dispose();
        Alumnos al = new Alumnos(usuarioActual, rolU);
        al.setVisible(true);
    }//GEN-LAST:event_lblAlumSTMouseClicked

    private void lblAlumSTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlumSTMouseEntered
        lblAlumST.setBackground(Color.WHITE);
        lblAlumST.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblAlumSTMouseEntered

    private void lblAlumSTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlumSTMouseExited
        lblAlumST.setBackground(new Color(71, 153, 252));
        lblAlumST.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblAlumSTMouseExited

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

    private void jtAlumnoTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAlumnoTMouseClicked
        int fila = jtAlumnoT.getSelectedRow();
        if(fila >= 0){
            int idalumno = (int) jtAlumnoT.getModel().getValueAt(fila, 0);
            cargarDatosAlumno(idalumno);
        }
    }//GEN-LAST:event_jtAlumnoTMouseClicked

    private void btnFotoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFotoMouseEntered
        btnFoto.setBackground(Color.YELLOW);
    }//GEN-LAST:event_btnFotoMouseEntered

    private void btnFotoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFotoMouseExited
        btnFoto.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnFotoMouseExited

    private void btnGuardarAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarAMouseEntered
        btnGuardarA.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnGuardarAMouseEntered

    private void btnGuardarAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarAMouseExited
       btnGuardarA.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnGuardarAMouseExited

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
        btnEliminar.setBackground(Color.white);
    }//GEN-LAST:event_btnEliminarMouseExited

    private void txtNombreTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreTKeyTyped
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
    }//GEN-LAST:event_txtNombreTKeyTyped

    private void txtApellidopTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidopTKeyTyped
        if(!(Character.isLetter(evt.getKeyChar())) && !(evt.getKeyChar() == KeyEvent.VK_SPACE) ){
            evt.consume();
        }
        
        JTextField txtname = (JTextField)evt.getComponent();
        String texto = txtname.getText();
        
        if(texto.length() > 0){
            char primero = texto.charAt(0);
            texto = Character.toUpperCase(primero) + texto.substring(1, texto.length());
            txtname.setText(texto);
        }
    }//GEN-LAST:event_txtApellidopTKeyTyped

    private void txtApellidoMTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMTKeyTyped
         if(!(Character.isLetter(evt.getKeyChar())) && !(evt.getKeyChar() == KeyEvent.VK_SPACE) ){
            evt.consume();
        }
         
         JTextField txtname = (JTextField)evt.getComponent();
        String texto = txtname.getText();
        
        if(texto.length() > 0){
            char primero = texto.charAt(0);
            texto = Character.toUpperCase(primero) + texto.substring(1, texto.length());
            txtname.setText(texto);
        }
    }//GEN-LAST:event_txtApellidoMTKeyTyped

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

    private void jDayChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDayChooser1PropertyChange
        filtroDia();
    }//GEN-LAST:event_jDayChooser1PropertyChange

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed
       cargarDatosTabla();
    }//GEN-LAST:event_btnRecargarActionPerformed
    
    private void iniciarReloj(){
        timerReloj = new Timer(1000, (e) -> {
            DateFormat hora = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
            String hora2 = hora.format(new java.util.Date()).toString();
                    lblReloj.setText(hora2);
        });
        timerReloj.start();
    }
    
    private void configPermisos(){
        switch(rolU){
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
        txtNombreT.setText("");
        txtApellidopT.setText("");
        txtApellidoMT.setText("");
        txtTelefonoT.setText("");
        lblFoto.setIcon(null);
        txtNombreA.setText("");
         txtApellidoPA.setText("");
         txtApellidoMA.setText("");
         txtTelefonoA.setText("");
         txtDate.setDate(null);
    }
    
    private void cargarDatosTabla() {       
        try (Connection con = Conexion.CDB();
                PreparedStatement ps = con.prepareStatement("SELECT * FROM Alumnot ORDER BY idalumno DESC");
                ResultSet rs = ps.executeQuery();) {
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

            modelo.setColumnIdentifiers(new String[]{"Ida","Nombre", "Apellido P", "Apellido M", "Telefóno", "Foto", "Fecha ins.","IdT","Nombre","Apellidop","Apellidom","Telefóno tutor"});

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
                    rs.getString("nombrea"),
                    rs.getString("apellidopa"),
                    rs.getString("apellidoma"),
                    rs.getString("telefonoa"),
                    foto,
                    rs.getDate("fechapago"),
                    rs.getInt("idtutor"),
                    rs.getString("nombre"),
                    rs.getString("apellidop"),
                    rs.getString("apellidom"),
                    rs.getString("telefono")
                });
            }

            jtAlumnoT.setModel(modelo);
            jtAlumnoT.removeColumn(jtAlumnoT.getColumnModel().getColumn(0));
            jtAlumnoT.removeColumn(jtAlumnoT.getColumnModel().getColumn(6));
            
            jtAlumnoT.setDefaultRenderer(ImageIcon.class, new DefaultTableCellRenderer() {
                @Override
                protected void setValue(Object value) {
                    setIcon((value instanceof ImageIcon) ? (ImageIcon) value : null);
                    setText("");
                    setHorizontalAlignment(JLabel.CENTER);
                    setVerticalAlignment(JLabel.CENTER);
                }
            });

            jtAlumnoT.getColumnModel().getColumn(4).setPreferredWidth(LABEL_WIDTH + 10);
            jtAlumnoT.getColumnModel().getColumn(4).setMaxWidth(LABEL_WIDTH + 20);
            jtAlumnoT.setRowHeight(LABEL_HEIGHT + 10);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al cargar datos: " + e.getMessage());
        }
    }
    
    private void cargarDatosAlumno(int idalumno){
        try (Connection con = Conexion.CDB();
                PreparedStatement ps = con.prepareStatement("SELECT * FROM AlumnoT WHERE idalumno = ?");
                ) {
            ps.setInt(1, idalumno);
            
            try(ResultSet rs = ps.executeQuery()){
                    if(rs.next()){
                        String nombrea = rs.getString(2);
                        String apellidopa = rs.getString(3);
                        String apellidoma = rs.getString(4);
                        String telefonoa = rs.getString(5);
                        InputStream is = rs.getBinaryStream(6);
                        Date fecha = rs.getDate(7);
                        String nombret = rs.getString(9);
                        String apellidop = rs.getString(10);
                        String apellidom = rs.getString(11);
                        String telefonot = rs.getString(12);

                        if(is != null){
                            BufferedImage bi = ImageIO.read(is);
                            ImageIcon foto = new ImageIcon(bi);
                            Image img = foto.getImage();
                            Image newimg = img.getScaledInstance(160, 166, Image.SCALE_SMOOTH);
                            ImageIcon newicon = new ImageIcon(newimg);
                            lblFoto.setIcon(newicon);
                        }

                        txtNombreA.setText(nombrea != null ? nombrea : "");
                        txtApellidoPA.setText(apellidopa != null ? apellidopa : "");
                        txtApellidoMA.setText(apellidoma != null ? apellidoma : "");
                        txtTelefonoA.setText(telefonoa != null ? telefonoa : "");

                        if(fecha != null){
                            txtDate.setDate(fecha);
                        }

                        txtNombreT.setText(nombret != null ? nombret : "");
                        txtApellidopT.setText(apellidop != null ? apellidop : "");
                        txtApellidoMT.setText(apellidom != null ? apellidom : "");
                        txtTelefonoT.setText(telefonot != null ? telefonot : "");
                    }
            }   
            
        } catch (Exception e) {
            System.out.println("Error al cargar los datos: " + e);
            e.printStackTrace();
        }
    }
    
    private void buscarDatos(String valor) {
        try (Connection con = Conexion.CDB();
                PreparedStatement ps = con.prepareStatement("SELECT * FROM Alumnot WHERE Nombrea LIKE '%"+valor+"%'  OR apellidopa LIKE '%"+valor+"%'  OR apellidoma LIKE '%"+valor+"%' OR CONCAT(Nombrea, ' ', apellidopa, ' ', apellidoma) LIKE '%"+valor+"%'  OR CONCAT(apellidopa, ' ', apellidoma) LIKE '%"+valor+"%'  OR telefonoa LIKE '%"+valor+"%' "
                    + "OR nombre LIKE '%"+valor+"%'  OR apellidop LIKE '%"+valor+"%' OR apellidom LIKE '%"+valor+"%' OR CONCAT(Nombre, ' ', apellidop, ' ', apellidom) LIKE '%"+valor+"%' OR CONCAT(apellidop, ' ', apellidom) LIKE '%"+valor+"%'  OR telefono LIKE '%"+valor+"%' ORDER BY idalumno DESC  ");
              ResultSet rs = ps.executeQuery() ){
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

            modelo.setColumnIdentifiers(new String[]{"Ida","Nombre", "Apellido P", "Apellido M", "Telefóno", "Foto", "Fecha ins.","IdT","Nombre","Apellidop","Apellidom","Telefóno tutor"});

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
                    rs.getString("nombrea"),
                    rs.getString("apellidopa"),
                    rs.getString("apellidoma"),
                    rs.getString("telefonoa"),
                    foto,
                    rs.getDate("fechapago"),
                    rs.getInt("idtutor"),
                    rs.getString("nombre"),
                    rs.getString("apellidop"),
                    rs.getString("apellidom"),
                    rs.getString("telefono")
                });
            }

            jtAlumnoT.setModel(modelo);
            jtAlumnoT.removeColumn(jtAlumnoT.getColumnModel().getColumn(0));
            jtAlumnoT.removeColumn(jtAlumnoT.getColumnModel().getColumn(6));
            
            jtAlumnoT.setDefaultRenderer(ImageIcon.class, new DefaultTableCellRenderer() {
                @Override
                protected void setValue(Object value) {
                    setIcon((value instanceof ImageIcon) ? (ImageIcon) value : null);
                    setText("");
                    setHorizontalAlignment(JLabel.CENTER);
                    setVerticalAlignment(JLabel.CENTER);
                }
            });

            jtAlumnoT.getColumnModel().getColumn(4).setPreferredWidth(LABEL_WIDTH + 10);
            jtAlumnoT.getColumnModel().getColumn(4).setMaxWidth(LABEL_WIDTH + 20);
            jtAlumnoT.setRowHeight(LABEL_HEIGHT + 10);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al cargar datos: " + e.getMessage());
        }
    }
    
    private void filtroDia(){
        try (Connection con = Conexion.CDB();
                PreparedStatement ps = con.prepareStatement("SELECT * FROM alumnot WHERE EXTRACT(DAY FROM fechapago) = ? ORDER BY idalumno DESC")) {
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

            modelo.setColumnIdentifiers(new String[]{"Ida","Nombre", "Apellido P", "Apellido M", "Telefóno", "Foto", "Fecha ins.","IdT","Nombre","Apellidop","Apellidom","Telefóno tutor"});
            
            int diaSelect = jDayChooser1.getDay();
            ps.setInt(1, diaSelect);
            
            try(ResultSet rs = ps.executeQuery()){
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
                            rs.getString("nombrea"),
                            rs.getString("apellidopa"),
                            rs.getString("apellidoma"),
                            rs.getString("telefonoa"),
                            foto,
                            rs.getDate("fechapago"),
                            rs.getInt("idtutor"),
                            rs.getString("nombre"),
                            rs.getString("apellidop"),
                            rs.getString("apellidom"),
                            rs.getString("telefono")
                        });
                    }
            }  

            jtAlumnoT.setModel(modelo);
            jtAlumnoT.removeColumn(jtAlumnoT.getColumnModel().getColumn(0));
            jtAlumnoT.removeColumn(jtAlumnoT.getColumnModel().getColumn(6));
            
            jtAlumnoT.setDefaultRenderer(ImageIcon.class, new DefaultTableCellRenderer() {
                @Override
                protected void setValue(Object value) {
                    setIcon((value instanceof ImageIcon) ? (ImageIcon) value : null);
                    setText("");
                    setHorizontalAlignment(JLabel.CENTER);
                    setVerticalAlignment(JLabel.CENTER);
                }
            });

            jtAlumnoT.getColumnModel().getColumn(4).setPreferredWidth(LABEL_WIDTH + 10);
            jtAlumnoT.getColumnModel().getColumn(4).setMaxWidth(LABEL_WIDTH + 20);
            jtAlumnoT.setRowHeight(LABEL_HEIGHT + 10);
        } catch (Exception e) {
            System.out.println("Error filtro día");
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
    private javax.swing.JButton btnGuardarA;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRecargar;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtAlumnoT;
    private javax.swing.JLabel lblAlumST;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JTextField txtApellidoMA;
    private javax.swing.JTextField txtApellidoMT;
    private javax.swing.JTextField txtApellidoPA;
    private javax.swing.JTextField txtApellidopT;
    private javax.swing.JTextField txtBuscar;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtNombreA;
    private javax.swing.JTextField txtNombreT;
    private javax.swing.JTextField txtTelefonoA;
    private javax.swing.JTextField txtTelefonoT;
    // End of variables declaration//GEN-END:variables
}