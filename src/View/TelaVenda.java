/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author Gabriel
 */
public class TelaVenda extends javax.swing.JInternalFrame {

    /**
     * Creates new form Venda
     */
    public TelaVenda() {
        initComponents();
        centralizarComponente();


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
         public void centralizarComponente() {
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dw = getSize();
        setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        TxConsultaId = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        TxNomeConsulta = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TxCpfConsulta = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        BtPesquisarConsulta = new javax.swing.JButton();
        TxCnpjConsulta = new javax.swing.JFormattedTextField();
        BtLimparCli = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxNome = new javax.swing.JTextField();
        BuscaCliente = new javax.swing.JButton();
        TxProduto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BuscaProduto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TxData = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TxDesconto = new javax.swing.JTextField();
        BtAlterar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        TxValortotal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TxTipopagamento = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        TxCodProduto = new javax.swing.JTextField();
        BtIncluir = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        TxSubValor = new javax.swing.JTextField();
        BtRemover = new javax.swing.JButton();
        BtNovo = new javax.swing.JButton();
        BtFinalizar = new javax.swing.JButton();
        BtCancelar = new javax.swing.JButton();
        BtSair = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Formulário de Venda");
        setToolTipText("");

        jLabel13.setText("Cód Cliente");

        jLabel14.setText("Nome");

        jLabel15.setText("CPF");

        try {
            TxCpfConsulta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel16.setText("CNPJ");

        BtPesquisarConsulta.setText("Pesquisar");
        BtPesquisarConsulta.setEnabled(false);
        BtPesquisarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtPesquisarConsultaActionPerformed(evt);
            }
        });

        try {
            TxCnpjConsulta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxCnpjConsulta.setToolTipText("");

        BtLimparCli.setText("Limpar");
        BtLimparCli.setEnabled(false);
        BtLimparCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLimparCliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(TxConsultaId, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(TxNomeConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(TxCpfConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtPesquisarConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtLimparCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(63, 63, 63))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(TxCnpjConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(BtPesquisarConsulta))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(TxConsultaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14))
                    .addComponent(BtLimparCli))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxNomeConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxCpfConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxCnpjConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(60, 60, 60))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta", jPanel2);

        jLabel1.setText("Nome Cliente");

        TxNome.setEditable(false);

        BuscaCliente.setText("Busca");
        BuscaCliente.setEnabled(false);

        TxProduto.setEditable(false);

        jLabel2.setText("Descrição Produto");

        BuscaProduto.setText("Busca");
        BuscaProduto.setEnabled(false);

        jLabel5.setText("Data");

