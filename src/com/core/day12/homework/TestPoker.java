/**
 * 
 */
package com.core.day12.homework;

/**
 * @author HQ
 *
 */
public class TestPoker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kind[] crr= Kind.values();
		Rank[] arr= Rank.values();
		
		int account=1;
		for (Rank r : arr) {
			for (Kind k : crr) {
				System.out.printf("\t%s%s ",k, r);

				if (account==4) {
					System.out.println();
					account=1;
				} else {
					account++;
				}
			}
		}
	}

}
