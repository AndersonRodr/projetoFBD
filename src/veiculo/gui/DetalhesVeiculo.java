/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculo.gui;

import cliente.service.Servico;
import filial.dominio.Filial;
import filial.service.ServicoFilial;
import static java.lang.Integer.parseInt;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import veiculo.dominio.Veiculo;
import veiculo.service.VeiculoService;

/**
 *
 * @author bruno.an
 */
public class DetalhesVeiculo extends javax.swing.JFrame {
    Servico service = new Servico();

    /**
     * Creates new form RemoverVeiculo
     */
    public DetalhesVeiculo() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        veiculoPlaca = new javax.swing.JTextField();
        revisaoBtn = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        veiculoMotor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        veiculoChassi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        veiculoKm = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        veiculoTipo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        veiculoFilial = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        veiculoRevisao = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JToggleButton();
        editarKm = new javax.swing.JToggleButton();
        deleteBtn2 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel6.setText("DETALHES VEÍCULO");

        jLabel1.setText("INFORME A PLACA DO VEICULO:");

        veiculoPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veiculoPlacaActionPerformed(evt);
            }
        });

        revisaoBtn.setBackground(new java.awt.Color(153, 153, 255));
        revisaoBtn.setText("Fazer Revisão");
        revisaoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revisaoBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("Número Motor");

        veiculoMotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veiculoMotorActionPerformed(evt);
            }
        });

        jLabel5.setText("Numero Chassi");

        veiculoChassi.setToolTipText("");
        veiculoChassi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veiculoChassiActionPerformed(evt);
            }
        });

        jLabel7.setText("Quilometragem");

        jLabel9.setText("Tipo Veículo");

        jLabel10.setText("Filial");

        veiculoFilial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veiculoFilialActionPerformed(evt);
            }
        });

        jLabel11.setText("Ùltima Revisão");

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        editarKm.setBackground(new java.awt.Color(153, 153, 255));
        editarKm.setText("Editar Quilometragem");
        editarKm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarKmActionPerformed(evt);
            }
        });

        deleteBtn2.setBackground(new java.awt.Color(153, 153, 255));
        deleteBtn2.setText("Remover Veículo");
        deleteBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(veiculoMotor)
                                .addComponent(veiculoChassi)
                                .addComponent(veiculoRevisao, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(revisaoBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(editarKm)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addComponent(veiculoKm)
                                    .addComponent(jLabel9)
                                    .addComponent(veiculoTipo)
                                    .addComponent(jLabel10)
                                    .addComponent(veiculoFilial, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteBtn2)))
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnbuscar)
                                .addGap(177, 177, 177))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(veiculoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(124, 124, 124))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(115, 115, 115))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(veiculoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(veiculoKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(veiculoMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(veiculoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(veiculoChassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(veiculoFilial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(veiculoRevisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(revisaoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarKm, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void veiculoPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veiculoPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_veiculoPlacaActionPerformed

    private void revisaoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revisaoBtnActionPerformed
       if(validarCampos()){
           VeiculoService vService = new VeiculoService();
           Veiculo veiculo = vService.buscarVeiculo(veiculoPlaca.getText());
           if(veiculo != null){
               LocalDate saida1 = java.time.LocalDate.now();
               String saida = String.valueOf(saida1);
               vService.updateRevisaoVeiculo(veiculoPlaca.getText(),saida);
               JOptionPane.showMessageDialog(null, "Revisão efetuada com sucesso");
               
           }else{
               JOptionPane.showMessageDialog(null, "Veiculo não encontrado");
           }
           
       }else{
           JOptionPane.showMessageDialog(null, "Placa inválida");
       }
      
       
       
       
    }//GEN-LAST:event_revisaoBtnActionPerformed

    private void veiculoMotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veiculoMotorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_veiculoMotorActionPerformed

    private void veiculoChassiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veiculoChassiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_veiculoChassiActionPerformed

    private void veiculoFilialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veiculoFilialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_veiculoFilialActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
       if(validarCampos()){
           VeiculoService vService = new VeiculoService();
           ServicoFilial fService = new ServicoFilial();
           Veiculo veiculo = vService.buscarVeiculo(veiculoPlaca.getText());
           if (veiculo != null){
               veiculoMotor.setText(veiculo.getNumeroMotor());
               veiculoChassi.setText(veiculo.getNumeroMotor());
               Filial filial = fService.buscarFilial1(veiculo.getFilial());
               veiculoFilial.setText(filial.getLocalizacao());
               veiculoKm.setText(String.valueOf(veiculo.getQuilometragem()));
               veiculoRevisao.setText(veiculo.getUltimaRevisao());
               String tipoVeiculo = vService.getTipoVeiculo(String.valueOf(veiculo.getTipoVeiculo()));
               veiculoTipo.setText(tipoVeiculo);
//               Date date  = new Date();
//               long time;
//               time = date.getTime();
  
           } else{
               JOptionPane.showMessageDialog(null, "Veículo não encontrado");
               veiculoMotor.setText("");
               veiculoChassi.setText("");
               veiculoFilial.setText("");
               veiculoKm.setText("");
               veiculoRevisao.setText("");
               veiculoTipo.setText("");
           }
           
           
       }
        
        
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void editarKmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarKmActionPerformed
        if(validarCampos()){
            if(!service.isEmpty(String.valueOf(veiculoKm.getText()))){
                try{
                    int x = parseInt(veiculoKm.getText());
                    VeiculoService vService =  new VeiculoService();
                    if(vService.buscarVeiculo(veiculoPlaca.getText())!= null){
                        vService.updateKm(veiculoPlaca.getText(), veiculoKm.getText());
                        JOptionPane.showMessageDialog(null, "Quilometragem Atualizada");

                    } else{
                        JOptionPane.showMessageDialog(null, "Veículo não encontrado");
                    }
                }catch(NumberFormatException ex){
                     JOptionPane.showMessageDialog(null, "Formato de Quilometragem inválida");             
                }  
            }              
        } else{
            JOptionPane.showMessageDialog(null, "Placa inválida");   
        }
    }//GEN-LAST:event_editarKmActionPerformed

    private void deleteBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtn2ActionPerformed
        if (validarCampos()){
            VeiculoService vService = new VeiculoService();
            vService.deletarVeiculo(veiculoPlaca.getText());
            JOptionPane.showMessageDialog(null, "Veículo removido com sucesso");
            veiculoPlaca.setText("");
        }
    }//GEN-LAST:event_deleteBtn2ActionPerformed

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
            java.util.logging.Logger.getLogger(DetalhesVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalhesVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalhesVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalhesVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetalhesVeiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnbuscar;
    private javax.swing.JToggleButton deleteBtn2;
    private javax.swing.JToggleButton editarKm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton revisaoBtn;
    private javax.swing.JTextField veiculoChassi;
    private javax.swing.JTextField veiculoFilial;
    private javax.swing.JTextField veiculoKm;
    private javax.swing.JTextField veiculoMotor;
    private javax.swing.JTextField veiculoPlaca;
    private javax.swing.JTextField veiculoRevisao;
    private javax.swing.JTextField veiculoTipo;
    // End of variables declaration//GEN-END:variables

    private boolean validarCampos() {
     if (service.isEmpty(String.valueOf(veiculoPlaca.getText()))){
            JOptionPane.showMessageDialog(null, "Placa inválida");
            return false;
            
     }
    return true;
   }
}
