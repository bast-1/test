package autochat.domain;

import java.io.Serializable;

public class Teach implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2438119334750356639L;
	private String teach, answer;

	
	
	public Teach() {
		super();
	}

	public Teach(String teach, String answer) {
		super();
		this.teach = teach;
		this.answer = answer;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getTeach() {
		return teach;
	}

	public void setTeach(String teach) {
		this.teach = teach;
	}

	@Override
	public String toString() {
		return "Teach [teach=" + teach + ", answer=" + answer + "]";
	}


	
	
}
