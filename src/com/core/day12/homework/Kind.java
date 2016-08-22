/**
 * 
 */
package com.core.day12.homework;

/**
 * @author HQ
 *
 */
public enum Kind {
	HEART("ºìÌÒ"),
	SPADE("ºÚÌÒ"),
	DIAMOND("·½¿é"),
	CLUB("Ã·»¨");
	
	
	private String literal;
	
	
	/**
	 * @param literal
	 */
	private Kind(String literal) {
		this.literal = literal;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.literal;
	}
	
}
