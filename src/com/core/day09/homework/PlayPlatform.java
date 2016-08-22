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
		//回调
		String m=p1.play();
		String n=p2.play();
		
		if(m.equals("剪刀")){
			if(n=="石头"){
				System.out.printf("a出[%s]b出[%s]，b胜",m,n);
			}else if(m.equals(n)){
				System.out.printf("a出[%s]b出[%s]，平局",m,n);
			}else{
				System.out.printf("a出[%s]b出[%s]，a胜",m,n);
			}
		}else if(m=="石头"){
			if(n=="剪刀"){
				System.out.printf("a出[%s]b出[%s]，a胜",m,n);
			}else if(m.equals(n)){
				System.out.printf("a出[%s]b出[%s]，平局",m,n);
			}else{
				System.out.printf("a出[%s]b出[%s]，b胜",m,n);
			}
		}else{
			if(n=="石头"){
				System.out.printf("a出[%s]b出[%s]，a胜",m,n);
			}else if(m.equals(n)){
				System.out.printf("a出[%s]b出[%s]，平局",m,n);
			}else{
				System.out.printf("a出[%s]b出[%s]，b胜",m,n);
			}
		}
	}
}
