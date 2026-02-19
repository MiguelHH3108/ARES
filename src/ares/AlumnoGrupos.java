
package ares;
import java.awt.Color;
import java.awt.Image;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.applet.AudioClip;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import javax.swing.Timer;

/**
 *
 * @author herna
 */
public class AlumnoGrupos extends javax.swing.JFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultComboBoxModel cbo1 = new DefaultComboBoxModel();
    private String usuarioActual;
    private String rolU;
    private Timer timerReloj;

    public AlumnoGrupos(String usuario,String rol) {
        this.usuarioActual = usuario;
        this.rolU = rol;
        
        initComponents();
        configPermisos();
        
        iniciarReloj();
        
         setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoAres.jpg")).getImage());
        
         ajusteRapidoNetbeans();
         
         this.setExtendedState(this.MAXIMIZED_BOTH);
        
        setImageLabel(lblImagen, "/Imagenes/Ares letras.jpg");
        
        cargarSAlumno();
        cargarSGrupo();
        cargarSGrupos();
        
        cargarAlumno();
        cargarGrupo();
        filtroGrupo();
    }

    private void ajusteRapidoNetbeans() {
    if (jtGrupos != null) {
        jtGrupos.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
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
        jPanel4 = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        lblCgrupos = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcbAlumno = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jcbGrupo = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jcbFiltro = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtGrupos = new javax.swing.JTable();
        lblReloj = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();

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

        lblCgrupos.setBackground(new java.awt.Color(71, 153, 252));
        lblCgrupos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCgrupos.setForeground(new java.awt.Color(255, 255, 255));
        lblCgrupos.setText("       Crear grupos");
        lblCgrupos.setOpaque(true);
        lblCgrupos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCgruposMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCgruposMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCgruposMouseExited(evt);
            }
        });
        jPanel4.add(lblCgrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 180, 100));
        jPanel4.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 0, 850, 100));

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

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agregar alumno:");

        jcbAlumno.setBackground(new java.awt.Color(255, 255, 255));
        jcbAlumno.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jcbAlumno.setForeground(new java.awt.Color(0, 0, 0));
        jcbAlumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alumno" }));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Al grupo:");

        jcbGrupo.setBackground(new java.awt.Color(255, 255, 255));
        jcbGrupo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jcbGrupo.setForeground(new java.awt.Color(0, 0, 0));
        jcbGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grupo" }));

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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(108, 108, 108))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(196, 36, 4));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Grupos");

        jcbFiltro.setBackground(new java.awt.Color(255, 255, 255));
        jcbFiltro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jcbFiltro.setForeground(new java.awt.Color(0, 0, 0));
        jcbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtro" }));
        jcbFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbFiltroActionPerformed(evt);
            }
        });

        jtGrupos.setBackground(new java.awt.Color(255, 255, 255));
        jtGrupos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtGrupos.setForeground(new java.awt.Color(0, 0, 0));
        jtGrupos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "idg", "idcg", "Grupo", "Días", "Horario", "Idalu", "Nombre", "Apellido P", "Apellido M"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jtGrupos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtGruposMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtGrupos);
        if (jtGrupos.getColumnModel().getColumnCount() > 0) {
            jtGrupos.getColumnModel().getColumn(0).setResizable(false);
            jtGrupos.getColumnModel().getColumn(1).setResizable(false);
            jtGrupos.getColumnModel().getColumn(2).setResizable(false);
            jtGrupos.getColumnModel().getColumn(3).setResizable(false);
            jtGrupos.getColumnModel().getColumn(4).setResizable(false);
            jtGrupos.getColumnModel().getColumn(5).setResizable(false);
            jtGrupos.getColumnModel().getColumn(6).setResizable(false);
            jtGrupos.getColumnModel().getColumn(7).setResizable(false);
            jtGrupos.getColumnModel().getColumn(8).setResizable(false);
        }

        lblReloj.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblReloj.setForeground(new java.awt.Color(255, 255, 255));
        lblReloj.setText("jLabel4");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(459, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(449, 449, 449))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jcbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReloj))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        lblFoto.setBackground(new java.awt.Color(255, 255, 255));
        lblFoto.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 138, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        this.dispose();
        System.gc();
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

    private void lblCgruposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCgruposMouseClicked
       this.dispose();
        Grupos g = new Grupos(usuarioActual, rolU);
        g.setVisible(true);
    }//GEN-LAST:event_lblCgruposMouseClicked

    private void lblCgruposMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCgruposMouseEntered
        lblCgrupos.setBackground(Color.WHITE);
        lblCgrupos.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblCgruposMouseEntered

    private void lblCgruposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCgruposMouseExited
        lblCgrupos.setBackground(new Color(71, 153, 252));
        lblCgrupos.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblCgruposMouseExited

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

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        btnGuardar.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        btnGuardar.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(jcbAlumno.getSelectedIndex() == 0 || jcbGrupo.getSelectedIndex() == 0){
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error.wav"));
             sonido.play();
            JOptionPane.showMessageDialog(null, "No dejes campos vacíos","CAMPOS VACÍOS",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/advertencia.png", 40, 40));
        }else{ 
                try (Connection con = Conexion.CDB(); 
                        PreparedStatement psv = con.prepareStatement("SELECT COUNT(*) FROM grupos WHERE alumnofk = ? AND cgrupofk = ?");
                        PreparedStatement ps = con.prepareStatement("INSERT INTO Grupos(alumnofk,cgrupofk)VALUES(?,?)");
                        PreparedStatement setvars = con.prepareStatement("SET app.usuario_rol  TO '"+this.usuarioActual+"'  ")){
                    
                            String alumnoselec = jcbAlumno.getSelectedItem().toString();
                            int idalumno = rolMapA.get(alumnoselec);

                            String gruposelect = jcbGrupo.getSelectedItem().toString();
                            int idgrupo = rolMapA.get(gruposelect);
                            
                            psv.setInt(1, idalumno);
                            psv.setInt(2, idgrupo);

                   try(ResultSet rs = psv.executeQuery()){     
                       if(rs.next() && rs.getInt(1) > 0){
                            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error.wav"));
                             sonido.play();
                             JOptionPane.showMessageDialog(null, "Estos datos ya existen",
                                     "DATOS DUPLICADOS", JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/advertencia.png", 40, 40)); 
                       }else{     
                             setvars.execute();

                            ps.setInt(1, idalumno);
                            ps.setInt(2,idgrupo);
                            ps.execute();

                            limpiarDatos();

                            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/saved.wav"));
                            sonido.play();

                            JOptionPane.showMessageDialog(null, "Datos guardados correctamente",
                                "Alumno agregado a grupo",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/comprobado.png", 40, 40));

                            filtroGrupo();
                       }    
                   }
                } catch (Exception e) {
                    System.out.println("Error alumno:" + e);
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
        if(jcbAlumno.getSelectedIndex() == 0 || jcbGrupo.getSelectedIndex() == 0){
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error.wav"));
             sonido.play();
            JOptionPane.showMessageDialog(null, "No dejes campos vacíos","CAMPOS VACÍOS",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/advertencia.png", 40, 40));
        }else{ 
                try (Connection con = Conexion.CDB(); 
                        PreparedStatement ps = con.prepareStatement("UPDATE Grupos SET cgrupofk = ?, alumnofk = ? WHERE idg = ?");
                        PreparedStatement setvars = con.prepareStatement("SET app.usuario_rol  TO '"+this.usuarioActual+"'  ")) {
                    
                    int fila = jtGrupos.getSelectedRow();
                    int idg = (int) jtGrupos.getModel().getValueAt(fila, 0);

                   String alumnoselec = jcbAlumno.getSelectedItem().toString();
                    int idalumno = rolMapA.get(alumnoselec);

                    String gruposelect = jcbGrupo.getSelectedItem().toString();
                    int idgrupo = rolMapA.get(gruposelect);

                     setvars.execute();

                    ps.setInt(1, idgrupo);
                    ps.setInt(2, idalumno);
                    ps.setInt(3, idg);
                    ps.executeUpdate();

                    limpiarDatos();

                    sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/saved.wav"));
                    sonido.play();

                    JOptionPane.showMessageDialog(null, "Datos actualizados correctamente",
                        "DATOS ACTUALIZADOS",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/comprobado.png", 40, 40));

                    filtroGrupo();

                } catch (Exception e) {
                    System.out.println("Error:" + e);
                    e.printStackTrace();
                }
        }    
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        int resultado = JOptionPane.showConfirmDialog(null, "¿Desea sacar al alumno del grupo",
                "¿Sacar alumno?",JOptionPane.YES_NO_OPTION);
        
        if(jcbAlumno.getSelectedIndex() == 0 || jcbGrupo.getSelectedIndex() == 0){
                sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error.wav"));
             sonido.play();
            JOptionPane.showMessageDialog(null, "No dejes campos vacíos","CAMPOS VACÍOS",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/advertencia.png", 40, 40));
        }else{ 
        
            if(resultado == 0){
                try  (Connection con = Conexion.CDB(); 
                        PreparedStatement ps = con.prepareStatement("DELETE FROM Grupos WHERE Idg = ?");
                        PreparedStatement setvars = con.prepareStatement("SET app.usuario_rol  TO '"+this.usuarioActual+"'  ")) {

                    int fila = jtGrupos.getSelectedRow();
                    int idg = (int) jtGrupos.getModel().getValueAt(fila, 0);

                     setvars.execute();

                    ps.setInt(1, idg);
                    ps.execute();

                    modelo.removeRow(fila);

                    limpiarDatos();
                    filtroGrupo();

                    sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/saved.wav"));
                        sonido.play();

                        JOptionPane.showMessageDialog(null, "Alumno elimindado de grupo correctamente",
                                "Alumno eliminado",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/comprobado.png", 40, 40));

                } catch (Exception e) {
                    e.printStackTrace();
                }
        }
       }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setBackground(Color.red);
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnEliminarMouseExited

    private void jtGruposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtGruposMouseClicked
        int fila = jtGrupos.getSelectedRow();
        if(fila >= 0){
            int idg = (int) jtGrupos.getModel().getValueAt(fila, 0);
            cargarGrupos(idg);
        }
    }//GEN-LAST:event_jtGruposMouseClicked

    private void jcbFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbFiltroActionPerformed
        String filtro = (String) jcbFiltro.getSelectedItem();
        cargarNgrupo(filtro);
    }//GEN-LAST:event_jcbFiltroActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarDatos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        btnLimpiar.setBackground(new Color(71,153,252));
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        btnLimpiar.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnLimpiarMouseExited

    private Map<String,Integer> rolMapA = new HashMap<>();
    
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
                    
                break;
                
                case "Usuario2":
                    btnEliminar.setVisible(false);
                    btnEliminar.setEnabled(false);
                break;
        }
    }
    
    public void limpiarDatos(){
        jcbAlumno.setSelectedIndex(0);
        jcbGrupo.setSelectedIndex(0);
    }
    
   private void cargarAlumno() {
    try {
        try (Connection con = Conexion.CDB();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT idalumno,nombre,apellidop,apellidom FROM Alumno")) {
            
            while (rs.next()) {                
                int ida = rs.getInt("idalumno");
                String nombre = rs.getString("nombre");
                String apellidop = rs.getString("apellidop");
                String apellidom = rs.getString("apellidom");

                String nombreCompleto = nombre + " " + apellidop + " " + apellidom;
                rolMapA.put(nombreCompleto, ida);
                jcbAlumno.addItem(nombreCompleto);
            }
            
        } 
        
    } catch (Exception e) {
        System.out.println("Error al encontrar alumno: " + e.getMessage());
        e.printStackTrace();
    }
}
    
    private void cargarSAlumno(){
        AutoCompleteDecorator.decorate(jcbAlumno);
    }
    
    private void cargarGrupo(){
        try (Connection con = Conexion.CDB();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT idcg,nombreg FROM cgrupos")) {
            
            while(rs.next()){
                int idg = rs.getInt("idcg");
                String ngrupo = rs.getString("nombreg");
                
                rolMapA.put(ngrupo, idg);
                jcbGrupo.addItem(ngrupo);
            }

        } catch (Exception e) {
            System.out.println("Error al econtrar grupo:" +e.getMessage());
            e.printStackTrace();
        }
    }
    
    private void cargarSGrupo(){
        AutoCompleteDecorator.decorate(jcbGrupo);
    }
    
    private void cargarGrupos(int idgrupo) {
        try (Connection con = Conexion.CDB();
             PreparedStatement ps = con.prepareStatement("SELECT * FROM GRUPO WHERE idg = ?")) {
            ps.setInt(1, idgrupo);

            try(ResultSet rs = ps.executeQuery() ){
                if(rs.next()) {
                    String alumno = rs.getString("nombre") + " " + rs.getString("apellidop") + " " + rs.getString("apellidom");
                    String grupo = rs.getString("nombreg");

                    seleccionarItemEnComboBox(jcbAlumno, alumno);
                    seleccionarItemEnComboBox(jcbGrupo, grupo);
                }
            }   

        } catch (Exception e) {
            System.out.println("Error al cargar los datos: " + e.getMessage());
            e.printStackTrace();
        } 
    }

private void seleccionarItemEnComboBox(JComboBox<String> comboBox, String valor) {
    for (int i = 0; i < comboBox.getItemCount(); i++) {
        if (comboBox.getItemAt(i).equals(valor)) {
            comboBox.setSelectedIndex(i);
            return;
        }
    }
    comboBox.setSelectedItem(valor);
}
    
    private void filtroGrupo(){
        try (Connection con = Conexion.CDB();
                PreparedStatement ps = con.prepareStatement("select distinct idcg,nombreg from grupo order by nombreg");
                ResultSet rs = ps.executeQuery()) {
            jcbFiltro.removeAllItems();
            jcbFiltro.addItem("Grupo");
            
            while (rs.next()) {                
                jcbFiltro.addItem(rs.getString("nombreg"));
            }

        } catch (Exception e) {
            System.out.println("Error al cargar datos");
            e.printStackTrace();
        }
    }
    
    private void cargarSGrupos(){
        AutoCompleteDecorator.decorate(jcbFiltro);
    }
    
    private void cargarNgrupo(String filtro){
        
        PreparedStatement ps = null;
        
        try (Connection con = Conexion.CDB();){
            InputStream is;
            modelo.setRowCount(0);
            modelo.setColumnIdentifiers(new String[]{"idg","idcg","Grupo","Días","Horario","idalumno","Nombre","Apellido p.","Apellido M."});
            
            String sql;
            if(filtro == null || filtro.equals("Grupos")){
                sql = "SELECT * FROM Grupo";
                ps = con.prepareStatement(sql);
            }else{
                sql = "SELECT * FROM Grupo WHERE nombreg = ?";
                ps = con.prepareStatement(sql);
                ps.setString(1, filtro);
            }
            
         try(ResultSet rs = ps.executeQuery();){   
                while (rs.next()) {                
                    modelo.addRow(new Object[] {
                        rs.getInt("idg"),
                        rs.getInt("idcg"),
                        rs.getString("nombreg"),
                        rs.getString("dias"),
                        rs.getString("horario"),
                        rs.getInt("idalumno"),
                        rs.getString("nombre"),
                        rs.getString("apellidop"),
                        rs.getString("apellidom")
                    });

                    if(filtro != null && !filtro.equals("Grupos")){
                        is = rs.getBinaryStream("fotogrupo");

                        if(is != null){
                            BufferedImage bi = ImageIO.read(is);
                            ImageIcon foto = new ImageIcon(bi);
                            Image img = foto.getImage();
                            Image newimg = img.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
                            ImageIcon newicon = new ImageIcon(newimg);
                            lblFoto.setIcon(newicon);
                        }
                    }
                }
                if(filtro == null || filtro.equals("Grupos")){
                    lblFoto.setIcon(null);
                }
         }      
            
            jtGrupos.setModel(modelo);
            jtGrupos.removeColumn(jtGrupos.getColumnModel().getColumn(0));
            jtGrupos.removeColumn(jtGrupos.getColumnModel().getColumn(0));
            jtGrupos.removeColumn(jtGrupos.getColumnModel().getColumn(3));

        } catch (Exception e) {
            System.out.println("Error:");
            e.printStackTrace();
        }
    }
    
    private void setImageLabel(JLabel labelname, String ruta) {
        try {
            java.net.URL imageURL = getClass().getResource(ruta);
            if (imageURL != null) {
                ImageIcon image = new ImageIcon(imageURL);
                Icon icon = new ImageIcon(
                    image.getImage().getScaledInstance(labelname.getWidth(), labelname.getHeight(), Image.SCALE_DEFAULT));
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
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbAlumno;
    private javax.swing.JComboBox<String> jcbFiltro;
    private javax.swing.JComboBox<String> jcbGrupo;
    private javax.swing.JTable jtGrupos;
    private javax.swing.JLabel lblCgrupos;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JLabel lblSalir;
    // End of variables declaration//GEN-END:variables
}