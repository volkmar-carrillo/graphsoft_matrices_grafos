/**
 * Manejo de Matrices y Grafos Simples (Interfaces Gráficas en Java - Plugin Netbeans)
 * 
 * GraphSoft - Proyecto con fines educativos y académicos
 * 
 * By: Volkmar Carrillo, Carlos Avila, Michell Prieto
 * Estructuras Computacionales Discretas
 * Facultad de Ingenierías y Arquitectura
 * Universidad de Pamplona - Colombia
 * Cuarto Semestre de Ingeniería de Sistemas
 * 2020
 */
package Interfaz;

import java.awt.Color;
import AppPackage.AnimationClass;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;

public class form_inicio extends javax.swing.JFrame {
    
    public form_inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void OpenNavigator(String url) {
        try {
            Desktop.getDesktop().browse(URI.create(url));
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        pnlMenu = new javax.swing.JPanel();
        lblInternet = new javax.swing.JLabel();
        lblCalculadora = new javax.swing.JLabel();
        lblMusica = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblGraph = new javax.swing.JLabel();
        pnlContent = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(620, 419));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMenu.setBackground(new java.awt.Color(0, 0, 51));
        pnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblInternet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInternet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/navegador.png"))); // NOI18N
        lblInternet.setToolTipText("Grafos");
        lblInternet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInternet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInternetMouseClicked(evt);
            }
        });
        pnlMenu.add(lblInternet, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 40, 50, 36));

        lblCalculadora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/calculadora.png"))); // NOI18N
        lblCalculadora.setToolTipText("Calculadora");
        lblCalculadora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCalculadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCalculadoraMouseClicked(evt);
            }
        });
        pnlMenu.add(lblCalculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 80, 50, 42));

        lblMusica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/musica.png"))); // NOI18N
        lblMusica.setToolTipText("YouTube Music");
        lblMusica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMusica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMusicaMouseClicked(evt);
            }
        });
        pnlMenu.add(lblMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 120, 50, 42));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/menu.png"))); // NOI18N
        jLabel7.setToolTipText("Menú");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        pnlMenu.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 70, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/informacion.png"))); // NOI18N
        jLabel8.setToolTipText("Acerca de");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        pnlMenu.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 70, 50));

        lblGraph.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGraph.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/graphSoft.png"))); // NOI18N
        lblGraph.setToolTipText("GraphSoft");
        lblGraph.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlMenu.add(lblGraph, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, 390));

        getContentPane().add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 480));

        pnlContent.setBackground(new java.awt.Color(255, 255, 255));
        pnlContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/cerrar.png"))); // NOI18N
        jLabel6.setToolTipText("Cerrar");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel6MouseMoved(evt);
            }
        });
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        pnlContent.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 50, 40));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/minimizar.png"))); // NOI18N
        jLabel5.setToolTipText("Minimizar");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel5MouseMoved(evt);
            }
        });
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        pnlContent.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 50, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/generar.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel1MouseMoved(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        pnlContent.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 230, 50));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/crear.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel2MouseMoved(evt);
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        pnlContent.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 230, 50));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/fondoInicio.gif"))); // NOI18N
        pnlContent.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(pnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 840, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseMoved
        //jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 33, 123)));   
        jLabel2.setOpaque(true);
        jLabel2.setBackground(new java.awt.Color(59, 68, 113));
    }//GEN-LAST:event_jLabel2MouseMoved

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        //jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel2.setOpaque(false);
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseMoved
        //jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 33, 123)));
        jLabel1.setOpaque(true);
        jLabel1.setBackground(new java.awt.Color(59, 68, 113));
    }//GEN-LAST:event_jLabel1MouseMoved

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        //jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel1.setOpaque(false);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        this.setState(form_inicio.ICONIFIED);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        salir S = new salir();
        S.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked
    public void cerrar() {
        System.exit(0);
    }
    private void jLabel6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseMoved
        jLabel6.setOpaque(true);
        jLabel6.setBackground(Color.red);
    }//GEN-LAST:event_jLabel6MouseMoved

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabel6.setOpaque(false);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseMoved
        jLabel5.setOpaque(true);
        jLabel5.setBackground(new java.awt.Color(59, 68, 113));
    }//GEN-LAST:event_jLabel5MouseMoved

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setOpaque(false);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        information I = new information();
        I.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        AnimationClass internet = new AnimationClass();
        internet.jLabelXRight(-50, 10, 10, 5, lblInternet);

        AnimationClass calculadora = new AnimationClass();
        calculadora.jLabelXRight(-50, 10, 10, 5, lblCalculadora);

        AnimationClass musica = new AnimationClass();
        musica.jLabelXRight(-50, 10, 10, 5, lblMusica);

        AnimationClass graph = new AnimationClass();
        graph.jLabelXRight(-50, 10, 10, 5, lblGraph);

        //<---
        AnimationClass internet1 = new AnimationClass();
        internet1.jLabelXLeft(10, -50, 8, 5, lblInternet);

        AnimationClass calculadora1 = new AnimationClass();
        calculadora1.jLabelXLeft(10, -50, 10, 5, lblCalculadora);

        AnimationClass musica1 = new AnimationClass();
        musica1.jLabelXLeft(10, -50, 10, 5, lblMusica);

        AnimationClass graph1 = new AnimationClass();
        graph1.jLabelXLeft(10, -50, 10, 5, lblGraph);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void lblInternetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInternetMouseClicked
        OpenNavigator("https://cutt.ly/Gg5XfXT");
    }//GEN-LAST:event_lblInternetMouseClicked

    private void lblCalculadoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCalculadoraMouseClicked
        try {
            Runtime rt = Runtime.getRuntime();
            Process p = rt.exec("calc");
            p.waitFor();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_lblCalculadoraMouseClicked

    private void lblMusicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMusicaMouseClicked
        OpenNavigator("https://music.youtube.com/");
    }//GEN-LAST:event_lblMusicaMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        form_dimension D = new form_dimension();
        D.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        mantenimiento M = new mantenimiento();
        M.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(form_inicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_inicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_inicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_inicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCalculadora;
    private javax.swing.JLabel lblGraph;
    private javax.swing.JLabel lblInternet;
    private javax.swing.JLabel lblMusica;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
}
