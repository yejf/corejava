/**
 * 
 */
package com.core.day09.homework;

/**
 * @author dell
 *
 */
public class TestPlay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Player p1=new Oplay();
		Player p2=new Tplay();
//		PlayPlatform p=new PlayPlatform();
		System.err.println("Èý¾ÖÁ½Ê¤£º");
		for (int i = 0; i < 3; i++) {
			PlayPlatform.pk(p1, p2);
			
			System.out.println();
		}
	

	}

}
