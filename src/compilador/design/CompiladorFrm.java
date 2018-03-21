/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador.design;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author ctomazoni
 */
public class CompiladorFrm extends javax.swing.JFrame {

    /**
     * Creates new form CompiladorFrm
     */
    public CompiladorFrm() {
        initComponents();
        editorTA.setBorder(new NumberedBorder());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        editorTA = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaMensagemTA = new javax.swing.JTextArea();
        barraFerramentas = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnCopy = new javax.swing.JButton();
        btnPaste = new javax.swing.JButton();
        btnCut = new javax.swing.JButton();
        btnCompile = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 620));
        setPreferredSize(new java.awt.Dimension(900, 620));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setToolTipText("");
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setMinimumSize(new java.awt.Dimension(735, 480));
        jScrollPane1.setOpaque(false);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(735, 480));

        editorTA.setColumns(20);
        editorTA.setRows(5);
        editorTA.setMinimumSize(null);
        editorTA.setPreferredSize(null);
        jScrollPane1.setViewportView(editorTA);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setMinimumSize(new java.awt.Dimension(750, 105));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(750, 105));

        areaMensagemTA.setEditable(false);
        areaMensagemTA.setColumns(20);
        areaMensagemTA.setRows(5);
        areaMensagemTA.setMinimumSize(new java.awt.Dimension(700, 250));
        areaMensagemTA.setName(""); // NOI18N
        areaMensagemTA.setPreferredSize(null);
        jScrollPane2.setViewportView(areaMensagemTA);

        barraFerramentas.setMinimumSize(new java.awt.Dimension(145, 590));
        barraFerramentas.setPreferredSize(new java.awt.Dimension(145, 590));
        barraFerramentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNew.setText("new [ctrl-n]");
        btnNew.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        barraFerramentas.add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 145, 60));

        btnSave.setText("save [ctrl-s]");
        btnSave.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        barraFerramentas.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 145, 60));

        btnOpen.setText("open [ctrl-o]");
        btnOpen.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        barraFerramentas.add(btnOpen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 145, 60));

        btnCopy.setText("copy [ctrl-c]");
        btnCopy.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        barraFerramentas.add(btnCopy, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 145, 60));

        btnPaste.setText("paste [ctrl-v]");
        btnPaste.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPaste.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        barraFerramentas.add(btnPaste, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 145, 60));

        btnCut.setText("cut [ctrl-x]");
        btnCut.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        barraFerramentas.add(btnCut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 145, 60));

        btnCompile.setText("compile [F9]");
        btnCompile.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        barraFerramentas.add(btnCompile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 145, 60));

        btnAbout.setText("about [F1]");
        btnAbout.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        barraFerramentas.add(btnAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 145, 60));

        jLabel1.setText("BARRA");
        jLabel1.setMinimumSize(new java.awt.Dimension(900, 25));
        jLabel1.setPreferredSize(new java.awt.Dimension(900, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 874, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(barraFerramentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(barraFerramentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CompiladorFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompiladorFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompiladorFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompiladorFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompiladorFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaMensagemTA;
    private javax.swing.JPanel barraFerramentas;
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnCompile;
    private javax.swing.JButton btnCopy;
    private javax.swing.JButton btnCut;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnPaste;
    private javax.swing.JButton btnSave;
    private javax.swing.JTextArea editorTA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
