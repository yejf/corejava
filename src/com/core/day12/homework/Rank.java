/**
 * 
 */
package com.core.day12.homework;

/**
 * @author HQ
 *
 */
public enum Rank {
	A("A"),
	TWO("2"),
	THREE("3"),
	FOUR("4"),
	FIVE("5"),
	SIX("6"),
	SEVEN("7"),
	EIGHT("8"),
	NINE("9"),
	TEN("10"),
	JACK("J"),
	QUEEN("Q"),
	KING("K");
	
	private String literal;
	
	

	/**
	 * @param literal
	 */
	private Rank(String literal) {
		this.literal = literal;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.literal;
	}
}
