package Testednv;

public class QuestoesBO {

	QuestoesView view = new QuestoesView();
	QuestoesDAO dao = new QuestoesDAO();
	

	public void escolha(String name) {
		
		view.mostrarPontuacao(name, view.id);

	}

}
