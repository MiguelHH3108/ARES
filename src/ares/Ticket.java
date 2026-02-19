
package ares;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.PrintJob;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.sql.*;

/**
 *
 * @author herna
 */
public class Ticket extends javax.swing.JFrame {
private int idRecibo;
    
    public Ticket(int idrecibo) {
        this.idRecibo = idrecibo;
        initComponents();
        cargarDatosTicket();
        
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LogoAres.jpg")).getImage());
        this.setLocationRelativeTo(null);
        
        setImageLabel(lblLetras, "/Imagenes/Ares letras.jpg");
        setImageLabel(lblStars, "/Imagenes/Estrellas.jpg");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrint = new javax.swing.JPanel();
        lblLetras = new javax.swing.JLabel();
        lblStars = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblRecibo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblCiudad = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblGrupo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblDetalles = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();
        lblPrint = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrint.setBackground(new java.awt.Color(255, 255, 255));
        panelPrint.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLetras.setBackground(new java.awt.Color(102, 102, 102));
        lblLetras.setOpaque(true);
        panelPrint.add(lblLetras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 90));

        lblStars.setBackground(new java.awt.Color(153, 153, 153));
        lblStars.setOpaque(true);
        panelPrint.add(lblStars, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 220, 210));

        jPanel2.setBackground(new java.awt.Color(255, 46, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelPrint.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 380, 40));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Fecha:");
        panelPrint.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        lblFecha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(0, 0, 0));
        lblFecha.setText("jLabel2");
        panelPrint.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 140, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Recibo:");
        panelPrint.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        lblRecibo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblRecibo.setForeground(new java.awt.Color(0, 0, 0));
        lblRecibo.setText("jLabel3");
        panelPrint.add(lblRecibo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 46, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelPrint.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 46, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelPrint.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 46, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelPrint.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 600, -1));

        jPanel6.setBackground(new java.awt.Color(255, 46, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelPrint.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Nombre:");
        panelPrint.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        lblNombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("jLabel4");
        panelPrint.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 270, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Ciudad:");
        panelPrint.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        lblCiudad.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCiudad.setForeground(new java.awt.Color(0, 0, 0));
        lblCiudad.setText("jLabel5");
        panelPrint.add(lblCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 210, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Cantidad:");
        panelPrint.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        lblCantidad.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(0, 0, 0));
        lblCantidad.setText("jLabel6");
        panelPrint.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 190, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Grupo:");
        panelPrint.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        lblGrupo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblGrupo.setForeground(new java.awt.Color(0, 0, 0));
        lblGrupo.setText("jLabel7");
        panelPrint.add(lblGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 190, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Firma:");
        panelPrint.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Detalles:");
        panelPrint.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        lblDetalles.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblDetalles.setForeground(new java.awt.Color(0, 0, 0));
        lblDetalles.setText("jLabel9");
        panelPrint.add(lblDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 270, 50));

        getContentPane().add(panelPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCerrar.setBackground(new java.awt.Color(255, 255, 255));
        lblCerrar.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblCerrar.setForeground(new java.awt.Color(0, 0, 0));
        lblCerrar.setText("             X");
        lblCerrar.setOpaque(true);
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCerrarMouseExited(evt);
            }
        });
        jPanel1.add(lblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 160, 120));

        lblPrint.setBackground(new java.awt.Color(255, 255, 255));
        lblPrint.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblPrint.setForeground(new java.awt.Color(0, 0, 0));
        lblPrint.setText("         Imprimir");
        lblPrint.setOpaque(true);
        lblPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPrintMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPrintMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPrintMouseExited(evt);
            }
        });
        jPanel1.add(lblPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 170, 350));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 0, 170, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
       this.dispose();
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseEntered
        lblCerrar.setBackground(Color.red);
    }//GEN-LAST:event_lblCerrarMouseEntered

    private void lblCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseExited
       lblCerrar.setBackground(Color.WHITE);
    }//GEN-LAST:event_lblCerrarMouseExited

    private void lblPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPrintMouseClicked
        try {
            Toolkit tk = panelPrint.getToolkit();
            PrintJob pj = tk.getPrintJob(this, null, null);
            Graphics g = pj.getGraphics();
            panelPrint.paint(g);
            g.dispose();
            pj.end();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_lblPrintMouseClicked

    private void lblPrintMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPrintMouseEntered
       lblPrint.setBackground(new Color(107,213,237));
    }//GEN-LAST:event_lblPrintMouseEntered

    private void lblPrintMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPrintMouseExited
              lblPrint.setBackground(Color.WHITE);
    }//GEN-LAST:event_lblPrintMouseExited
    
    private void cargarDatosTicket(){   
        try (Connection con = Conexion.CDB();
                PreparedStatement ps = con.prepareStatement("SELECT * FROM ticket WHERE idrecibo = ?");) {
            
            ps.setInt(1, this.idRecibo);
            
            
            try(ResultSet rs = ps.executeQuery()){
                    if(rs.next()){
                        lblRecibo.setText(String.valueOf(rs.getInt("idrecibo")));
                        lblFecha.setText(rs.getDate("fecha").toString());
                        lblNombre.setText(rs.getString("nombre") + " " + rs.getString("apellidop") + " " + rs.getString("apellidom"));
                        lblCiudad.setText(rs.getString("ciudad"));
                        lblCantidad.setText("$" + String.format("%.2f", rs.getDouble("cantidad")));
                        lblGrupo.setText(rs.getString("nombreg"));
                        lblDetalles.setText(rs.getString("detalles"));
                    }else{
                        System.out.println("Error recibo" + this.idRecibo);
                    }
            }     
        } catch (Exception e) {
            System.out.println("Error al cargar el ticket");
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblDetalles;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblGrupo;
    private javax.swing.JLabel lblLetras;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrint;
    private javax.swing.JLabel lblRecibo;
    private javax.swing.JLabel lblStars;
    private javax.swing.JPanel panelPrint;
    // End of variables declaration//GEN-END:variables
}