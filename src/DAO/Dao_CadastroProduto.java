/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.CadastroPeça;
import Dao.conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.io.Serializable;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gabriel
 */
public class Dao_CadastroProduto {

    PreparedStatement pst;
    String sql;
    CadastroPeça mod = new CadastroPeça();
    conexao con = new conexao();
    conexao conexaoFornecedor = new conexao();
    int codFornecedor;
    String nomeFornecedor;

    public void salvar(CadastroPeça cadpeça) throws SQLException {
        buscaCodigo(mod.getNomeforne());
        con.conexao();

        sql = "INSERT INTO produto values (?,?,?,?,?,?)";
        pst = conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, cadpeça.getCodproduto());
        pst.setString(2, cadpeça.getDescriprod());
        pst.setInt(3, cadpeça.getQtdprod());
        pst.setFloat(4, cadpeça.getPrecopag());
        pst.setFloat(5, cadpeça.getPrecovenda());
        pst.setInt(6, codFornecedor);
        pst.execute();
        pst.close();

    }

    public CadastroPeça buscaProduto(CadastroPeça modelo) {
        con.conexao();
        con.executeSQL("select from produto where nome_produto " + modelo.getPesquisa() + "%'");
        try {
            con.resultset.first();

            mod.setCodproduto(con.resultset.getInt("id_produto"));
            mod.setDescriprod(con.resultset.getString("Nome_produto"));
            mod.setQtdprod(con.resultset.getInt("quantidade"));
            mod.setPrecopag(con.resultset.getFloat("preco_compra"));
            mod.setPrecopag(con.resultset.getFloat("preco_venda"));
            buscaNomeFornecedor(con.resultset.getInt("id_fornecedor"));
            mod.setNomeforne(nomeFornecedor);

        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao buscar produto"+ex);
        }
        return mod;
    }

    public void buscaCodigo(String nome) {
        con.conexao();
        con.executeSQL("select *from fornecedores  where nome_fornecedor='" + nome + "%'");
        try {
            con.resultset.first();
            codFornecedor = con.resultset.getInt("id_fornecedor");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar o codigo" + ex);
        }

    }

    public void buscaNomeFornecedor(int cod) throws SQLException {
        conexaoFornecedor.conexao();
        conexaoFornecedor.executeSQL("select *from fornecedores where id_fornecedor" + cod + "");
        try {
            conexaoFornecedor.resultset.first();
            nomeFornecedor = conexaoFornecedor.resultset.getString("nome_fornecedor");
        } catch (SQLException ex) {

        }
        conexaoFornecedor.closeInstance();
    }

}
