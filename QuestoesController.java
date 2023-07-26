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

	public QuestoesController(QuestoesView questoesView) {
		this.questoesView = questoesView;
		this.questoesDAO = new QuestoesDAO();

		questoesView.btnMatematica.addActionListener(e -> {
			List<QuestoesVO> questoesList = questoesDAO.obterQuestoes("MatematicaPSC1");
			questoesView.exibirQuestoes(questoesList);
		});

		questoesView.btnPortugues.addActionListener(e -> {
			List<QuestoesVO> questoesList = questoesDAO.obterQuestoes("PortuguesPSC1");
			questoesView.exibirQuestoes(questoesList);
		});
		
		questoesView.btnLiteratura.addActionListener(e -> {
			List<QuestoesVO> questoesList = questoesDAO.obterQuestoes("LiteraturaPSC1");
			questoesView.exibirQuestoes(questoesList);
		});
		
		questoesView.btnHistoria.addActionListener(e -> {
			List<QuestoesVO> questoesList = questoesDAO.obterQuestoes("HistoriaPSC1");
			questoesView.exibirQuestoes(questoesList);
		});

		questoesView.btnGeografia.addActionListener(e -> {
			List<QuestoesVO> questoesList = questoesDAO.obterQuestoes("GeografiaPSC1");
			questoesView.exibirQuestoes(questoesList);
		});
		
		questoesView.btnBiologia.addActionListener(e -> {
			List<QuestoesVO> questoesList = questoesDAO.obterQuestoes("BiologiaPSC1");
			questoesView.exibirQuestoes(questoesList);
		});
		
		questoesView.btnQuimica.addActionListener(e -> {
			List<QuestoesVO> questoesList = questoesDAO.obterQuestoes("QuimicaPSC1");
			questoesView.exibirQuestoes(questoesList);
		});
		
		questoesView.btnFisica.addActionListener(e -> {
			List<QuestoesVO> questoesList = questoesDAO.obterQuestoes("FisicaPSC1");
			questoesView.exibirQuestoes(questoesList);
		});

		questoesView.btnFinalizar.addActionListener(e -> {
			QuestoesController controller = new QuestoesController(questoesView);
			int pontuacao = questoesView.calcularPontuacao();
			questoesView.mostrarPontuacao(pontuacao);
		});
	}
}
