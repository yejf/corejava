/**
 * ������������У�Ψ�����
 */
package com.core.day05.homework;

/**
 * @author ����
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
				System.out.println("������������Ϸ�...");
			}
		}else{
			System.out.println("������������Ϸ�...");
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
			System.out.println("������Ĳ��Ϸ�...");
		}
	}
	
}
