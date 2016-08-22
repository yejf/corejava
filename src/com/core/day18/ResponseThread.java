/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day18;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;
import java.util.Map;

/**
 * @author yejf
 *
 */
public class ResponseThread extends Thread {

	private Socket s;
	private Map<String, Socket> map;
	
	//���췽��
	public ResponseThread(Socket s, Map<String, Socket> map) {
		super();
		this.s = s;
		this.map = map;
	}
	
	@Override
	public void run() {
		//����ͻ�������
		//...
		//���ͻ���д�ͻ�IP������������ϵͳ����
		try (PrintWriter pw = new PrintWriter(s.getOutputStream())) {
			//
			String ip = s.getInetAddress().getHostAddress();
			Date now = new Date();
			int size = map.size();
			//ƴ�ӳ��ַ���
			StringBuilder builder = new StringBuilder();
			builder.append("��ã����IP:").append(ip)
					.append("\n").append("��ǰϵͳʱ�䣺").append(now)
					.append("\n").append("��������:").append(size);
			//д��
			pw.println(builder.toString());
			pw.flush(); //�ֶ�ˢ��
			
			System.out.printf("�̡߳�%s���������.\n",getName());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


