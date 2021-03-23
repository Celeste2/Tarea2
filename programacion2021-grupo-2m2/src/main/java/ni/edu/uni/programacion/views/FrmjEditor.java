package ni.edu.uni.programacion.views;

import java.awt.Component;
import java.awt.Font;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import ni.edu.uni.programacion.views.panels.PnlEditor;

/**
 *
 * @author Sistemas-05
 */
public class FrmjEditor extends javax.swing.JFrame {

    private int countTab;
    Logger logger = Logger.getLogger(FrmjEditor.class.getName());

    /**
     * Creates new form FrmEditor
     */
    public FrmjEditor() {
        countTab = 1;
        
        
        logger.setLevel(Level.INFO);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCloseTab = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnFile = new javax.swing.JMenu();
        mniNew = new javax.swing.JMenuItem();
        mniOpen = new javax.swing.JMenuItem();
        mniSaveAs = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniExit = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        btnCloseTab.setText("X");
        btnCloseTab.setFocusable(false);
        btnCloseTab.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCloseTab.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCloseTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseTabActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Text Editor");

        jToolBar1.setRollover(true);
        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jScrollPane2.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane2, java.awt.BorderLayout.CENTER);

        mnFile.setText("File");

        mniNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new-file.png"))); // NOI18N
        mniNew.setText("Nuevo");
        mniNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNewActionPerformed(evt);
            }
        });
        mnFile.add(mniNew);

        mniOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniOpen.setText("Abrir");
        mniOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniOpenActionPerformed(evt);
            }
        });
        mnFile.add(mniOpen);

        mniSaveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniSaveAs.setText("Guardar Como");
        mniSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSaveAsActionPerformed(evt);
            }
        });
        mnFile.add(mniSaveAs);
        mnFile.add(jSeparator1);

        mniExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniExit.setText("Salir");
        mniExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExitActionPerformed(evt);
            }
        });
        mnFile.add(mniExit);

        jMenuBar1.add(mnFile);

        jMenu1.setText("Editar");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Escoger Fuente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(977, 497));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mniNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNewActionPerformed
        PnlEditor pnlEditor = new PnlEditor();
        tbpContent.addTab("Editor " + countTab++, pnlEditor);
    }//GEN-LAST:event_mniNewActionPerformed

    private void btnCloseTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseTabActionPerformed
        if (tbpContent.getComponentCount() <= 0) {
            return;
        }
        int option = JOptionPane.showConfirmDialog(null,
                "Are you sure to delete this Tab?",
                "Confirm Dialog",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (option == 1) {
            return;
        }

        int index = tbpContent.getSelectedIndex();
        tbpContent.remove(index);
    }//GEN-LAST:event_btnCloseTabActionPerformed

    private void mniOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniOpenActionPerformed
        // TODO add your handling code here:
logger.info("Entrando al metodo");
        try {
           // Reader filereader;
           
           //Paso No 1 se crea una nueva instancia del file chooser
            final JFileChooser fc = new JFileChooser();
            //Paso No 2 se filtran para solo abrir archivos .txt
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto", "txt", "text");
            fc.setFileFilter(filter);
            //Se abre el filechooser
            int returnvalue = fc.showOpenDialog(FrmjEditor.this);
            
            //Esto es para que el documento no sea editable
        
          
            
            //Se obtiene el nombre del arhcivo
            File archivo = fc.getSelectedFile();
            //filereader = new FileReader(archivo);
            TextFromFile(jTextPane1, archivo);
            
             //Se convierte el nombre del archivo a URL, que es la ruta 
            
         
            
            //Se abre en el jeditor
            
            
//            // Se pone en modo scroll para poder ver los archivos con texto grande
//            JScrollPane editorScrollPane;
//            editorScrollPane = new JScrollPane(jEditorPane1);
//            editorScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//        editorScrollPane.setPreferredSize(new Dimension(250, 145));
//        editorScrollPane.setMinimumSize(new Dimension(10, 10)); 
            
            
            
        } catch (Exception e) {
            logger.severe("Ocurrió exception ".concat(e.toString()));
            JOptionPane.showMessageDialog(null, "Acaba de ocurrir un error " + e.toString());
        }

    }//GEN-LAST:event_mniOpenActionPerformed
public static void TextFromFile(JTextPane tp, File archivo)
     {
        try{
            //the file path
            //URL url = archivo.toURI().toURL();
            
            
            FileReader fr = new FileReader(archivo);
            while(fr.read() != -1){
              tp.read(fr,null);
            }
            fr.close();
        } catch(Exception ex){
          ex.printStackTrace();
        }
     }
    
    
    
    
    private void mniSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSaveAsActionPerformed
        // TODO add your handling code here:
        logger.info("Entrando al metodo guardarcomo");
         try {
              // Reader filereader;
           
           //Paso No 1 se crea una nueva instancia del file chooser
            final JFileChooser fc = new JFileChooser();
            //Paso No 2 se filtran para solo abrir archivos .txt
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto", "txt", "text");
            fc.setFileFilter(filter);
            //Se abre el filechooser
            int returnvalue = fc.showOpenDialog(FrmjEditor.this);
            
               //Se obtiene el nombre del arhcivo
            File archivo = fc.getSelectedFile();
            //filereader = new FileReader(archivo);
            
            
             //Se convierte el nombre del archivo a URL, que es la ruta 
            URL url = archivo.toURI().toURL();
             
             
             
             
             
    FileOutputStream outf = new FileOutputStream(archivo);
    Writer out = new OutputStreamWriter(outf, "utf-8");
    jTextPane1.write(out);
//    jEditorPane1.write(out);
    
     
  } catch (IOException eee) {
    if (logger.isLoggable(Level.SEVERE)) {
      logger.warning(eee.getMessage());
    }
  }
    }//GEN-LAST:event_mniSaveAsActionPerformed

    private void mniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExitActionPerformed
        // TODO add your handling code here:
        
        
        logger.info("Ya me voy");
         
        JOptionPane.showConfirmDialog(rootPane, "¿Está seguro?", "Saliendo del sistema",0);
    }//GEN-LAST:event_mniExitActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        logger.info("Tratando que funcione el fontchooser");
  try {      
        JFontChooser fontChooser = new JFontChooser();
            fontChooser.setLocale(Locale.US);
        //fontChooser.setSelectedFont(jTextPane1.getFont());
        Component c;
        c=null;
        fontChooser.showDialog(c,"" );
         logger.info("viendo el locale del fontchooser"+ fontChooser.getLocale());

               
    Font m = fontChooser.getFont();
     logger.info("acabo de escoger la fuente " + m.toString());
       
     

     
         Font font = fontChooser.getFont();
        logger.info("Se selecciono la fuente");
         
        //jTextPane1.update();
    this.jTextPane1.selectAll();
    this.jTextPane1.setFont(font);
    this.jTextPane1.updateUI();
    }//GEN-LAST:event_jMenuItem1ActionPerformed
  
  catch (Exception e)
  { logger.info(e.toString());
  }
    }
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
            java.util.logging.Logger.getLogger(FrmjEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmjEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmjEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmjEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmjEditor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCloseTab;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenu mnFile;
    private javax.swing.JMenuItem mniExit;
    private javax.swing.JMenuItem mniNew;
    private javax.swing.JMenuItem mniOpen;
    private javax.swing.JMenuItem mniSaveAs;
    // End of variables declaration//GEN-END:variables
}
