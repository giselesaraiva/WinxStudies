package Testednv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QuestoesDAO {

    private Connection conn;

    public QuestoesDAO() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testeQuestoes", "root", "souza0868");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<QuestoesVO> obterQuestoes() {
    	
        List<QuestoesVO> questoesList = new ArrayList<>();

        try {
        	
            String query = "SELECT pergunta, A, B, C, D, E, resposta FROM matematicaPSC1";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String pergunta = rs.getString("pergunta");
                String a = rs.getString("A");
                String b = rs.getString("B");
                String c = rs.getString("C");
                String d = rs.getString("D");
                String e = rs.getString("E");
                String resposta = rs.getString("resposta");
                
                QuestoesVO questoesVO = new QuestoesVO(pergunta, a, b, c, d, e,resposta);
                questoesList.add(questoesVO);
            }

            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return questoesList;
    }
}
