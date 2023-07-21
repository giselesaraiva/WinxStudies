package Testednv;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MainQuestoes {
	
public static void main(String[] args) {
		
	 SwingUtilities.invokeLater(() -> {
         JFrame frame = new JFrame("Questões");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         QuestoesDAO questoesDAO = new QuestoesDAO();
         QuestoesView questoesView = new QuestoesView(questoesDAO);
         frame.getContentPane().add(questoesView);
         
         frame.setSize(500, 600);
         frame.setVisible(true);
         
     });

}
}
