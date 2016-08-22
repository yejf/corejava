/**
 * 本代码归我所有，唯吾独尊
 */
package com.core.day05.homework;

/**
 * @author 陈林
 *
 */
public class Screen {
	private int size;
	private String pinPaiScreen;
	private String kind;
	
	
	/**
	 * 
	 */
	public Screen() {
		super();
	}
	/**
	 * @param size
	 * @param pinPaiScreen
	 * @param kind
	 */
	public Screen(int size, String pinPaiScreen, String kind) {
		super();
		this.size = size;
		this.pinPaiScreen = pinPaiScreen;
		this.kind = kind;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		if(size>17&&size<99){
			if(size%2==1){
				this.size=size;
			}else{
				this.size=0;
				System.out.println("你输入的数不合法...");
			}
		}else{
			System.out.println("你输入的数不合法...");
		}
	}
	public String getPinPaiScreen() {
		return pinPaiScreen;
	}
	public void setPinPaiScreen(String pinPaiScreen) {
		this.pinPaiScreen = pinPaiScreen;
	}
	public String getKind() {
		return kind;
	}
	
	public void setKind(String kind) {
		if(kind=="LCD"||kind=="LED"){
			this.kind = kind;
		}else{
			System.out.println("你输入的不合法...");
		}
	}
	
}
