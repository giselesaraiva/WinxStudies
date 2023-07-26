package Testednv;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;

public class QuestoesController {

	private QuestoesDAO questoesDAO;
	private QuestoesView questoesView;

	public QuestoesController(QuestoesView questoesView2) {
		this.questoesView = questoesView2;
		this.questoesDAO = new QuestoesDAO();

		questoesView2.MATEMATICA.addActionListener(e -> {
			List<QuestoesVO> questoesList = questoesDAO.obterQuestoes("MatematicaPSC1");
			questoesView2.exibirQuestoes(questoesList);
			
		});

		questoesView2.PORTUGUES.addActionListener(e -> {
			List<QuestoesVO> questoesList = questoesDAO.obterQuestoes("PortuguesPSC1");
			questoesView2.exibirQuestoes(questoesList);
			
		});
		
		questoesView2.LITERATURA.addActionListener(e -> {
			List<QuestoesVO> questoesList = questoesDAO.obterQuestoes("LiteraturaPSC1");
			questoesView2.exibirQuestoes(questoesList);
			
		});
		
		questoesView2.HISTORIA.addActionListener(e -> {
			List<QuestoesVO> questoesList = questoesDAO.obterQuestoes("HistoriaPSC1");
			questoesView2.exibirQuestoes(questoesList);
			
		});

		questoesView2.GEOGRAFIA.addActionListener(e -> {
			List<QuestoesVO> questoesList = questoesDAO.obterQuestoes("GeografiaPSC1");
			questoesView2.exibirQuestoes(questoesList);
			
		});
		
		questoesView2.BIOLOGIA.addActionListener(e -> {
			List<QuestoesVO> questoesList = questoesDAO.obterQuestoes("BiologiaPSC1");
			questoesView2.exibirQuestoes(questoesList);
			
		});
		
		questoesView2.QUIMICA.addActionListener(e -> {
			List<QuestoesVO> questoesList = questoesDAO.obterQuestoes("QuimicaPSC1");
			questoesView2.exibirQuestoes(questoesList);
			
		});
		
		questoesView2.FISICA.addActionListener(e -> {
			List<QuestoesVO> questoesList = questoesDAO.obterQuestoes("FisicaPSC1");
			questoesView2.exibirQuestoes(questoesList);
			
		});
		
		questoesView2.REDACAO.addActionListener(e -> {
			List<QuestoesVO> questoesList = questoesDAO.obterQuestoes("RedacaoPSC1");
			questoesView2.exibirQuestoes(questoesList);
			
		});

		questoesView2.btnFinalizar.addActionListener(e -> {
			
			int pontuacao = questoesView2.calcularPontuacao();
			questoesView2.mostrarPontuacao(pontuacao);
		});
	}
	
	
	    

}
