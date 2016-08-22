/**
 * 
 */
package com.core.day12.homework;


/**
 * @author HQ
 *
 */
public enum TrafficLight {
	
	RED("��",30){ //�൱�ڣ�public static final TrafficLight = new TrafficLight("",30);
		@Override
		public TrafficLight next(){
			System.out.printf("��ǰ�źŵƣ���%s��\n","��");
			//ģ���ʱ
			readSeconds(30);
			return TrafficLight.GREEN;
		}
		
	},
	
	GREEN("��",45){
		@Override
		public TrafficLight next(){
			System.out.printf("��ǰ�źŵƣ���%s��\n","��");
			//ģ���ʱ
			readSeconds(45);
			return TrafficLight.YELLOW;
		}
	},
	YELLOW("��",3){
		@Override
		public TrafficLight next(){
			//...
			System.out.printf("��ǰ�źŵƣ���%s��\n","��");
			//ģ���ʱ
			readSeconds(3);
			return TrafficLight.RED;
		}
	};
	private String literal;
	
	private int seconds; //
	
	
	/**
	 * @return the literal
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * @param literal the literal to set
	 */
	public void setLiteral(String literal) {
		this.literal = literal;
	}

	/**
	 * @return the seconds
	 */
	public int getSeconds() {
		return seconds;
	}

	/**
	 * @param seconds the seconds to set
	 */
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	/**
	 * @param literal
	 */
	private TrafficLight(String literal, int seconds) {
		this.literal = literal;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.literal+"��";
	}
	
	public abstract TrafficLight next();
	
	
	private static void readSeconds(int seconds) {
		for(int i=seconds;i>0;i--){
			try {
				System.out.printf("\r��ȴ���%-2d����",i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.printf("\r");
	}
	
}

