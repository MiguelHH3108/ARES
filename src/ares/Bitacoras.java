
package ares;
import java.awt.Color;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author herna
 */
public class Bitacoras extends javax.swing.JFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modelot = new DefaultTableModel();
    DefaultTableModel modelcg = new DefaultTableModel();
    DefaultTableModel modelog = new DefaultTableModel();
    DefaultTableModel modeloR = new DefaultTableModel();
    DefaultTableModel modeloC = new DefaultTableModel();
    DefaultTableModel modeloM = new DefaultTableModel();
    DefaultTableModel modeloU = new DefaultTableModel();
    
    private String usuarioActual;
    private String rolU;

    public Bitacoras(String usuario, String rol) {
        this.usuarioActual = usuario;
        this.rolU = rol;
        
        initComponents();
        
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoAres.jpg")).getImage());
        this.setExtendedState(this.MAXIMIZED_BOTH);
        
         setImageLabel(lblImagen, "/Imagenes/Ares letras.jpg");
         
         cargarAlumst();
         cargarAlumT();
         cargarCGrupos();
         cargarGrupos();
         cargarRecibos();
         cargarCitas();
         cargarMaestros();
         cargarCitas();
         cargarUsers();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        lblUsuarios = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jpScroll = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAlumst = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtAlumT = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtCgrupos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtGrupos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtRecibos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jtCitas = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jtUsers = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        jtMaestros = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

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

        lblUsuarios.setBackground(new java.awt.Color(71, 153, 252));
        lblUsuarios.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuarios.setText("            Usuarios");
        lblUsuarios.setOpaque(true);
        lblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblUsuariosMouseExited(evt);
            }
        });
        jPanel4.add(lblUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 180, 100));

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
        jPanel4.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 0, 830, 100));

        jpScroll.setBackground(new java.awt.Color(196, 36, 4));
        jpScroll.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bitacoras alumno con tutor");

        jtAlumst.setBackground(new java.awt.Color(255, 255, 255));
        jtAlumst.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtAlumst.setForeground(new java.awt.Color(0, 0, 0));
        jtAlumst.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Usuario", "Fecha y hora", "Acción", "Detalles"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(jtAlumst);
        if (jtAlumst.getColumnModel().getColumnCount() > 0) {
            jtAlumst.getColumnModel().getColumn(0).setResizable(false);
            jtAlumst.getColumnModel().getColumn(1).setResizable(false);
            jtAlumst.getColumnModel().getColumn(2).setResizable(false);
            jtAlumst.getColumnModel().getColumn(3).setResizable(false);
        }

        jtAlumT.setBackground(new java.awt.Color(255, 255, 255));
        jtAlumT.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtAlumT.setForeground(new java.awt.Color(0, 0, 0));
        jtAlumT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Usuario", "Fecha y hora", "Acción", "Detalles"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane2.setViewportView(jtAlumT);
        if (jtAlumT.getColumnModel().getColumnCount() > 0) {
            jtAlumT.getColumnModel().getColumn(0).setResizable(false);
            jtAlumT.getColumnModel().getColumn(1).setResizable(false);
            jtAlumT.getColumnModel().getColumn(2).setResizable(false);
            jtAlumT.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bitacoras alumno sin tutor");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bitacoras creación de grupos");

        jtCgrupos.setBackground(new java.awt.Color(255, 255, 255));
        jtCgrupos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtCgrupos.setForeground(new java.awt.Color(0, 0, 0));
        jtCgrupos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Usuario", "Fecha", "Acción", "Detalles"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane4.setViewportView(jtCgrupos);
        if (jtCgrupos.getColumnModel().getColumnCount() > 0) {
            jtCgrupos.getColumnModel().getColumn(0).setResizable(false);
            jtCgrupos.getColumnModel().getColumn(1).setResizable(false);
            jtCgrupos.getColumnModel().getColumn(2).setResizable(false);
            jtCgrupos.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bitacora agregar alumnos a grupos");

        jtGrupos.setBackground(new java.awt.Color(255, 255, 255));
        jtGrupos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtGrupos.setForeground(new java.awt.Color(0, 0, 0));
        jtGrupos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Usuario", "Fecha", "Acción", "Detalles"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane5.setViewportView(jtGrupos);
        if (jtGrupos.getColumnModel().getColumnCount() > 0) {
            jtGrupos.getColumnModel().getColumn(0).setResizable(false);
            jtGrupos.getColumnModel().getColumn(1).setResizable(false);
            jtGrupos.getColumnModel().getColumn(2).setResizable(false);
            jtGrupos.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bitacora recibos");

        jtRecibos.setBackground(new java.awt.Color(255, 255, 255));
        jtRecibos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtRecibos.setForeground(new java.awt.Color(0, 0, 0));
        jtRecibos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Usuario", "Fecha", "Acción", "Detalles"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane6.setViewportView(jtRecibos);
        if (jtRecibos.getColumnModel().getColumnCount() > 0) {
            jtRecibos.getColumnModel().getColumn(0).setResizable(false);
            jtRecibos.getColumnModel().getColumn(1).setResizable(false);
            jtRecibos.getColumnModel().getColumn(2).setResizable(false);
            jtRecibos.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Bitacora citas");

        jtCitas.setBackground(new java.awt.Color(255, 255, 255));
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
                "Usuario", "Fecha", "Acción", "Detalles"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane7.setViewportView(jtCitas);
        if (jtCitas.getColumnModel().getColumnCount() > 0) {
            jtCitas.getColumnModel().getColumn(0).setResizable(false);
            jtCitas.getColumnModel().getColumn(1).setResizable(false);
            jtCitas.getColumnModel().getColumn(2).setResizable(false);
            jtCitas.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Bitacora maestros");

        jtUsers.setBackground(new java.awt.Color(255, 255, 255));
        jtUsers.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtUsers.setForeground(new java.awt.Color(0, 0, 0));
        jtUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Usuario", "Fecha", "Acción", "Detalles"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane8.setViewportView(jtUsers);
        if (jtUsers.getColumnModel().getColumnCount() > 0) {
            jtUsers.getColumnModel().getColumn(0).setResizable(false);
            jtUsers.getColumnModel().getColumn(1).setResizable(false);
            jtUsers.getColumnModel().getColumn(2).setResizable(false);
            jtUsers.getColumnModel().getColumn(3).setResizable(false);
        }

        jtMaestros.setBackground(new java.awt.Color(255, 255, 255));
        jtMaestros.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtMaestros.setForeground(new java.awt.Color(0, 0, 0));
        jtMaestros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Usuario", "Fecha", "Acción", "Detalles"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane9.setViewportView(jtMaestros);
        if (jtMaestros.getColumnModel().getColumnCount() > 0) {
            jtMaestros.getColumnModel().getColumn(0).setResizable(false);
            jtMaestros.getColumnModel().getColumn(1).setResizable(false);
            jtMaestros.getColumnModel().getColumn(2).setResizable(false);
            jtMaestros.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Bitacora usuarios:");

        javax.swing.GroupLayout jpScrollLayout = new javax.swing.GroupLayout(jpScroll);
        jpScroll.setLayout(jpScrollLayout);
        jpScrollLayout.setHorizontalGroup(
            jpScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpScrollLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jpScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpScrollLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(630, 630, 630))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpScrollLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(628, 628, 628))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpScrollLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(613, 613, 613))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpScrollLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(555, 555, 555))))
            .addGroup(jpScrollLayout.createSequentialGroup()
                .addGroup(jpScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1503, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1503, Short.MAX_VALUE)
                        .addComponent(jScrollPane4)
                        .addComponent(jScrollPane5)
                        .addGroup(jpScrollLayout.createSequentialGroup()
                            .addGap(661, 661, 661)
                            .addComponent(jLabel5))
                        .addComponent(jScrollPane6)
                        .addGroup(jpScrollLayout.createSequentialGroup()
                            .addGap(675, 675, 675)
                            .addComponent(jLabel6))
                        .addComponent(jScrollPane7)
                        .addGroup(jpScrollLayout.createSequentialGroup()
                            .addGap(651, 651, 651)
                            .addComponent(jLabel7)))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 1503, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpScrollLayout.createSequentialGroup()
                        .addGap(649, 649, 649)
                        .addComponent(jLabel8))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 1503, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jpScrollLayout.setVerticalGroup(
            jpScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpScrollLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(494, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jpScroll);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1530, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 3, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 2387, Short.MAX_VALUE)
                .addContainerGap())
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

    private void lblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuariosMouseClicked
        this.dispose();
        Usuarios u = new Usuarios(usuarioActual, rolU);
        u.setVisible(true);
    }//GEN-LAST:event_lblUsuariosMouseClicked

    private void lblUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuariosMouseEntered
        lblUsuarios.setBackground(Color.WHITE);
        lblUsuarios.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblUsuariosMouseEntered

    private void lblUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuariosMouseExited
        lblUsuarios.setBackground(new Color(71, 153, 252));
        lblUsuarios.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblUsuariosMouseExited

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        int salir = JOptionPane.showConfirmDialog(null, "¿Desea salir del sistema?","¿SALIR?",JOptionPane.YES_NO_OPTION);

        if(salir == 0){
            copiaSQL();
            System.exit(0);
        }else{}
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseEntered
        lblSalir.setBackground(Color.RED);
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

    private void cargarAlumst(){     
        try (Connection con = Conexion.CDB();
                PreparedStatement ps = con.prepareStatement("SELECT * FROM bitast ORDER BY fecha DESC");
                ResultSet rs = ps.executeQuery()){
            modelo.setColumnIdentifiers(new String[]{"Usuarios","Fecha","Acción","Detalles"});

            while (rs.next()) {                
                modelo.addRow(new Object[]{
                    rs.getString("Usuarios"),
                    rs.getDate("fecha"),
                    rs.getString("accion"),
                    rs.getString("detalles")
                });
            }
            
            jtAlumst.setModel(modelo);
                
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
    
    private void cargarAlumT(){
        try (Connection con = Conexion.CDB();
                PreparedStatement ps = con.prepareStatement("SELECT * FROM batu ORDER BY fecha DESC");
                 ResultSet rs = ps.executeQuery();) {
            
            modelot.setColumnIdentifiers(new String[]{"Usuarios","Fecha","Acción","Detalles"});
            
            while (rs.next()) {                
                modelot.addRow(new Object[]{
                    rs.getString("Usuario"),
                    rs.getDate("fecha"),
                    rs.getString("accion"),
                    rs.getString("detalles")
                });
            }
            
            jtAlumT.setModel(modelot);

        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
    
     private void cargarCGrupos(){  
        try (Connection con = Conexion.CDB(); 
               PreparedStatement ps = con.prepareStatement("SELECT * FROM bcgrs ORDER BY fecha DESC"); 
                ResultSet rs = ps.executeQuery();){
            
            modelcg.setColumnIdentifiers(new String[]{"Usuarios","Fecha","Acción","Detalles"});

            while (rs.next()) {                
                modelcg.addRow(new Object[]{
                    rs.getString("Usuario"),
                    rs.getDate("fecha"),
                    rs.getString("accion"),
                    rs.getString("detalles")
                });
            }
            
            jtCgrupos.setModel(modelcg);
            
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
    
     private void cargarGrupos(){
        try (Connection con = Conexion.CDB();
              PreparedStatement ps = con.prepareStatement("SELECT * FROM bgrs");
                ResultSet rs = ps.executeQuery()) {
            
            modelog.setColumnIdentifiers(new String[]{"Usuarios","Fecha","Acción","Detalles"});

            while (rs.next()) {                
                modelog.addRow(new Object[]{
                    rs.getString("Usuario"),
                    rs.getDate("fecha"),
                    rs.getString("accion"),
                    rs.getString("detalles")
                });
            }
            
            jtGrupos.setModel(modelog);

        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
     
     private void cargarRecibos(){       
        try (Connection con = Conexion.CDB(); 
               PreparedStatement ps = con.prepareStatement("SELECT * FROM biticket"); 
               ResultSet rs = ps.executeQuery() ) {
            
            modeloR.setColumnIdentifiers(new String[]{"Usuarios","Fecha","Acción","Detalles"});

            while (rs.next()) {                
                modeloR.addRow(new Object[]{
                    rs.getString("Usuario"),
                    rs.getDate("fecha"),
                    rs.getString("accion"),
                    rs.getString("detalles")
                });
            }
            
            jtRecibos.setModel(modeloR);
 
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
     
     private void cargarCitas(){
        try (Connection con = Conexion.CDB(); 
               PreparedStatement ps = con.prepareStatement("SELECT * FROM bcita"); 
               ResultSet rs = ps.executeQuery(); ) {
            
            modeloC.setColumnIdentifiers(new String[]{"Usuarios","Fecha","Acción","Detalles"});
                        
            while (rs.next()) {                
                modeloC.addRow(new Object[]{
                    rs.getString("Usuario"),
                    rs.getDate("fecha"),
                    rs.getString("accion"),
                    rs.getString("detalles")
                });
            }
            
            jtCitas.setModel(modeloC);

        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
     
      private void cargarMaestros(){
        try (Connection con = Conexion.CDB();
                PreparedStatement ps = con.prepareStatement("SELECT * FROM bmaes"); 
               ResultSet rs = ps.executeQuery() ) {
            modeloM.setColumnIdentifiers(new String[]{"Usuarios","Fecha","Acción","Detalles"});

            while (rs.next()) {                
                modeloM.addRow(new Object[]{
                    rs.getString("Usuario"),
                    rs.getDate("fecha"),
                    rs.getString("accion"),
                    rs.getString("detalles")
                });
            }
            
            jtMaestros.setModel(modeloM);
            
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
      
       private void cargarUsers(){
        try (Connection con = Conexion.CDB(); 
               PreparedStatement ps = con.prepareStatement("SELECT * FROM buser");  
                ResultSet rs = ps.executeQuery() ){
            
            modeloU.setColumnIdentifiers(new String[]{"Usuarios","Fecha","Acción","Detalles"});

            while (rs.next()) {                
                modeloU.addRow(new Object[]{
                    rs.getString("Usuario"),
                    rs.getDate("fecha"),
                    rs.getString("accion"),
                    rs.getString("detalles")
                });
            }
            
            jtUsers.setModel(modeloU);

        } catch (Exception e) {
            System.out.println("Error");
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel jpScroll;
    private javax.swing.JTable jtAlumT;
    private javax.swing.JTable jtAlumst;
    private javax.swing.JTable jtCgrupos;
    private javax.swing.JTable jtCitas;
    private javax.swing.JTable jtGrupos;
    private javax.swing.JTable jtMaestros;
    private javax.swing.JTable jtRecibos;
    private javax.swing.JTable jtUsers;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblUsuarios;
    // End of variables declaration//GEN-END:variables
}