/**
 * 
 */
package com.core.day09.homework;

/**
 * @author dell
 *
 */
public interface Player {
	String JIAODAO = "剪刀";
	String SHITOU = "石头";
	String BU = "布";

	//方法,只能返回以上三个常量之一
	String play();
}
