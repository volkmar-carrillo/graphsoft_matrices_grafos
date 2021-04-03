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

import Logica.definicion_grafo;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JTextField;
import rojerusan.RSAnimation;

public class form_matriz extends javax.swing.JFrame {

    private int tamanio = 0, tamX = 0, tamY = 0;
    private JTextField[][] matrizTextField;
    private definicion_grafo elementos;
    private final int TableroX = 2000;
    private final int TableroY = 2000;

    public form_matriz() {
        initComponents();
        disabledButton(false);
        RSAnimation.setBajar(-830, 150, 10, 20, this);
        this.setLocationRelativeTo(null);
        //Se obtienen las dimensiones de la pantalla
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        //Se settea la posición inicial de la ventana en el centro de la pantalla
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        //Se muestra el tablero
        this.show();
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public void generar() {
        //Se settea el tamaño de la matriz de textfield
        matrizTextField = new JTextField[tamanio][tamanio];
        //Se settea el tamaño de gridLayout de nuestro panel del tablero
        pnlTablero.setLayout(new GridLayout(tamanio, tamanio));
        //Se obtiene el tamaño de los jtextfield acorde a su cantidad
        ObtenerTamanioObjetos(tamanio, tamanio);
        //Se recorre la dimension X desde 0 hasta DimensionX
        elementos = new definicion_grafo(tamanio);
        for (int i = 0; i < tamanio; i++) {
            //Se recorre la dimension Y desde 0 hasta DimensionY
            for (int j = 0; j < tamanio; j++) {
                //Se crea un nuevo objeto de tipo JTextField
                JTextField txtNuevo = new JTextField();
                //Se le asignan sus dimensiones (ancho, alto)
                txtNuevo.setSize(tamX, tamY);
                //Se le asigna el texto en el centro del JTextField
                txtNuevo.setHorizontalAlignment(txtNuevo.CENTER);
                //Se agrega a la matriz el botón recien creado
                matrizTextField[i][j] = txtNuevo;
                //Se agrega al panel 
                pnlTablero.add(matrizTextField[i][j]);
                //Se redibuja el panel
                RedibujarTablero();
            }
        }
        inhabilitar();
    }
    
    public void disabledButton(boolean action){
        jButton3.setEnabled(action);
        jButton4.setEnabled(action);
        jButton5.setEnabled(action);
        jButton6.setEnabled(action);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTablero = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        pnlOpciones = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTablero.setBackground(new java.awt.Color(255, 255, 255));
        pnlTablero.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(pnlTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 460, 350));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));

        pnlOpciones.setBackground(new java.awt.Color(0, 0, 51));
        pnlOpciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));
        pnlOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/matriz1.png"))); // NOI18N
        pnlOpciones.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 220, 60));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/matriz2.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        pnlOpciones.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 80, -1));

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
        pnlOpciones.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 50, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/b4Matriz.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        pnlOpciones.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 210, 50));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/b1Matriz.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        pnlOpciones.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 210, 50));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/b2Matriz.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        pnlOpciones.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 210, 50));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/b3Matriz.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        pnlOpciones.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 210, 50));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/matriz.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pnlOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(pnlOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void inhabilitar() {
        for (int i = 0; i < tamanio; i++) {
            for (int j = i + 1; j < tamanio; j++) {
                matrizTextField[j][i].setEnabled(false);
            }
        }
    }

    private boolean permiteValidar() {
        for (int i = 0; i < tamanio; i++) {
            for (int j = i + 1; j < tamanio; j++) {
                if (matrizTextField[i][j].getText().equals("")) {
                    return (false);
                }
            }
        }
        return (true);
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (permiteValidar()) {
            boolean creaMatriz = elementos.cargarMatriz3(matrizTextField);
            if (creaMatriz) {
                alerta1 A = new alerta1();
                disabledButton(true);
                A.setVisible(true);
                jButton2.setEnabled(false);
            } else {
                alerta2 A = new alerta2();
                reestablecerEntorno();
                A.setVisible(true);
                this.setVisible(false);
            }
        } else {
            alerta2 A = new alerta2();
            A.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseMoved
        jLabel5.setOpaque(true);
        jLabel5.setBackground(new java.awt.Color(59, 68, 113));
    }//GEN-LAST:event_jLabel5MouseMoved

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setOpaque(false);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        form_area FA = new form_area();
        FA.areaTexto.setText(elementos.op1());
        FA.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        form_area FA = new form_area();
        FA.areaTexto.setText(elementos.op2());
        FA.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        form_area FA = new form_area();
        FA.areaTexto.setText(elementos.op3());
        FA.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        form_area FA = new form_area();
        FA.areaTexto.setText(elementos.op4());
        FA.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
    private void reestablecerEntorno() {
        //Se valida que hayan elementos en el panel
        if (HayElementos()) {
            //Se recorre la matriz de botones y se elimina cada elemento de la matríz
            for (int x = 0; x < tamanio; x++) {
                for (int y = 0; y < tamanio; y++) {
                    matrizTextField[x][y].setText("");
                }//Fin For - y
            }//Fin For - x
            //Se remueven todos los elementos hijos del JPanel pnlTablero
            pnlTablero.removeAll();
            //Se redibuja el panel
            RedibujarTablero();
        }//Fin if HayElementos
    }

    /**
     * Función que verifica si hay elementos creados en el pnlTablero
     */
    private boolean HayElementos() {
        //Si hay elementos en el panel retorna true, caso contrario retorna false
        return pnlTablero.getComponentCount() > 0;
    }

    /**
     * Metodo que redibuja el elemto pnlTablero
     */
    private void RedibujarTablero() {
        //Se valida los componentes del elemento pnlTablero
        pnlTablero.validate();
        //Se redibuja el elemento pnlTablero y sus componentes hijos
        pnlTablero.repaint();
    }

    /**
     * Función que verifica si el valor String es de tipo númerico
     */
    boolean esNumerico(String valorString) {
        try {
            Integer.parseInt(valorString);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }

    /**
     * Metodo que calcula el tamaño de ancho y alto de los botones acorde a la
     * cantidad de elementos en la matriz
     */
    private void ObtenerTamanioObjetos(int cantX, int cantY) {
        tamX = TableroX / cantX;
        tamY = TableroY / cantY;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnlOpciones;
    private javax.swing.JPanel pnlTablero;
    // End of variables declaration//GEN-END:variables
}
