/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Carro;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruna Leonel
 */
public class TelaCarro2 extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCarro2
     */
    Carro car = new Carro();
    public TelaCarro2() {
        initComponents();
        BtSalvar.setEnabled(false);
        BtAlterar.setEnabled(false);
        BtLimparC.setEnabled(false);
        ComboCombustivel4.setEnabled(false);
        ComboMarca4.setEnabled(false);
        ComboCor4.setEnabled(false);
        ComboModelo4.setEnabled(false);
        ComboPintura4.setEnabled(false);
        ComboDetalhe4.setEnabled(false);
        BtPesquisarC.setEnabled(false);
       
        
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
        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        TxConsultaCarro = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        TxNomeCarro = new javax.swing.JTextField();
        BtPesquisarC = new javax.swing.JButton();
        BtLimparC = new javax.swing.JButton();
        BtSairC = new javax.swing.JButton();
        TxCpfCarro = new javax.swing.JFormattedTextField();
        jLabel25 = new javax.swing.JLabel();
        TxCnpjCarro = new javax.swing.JFormattedTextField();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Chassi = new javax.swing.JLabel();
        TxChassis4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TxKm4 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        ComboCombustivel4 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        TxAnoModelo4 = new javax.swing.JTextField();
        TxAnoFabricação4 = new javax.swing.JTextField();
        ComboModelo4 = new javax.swing.JComboBox<>();
        ComboMarca4 = new javax.swing.JComboBox<>();
        ComboCor4 = new javax.swing.JComboBox<>();
        ComboPintura4 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        TxDataVenda4 = new javax.swing.JFormattedTextField();
        ComboDetalhe4 = new javax.swing.JComboBox<>();
        TxPlaca4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxIdC = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TxNomeC = new javax.swing.JTextField();
        BtSair = new javax.swing.JButton();
        BtAlterar = new javax.swing.JButton();
        BtSalvar = new javax.swing.JButton();
        BtIncluir = new javax.swing.JButton();

        setTitle("Carros");

        jLabel32.setText("Cód Cliente");

        jLabel33.setText("Nome");

        BtPesquisarC.setText("Pesquisar");
        BtPesquisarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtPesquisarCActionPerformed(evt);
            }
        });

        BtLimparC.setText("Limpar");
        BtLimparC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLimparCActionPerformed(evt);
            }
        });

        BtSairC.setText("Sair");
        BtSairC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSairCActionPerformed(evt);
            }
        });

        try {
            TxCpfCarro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel25.setText("CPF");

        try {
            TxCnpjCarro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxCnpjCarro.setToolTipText("");

        jLabel26.setText("CNPJ");

        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(TxConsultaCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(TxNomeCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtPesquisarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtLimparC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtSairC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(63, 63, 63))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxCpfCarro)
                    .addComponent(jLabel26)
                    .addComponent(TxCnpjCarro, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(BtPesquisarC))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxConsultaCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(BtLimparC)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(BtSairC))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxNomeCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxCpfCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxCnpjCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta", jPanel1);

        jTabbedPane2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTabbedPane2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel5.setText("Placa");

        Chassi.setText("Chassis");

        TxChassis4.setEditable(false);
        TxChassis4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxChassis4ActionPerformed(evt);
            }
        });

        jLabel7.setText("Modelo");

        jLabel8.setText("Marca");

        jLabel9.setText("Ano Modelo");

        jLabel10.setText("Data Venda");

        jLabel11.setText("Ano Fabricação");

        TxKm4.setEditable(false);

        jLabel29.setText("Cor");

        jLabel30.setText("Tipo de Pintura");

        ComboCombustivel4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Álcool", "Diesel", "Flex", "Gasolina" }));

        jLabel13.setText("KM");

        jLabel31.setText("Detalhamento Engenharia");

        TxAnoModelo4.setEditable(false);

        TxAnoFabricação4.setEditable(false);

        ComboModelo4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Fox", "Gol", "HB20", "Onix", "Sandero", "Siena", "Voyage" }));

        ComboMarca4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Chevrolet", "Fiat", "Ford", "Hyundai", "Volkswagen" }));

        ComboCor4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Amarelo", "Azul", "Branco", "Laranja", "Prata", "Preto", "Vermelho", "Verde", "Vinho" }));

        ComboPintura4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Metálica", "Perolizada", "Sólida" }));

        jLabel6.setText("Tipo de Combustível");

        TxDataVenda4.setEditable(false);
        try {
            TxDataVenda4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        ComboDetalhe4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Motor 1.0", "Motor 1.4", "Motor 1.8", "Motor 2.0" }));

        TxPlaca4.setEditable(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jLabel30))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(ComboCor4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ComboPintura4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(TxKm4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxDataVenda4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(ComboDetalhe4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(ComboModelo4, 0, 207, Short.MAX_VALUE)
                                    .addComponent(TxPlaca4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(ComboMarca4, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel11))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(ComboCombustivel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(TxAnoFabricação4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(TxAnoModelo4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Chassi)
                                        .addComponent(TxChassis4, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(75, 75, 75))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Chassi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxChassis4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxPlaca4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboModelo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboMarca4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9))
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboCombustivel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxAnoFabricação4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxAnoModelo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboPintura4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboCor4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel10)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxKm4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxDataVenda4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboDetalhe4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Dados", jPanel6);

        jLabel2.setText("Cód Cliente");

        TxIdC.setEditable(false);

        jLabel12.setText("Nome");

        TxNomeC.setEditable(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(TxIdC, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(TxNomeC, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel12))
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxIdC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxNomeC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        BtSair.setText("Sair");
        BtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSairActionPerformed(evt);
            }
        });

        BtAlterar.setText("Alterar");
        BtAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAlterarActionPerformed(evt);
            }
        });

        BtSalvar.setText("Salvar");
        BtSalvar.setToolTipText("");
        BtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalvarActionPerformed(evt);
            }
        });

        BtIncluir.setText("Incluir");
        BtIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtIncluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(BtIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(BtSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(BtSair, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtSalvar)
                    .addComponent(BtSair)
                    .addComponent(BtIncluir)
                    .addComponent(BtAlterar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Manutenção", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtPesquisarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPesquisarCActionPerformed
        if(TxConsultaCarro.getText().length()==1 || TxNomeCarro.getText().length()==1 || TxCpfCarro.getText().length()==1 || TxCnpjCarro.getText().length()==1){
           this.jTabbedPane1.setSelectedIndex(1);
        }
        else {
           JOptionPane.showMessageDialog(null,"Digite algum parâmetro para a pesquisa!");
        }
        BtLimparC.setEnabled(true);
            }//GEN-LAST:event_BtPesquisarCActionPerformed

    private void BtLimparCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLimparCActionPerformed
        int op = JOptionPane.showConfirmDialog(this, "Deseja realmente limpar?", "Confirmação",JOptionPane.YES_NO_OPTION);

        if(op==0){
            TxConsultaCarro.setText("");
            TxNomeCarro.setText("");
        }
        BtLimparC.setEnabled(false);
    }//GEN-LAST:event_BtLimparCActionPerformed

    private void BtSairCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSairCActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtSairCActionPerformed

    private void jTabbedPane2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTabbedPane2AncestorAdded

    }//GEN-LAST:event_jTabbedPane2AncestorAdded

    private void BtIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtIncluirActionPerformed
        TxAnoFabricação4.setEditable(true);
        TxAnoModelo4.setEditable(true);
        TxChassis4.setEditable(true);
        TxNomeC.setEditable(true);
        TxDataVenda4.setEditable(true);
        TxKm4.setEditable(true);
        TxPlaca4.setEditable(true);
        ComboModelo4.setEnabled(true);
        ComboMarca4.setEnabled(true);
        ComboCor4.setEnabled(true);
        ComboPintura4.setEnabled(true);
        ComboDetalhe4.setEnabled(true);
        ComboCombustivel4.setEnabled(true);
        BtSalvar.setEnabled(true);
        BtAlterar.setEnabled(false);
        BtIncluir.setEnabled(false);
    }//GEN-LAST:event_BtIncluirActionPerformed

    private void BtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalvarActionPerformed
       if(ComboModelo4.getSelectedItem().equals("Selecione") || ComboMarca4.getSelectedItem().equals("Selecione")|| ComboCor4.getSelectedItem().equals("Selecione")|| TxAnoFabricação4.getText().length()==0 || TxAnoModelo4.getText().length()==0 || TxDataVenda4.getValue()==null || TxChassis4.getText().length()==0 || TxPlaca4.getText().length()==0 ||ComboPintura4.getSelectedItem().equals("Selecione")|| ComboDetalhe4.getSelectedItem().equals("Selecione") || TxNomeC.getText().length()==0 || ComboCor4.getSelectedItem().equals("Selecione") || TxKm4.getText().length()==0)   {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } 
        else{
            JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!");
            int op=0;
            if(op==0){
            ComboModelo4.setSelectedItem("Selecione");
            ComboMarca4.setSelectedItem("Selecione");
            ComboCor4.setSelectedItem("Selecione");
            TxAnoFabricação4.setText("");
            TxAnoModelo4.setText("");
            TxDataVenda4.setText("");
            TxChassis4.setText("");
            TxPlaca4.setText("");
            TxNomeC.setText("");
            TxChassis4.setText("");
            ComboCor4.setSelectedItem("Selecione");
            TxKm4.setText("");
            ComboCombustivel4.setSelectedItem("Selecione");
            ComboPintura4.setSelectedItem("Selecione");
            ComboDetalhe4.setSelectedItem("Selecione");
            BtAlterar.setEnabled(true);

            ComboModelo4.setEnabled(false);
            ComboMarca4.setEnabled(false);
            ComboCor4.setEnabled(false);
            TxAnoFabricação4.setEditable(false);
            TxAnoModelo4.setEditable(false);
            TxDataVenda4.setEditable(false);
            TxChassis4.setEditable(false);
            TxPlaca4.setEditable(false);
            ComboPintura4.setEnabled(false);  
            ComboDetalhe4.setEnabled(false);
            TxNomeC.setEditable(false);
            ComboCor4.setEnabled(false);
            TxKm4.setEditable(false);
            TxDataVenda4.setEditable(false);
            BtSalvar.setEnabled(false);
            BtAlterar.setEnabled(false);
            BtIncluir.setEnabled(true);
            }
        }
    }//GEN-LAST:event_BtSalvarActionPerformed

    private void BtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtSairActionPerformed

    private void BtAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAlterarActionPerformed
        if(TxIdC.getText().isEmpty())
           {
           }
           
           else
           {
               car = new Carro();
               car.setId(Integer.parseInt(TxIdC.getText()));
               car.setNome(TxNomeC.getText());
               car.setModelo(ComboModelo4.getSelectedItem().toString());
               car.setMarca(ComboMarca4.getSelectedItem().toString());
               car.setCor(ComboCor4.getSelectedItem().toString());
               car.setAnoFabricacao(TxAnoFabricação4.getText());
               car.setAnoModelo(TxAnoModelo4.getText());
               car.setChassi(TxChassis4.getText());
               car.setDataVenda(TxDataVenda4.getText());
               car.setPlaca(TxPlaca4.getText());
               car.setKm(TxKm4.getText());
               car.setPintura(ComboPintura4.getSelectedItem().toString());
               car.setDetalhamento((String) ComboDetalhe4.getSelectedItem());
               BtSalvar.setEnabled(false);
               BtAlterar.setEnabled(false);
               JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
           
           } 
    }//GEN-LAST:event_BtAlterarActionPerformed

    private void TxChassis4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxChassis4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxChassis4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAlterar;
    private javax.swing.JButton BtIncluir;
    private javax.swing.JButton BtLimparC;
    private javax.swing.JButton BtPesquisarC;
    private javax.swing.JButton BtSair;
    private javax.swing.JButton BtSairC;
    private javax.swing.JButton BtSalvar;
    private javax.swing.JLabel Chassi;
    private javax.swing.JComboBox<String> ComboCombustivel4;
    private javax.swing.JComboBox<String> ComboCor4;
    private javax.swing.JComboBox<String> ComboDetalhe4;
    private javax.swing.JComboBox<String> ComboMarca4;
    private javax.swing.JComboBox<String> ComboModelo4;
    private javax.swing.JComboBox<String> ComboPintura4;
    private javax.swing.JTextField TxAnoFabricação4;
    private javax.swing.JTextField TxAnoModelo4;
    private javax.swing.JTextField TxChassis4;
    private javax.swing.JFormattedTextField TxCnpjCarro;
    private javax.swing.JTextField TxConsultaCarro;
    private javax.swing.JFormattedTextField TxCpfCarro;
    private javax.swing.JFormattedTextField TxDataVenda4;
    private javax.swing.JTextField TxIdC;
    private javax.swing.JTextField TxKm4;
    private javax.swing.JTextField TxNomeC;
    private javax.swing.JTextField TxNomeCarro;
    private javax.swing.JTextField TxPlaca4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
