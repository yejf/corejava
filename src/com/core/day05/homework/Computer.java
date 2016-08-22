/**
 * ������������У�Ψ�����
 */
package com.core.day05.homework;

/**
 * @author ����
 *
 */
public class Computer {
	private String pinPai;
	private double price;
	private Screen screen;
	
	/**
	 * @param pinPai
	 * @param price
	 * @param screen
	 */
	public Computer(String pinPai, double price, Screen screen) {
		super();
		this.pinPai = pinPai;
		this.price = price;
		this.screen = screen;
	}
	
	/**
	 * 
	 */
	public Computer() {
		
	}

	public String getPinPai() {
		return pinPai;
	}
	public void setPinPai(String pinPai) {
		this.pinPai = pinPai;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Screen getScreen() {
		return screen;
	}
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	//ҵ�񷽷�
	public void show(){
		if(pinPai!=null||price!=0){
			if(screen!=null){
				System.out.printf("%-8s%-6.2f%8s%4d%4s\n",
						pinPai,price,screen.getPinPaiScreen(),screen.getSize(),screen.getKind());
			}else{
				System.out.printf("%-8s%-6.2f  ����ʾ����Ϣ\n",pinPai,price);
			}
		}
	}
}
