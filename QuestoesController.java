package Testednv;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;

public class QuestoesController {

	public String name;
	private QuestoesDAO questoesDAO;
	private QuestoesView questoesView;
	

	public QuestoesController(QuestoesView questoesView2) {
		this.questoesView = questoesView2;
		this.questoesDAO = new QuestoesDAO();

		questoesView2.Mat.addActionListener(e -> {
			
			JButton clique = (JButton) e.getSource();
			name = clique.getName();
			List<QuestoesVO> questoesList = questoesDAO.obterQuestoes("MatematicaPSC1");
			questoesView2.exibirQuestoes(questoesList);
			 
		});

		questoesView2.Port.addActionListener(e -> {
			JButton clique = (JButton) e.getSource();
			 name = clique.getName();
			List<QuestoesVO> questoesList = questoesDAO.obterQuestoes("PortuguesPSC1");
			questoesView2.exibirQuestoes(questoesList);
			
		});
		
		questoesView2.Lit.addActionListener(e -> {
			JButton clique = (JButton) e.getSource();
			 name = clique.getName();
			List<QuestoesVO> questoesList = questoesDAO.obterQuestoes("LiteraturaPSC1");
			questoesView2.exibirQuestoes(questoesList);
			
		});
		
		questoesView2.His.addActionListener(e -> {
			JButton clique = (JButton) e.getSource();
			 name = clique.getName();
			List<QuestoesVO> questoesList = questoesDAO.obterQuestoes("HistoriaPSC1");
			questoesView2.exibirQuestoes(questoesList);
			
		});

		questoesView2.Geo.addActionListener(e -> {
			JButton clique = (JButton) e.getSource();
			name = clique.getName();
			List<QuestoesVO> questoesList = questoesDAO.obterQuestoes("GeografiaPSC1");
			questoesView2.exibirQuestoes(questoesList);
			
		});
		
		questoesView2.Bio.addActionListener(e -> {
			JButton clique = (JButton) e.getSource();
			 name = clique.getName();
			List<QuestoesVO> questoesList = questoesDAO.obterQuestoes("BiologiaPSC1");
			questoesView2.exibirQuestoes(questoesList);
			
		});
		
		questoesView2.Qui.addActionListener(e -> {
			JButton clique = (JButton) e.getSource();
			 name = clique.getName();
			List<QuestoesVO> questoesList = questoesDAO.obterQuestoes("QuimicaPSC1");
			questoesView2.exibirQuestoes(questoesList);
			
		});
		
		questoesView2.Fis.addActionListener(e -> {
			JButton clique = (JButton) e.getSource();
			name = clique.getName();
			List<QuestoesVO> questoesList = questoesDAO.obterQuestoes("FisicaPSC1");
			questoesView2.exibirQuestoes(questoesList);
			
		});
		
		questoesView2.Red.addActionListener(e -> {
			JButton clique = (JButton) e.getSource();
			 name = clique.getName();
			List<QuestoesVO> questoesList = questoesDAO.obterQuestoes("RedacaoPSC1");
			questoesView2.exibirQuestoes(questoesList);
			
		});

		questoesView2.btnFinalizar.addActionListener(e -> {
			QuestoesBO bo = new QuestoesBO();
			questoesView2.calcularPontuacao();
			System.out.println(name);
			bo.escolha(name);
		});
	}
	
	
	    

}
