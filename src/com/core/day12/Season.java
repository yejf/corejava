/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day12;

/**
 * @author yejf
 *
 */
public enum Season {

	SPRING("春") {
		@Override
		public Season next() {
			System.out.println("春天结束了...");
			return Season.SUMMER;
		}
	},
		//相当于 public static final Season SPRING = new Season("");
	
	SUMMER("夏") {
		@Override
		public Season next() {
			System.out.println("夏天结束了...");
			return Season.AUTUMN;
		}
	},
	
	AUTUMN("秋") {
		@Override
		public Season next() {
			System.out.println("秋天结束了...");
			return WINTER;
		}
	},
	
	WINTER("冬") {
		@Override
		public Season next() {
			System.out.println("冬天结束了...");
			return Season.SPRING;
		}
	};
	
	//枚举可以有普通属性
	private String literal; //四季的字面值
	
	//定义构造方法
	private Season(String literal) {
		this.literal = literal;
	}

	/* (non-Javadoc)
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {
		
		return this.literal + "天";
	}
	
	//枚举中可以有抽象方法
	public abstract Season next();
	
}
