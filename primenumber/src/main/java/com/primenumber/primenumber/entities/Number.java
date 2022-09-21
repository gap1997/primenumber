package com.primenumber.primenumber.entities;

public class Number {

	public int lowerBound;
	public int upperBound;
	
	public Number(int lowerBound, int upperBound) {
		super();
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
	}
	public Number() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getLowerBound() {
		return lowerBound;
	}
	public void setLowerBound(int lowerBound) {
		this.lowerBound = lowerBound;
	}
	public int getUpperBound() {
		return upperBound;
	}
	public void setUpperBound(int upperBound) {
		this.upperBound = upperBound;
	}
	@Override
	public String toString() {
		return "Number [lowerBound=" + lowerBound + ", upperBound=" + upperBound + "]";
	}
	

}
