/**
 * 
 */
package com.core.day12.homework;


/**
 * @author HQ
 *
 */
public enum TrafficLight {
	
	RED("红",30){ //相当于：public static final TrafficLight = new TrafficLight("",30);
		@Override
		public TrafficLight next(){
			System.out.printf("当前信号灯：【%s】\n","红");
			//模拟计时
			readSeconds(30);
			return TrafficLight.GREEN;
		}
		
	},
	
	GREEN("绿",45){
		@Override
		public TrafficLight next(){
			System.out.printf("当前信号灯：【%s】\n","绿");
			//模拟计时
			readSeconds(45);
			return TrafficLight.YELLOW;
		}
	},
	YELLOW("黄",3){
		@Override
		public TrafficLight next(){
			//...
			System.out.printf("当前信号灯：【%s】\n","黄");
			//模拟计时
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
		return this.literal+"灯";
	}
	
	public abstract TrafficLight next();
	
	
	private static void readSeconds(int seconds) {
		for(int i=seconds;i>0;i--){
			try {
				System.out.printf("\r请等待【%-2d】秒",i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.printf("\r");
	}
	
}

