package Testednv;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton; 
import javax.swing.JScrollPane;

public class QuestoesView extends JPanel {

    public JButton btnMatematica;
    public JButton btnPortugues;
    public JButton btnLiteratura;
    public JButton btnHistoria;
    public JButton btnGeografia;
    public JButton btnBiologia;
    public JButton btnQuimica;
    public JButton btnFisica;
    public JButton btnFinalizar;
    private JScrollPane scrollpane;
    Map<QuestoesVO, ButtonGroup> buttonGroups;
    private QuestoesDAO questoesDAO;
    private int pontuacao;
    String materia;


    public QuestoesView(QuestoesDAO questoesDAO) {
        this.questoesDAO = questoesDAO;
        inicializacomponentes();
        QuestoesController con = new QuestoesController(this);
        
    }

    private void inicializacomponentes() {
        setLayout(new FlowLayout());

        btnMatematica = new JButton("Matemática");
        add(btnMatematica);
        btnPortugues = new JButton("Português");
        add(btnPortugues);
        btnLiteratura = new JButton("Literatura");
        add(btnLiteratura);
        btnHistoria = new JButton("História");
        add(btnHistoria);
        btnGeografia = new JButton("Geografia");
        add(btnGeografia);
        btnBiologia = new JButton("Biologia");
        add(btnBiologia);
        btnQuimica = new JButton("Química");
        add(btnQuimica);
        btnFisica = new JButton("Física");
        add(btnFisica);
        btnFinalizar = new JButton("Finalizar");
        add(btnFinalizar, BorderLayout.SOUTH);
        btnFinalizar.setVisible(false);

       
    }

    public void exibirQuestoes(List<QuestoesVO> questoesList) {
    	removeAll();
        btnFinalizar.setVisible(true);

        JPanel questoesPanel = new JPanel(new GridLayout(0, 1));

        buttonGroups = new HashMap<>();
        
        for (QuestoesVO questao : questoesList) {
            JLabel perguntaLabel = new JLabel(questao.getPergunta());
            questoesPanel.add(perguntaLabel);

            JRadioButton radioButtonA = new JRadioButton(questao.getA());
            JRadioButton radioButtonB = new JRadioButton(questao.getB());
            JRadioButton radioButtonC = new JRadioButton(questao.getC());
            JRadioButton radioButtonD = new JRadioButton(questao.getD());
            JRadioButton radioButtonE = new JRadioButton(questao.getE());

            ButtonGroup buttonGroup = new ButtonGroup();
            buttonGroup.add(radioButtonA);
            buttonGroup.add(radioButtonB);
            buttonGroup.add(radioButtonC);
            buttonGroup.add(radioButtonD);
            buttonGroup.add(radioButtonE);

            buttonGroups.put(questao, buttonGroup);

            questoesPanel.add(radioButtonA);
            questoesPanel.add(radioButtonB);
            questoesPanel.add(radioButtonC);
            questoesPanel.add(radioButtonD);
            questoesPanel.add(radioButtonE);
        }

        scrollpane = new JScrollPane(questoesPanel);
        scrollpane.setPreferredSize(new Dimension(400, 400));
        scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        removeAll();
        setLayout(new BorderLayout());
        add(scrollpane, BorderLayout.CENTER);
        add(btnFinalizar, BorderLayout.AFTER_LAST_LINE);

        revalidate();
        repaint();
        pontuacao = 0;
    }

    public int calcularPontuacao() {
        int pontuacao = 0;
        for (QuestoesVO questao : buttonGroups.keySet()) {
            ButtonGroup buttonGroup = buttonGroups.get(questao);
            String respostaSelecionada = getSelectedButtonText(buttonGroup);

            if (respostaSelecionada != null && respostaSelecionada.equals(questao.getResposta())) {
                pontuacao++;
            }
        }
        return pontuacao;
    }
    
    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        Enumeration<AbstractButton> buttons = buttonGroup.getElements();
        while (buttons.hasMoreElements()) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                return button.getActionCommand();
            }
        }
        return null;
    }
    
    public void mostrarPontuacao(int pontuacao) {
    	removeAll();
        JLabel pontuacaoLabel = new JLabel("Pontuação: " + pontuacao);
        add(pontuacaoLabel);
        revalidate();
        repaint();	
    }
}
