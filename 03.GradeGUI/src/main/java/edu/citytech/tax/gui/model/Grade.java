package edu.citytech.tax.gui.model;

public class Grade {
	
	public final float qpa;
	public final String letter;
	
	public Grade(float qpa, String letter) {
		super();
		this.qpa = qpa;
		this.letter = letter;
	}

	@Override
	public String toString() {
		return "Grade [qpa=" + qpa + ", letter=" + letter + "]";
	}
	
}
