/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day12;

/**
 * @author yejf
 *
 */
public class SpiderMan extends Person {
	
	//����
	private boolean help; //������Ҫ����ʱ���������ڵ�֩��DNA
	private Spider dna; // �õ��ڲ��������
	
	//��Ա�ڲ���
	private class SpiderDNA implements Spider {
		
		//�ڲ�������
		private String color;  //�·�
		private boolean throwSilk; //��˿
		
		//���췽��
		public SpiderDNA() {
			//���Է����ⲿ������г�Ա
//			if(SpiderMan.this.help) {  //�ڲ������������ⲿ������ͬ��ʱ
			if(help) {
				this.color = "��ɫ֩���";
				this.throwSilk = true; 
			} else {
				this.color = "�����ϰ��";
				this.throwSilk = false;
			}
		}

		@Override
		public void run() {
			// ֩��� run 
			System.out.printf("֩��DNA����.....\n");
			
			if(this.throwSilk) {
				System.out.printf(">>> ֩��������׼����...\n");
			} else {
				System.out.println("<<< ��δ�յ�����ָ�����׼������");
			}
			System.out.printf("���ϡ�%s��\n",this.color);
		}
	}
	
	/**
	 * @param name
	 * @param help
	 */
	public SpiderMan(String name, boolean help) {
		super(name);
		this.help = help;
		//��ʼ��dna
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
		//��Ϊ Person ��run
		System.out.printf("����:%s\n",getName());
		//����֩����Ǹ�run 
		this.dna.run();
	}

}
