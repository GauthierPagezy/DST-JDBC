package Model;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Repository2 {
    java.sql.Statement stmt = null;
    ResultSet resultat = null;

    public ResultSet selectNoteByIdCand(Connection conn, String idCand) {
        String sql = "SELECT note FROM resultat WHERE idCand = ?";
        try {
            this.stmt =  conn.createStatement();
            this.resultat = stmt.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println("Erreur lors du chargement "+e.getMessage());
        }
        return this.resultat;
    }
}

