package Testednv;

import java.util.ArrayList;
import java.util.List;

public class QuestoesModel {
    private List<QuestoesVO> questoesList;

    public QuestoesModel() {
        questoesList = new ArrayList<>();
    }

    public List<QuestoesVO> getQuestoesList() {
        return questoesList;
    }

    public void adicionarQuestao(QuestoesVO questao) {
        questoesList.add(questao);
    }

}