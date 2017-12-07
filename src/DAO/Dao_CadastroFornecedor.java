/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Dao.conexao;
import java.sql.PreparedStatement;
import Model.Fornecedor;
import java.sql.SQLException;

/**
 *
 * @author Bruna Leonel
 */
public class Dao_CadastroFornecedor {
    conexao con = new conexao();
    PreparedStatement pst;
    String sql;
   public void salvar(Fornecedor For) throws SQLException {

        con.conexao();

        sql = "INSERT INTO produto values (?,?,?,?,?,?,?,?,?,?,?,?)";
        pst = conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, For.getID());  
        pst.setString(2, For.getCNPJ());
        pst.setString(3, For.getRazaoSocial());
        pst.setString(4, For.getEndereço());
        pst.setString(5, For.getBairro());
        pst.setString(6, For.getCidade());
        pst.setString(7,For.getEstado());
        pst.setString(8, For.getCEP());
        pst.setString(9,For.getTelefone());
        pst.setString(10, For.getInscricaoEstadual());
        pst.setString(11,For.getEmail());
        pst.setString(12,For.getTipo_via());
        pst.execute();
        pst.close();

    }

  
}
