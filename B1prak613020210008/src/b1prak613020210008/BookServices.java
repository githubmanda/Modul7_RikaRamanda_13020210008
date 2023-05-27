/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package b1prak613020210008;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class BookServices extends javax.swing.JFrame {

   private String menu = "";
   private ArrayList<String> bookName = new ArrayList<>();
   private ArrayList<String> authorName = new ArrayList<>();
   
   private void changeAllVisible(boolean value){
       fieldBookName.setVisible(value);
       fieldAuthorName.setVisible(value);
       fieldId.setVisible(false);
       btnSet.setVisible(value);
   }
   
   private void changeAllVisibleUpdate(boolean value){
       fieldBookName.setVisible(value);
       fieldAuthorName.setVisible(value);
       fieldId.setVisible(false);
       btnSet.setVisible(value);
       
       btnSet.setVisible(value);
   }
   
   void addBook(){
       bookName.add(fielBookName.getText());
       authorName.add(fieldAuthorName.getText());
   }
   
   void findListBook(){
       DefaultListModel<String> model = new DefaultListModel<>();
       
       for (int i = 0; i<bookName.size(); i++){
           String outputText = "";
           outputText += (i + 1) + ". ";
           outputText += "Nama Buku: "+ bookName.get(i) + ", ";
           outputText += "Nama Author: "+ authorName.get(i);
           model.addElement(outputText);     
       }
       iList1.setMode(model);
   }
   
   void findlListBookById(int i){
       DefaultListModel<String> model = new DefaultListModel<>();
       
       String outputText = "";
       outputText += "Nama Buku: "+ bookName.get(i-1) + ", ";
       outputText += "Nama Author: "+ authorName.get(i-1);
       model.addElement(outputText);
       
       jList1.setMode(model);
   }
   
   void findListBookId(int i){
       DefaultListModel<String> model = new DefaultListModel();
       
       String outputText = "";
       outputText += (i) + ". ";
       outputText += "Nama Buku: "+ bookName.get(i-1)+", ";
       outputText += "Nama Author: "+ authorName.get(i-1);
       model.addElement(outputText);
       
       jList1.setMode(model);
   }
   
   void findListBookBy(int i){
       DefaultListModel<String> model = new DefaultListModel<>();
       
       String outputText = "";
       outputText += "Nama Buku: "+ bookName.get(i-1)+ ", ";
       outputText += "Nama Author: "+ authorName.get(i-1);
       model.addElement(outputText);
       
       jList1.setModel(model);
   }
   
   void deleteBook(int i){
       bookName.remove(i - 1);
   }
   
   void changeMenu(String menu){
       this.menu = menu;
   }
   
   void updateBook(){
       int id = Integer.parseInt(fieldId.getText()) -1;
       String set = bookName.set(id, fieldBookName.getText());
       authorName.set(id, fieldAuthorName.getText());
   }
   
   public BookServices(){
       initComponents();
       changeAllVisible(false);
       panelOutput.SetVisible(true);
   }

private void btnAddActionPerformed(java.awt.event.ActionEvent evt){
   fieldBookName.setText("Book name");
   changeBookNameVisible(false);
   changeAllVisible(true);
   changeMenu("add");
}

private void btnFindBookActionPerformed(java.awt.event.ActionEvent evt){
    findListBook();
    changeAllVisible(false);
    panelOutput.setVisible(true);
}

private void btnFindByIdActionPerformed(java.awt.event.ActionEvent evt){
    fieldBookName.setText("ID Book");
    changeBookNameVisible(true);
    changeMenu("findById");
}

private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt){
    changeAllVisible(false);
    changeAllVisibleUpdate(true);
    changeMenu("update");
}

private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt){
    fieldBookName.setText("ID Book");
    changeAllVisible(false);
    
    changeBookNameVisible(true);
    changeMenu("delete");
}

private void fieldBookNameActionPerformed(java.awt.event.ActionEvent evt){
}

private void fieldAuthorNameActionPerformed(java.awt.event.ActionEvent evt){
}

private void btnSetActionPerformed(java.awt.event.ActionEvent evt){
    switch (menu){
        case "add":
            addBook();
            break;
        
        case "delete":
            deleteBook(Integer.parseInt(fieldBookName.getText()));
            break;
        case "update":
            updateBook();
            break;
        case "findById":
            findListBookById(Integer.parseInt(fieldBookName.getText()));
            break;
    }
}


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(BookServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookServices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
