/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day12;

/**
 * @author yejf
 *
 */
public enum Season {

	SPRING("��") {
		@Override
		public Season next() {
			System.out.println("���������...");
			return Season.SUMMER;
		}
	},
		//�൱�� public static final Season SPRING = new Season("");
	
	SUMMER("��") {
		@Override
		public Season next() {
			System.out.println("���������...");
			return Season.AUTUMN;
		}
	},
	
	AUTUMN("��") {
		@Override
		public Season next() {
			System.out.println("���������...");
			return WINTER;
		}
	},
	
	WINTER("��") {
		@Override
		public Season next() {
			System.out.println("���������...");
			return Season.SPRING;
		}
	};
	
	//ö�ٿ�������ͨ����
	private String literal; //�ļ�������ֵ
	
	//���幹�췽��
	private Season(String literal) {
		this.literal = literal;
	}

	/* (non-Javadoc)
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {
		
		return this.literal + "��";
	}
	
	//ö���п����г��󷽷�
	public abstract Season next();
	
}
