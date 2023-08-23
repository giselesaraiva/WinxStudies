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
    String materiaDAO;

    public QuestoesDAO() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testeQuestoes", "root", "souza0868");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<QuestoesVO> obterQuestoes(String materia) {
    	
        List<QuestoesVO> questoesList = new ArrayList<>();

        try {
        	
            String query = "SELECT pergunta, A, B, C, D, E, resposta FROM "+ materia;
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
    
    public void progresso(String materia, int id, int pontuacao) {
    	
    	try {
			
		
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testequestoes", "root", "souza0868");
	        String cadastrar = "insert into progresso (pk_usuario, pontuacao" + materia + ") values (?, ?)";
	        PreparedStatement ps = conn.prepareStatement(cadastrar);
	        
	        ps.setInt(1, id);
	        ps.setInt(2, pontuacao);
	        
	        int check = ps.executeUpdate();
	        
			if(check<=0) {
				
				System.out.println("Erro no cadastro da pontuação");
				
			}
			
			
		}catch (SQLException e) {
			
			e.printStackTrace();
			
		}
    	
    }
}
