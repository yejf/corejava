/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day10;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;

/**
 * @author yejf
 *
 */
public class NumberFormatDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//��ʽ������
		double d = 3.1415926;
		double rate = 0.035; //����
		//��ʽ�����ϵĸ�����
		NumberFormat nf = NumberFormat.getNumberInstance();
		//�趨С��λ
		nf.setMinimumFractionDigits(4);
		//ָ������ģʽ
		nf.setRoundingMode(RoundingMode.FLOOR);
		//��ʽ��
		String dStr = nf.format(d);
		System.out.printf("%s\n",dStr);
		
		//��ʽ���ٷ�����ʵ��
		NumberFormat pf = NumberFormat.getPercentInstance();
		pf.setMinimumFractionDigits(2);
		String rateStr = pf.format(rate);
		System.out.printf("%s\n",rateStr);
		
		//���ַ�������������
		String s = "123%";
		try {
			//����
			Number n = pf.parse(s);
			//�õ���������
			double dn = n.doubleValue();
			//���
			System.out.println(dn);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}



