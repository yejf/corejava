/**
 * 
 */
package com.core.day09.homework;

/**
 * @author dell
 *
 */
public class PlayPlatform {
	public static void pk(Player p1, Player p2){
		//�ص�
		String m=p1.play();
		String n=p2.play();
		
		if(m.equals("����")){
			if(n=="ʯͷ"){
				System.out.printf("a��[%s]b��[%s]��bʤ",m,n);
			}else if(m.equals(n)){
				System.out.printf("a��[%s]b��[%s]��ƽ��",m,n);
			}else{
				System.out.printf("a��[%s]b��[%s]��aʤ",m,n);
			}
		}else if(m=="ʯͷ"){
			if(n=="����"){
				System.out.printf("a��[%s]b��[%s]��aʤ",m,n);
			}else if(m.equals(n)){
				System.out.printf("a��[%s]b��[%s]��ƽ��",m,n);
			}else{
				System.out.printf("a��[%s]b��[%s]��bʤ",m,n);
			}
		}else{
			if(n=="ʯͷ"){
				System.out.printf("a��[%s]b��[%s]��aʤ",m,n);
			}else if(m.equals(n)){
				System.out.printf("a��[%s]b��[%s]��ƽ��",m,n);
			}else{
				System.out.printf("a��[%s]b��[%s]��bʤ",m,n);
			}
		}
	}
}
