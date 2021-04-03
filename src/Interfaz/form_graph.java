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

import Logica.coordenada_aux_grafo;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Graphics;
import java.net.URI;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class form_graph extends javax.swing.JFrame {

    private static final int SIZE = 400;
    private int a = SIZE / 2;
    private int b = a;
    private int r = 4 * SIZE / 5;
    private int n;
    private int[][] nodos;
    private ArrayList<coordenada_aux_grafo> ubicacionNodos;

    public form_graph() {
        initComponents();
        String aux;
        while (true) {
            try {
                aux = JOptionPane.showInputDialog("Ingrese el numero de vertices: ");
                if (!aux.equals("")) {
                    this.n = Integer.parseInt(aux);
                    break;
                }
            } catch (Exception e) {
            }
        }
        this.nodos = new int[n][n];
        cargar();
        jLabel5.setOpaque(true);
        jLabel5.setBackground(new java.awt.Color(27, 236, 10));
        this.setBounds(0, 0, 600, 400);
        this.setLocationRelativeTo(null);

    }

    public void OpenUnipamplona() {
        try {
            Desktop.getDesktop().browse(URI.create("www.unipamplona.edu.co"));
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, e);
        }
    }

    private void cargar() {
        int leido;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String aux;
                while (true) {
                    try {
                        aux = JOptionPane.showInputDialog("Ingrese la arista [" + i + "][" + j + "]: ");
                        if (!aux.equals("")) {
                            leido = Integer.parseInt(aux);
                            break;
                        }
                    } catch (Exception e) {
                    }
                }
                if (leido == 0 || leido == 1) {
                    nodos[i][j] = leido;
                } else {
                    JOptionPane.showMessageDialog(null, "Ésta opción sólo acepta Grafos Simples...");
                    j--;
                }

            }

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 51));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

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

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/grafoMant.png"))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/escudoUnipamplona.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 330, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseMoved
        jLabel5.setOpaque(true);
        jLabel5.setBackground(new java.awt.Color(59, 68, 113));
    }//GEN-LAST:event_jLabel5MouseMoved

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setOpaque(true);
        jLabel5.setBackground(new java.awt.Color(27, 236, 10));
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        OpenUnipamplona();
    }//GEN-LAST:event_jLabel2MouseClicked
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(form_graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_graph().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    public void paint(Graphics g) {
        super.paint(g);
        char[] letrasGeneradas = new char[n];
        ubicacionNodos = new ArrayList<>();
        int aux = 0;
        a = getWidth() / 2;
        b = getHeight() / 2;
        int m = Math.min(a, b);
        r = 4 * m / 5;
        int r2 = Math.abs(m - r) / 2;
        int aux1, aux2;
        char letter;
        //g2d.drawOval(a - r, b - r, 2 * r, 2 * r);        
        for (int i = 0; i < n; i++) {
            g.setColor(Color.white);
            double t = 2 * Math.PI * i / n;
            int x = (int) Math.round(a + r * Math.cos(t));
            int y = (int) Math.round(b + r * Math.sin(t));
            g.fillOval(x - r2, y - r2, 2 * r2, 2 * r2);
            letter = generarLetra(letrasGeneradas, aux++);
            g.drawString(("" + letter), x - r2, y - r2);
            aux1 = x - 5;
            aux2 = y;
            ubicacionNodos.add(new coordenada_aux_grafo(aux1, aux2, letter));
            g.fillOval(aux1, aux2, 5, 5);
        }
        graficarAristas(g);
    }

    private int posicionLetra(char letter) {
        for (int i = 0; i < n; i++) {
            if (ubicacionNodos.get(i).getLetter() == letter) {
                return (i);
            }
        }
        return (-1);
    }

    public void graficarAristas(Graphics g) {
        int posA;
        int posB;
        char L = 65;
        for (int i = 0; i < nodos.length; i++) {
            char buscar1 = (char) (L + i);
            for (int j = i + 1; j < nodos.length; j++) {
                char buscar2 = (char) (L + j);
                for (int k = 0; k < nodos[i][j]; k++) {
                    posA = posicionLetra(buscar1);
                    posB = posicionLetra(buscar2);
                    g.drawLine(ubicacionNodos.get(posA).getX(), ubicacionNodos.get(posA).getY(),
                            ubicacionNodos.get(posB).getX(), ubicacionNodos.get(posB).getY());
                }

            }

        }
    }

    private boolean esta(char letra, char[] letrasGeneradas) {
        for (int i = 0; i < letrasGeneradas.length; i++) {
            if (letrasGeneradas[i] == letra) {
                return true;
            }
        }
        return (false);
    }

    private char generarLetra(char[] letrasGeneradas, int aux) {
        Random ran = new Random();
        char c;
        while (true) {
            c = (char) (ran.nextInt(n) + 'A');
            if (!esta(c, letrasGeneradas)) {
                break;
            }
        }
        letrasGeneradas[aux] = c;
        aux++;
        return (c);
    }

}
