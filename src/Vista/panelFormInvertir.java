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
public class panelFormInvertir extends javax.swing.JPanel {

    /**
     * Creates new form panelFormInsertar
     */
    public Hilera hilera;
    private controlador.ControladorPrincipal cp;
    /**
     * El Constructor
     * @param hilera la hilera que se trabaja en este panel
     * @param cp el controlador principal
     * @param key 1 para mostrar invertir , 0 para validar palindromo y mostrar, 
     */
    public panelFormInvertir(Hilera hilera, controlador.ControladorPrincipal cp,int key) {
        this.hilera = hilera;
        this.cp = cp;
        initComponents();
        this.setMinimumSize(new Dimension(300, 300));
        
        switch(key)
        {
            case 0:
            {
                setTextTitle("¿La Hilera es Palindromo?");
                if (hilera.esPalindromo()) {
                    jLabel2.setText("!!! Si !!!");
                }
                else
                {
                    jLabel2.setText("!!! No !!!");
                }
            }
            case 1:
            {
                    jLabel2.setText("!!! Se ha invertido la Hilera !!!");       
                
            }
            
        }
               
    }
    
    public void setTextTitle(String s)
    {
        jLabel1.setText(s);
    }
    
    public void setTextResult(String s)
    {
        jLabel2.setText(s);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 36)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(195, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