        TxData.setEditable(false);
        try {
            TxData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel6.setText("Tabela de Pesquisa");

        jLabel7.setText("Itens de Venda");

        jLabel8.setText("Desconto");

        TxDesconto.setEditable(false);
        TxDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxDescontoActionPerformed(evt);
            }
        });

        BtAlterar.setText("Alterar");
        BtAlterar.setEnabled(false);
        BtAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAlterarActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel10.setText("Valor Total");

        TxValortotal.setEditable(false);
        TxValortotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxValortotalActionPerformed(evt);
            }
        });

        jLabel11.setText("Tipo de Pagamento");

        TxTipopagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Dinheiro", "Cheque ", "Cartao", " " }));
        TxTipopagamento.setEnabled(false);

        jLabel9.setText("Cód Produto");

        TxCodProduto.setEditable(false);

        BtIncluir.setText("Incluir");
        BtIncluir.setEnabled(false);

        jLabel12.setText("Valor Sub-Total");

        TxSubValor.setEditable(false);

        BtRemover.setText("Remover");
        BtRemover.setEnabled(false);

        BtNovo.setText("Novo");
        BtNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtNovoActionPerformed(evt);
            }
        });

        BtFinalizar.setText("Finalizar ");
        BtFinalizar.setEnabled(false);
        BtFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtFinalizarActionPerformed(evt);
            }
        });

        BtCancelar.setText("Cancelar");
        BtCancelar.setEnabled(false);
        BtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCancelarActionPerformed(evt);
            }
        });

        BtSair.setText("Sair");
        BtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(BtIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtRemover)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(TxSubValor, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TxDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BtAlterar))
                                    .addComponent(jLabel8))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxValortotal, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(TxTipopagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(BtCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(BtSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TxCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(TxProduto))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(TxData, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(BuscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BuscaCliente)
                        .addComponent(TxData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BuscaProduto))))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtIncluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtRemover)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxSubValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtAlterar)
                    .addComponent(TxValortotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxTipopagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtNovo)
                    .addComponent(BtFinalizar)
                    .addComponent(BtCancelar)
                    .addComponent(BtSair)))
        );

        jTabbedPane1.addTab("Atendimento", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAlterarActionPerformed
        JPasswordField password = new  JPasswordField(3);
        password.setEchoChar('*');
        
	
	      
        JOptionPane.showMessageDialog(null,password,"Digite a senha do gerente",JOptionPane.PLAIN_MESSAGE);
       
         
          if(password.getText().equals("121")){
               JOptionPane.showMessageDialog(null,"Desconto autorizado ");
             TxDesconto.setEditable(true);
          }
          else{
              JOptionPane.showMessageDialog(null,"Senha incorreta! ");
          }
       
          
      
    }//GEN-LAST:event_BtAlterarActionPerformed

    private void BtFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtFinalizarActionPerformed
       if(TxNome.getText().equals("") || TxCodProduto.getText().equals("") || TxData.getValue().equals("") || TxDesconto.getText().equals("") || TxTipopagamento.getSelectedItem().equals("Selecione") || TxSubValor.getText().equals("") || TxProduto.getText().equals("")|| TxValortotal.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Por favor preencha todos os campos");
       }
       else{
          JOptionPane.showMessageDialog(null,"Venda Realizada com sucesso");
           TxNome.setText("");
           TxCodProduto.setText("");
           TxData.setValue("");
           TxDesconto.setText("");
           TxProduto.setText("");
           TxTipopagamento.setSelectedItem("Selecione");
           TxValortotal.setText("");
           TxSubValor.setText("");
           BtAlterar.setEnabled(false);
           TxNome.setEditable(false);
           TxCodProduto.setEditable(false);
           TxData.setEditable(false);
           TxDesconto.setEditable(false);
           TxProduto.setEditable(false);
           TxTipopagamento.setEnabled(false);
           TxValortotal.setEditable(false);
           TxSubValor.setEditable(false);
           
          
       }
    }//GEN-LAST:event_BtFinalizarActionPerformed

    private void TxValortotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxValortotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxValortotalActionPerformed

    private void TxDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxDescontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxDescontoActionPerformed

    private void BtPesquisarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPesquisarConsultaActionPerformed
        if (TxConsultaId.getText().length() != 0  || TxNomeConsulta.getText().length() != 0 || TxCnpjConsulta.getText().length()!=0|| TxCpfConsulta.getText().length()!=0) {
            this.jTabbedPane1.setSelectedIndex(1);
            TxConsultaId.setText("");
            TxNomeConsulta.setText("");
            TxCnpjConsulta.setText("");
            TxCpfConsulta.setText("");
        }
        else {
            JOptionPane.showMessageDialog(null, "Digite algum parâmetro para a pesquisa!");
        }
        BtLimparCli.setEnabled(true);
    }//GEN-LAST:event_BtPesquisarConsultaActionPerformed

    private void BtLimparCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLimparCliActionPerformed
        int op = JOptionPane.showConfirmDialog(this, "Deseja realmente limpar?", "Confirmação",JOptionPane.YES_NO_OPTION);

        if(op==0){
            TxConsultaId.setText("");
            TxNomeConsulta.setText("");
            TxCpfConsulta.setText("");
            TxCnpjConsulta.setText("");
        }
    }//GEN-LAST:event_BtLimparCliActionPerformed

    private void BtNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtNovoActionPerformed
           BtAlterar.setEnabled(true);
           TxNome.setEditable(true);
           TxCodProduto.setEditable(true);
           TxData.setEditable(true);
           TxDesconto.setEditable(true);
           TxProduto.setEditable(true);
           TxTipopagamento.setEnabled(true);
           TxValortotal.setEditable(true);
           TxSubValor.setEditable(true);
           BtCancelar.setEnabled(true);
           BtFinalizar.setEnabled(true);
           BtRemover.setEnabled(true);
           BtIncluir.setEnabled(true);
           BuscaCliente.setEnabled(true);
           BuscaProduto.setEnabled(true);
    }//GEN-LAST:event_BtNovoActionPerformed

    private void BtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtSairActionPerformed

    private void BtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCancelarActionPerformed
           
    }//GEN-LAST:event_BtCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAlterar;
    private javax.swing.JButton BtCancelar;
    private javax.swing.JButton BtFinalizar;
    private javax.swing.JButton BtIncluir;
    private javax.swing.JButton BtLimparCli;
    private javax.swing.JButton BtNovo;
    private javax.swing.JButton BtPesquisarConsulta;
    private javax.swing.JButton BtRemover;
    private javax.swing.JButton BtSair;
    private javax.swing.JButton BuscaCliente;
    private javax.swing.JButton BuscaProduto;
    private javax.swing.JFormattedTextField TxCnpjConsulta;
    private javax.swing.JTextField TxCodProduto;
    private javax.swing.JTextField TxConsultaId;
    private javax.swing.JFormattedTextField TxCpfConsulta;
    private javax.swing.JFormattedTextField TxData;
    private javax.swing.JTextField TxDesconto;
    private javax.swing.JTextField TxNome;
    private javax.swing.JTextField TxNomeConsulta;
    private javax.swing.JTextField TxProduto;
    private javax.swing.JTextField TxSubValor;
    private javax.swing.JComboBox<String> TxTipopagamento;
    private javax.swing.JTextField TxValortotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}