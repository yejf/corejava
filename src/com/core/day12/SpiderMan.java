/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day12;

/**
 * @author yejf
 *
 */
public class SpiderMan extends Person {
	
	//属性
	private boolean help; //有人需要帮助时，激活体内的蜘蛛DNA
	private Spider dna; // 拿到内部类的引用
	
	//成员内部类
	private class SpiderDNA implements Spider {
		
		//内部类属性
		private String color;  //衣服
		private boolean throwSilk; //吐丝
		
		//构造方法
		public SpiderDNA() {
			//可以访问外部类的所有成员
//			if(SpiderMan.this.help) {  //内部类属性名与外部类属性同名时
			if(help) {
				this.color = "红色蜘蛛服";
				this.throwSilk = true; 
			} else {
				this.color = "正常上班服";
				this.throwSilk = false;
			}
		}

		@Override
		public void run() {
			// 蜘蛛的 run 
			System.out.printf("蜘蛛DNA启动.....\n");
			
			if(this.throwSilk) {
				System.out.printf(">>> 蜘蛛武器已准备好...\n");
			} else {
				System.out.println("<<< 暂未收到攻击指令，无需准备武器");
			}
			System.out.printf("穿上【%s】\n",this.color);
		}
	}
	
	/**
	 * @param name
	 * @param help
	 */
	public SpiderMan(String name, boolean help) {
		super(name);
		this.help = help;
		//初始化dna
		this.dna = new SpiderDNA();
	}

	/**
	 * @return the help
	 */
	public boolean isHelp() {
		return help;
	}


	/**
	 * @param help the help to set
	 */
	public void setHelp(boolean help) {
		this.help = help;
	}

	/**
	 * @return the dna
	 */
	public Spider getDna() {
		return dna;
	}

	/* (non-Javadoc)
	 * @see com.core.day12.Person#run()
	 */
	@Override
	public void run() {
		//做为 Person 的run
		System.out.printf("我是:%s\n",getName());
		//启动蜘蛛的那个run 
		this.dna.run();
	}

}
