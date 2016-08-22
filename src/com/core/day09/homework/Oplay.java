/**
 * 
 */
package com.core.day09.homework;

import java.util.Random;

/**
 * @author dell
 *
 */
public class Oplay implements Player {
	
	/* (non-Javadoc)
	 * @see com.core.day09.homework.Player#play()
	 */
	@Override
	public String play() {
		Random r=new Random();
		int i=r.nextInt(3)+1;
		if(i==1){
			return JIAODAO;
		}else if(i==2){
			return SHITOU;
		}else{
			return BU;
		}
	}

}
