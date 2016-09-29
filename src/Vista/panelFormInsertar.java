/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;
import modelo.Hilera;

/**
 *
 * @author Alejandro
 */
public class panelFormInsertar extends javax.swing.JPanel {

    /**
     * Creates new form panelFormInsertar
     */
    public Hilera hilera;
    private controlador.ControladorPrincipal cp;
    public panelFormInsertar(Hilera hilera, controlador.ControladorPrincipal cp) {
        this.hilera = hilera;
        this.cp = cp;
        initComponents();
        jButton1.setEnabled(false);
        this.setMinimumSize(new Dimension(300, 300));
        if (hilera != null) 
        {
            jTextField1.setText(String.copyValueOf(hilera.hilera2Char()));
        }
        
    }

    public void setHileraJField()
    {
        if (hilera != null) 
        {
            jTextField1.setText(String.copyValueOf(hilera.hilera2Char()));
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jTextField1.setFont(new java.awt.Font("Arial Narrow", 0, 36)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 36)); // NOI18N
        jLabel1.setText("Ingrese la Hilera a trabajar");

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        jButton1.setEnabled(true);
        char c = evt.getKeyChar();
        int code = Character.hashCode(c);
        //System.out.println(code);
        if (code > 96) {
            code = code - 32;
        }
        if(code > 64 && code < 91 )
        {
          // System.out.println(c);
           hilera.insertarCaracter(c);
           //Crear una hilera
        }
        else if(code == 8)
        {
            //desconectar el ultimo nodo
            hilera.eliminarUltimo();
        }
        else{
            evt.consume();
        }
        hilera.recorreIzqDer();
        System.out.println("---------------------------");
    }//GEN-LAST:event_jTextField1KeyTyped

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        char[] c = hilera.hilera2Char();
        
        
        
        JPanel mainPanel = new JPanel();
        
        mainPanel.setSize(cp.getDimension().width,100);
        
        mainPanel.setLayout(new java.awt.GridLayout(1, c.length));
        mainPanel.setMinimumSize(new Dimension(300, 100));
        for (int i = 0; i < c.length; i++) 
        {
            System.out.println(c[i]);
            JButton aButton = new JButton(String.valueOf(c[i]));
            aButton.setName("btn"+String.valueOf(i));
            aButton.setMinimumSize(new Dimension(50, 100));
            mainPanel.add(aButton);
        }
                        
        cp.cleanPanel(cp.vp.getPanelHilera());
        cp.setPanel(mainPanel, cp.vp.getPanelHilera());
        
        cp.cleanPanel(this);
        
        cp.vp.bntAnagrama.setEnabled(true);
        cp.vp.btnEliminar.setEnabled(true);
        cp.vp.btnInvertir.setEnabled(true);
        cp.vp.btnModificar.setEnabled(true);
        cp.vp.btnOrdenar.setEnabled(true);
        cp.vp.btnPalindromo.setEnabled(true);
        cp.vp.btnSubString.setEnabled(true);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
