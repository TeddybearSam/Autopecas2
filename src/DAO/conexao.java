package Dao;

/**
 *
 * @author Gabriel
 */
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class conexao implements Serializable {

    private static conexao conexao = null;
    private static Connection connection;
    private String usuario;
    private String senha;
    private String url;
    public Statement statement;
    public ResultSet resultset;

    public void conexao () {
        usuario = "root";
        senha = "1234";
        url = "jdbc:mysql://localhost:3306/SistemaAutopecas";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, usuario, senha);
            
        } catch (ClassNotFoundException | SQLException e) {
        }
    }

    public static Connection getInstance() {
        if (connection == null) {
            synchronized (conexao.class) {
                conexao = new conexao();
            }
        }
        return connection;
    }

    public static void closeInstance() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
    public void executeSQL(String sql){
        try{
            statement = connection.createStatement();
            resultset = statement.executeQuery(sql);
            
        }catch(SQLException sqlex){
            JOptionPane.showMessageDialog(null,sqlex.getMessage());
        }
    }
}
