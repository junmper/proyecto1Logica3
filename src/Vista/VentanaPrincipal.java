/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import java.awt.Dimension;
import javax.swing.JPanel;
import Vista.panelFormInsertar;
import Vista.panelFormEliminar;
import modelo.Hilera;

/**
 *
 * @author Yaqueline Hoyos Montes, Alejandro Marín Alzate
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private Dimension dimension;
    private controlador.ControladorPrincipal cp;
    
    
    private Hilera hilera;
    /**
     * Creates new form jPanelMain
     */
    public VentanaPrincipal(Dimension dimension,controlador.ControladorPrincipal cp) {
        this.dimension = dimension;
        this.cp = cp;
        
        initComponents();
        panelBotones.setSize(300, this.dimension.height);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelBotones = new javax.swing.JPanel();
        btnInsertar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnInvertir = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        btnSubString = new javax.swing.JButton();
        btnPalindromo = new javax.swing.JButton();
        bntAnagrama = new javax.swing.JButton();
        panelHilera = new javax.swing.JPanel();
        panelTrabajo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panelBotones.setSize(300, ((this.dimension.height)- 200));
        panelBotones.setBackground(new java.awt.Color(255, 255, 255));
        panelBotones.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));
        panelBotones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelBotones.setDoubleBuffered(false);
        panelBotones.setMinimumSize(new java.awt.Dimension(200, 200));
        panelBotones.setLayout(new java.awt.GridLayout(8, 1));

        btnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/insertar1.png"))); // NOI18N
        btnInsertar.setBorder(null);
        btnInsertar.setBorderPainted(false);
        btnInsertar.setContentAreaFilled(false);
        btnInsertar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsertar.setPreferredSize(new java.awt.Dimension(71, 50));
        btnInsertar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/insertar2.png"))); // NOI18N
        btnInsertar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/insertar2.png"))); // NOI18N
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        panelBotones.add(btnInsertar);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar1.png"))); // NOI18N
        btnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setEnabled(false);
        btnEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar2.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        panelBotones.add(btnEliminar);

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar1.png"))); // NOI18N
        btnModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnModificar.setBorderPainted(false);
        btnModificar.setContentAreaFilled(false);
        btnModificar.setEnabled(false);
        btnModificar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar2.png"))); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        panelBotones.add(btnModificar);

        btnInvertir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/invertir1.png"))); // NOI18N
        btnInvertir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnInvertir.setBorderPainted(false);
        btnInvertir.setContentAreaFilled(false);
        btnInvertir.setEnabled(false);
        btnInvertir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/invertir2.png"))); // NOI18N
        btnInvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvertirActionPerformed(evt);
            }
        });
        panelBotones.add(btnInvertir);

        btnOrdenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ordenar1.png"))); // NOI18N
        btnOrdenar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnOrdenar.setBorderPainted(false);
        btnOrdenar.setContentAreaFilled(false);
        btnOrdenar.setEnabled(false);
        btnOrdenar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ordenar2.png"))); // NOI18N
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });
        panelBotones.add(btnOrdenar);

        btnSubString.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/subhilera1.png"))); // NOI18N
        btnSubString.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSubString.setBorderPainted(false);
        btnSubString.setContentAreaFilled(false);
        btnSubString.setEnabled(false);
        btnSubString.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/subhilera2.png"))); // NOI18N
        btnSubString.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubStringActionPerformed(evt);
            }
        });
        panelBotones.add(btnSubString);

        btnPalindromo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/palindromo1.png"))); // NOI18N
        btnPalindromo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPalindromo.setBorderPainted(false);
        btnPalindromo.setContentAreaFilled(false);
        btnPalindromo.setEnabled(false);
        btnPalindromo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/palindromo2.png"))); // NOI18N
        btnPalindromo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPalindromoActionPerformed(evt);
            }
        });
        panelBotones.add(btnPalindromo);

        bntAnagrama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anagrama1.png"))); // NOI18N
        bntAnagrama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bntAnagrama.setBorderPainted(false);
        bntAnagrama.setContentAreaFilled(false);
        bntAnagrama.setEnabled(false);
        bntAnagrama.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anagrama2.png"))); // NOI18N
        bntAnagrama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAnagramaActionPerformed(evt);
            }
        });
        panelBotones.add(bntAnagrama);

        panelHilera.setBackground(new java.awt.Color(255, 255, 255));
        panelHilera.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelHilera.setLayout(new java.awt.CardLayout());

        panelTrabajo.setBackground(new java.awt.Color(255, 255, 255));
        panelTrabajo.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHilera, javax.swing.GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTrabajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelHilera, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 172, Short.MAX_VALUE))
                    .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * evento cuando se oprime el boton de insertar
     * @param evt evento
     */
    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        JPanel panelFormInsertar = new panelFormInsertar(cp.hilera,cp);
        cp.cleanPanel(panelTrabajo);
        cp.setPanel(panelFormInsertar, this.panelTrabajo);
    }//GEN-LAST:event_btnInsertarActionPerformed

    /**
     * evento cuando se oprime el boton de eliminar
     * @param evt evento
     */
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        bntAnagrama.setEnabled(false);
        btnInsertar.setEnabled(false);
        btnInvertir.setEnabled(false);
        btnModificar.setEnabled(false);
        btnOrdenar.setEnabled(false);
        btnPalindromo.setEnabled(false);
        btnSubString.setEnabled(false);
        
        cp.eventosBotonesHilera();
        cp.setControl(true);
        JPanel panelFormEliminar = new panelFormEliminar(cp.hilera,cp);
        cp.cleanPanel(panelTrabajo);
        cp.setPanel(panelFormEliminar, this.panelTrabajo);
    }//GEN-LAST:event_btnEliminarActionPerformed
    /**
     * evento cuando se oprime el boton de anagrama
     * @param evt evento
     */
    private void bntAnagramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAnagramaActionPerformed
        JPanel panelFormAnagrama = new panelFormAnagrama(cp.hilera,cp);
        cp.cleanPanel(panelTrabajo);
        cp.setPanel(panelFormAnagrama, this.panelTrabajo);
    }//GEN-LAST:event_bntAnagramaActionPerformed

    /**
     * evento cuando se oprime el boton de validar palindromo
     * @param evt evento
     */
    private void btnPalindromoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPalindromoActionPerformed
        JPanel panelPalindromo = new panelFormPalindromo(cp.hilera, cp, 0);
        cp.cleanPanel(panelTrabajo);
        cp.setPanel(panelPalindromo, panelTrabajo);
    }//GEN-LAST:event_btnPalindromoActionPerformed

    /**
     * evento cuando se oprime el boton de Invertir
     * @param evt evento
     */
    private void btnInvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvertirActionPerformed
        cp.hilera.invertir();
        cp.cleanPanel(panelHilera);
        cp.setPanel(cp.panelBotonesHilera(cp.hilera), panelHilera);
        
        
        JPanel panelFormInvertir = new panelFormInvertir(cp.hilera, cp, 1);
        cp.cleanPanel(panelTrabajo);
        cp.setPanel(panelFormInvertir, panelTrabajo);
    }//GEN-LAST:event_btnInvertirActionPerformed

    /**
     * evento cuando se oprime el boton de subString
     * @param evt evento
     */
    private void btnSubStringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubStringActionPerformed
        JPanel panel = new panelFormSubString(cp.hilera, cp);
        cp.cleanPanel(panelTrabajo);
        cp.setPanel(panel, panelTrabajo);
    }//GEN-LAST:event_btnSubStringActionPerformed
    
    /**
     * evento cuando se oprime el boton de Ordenar alfabeticamente
     * @param evt evento
     */
    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        cp.hilera.ordenarAlfabeticamente();
        cp.cleanPanel(panelHilera);
        cp.setPanel(cp.panelBotonesHilera(cp.hilera), panelHilera);
        
        JPanel panel = new panelFormOdenar(cp.hilera, cp);
        cp.cleanPanel(panelTrabajo);
        cp.setPanel(panel, panelTrabajo);
    }//GEN-LAST:event_btnOrdenarActionPerformed
    
    /**
     * evento cuando se oprime el boton de modificar
     * @param evt evento
     */
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        JPanel panel = new panelFormModificar(cp.hilera, cp);
        cp.cleanPanel(panelTrabajo);
        cp.setPanel(panel, panelTrabajo);
    }//GEN-LAST:event_btnModificarActionPerformed

    /**
     * Asigana un tamño dependiendo del tamaño de la pantalla del computador
     * a los botones de funcionalidades de la vista principal
     * @param dimension tamaño de la pantalla
     */
    public void setSizeButtonsMenu(Dimension dimension)
    {
        this.panelBotones.setSize(300,(dimension.height- panelHilera.getSize().height));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bntAnagrama;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnInsertar;
    public javax.swing.JButton btnInvertir;
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnOrdenar;
    public javax.swing.JButton btnPalindromo;
    public javax.swing.JButton btnSubString;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelBotones;
    public javax.swing.JPanel panelHilera;
    private javax.swing.JPanel panelTrabajo;
    // End of variables declaration//GEN-END:variables
}
