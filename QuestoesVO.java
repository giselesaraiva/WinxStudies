package Testednv;

public class QuestoesVO {
	
	private String pergunta;
	private String A;
	private String B;
	private String C;
	private String D;
	private String E;
	private String resposta;
	
	public QuestoesVO(String pergunta, String A,String B,String C,String D,String E,String resposta) {
		
		this.pergunta = pergunta;
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
		this.E = E;
		this.resposta = resposta;
		
	}

	/**
	 * @return the pergunta
	 */
	public String getPergunta() {
		return pergunta;
	}

	/**
	 * @param pergunta the pergunta to set
	 */
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	/**
	 * @return the a
	 */
	public String getA() {
		return A;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(String a) {
		A = a;
	}

	/**
	 * @return the b
	 */
	public String getB() {
		return B;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(String b) {
		B = b;
	}

	/**
	 * @return the c
	 */
	public String getC() {
		return C;
	}

	/**
	 * @param c the c to set
	 */
	public void setC(String c) {
		C = c;
	}

	/**
	 * @return the d
	 */
	public String getD() {
		return D;
	}

	/**
	 * @param d the d to set
	 */
	public void setD(String d) {
		D = d;
	}

	/**
	 * @return the e
	 */
	public String getE() {
		return E;
	}

	/**
	 * @param e the e to set
	 */
	public void setE(String e) {
		E = e;
	}

	/**
	 * @return the resposta
	 */
	public String getResposta() {
		return resposta;
	}

	/**
	 * @param resposta the resposta to set
	 */
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	
	

}
