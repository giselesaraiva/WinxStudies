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
            List<QuestoesVO> questoesList = questoesDAO.obterQuestoes();
            questoesView.exibirQuestoes(questoesList);
        });

        questoesView.btnFinalizar.addActionListener(e -> {
            QuestoesController controller = new QuestoesController(questoesView);
            int pontuacao = questoesView.calcularPontuacao();
            questoesView.mostrarPontuacao(pontuacao);
        });
        }
}
	
