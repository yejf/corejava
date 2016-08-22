/**
 * 
 */
package com.core.day09.homework;

import java.util.Random;

/**
 * @author dell
 *
 */
public class Tplay implements Player {

	/* (non-Javadoc)
	 * @see com.core.day09.homework.Player#play()
	 */
	@Override
	public String play() {
		Random r=new Random();
		int i=r.nextInt(6)+1;
		if(i>=1&&i<=3){
			return JIAODAO;
		}else if(i>=4&&i<=5){
			return SHITOU;
		}else{
			return BU;
		}
	}

}
