package com.diptom.spring.springcores.reftypes;

public class Scores {
	private double math;
	private double physics;
	private double chem;

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getPhysics() {
		return physics;
	}

	public void setPhysics(double physics) {
		this.physics = physics;
	}

	public double getChem() {
		return chem;
	}

	public void setChem(double chem) {
		this.chem = chem;
	}

	@Override
	public String toString() {
		return String.format("Scores [math=%s, physics=%s, chem=%s]", math, physics, chem);
	}

	
}
