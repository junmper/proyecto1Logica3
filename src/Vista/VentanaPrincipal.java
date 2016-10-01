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
 * @author Alejandro
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelBotones.setSize(300, ((this.dimension.height)- 200));
        panelBotones.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelBotones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelBotones.setDoubleBuffered(false);
        panelBotones.setMinimumSize(new java.awt.Dimension(200, 200));
        panelBotones.setLayout(new java.awt.GridLayout(4, 2));

        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        panelBotones.add(btnInsertar);

        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        panelBotones.add(btnEliminar);

        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        panelBotones.add(btnModificar);

        btnInvertir.setText("Invertir");
        btnInvertir.setEnabled(false);
        btnInvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvertirActionPerformed(evt);
            }
        });
        panelBotones.add(btnInvertir);

        btnOrdenar.setText("Ordenar A-->Z");
        btnOrdenar.setEnabled(false);
        panelBotones.add(btnOrdenar);

        btnSubString.setText("SubString");
        btnSubString.setEnabled(false);
        btnSubString.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubStringActionPerformed(evt);
            }
        });
        panelBotones.add(btnSubString);

        btnPalindromo.setText("Palindromo");
        btnPalindromo.setEnabled(false);
        btnPalindromo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPalindromoActionPerformed(evt);
            }
        });
        panelBotones.add(btnPalindromo);

        bntAnagrama.setText("Anagrama");
        bntAnagrama.setEnabled(false);
        bntAnagrama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAnagramaActionPerformed(evt);
            }
        });
        panelBotones.add(bntAnagrama);

        panelHilera.setBackground(new java.awt.Color(204, 204, 255));
        panelHilera.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelHilera.setLayout(new java.awt.CardLayout());

        panelTrabajo.setLayout(new java.awt.CardLayout());

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 771, Short.MAX_VALUE))
            .addComponent(panelHilera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHilera, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        JPanel panelFormInsertar = new panelFormInsertar(cp.hilera,cp);
        cp.cleanPanel(panelTrabajo);
        cp.setPanel(panelFormInsertar, this.panelTrabajo);
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        JPanel panelFormEliminar = new panelFormEliminar(cp.hilera,cp);
        cp.cleanPanel(panelTrabajo);
        cp.setPanel(panelFormEliminar, this.panelTrabajo);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void bntAnagramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAnagramaActionPerformed
        JPanel panelFormAnagrama = new panelFormAnagrama(cp.hilera,cp);
        cp.cleanPanel(panelTrabajo);
        cp.setPanel(panelFormAnagrama, this.panelTrabajo);
    }//GEN-LAST:event_bntAnagramaActionPerformed

    private void btnPalindromoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPalindromoActionPerformed
        JPanel panelPalindromo = new panelFormPalindromo(cp.hilera, cp, 0);
        cp.cleanPanel(panelTrabajo);
        cp.setPanel(panelPalindromo, panelTrabajo);
    }//GEN-LAST:event_btnPalindromoActionPerformed

    private void btnInvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvertirActionPerformed
        JPanel panelFormInvertir = new panelFormInvertir(cp.hilera, cp, 1);
        cp.cleanPanel(panelTrabajo);
        cp.setPanel(panelFormInvertir, panelTrabajo);
    }//GEN-LAST:event_btnInvertirActionPerformed

    private void btnSubStringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubStringActionPerformed
        JPanel panel = new panelFormSubString(cp.hilera, cp);
        cp.cleanPanel(panelTrabajo);
        cp.setPanel(panel, panelTrabajo);
    }//GEN-LAST:event_btnSubStringActionPerformed

    public JPanel getPanelHilera() {
        return panelHilera;
    }

    public void setPanelHilera(JPanel panelHilera) {
        this.panelHilera = panelHilera;
    }
    
    public void setSizeButtonsMenu(Dimension dimension)
    {
        this.panelBotones.setSize(300,(dimension.height- panelHilera.getSize().height));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bntAnagrama;
    public javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    public javax.swing.JButton btnInvertir;
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnOrdenar;
    public javax.swing.JButton btnPalindromo;
    public javax.swing.JButton btnSubString;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel panelBotones;
    public javax.swing.JPanel panelHilera;
    private javax.swing.JPanel panelTrabajo;
    // End of variables declaration//GEN-END:variables
}
