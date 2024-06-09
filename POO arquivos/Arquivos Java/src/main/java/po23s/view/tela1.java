
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
import javax.swing.JOptionPane;


public class tela1 extends javax.swing.JFrame {

    private DefaultListModel<String> modelo;
    private DefaultListModel<String> modelo2;
    private List<Livro> album;
    
    
    
    public tela1() {
        initComponents();
        //customInitComponents();
        modelo = new DefaultListModel<>();
        modelo2 = new DefaultListModel<>();
        
        
        this.album = new ArrayList<>();

        
        nomelivro.setModel(modelo);
        autorlivro.setModel(modelo2);
    }

    

     
    

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        pesquisa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        nomelivro = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        autorlivro = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        quantos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        autorlivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                troca(evt);
            }
        });
        jScrollPane2.setViewportView(autorlivro);

        jLabel1.setText("Titulo");

        jLabel2.setText("Editora");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(2, 2, 2)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(21, 21, 21))))
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
                .addGap(6, 6, 6)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
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
        int quantidade;
       
        try{
            quantidade = Integer.parseInt(quantos.getText());
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, "Informe um numero valido", "ERRO!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        //ClienteHttp cliente = new ClienteHttp();
        //String json = cliente.buscaDados("https://www.googleapis.com/books/v1/volumes?q="+ buscar);
        
        ClienteHttp cliente = new ClienteHttp();
        String url = "https://www.googleapis.com/books/v1/volumes?q="+ buscar;
        if (quantidade > 0) {
            url = url += "&maxResults=" + quantidade;
        }
        String json = cliente.buscaDados(url);

        
        JSONObject jsonObject = new JSONObject(json);
        JSONArray itensJson = jsonObject.optJSONArray("items");
        
        modelo.clear();
        modelo2.clear();
        
        
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
                
            //    System.out.println(Title);
                
                
                
                
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
                    
                    /*if (publisher.isEmpty()){                
                        livro.setEditora("Editora não disponível!");
                    }*/
                    
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
                    }

                
                if (accessInfo != null){
                    boolean disponivelPDF = accessInfo.optJSONObject("pdf").optBoolean("isAvailable", false);
                    livro.setDisponivelPDF(disponivelPDF);
                }

                
                modelo.addElement(Title);
                modelo2.addElement(Publisher);
                
                album.add(livro);
                
                
                
                        
                        
            }
        
            
            
            
        }   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void quantosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantosActionPerformed

    private void troca(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_troca
      
        
        tela2 visor = new tela2(this, true); 
        
        album.get(nomelivro.getSelectedIndex());
            
            visor.passadados(album.get(nomelivro.getSelectedIndex()).getTitulo(), album.get(nomelivro.getSelectedIndex()).getAutores(), album.get(nomelivro.getSelectedIndex()).getEditora(), album.get(nomelivro.getSelectedIndex()).getValor(), album.get(nomelivro.getSelectedIndex()).getDescricao());
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
    private javax.swing.JList<String> autorlivro;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JList<String> nomelivro;
    private javax.swing.JTextField pesquisa;
    private javax.swing.JTextField quantos;
    // End of variables declaration//GEN-END:variables
}
