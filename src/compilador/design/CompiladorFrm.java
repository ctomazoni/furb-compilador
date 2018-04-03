/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador.design;

import compilador.LexicalError;
import compilador.Lexico;
import compilador.Token;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author ctomazoni
 */
public class CompiladorFrm extends javax.swing.JFrame {

    /**
     * Creates new form CompiladorFrm
     */
    private File arquivoAtual = null;
    private boolean isArquivoNovo = true;
    
    public CompiladorFrm() {
        initComponents();
        editorTA.setBorder(new NumberedBorder());
        criaAtalhosTeclado();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        compiladorJP = new javax.swing.JPanel();
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
        barraStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 620));
        setPreferredSize(new java.awt.Dimension(900, 620));
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        compiladorJP.setMinimumSize(new java.awt.Dimension(900, 620));
        compiladorJP.setPreferredSize(new java.awt.Dimension(900, 620));
        compiladorJP.setLayout(new java.awt.GridBagLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setToolTipText("");
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setMinimumSize(new java.awt.Dimension(750, 480));
        jScrollPane1.setOpaque(false);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(750, 480));

        editorTA.setColumns(20);
        editorTA.setRows(5);
        editorTA.setTabSize(4);
        editorTA.setMinimumSize(null);
        editorTA.setPreferredSize(null);
        jScrollPane1.setViewportView(editorTA);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = -10;
        gridBagConstraints.ipady = -13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(11, 6, 0, 14);
        compiladorJP.add(jScrollPane1, gridBagConstraints);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setMinimumSize(new java.awt.Dimension(750, 105));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(750, 105));

        areaMensagemTA.setEditable(false);
        areaMensagemTA.setColumns(20);
        areaMensagemTA.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        areaMensagemTA.setRows(5);
        areaMensagemTA.setTabSize(4);
        areaMensagemTA.setMinimumSize(new java.awt.Dimension(700, 250));
        areaMensagemTA.setName(""); // NOI18N
        jScrollPane2.setViewportView(areaMensagemTA);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = -25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 14);
        compiladorJP.add(jScrollPane2, gridBagConstraints);

        barraFerramentas.setMinimumSize(new java.awt.Dimension(145, 590));
        barraFerramentas.setPreferredSize(new java.awt.Dimension(145, 590));
        barraFerramentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/design/img/new.png"))); // NOI18N
        btnNew.setText("new [ctrl-n]");
        btnNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNew.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        barraFerramentas.add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 145, 60));

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/design/img/save.png"))); // NOI18N
        btnSave.setText("save [ctrl-s]");
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        barraFerramentas.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 145, 60));

        btnOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/design/img/open.png"))); // NOI18N
        btnOpen.setText("open [ctrl-o]");
        btnOpen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOpen.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnOpen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });
        barraFerramentas.add(btnOpen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 145, 60));

        btnCopy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/design/img/copy.png"))); // NOI18N
        btnCopy.setText("copy [ctrl-c]");
        btnCopy.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCopy.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCopy.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyActionPerformed(evt);
            }
        });
        barraFerramentas.add(btnCopy, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 145, 60));

        btnPaste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/design/img/paste.png"))); // NOI18N
        btnPaste.setText("paste [ctrl-v]");
        btnPaste.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPaste.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnPaste.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasteActionPerformed(evt);
            }
        });
        barraFerramentas.add(btnPaste, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 145, 60));

        btnCut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/design/img/cut.png"))); // NOI18N
        btnCut.setText("cut [ctrl-x]");
        btnCut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCut.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCut.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCutActionPerformed(evt);
            }
        });
        barraFerramentas.add(btnCut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 145, 60));

        btnCompile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/design/img/compile.png"))); // NOI18N
        btnCompile.setText("compile [F9]");
        btnCompile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCompile.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCompile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCompile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompileActionPerformed(evt);
            }
        });
        barraFerramentas.add(btnCompile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 145, 60));

        btnAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compilador/design/img/about.png"))); // NOI18N
        btnAbout.setText("about [F1]");
        btnAbout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAbout.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAbout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });
        barraFerramentas.add(btnAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 145, 60));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        compiladorJP.add(barraFerramentas, gridBagConstraints);

        barraStatus.setMinimumSize(new java.awt.Dimension(900, 25));
        barraStatus.setPreferredSize(new java.awt.Dimension(900, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = -24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 11, 14);
        compiladorJP.add(barraStatus, gridBagConstraints);

        getContentPane().add(compiladorJP);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        areaMensagemTA.setText("Desenvolvido por:\n- Cleber Tomazoni\n- Gabriel Deggau Schmidt\n- Nicolas José Cordeiro Viana\n");
    }//GEN-LAST:event_btnAboutActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        try {
            realizarOpen();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao abrir arquivo: " + ex.getMessage() + ". Contate os administradores do sistema e tente novamente.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        realizarNovo();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            realizarSalvar();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar arquivo: " + ex.getMessage() + ". Contate os administradores do sistema e tente novamente.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCompileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompileActionPerformed
        Lexico lexico = new Lexico();
        //...
        lexico.setInput(new StringReader(editorTA.getText()));
        //...
        try{
            Token t = null;
            while ( (t = lexico.nextToken()) != null ){
                areaMensagemTA.append(t.getLexeme()+"\n");
            }
        }catch(LexicalError e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnCompileActionPerformed

    private void btnCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyActionPerformed
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection selection = new StringSelection(editorTA.getSelectedText());
        clipboard.setContents(selection, null);
    }//GEN-LAST:event_btnCopyActionPerformed

    private void btnPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasteActionPerformed
        editorTA.paste();
    }//GEN-LAST:event_btnPasteActionPerformed

    private void btnCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCutActionPerformed
        editorTA.cut();
    }//GEN-LAST:event_btnCutActionPerformed

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
    
    private void criaAtalhosTeclado() {
        Action newAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        };
        Action openAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        };
        Action saveAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        };
        Action compileAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btnCompileActionPerformed(evt);
            }
        };
        Action aboutAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        };
        ActionMap actionMap = compiladorJP.getActionMap();
        actionMap.put("new", newAction);
        actionMap.put("open", openAction);
        actionMap.put("save", saveAction);
        actionMap.put("compile", compileAction);
        actionMap.put("about", aboutAction);
        InputMap imap = compiladorJP.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        imap.put(KeyStroke.getKeyStroke("ctrl N"), "new");
        imap.put(KeyStroke.getKeyStroke("ctrl O"), "open");
        imap.put(KeyStroke.getKeyStroke("ctrl S"), "save");
        imap.put(KeyStroke.getKeyStroke("F9"), "compile");
        imap.put(KeyStroke.getKeyStroke("F1"), "about");
    }
    
    private void realizarNovo() {
        editorTA.setText("");
        areaMensagemTA.setText("");
        barraStatus.setText("");
        isArquivoNovo = true;
        arquivoAtual = null;
    }
    
    private void realizarOpen() throws IOException {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.addChoosableFileFilter(new TextoFilter());
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int resposta = fileChooser.showOpenDialog(this);
        if (JFileChooser.APPROVE_OPTION == resposta) {
            File arquivo = fileChooser.getSelectedFile();
            String absolutePath = arquivo.getAbsolutePath();
            String conteudo = Files.readAllLines(Paths.get(absolutePath)).stream().collect(Collectors.joining("\r\n"));
            
            editorTA.setText(conteudo);
            areaMensagemTA.setText("");
            barraStatus.setText(absolutePath);
            arquivoAtual = arquivo;
            isArquivoNovo = false;
        }
    }
    
    private void realizarSalvar() throws IOException {
        String texto = editorTA.getText();
        
        if (isArquivoNovo) {
            JFileChooser fileChooser = new JFileChooser();
            int resposta = fileChooser.showSaveDialog(this);
            
            if (JFileChooser.APPROVE_OPTION == resposta) {
                
                String nomeArquivo = fileChooser.getSelectedFile() + ".txt";
                
                escreverArquivo(nomeArquivo, texto);
                
                areaMensagemTA.setText("");
                barraStatus.setText(nomeArquivo);
                
                isArquivoNovo = false;
                arquivoAtual = new File(nomeArquivo);
                
                JOptionPane.showMessageDialog(this, "Arquivo salvo com sucesso", "Arquivo salvo", JOptionPane.INFORMATION_MESSAGE);
            }
   
        } else {
            escreverArquivo(arquivoAtual.getAbsolutePath(), texto);
            areaMensagemTA.setText("");
            arquivoAtual = new File(arquivoAtual.getAbsolutePath());
            
            JOptionPane.showMessageDialog(this, "Arquivo salvo com sucesso", "Arquivo salvo", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void escreverArquivo(String nomeArquivo, String textoQuebrado) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(new StringReader(textoQuebrado));
            PrintWriter writer = new PrintWriter(new FileWriter(nomeArquivo)); ) {
                reader.lines().forEach(line -> writer.println(line));
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaMensagemTA;
    private javax.swing.JPanel barraFerramentas;
    private javax.swing.JLabel barraStatus;
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnCompile;
    private javax.swing.JButton btnCopy;
    private javax.swing.JButton btnCut;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnPaste;
    private javax.swing.JButton btnSave;
    private javax.swing.JPanel compiladorJP;
    private javax.swing.JTextArea editorTA;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private class TextoFilter extends FileFilter {

        @Override
        public boolean accept(File f) {
            return f.isDirectory() || f.getName().endsWith(".txt");
        }

        @Override
        public String getDescription() {
            return "Arquivos de texto";
        }
    }

}
