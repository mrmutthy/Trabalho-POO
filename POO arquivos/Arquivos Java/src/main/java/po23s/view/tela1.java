
package po23s.view;
import po23s.http.ClienteHttp;
import po23s.model.Livro;
import javax.swing.DefaultListModel;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;
import javax.swing.AbstractListModel;


public class tela1 extends javax.swing.JFrame {

    private DefaultListModel<String> modelo;
    
    
    
    public tela1() {
        initComponents();
        //customInitComponents();
        modelo = new DefaultListModel<>();
        
        nomelivro.setModel(modelo);
    }

    
   /* private void customInitComponents() {
        modelo = new DefaultListModel<>();

        nomelivro.setModel(new AbstractListModel<String>() {
            @Override
            public int getSize() {
                return modelo.getSize();
            }

            @Override
            public Livro getElementAt(int i) {
                return modelo.getElementAt(i);
            }
        });
        }
        */
     
    

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        pesquisa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        nomelivro = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        quantos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        jInternalFrame1.setVisible(true);

        pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Digite o nome do Livro:");

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nomelivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                troca(evt);
            }
        });
        jScrollPane1.setViewportView(nomelivro);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel11.setText("Quantidade:");

        quantos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quantos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addGap(12, 12, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(3, 3, 3)
                .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(quantos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaActionPerformed

    }//GEN-LAST:event_pesquisaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String buscar = pesquisa.getText();
    //    int quantidade = Integer.parseInt(quantos.getText());
       
        
        
        ClienteHttp cliente = new ClienteHttp();
        String json = cliente.buscaDados("https://www.googleapis.com/books/v1/volumes?q="+ buscar);
        
        JSONObject jsonObject = new JSONObject(json);
        JSONArray itensJson = jsonObject.optJSONArray("items");
        
        //modelo.clear();
        
             /*for (int i = 0; i < itensJson.length(); i++) {
                JSONObject item = itensJson.getJSONObject(i);
                JSONObject volumeInfo = item.optJSONObject("volumeInfo");
                JSONObject saleInfo = item.optJSONObject("saleInfo");
                JSONObject accessInfo = item.optJSONObject("accessInfo");
                Livro livro = new Livro();
         
                String Title = volumeInfo.optString("title");
                livro.setTitulo(Title);

                
                System.out.println(Title);
                
                modelo.addElement(Title);} */  
        if (itensJson != null) {
            for (int i = 0; i < itensJson.length(); i++) {
                JSONObject item = itensJson.getJSONObject(i);
                JSONObject volumeInfo = item.optJSONObject("volumeInfo");
                JSONObject saleInfo = item.optJSONObject("saleInfo");
                JSONObject accessInfo = item.optJSONObject("accessInfo");
                Livro livro = new Livro();
         
                String Title = volumeInfo.optString("title");
                livro.setTitulo(Title);
                String Publisher = volumeInfo.optString("publisher");
                livro.setEditora(Publisher);
                String Descricao = volumeInfo.optString("description");
                livro.setDescricao(Descricao);
                
                System.out.println(Title);
                
                modelo.addElement(Title);
                
                
                if (volumeInfo != null) {
                    List<String> autores = new ArrayList<>();

                    String title = volumeInfo.optString("title", "Título não disponível!");
                    livro.setTitulo(title);
                    String publisher = volumeInfo.optString("publisher", "Editora não disponível!");
                    livro.setEditora(publisher);
                    String descricao = volumeInfo.optString("description", "Descrição não disponível!");
                    livro.setDescricao(descricao);

                    JSONArray autoresJson = volumeInfo.optJSONArray("authors");
                    
                                    if (autoresJson != null) {
                        for (int j = 0; j < autoresJson.length(); j++) {
                            autores.add(autoresJson.getString(j));
                        }
                    }
                    if (autores.isEmpty()){
                        autores.add("Autores Desconhecido!");
                    }
                    livro.setAutores(autores); 
                }
                
                    JSONObject listPrice = saleInfo.optJSONObject("listPrice");
                        if (listPrice != null) {
                            double valor = listPrice.optDouble("amount", 0.0);
                            livro.setValor(valor);
                        } else {
                        // Trate o caso em que "listPrice" é nulo, se necessário
                    }

                
                if (accessInfo != null){
                    boolean disponivelPDF = accessInfo.optJSONObject("pdf").optBoolean("isAvailable", false);
                    livro.setDisponivelPDF(disponivelPDF);
                }

                
                
                //modelo.clear();
                //modelo.addElement(livro);
                
                
                
                
                
                        
                        
            }
        
            
            
            
        }   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void quantosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantosActionPerformed

    private void troca(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_troca
      
        
        tela2 visor = new tela2(this, true); 
    //    visor.passadados(nome, autor, editora, valor, pdf, descricao);
        visor.setVisible(true);
       
    }//GEN-LAST:event_troca

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
            java.util.logging.Logger.getLogger(tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
        tela1 tela = new tela1();
        tela.setTitle("Livraria Virtual");
        tela.setVisible(true);
            }  
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JList<String> nomelivro;
    private javax.swing.JTextField pesquisa;
    private javax.swing.JTextField quantos;
    // End of variables declaration//GEN-END:variables
}
