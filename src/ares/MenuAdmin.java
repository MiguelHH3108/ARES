
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
import java.util.concurrent.TimeUnit;

/**
 *
 * @author herna
 */
public class MenuAdmin extends javax.swing.JFrame {
    private String usuarioActual;
    private String rolU;

    public MenuAdmin(String usuario, String rol) {
        this.usuarioActual = usuario;
        this.rolU = rol;
        
        initComponents();
        configPermisos();
        
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoAres.jpg")).getImage());
        this.setExtendedState(this.MAXIMIZED_BOTH);
        
        setImageLabel(lblFondo, "/Imagenes/Fondoprincipal.jpg");
    }
    
    AudioClip sonido;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMenu = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        lblAlumnoST = new javax.swing.JLabel();
        lblAlumnoT = new javax.swing.JLabel();
        lblGrupos = new javax.swing.JLabel();
        lblRecibos = new javax.swing.JLabel();
        lblCitas = new javax.swing.JLabel();
        lblUsuarios = new javax.swing.JLabel();
        lblMaestros = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpMenu.setBackground(new java.awt.Color(211, 122, 30));
        jpMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogin.setBackground(new java.awt.Color(211, 122, 30));
        lblLogin.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(0, 0, 0));
        lblLogin.setText("          Cambiar usuario");
        lblLogin.setOpaque(true);
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLoginMouseExited(evt);
            }
        });
        jpMenu.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 280, 108));

        lblSalir.setBackground(new java.awt.Color(211, 122, 30));
        lblSalir.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblSalir.setForeground(new java.awt.Color(0, 0, 0));
        lblSalir.setText("                       X");
        lblSalir.setOpaque(true);
        lblSalir.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblSalirMouseMoved(evt);
            }
        });
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
        jpMenu.add(lblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 100));

        lblAlumnoST.setBackground(new java.awt.Color(211, 122, 30));
        lblAlumnoST.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblAlumnoST.setForeground(new java.awt.Color(0, 0, 0));
        lblAlumnoST.setText("           Alumnos sin tutor");
        lblAlumnoST.setOpaque(true);
        lblAlumnoST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAlumnoSTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAlumnoSTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAlumnoSTMouseExited(evt);
            }
        });
        jpMenu.add(lblAlumnoST, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 279, 99));

        lblAlumnoT.setBackground(new java.awt.Color(211, 122, 30));
        lblAlumnoT.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblAlumnoT.setForeground(new java.awt.Color(0, 0, 0));
        lblAlumnoT.setText("         Alumnos con tutor");
        lblAlumnoT.setToolTipText("");
        lblAlumnoT.setOpaque(true);
        lblAlumnoT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAlumnoTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAlumnoTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAlumnoTMouseExited(evt);
            }
        });
        jpMenu.add(lblAlumnoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 280, 110));

        lblGrupos.setBackground(new java.awt.Color(211, 122, 30));
        lblGrupos.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblGrupos.setForeground(new java.awt.Color(0, 0, 0));
        lblGrupos.setText("                 Grupos");
        lblGrupos.setOpaque(true);
        lblGrupos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGruposMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblGruposMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblGruposMouseExited(evt);
            }
        });
        jpMenu.add(lblGrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 280, 110));

        lblRecibos.setBackground(new java.awt.Color(211, 122, 30));
        lblRecibos.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblRecibos.setForeground(new java.awt.Color(0, 0, 0));
        lblRecibos.setText("                 Recibos");
        lblRecibos.setOpaque(true);
        lblRecibos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRecibosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRecibosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRecibosMouseExited(evt);
            }
        });
        jpMenu.add(lblRecibos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 280, 100));

        lblCitas.setBackground(new java.awt.Color(211, 122, 30));
        lblCitas.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblCitas.setForeground(new java.awt.Color(0, 0, 0));
        lblCitas.setText("                  Citas");
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
        jpMenu.add(lblCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 280, 90));

        lblUsuarios.setBackground(new java.awt.Color(211, 122, 30));
        lblUsuarios.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuarios.setText("                Usuarios");
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
        jpMenu.add(lblUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 790, 280, 90));

        lblMaestros.setBackground(new java.awt.Color(211, 122, 30));
        lblMaestros.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblMaestros.setForeground(new java.awt.Color(0, 0, 0));
        lblMaestros.setText("                Maestros");
        lblMaestros.setOpaque(true);
        lblMaestros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaestrosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMaestrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMaestrosMouseExited(evt);
            }
        });
        jpMenu.add(lblMaestros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 710, 280, 80));

        getContentPane().add(jpMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 879));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 1260, 879));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseClicked
        this.dispose();
        Login lg = new Login();
        lg.setVisible(true);
    }//GEN-LAST:event_lblLoginMouseClicked

    private void lblLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseEntered
        lblLogin.setBackground(Color.WHITE);
    }//GEN-LAST:event_lblLoginMouseEntered

    private void lblLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseExited
        lblLogin.setBackground(new Color (211,122,30));
    }//GEN-LAST:event_lblLoginMouseExited

    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
        lblSalir.setBackground(new Color(211,122,30));
    }//GEN-LAST:event_lblSalirMouseExited

    private void lblSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseEntered
        lblSalir.setBackground(Color.RED);
    }//GEN-LAST:event_lblSalirMouseEntered

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        int resultado = JOptionPane.showConfirmDialog(this,"           ¿Desea salir?","Salir",JOptionPane.YES_NO_OPTION);
        if(resultado==0){
            copiaSQL();
            System.exit(0);
        }else{}
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblAlumnoSTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlumnoSTMouseClicked
          this.dispose();
        Alumnos al = new Alumnos(usuarioActual, rolU);
        al.setVisible(true);
    }//GEN-LAST:event_lblAlumnoSTMouseClicked

    private void lblAlumnoSTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlumnoSTMouseEntered
        lblAlumnoST.setBackground(Color.WHITE);
    }//GEN-LAST:event_lblAlumnoSTMouseEntered

    private void lblAlumnoSTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlumnoSTMouseExited
        lblAlumnoST.setBackground(new Color(211,122,30));
    }//GEN-LAST:event_lblAlumnoSTMouseExited

    private void lblSalirMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseMoved
        lblSalir.setToolTipText("Salir");
    }//GEN-LAST:event_lblSalirMouseMoved

    private void lblAlumnoTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlumnoTMouseClicked
       this.dispose();
        AlumnoTutor alt = new AlumnoTutor(usuarioActual,rolU);
        alt.setVisible(true);
    }//GEN-LAST:event_lblAlumnoTMouseClicked

    private void lblAlumnoTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlumnoTMouseEntered
        lblAlumnoT.setBackground(Color.WHITE);
    }//GEN-LAST:event_lblAlumnoTMouseEntered

    private void lblAlumnoTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlumnoTMouseExited
        lblAlumnoT.setBackground(new Color(211,122,30));
    }//GEN-LAST:event_lblAlumnoTMouseExited

    private void lblGruposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGruposMouseClicked
        this.dispose();
        Grupos g = new Grupos(usuarioActual, rolU);
        g.setVisible(true);
    }//GEN-LAST:event_lblGruposMouseClicked

    private void lblGruposMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGruposMouseEntered
        lblGrupos.setBackground(Color.WHITE);
    }//GEN-LAST:event_lblGruposMouseEntered

    private void lblGruposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGruposMouseExited
        lblGrupos.setBackground(new Color(211,122,30));
    }//GEN-LAST:event_lblGruposMouseExited

    private void lblRecibosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRecibosMouseClicked
        this.dispose();
        Recibos r = new Recibos(usuarioActual, rolU);
        r.setVisible(true);
    }//GEN-LAST:event_lblRecibosMouseClicked

    private void lblRecibosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRecibosMouseEntered
        lblRecibos.setBackground(Color.WHITE);
    }//GEN-LAST:event_lblRecibosMouseEntered

    private void lblRecibosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRecibosMouseExited
        lblRecibos.setBackground(new Color(211,122,30));
    }//GEN-LAST:event_lblRecibosMouseExited

    private void lblCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCitasMouseClicked
        this.dispose();
        Citas c = new Citas(usuarioActual, rolU);
        c.setVisible(true);
    }//GEN-LAST:event_lblCitasMouseClicked

    private void lblCitasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCitasMouseEntered
        lblCitas.setBackground(Color.WHITE);
    }//GEN-LAST:event_lblCitasMouseEntered

    private void lblCitasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCitasMouseExited
        lblCitas.setBackground(new Color(211,122,30));
    }//GEN-LAST:event_lblCitasMouseExited

    private void lblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuariosMouseClicked
         if(!rolU.endsWith("Administrador")){
             sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/error.wav"));
                sonido.play();
            JOptionPane.showMessageDialog(null, "No tienes permisos para acceder",
                    "Sin permisos",JOptionPane.PLAIN_MESSAGE, icono("/Imagenes/advertencia.png", 40, 40));
            return;
        }
        this.dispose();
         Usuarios u = new Usuarios(usuarioActual, rolU);
        u.setVisible(true);
    }//GEN-LAST:event_lblUsuariosMouseClicked

    private void lblUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuariosMouseEntered
        lblUsuarios.setBackground(Color.WHITE);
    }//GEN-LAST:event_lblUsuariosMouseEntered

    private void lblUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuariosMouseExited
        lblUsuarios.setBackground(new Color(211,122,30));
    }//GEN-LAST:event_lblUsuariosMouseExited

    private void lblMaestrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaestrosMouseClicked
        this.dispose();
        Maestros m = new Maestros(usuarioActual, rolU);
        m.setVisible(true);
    }//GEN-LAST:event_lblMaestrosMouseClicked

    private void lblMaestrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaestrosMouseEntered
        lblMaestros.setBackground(Color.WHITE);
    }//GEN-LAST:event_lblMaestrosMouseEntered

    private void lblMaestrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaestrosMouseExited
        lblMaestros.setBackground(new Color(211,122,30));
    }//GEN-LAST:event_lblMaestrosMouseExited

    private void configPermisos(){
        switch(rolU){
            case "Administrador":
                
                break;
                
                case "Usuario1":
                    lblUsuarios.setEnabled(false);
                break;
                
                case "Usuario2":
                    lblUsuarios.setEnabled(false);
                break;
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jpMenu;
    private javax.swing.JLabel lblAlumnoST;
    private javax.swing.JLabel lblAlumnoT;
    private javax.swing.JLabel lblCitas;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblGrupos;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblMaestros;
    private javax.swing.JLabel lblRecibos;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblUsuarios;
    // End of variables declaration//GEN-END:variables
}