package com.diptom.spring.springcores.reftypes;

public class Student {
	private Scores score;

	public Scores getScore() {
		return score;
	}

	public void setScore(Scores score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return String.format("Student [score=%s]", score);
	}
	
	
}
