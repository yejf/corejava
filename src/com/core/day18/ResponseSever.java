/**
 * �������xxx��˾��Ȩ���У�
 * δ����ɣ����ø��ơ�ת�ء��ַ�...
 */
package com.core.day18;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

import com.core.day19.Port;

/**
 * ����˳���
 * 
 * @author yejf
 *
 */
public class ResponseSever {

	private Map<String, Socket> clients = new HashMap<>();
	//
	private int max; // �ͻ�������

	private int port; //

	@Port(1314)
	public ResponseSever() {
		this.max = 100;
		//ͨ�����䣬��������ע���е�ֵ����Ϊport��ֵ
		this.port = getPortFromAnnotation();
	}

	//ͨ����������ȡPortע���ֵ
	private int getPortFromAnnotation() {
		Class<ResponseSever> c = ResponseSever.class;
		//ͨ��class����ȡ�ղι�����
		try {
			Port p = c.getConstructor()
								.getAnnotation(Port.class);
			//����
			return p.value();
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
			throw new RuntimeException("��ȡע������ʧ��...");
		}
	}

	/****
	 * ���������
	 */
	public void start() {
		// ����ServerSocket
		try (ServerSocket ss = new ServerSocket(port);) {
			System.out.println("\n�����������ɹ�...");
			System.out.printf("����������[%d]�˿ڼ���...\n", port);
			// ����
			while (true) {
				if (clients.size() >= max) {
					System.out.printf("�Բ����Ѵﵽ��������...");
					
				} else {
					Socket client = ss.accept(); // ��������
					// ��ӵ�������
					String clientIp = client.getInetAddress().getHostAddress();

					clients.put(clientIp, client);

					System.out.printf("�¼���1���ͻ�[%s]����ǰ������: %d\n", clientIp, clients.size());
					// ���������߳�Ϊ�˿ͻ��˷���
					new ResponseThread(client, clients).start();
				}
			}
		} catch (IOException e) {
			System.out.println("\n����������ʧ��...");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// ����
		ResponseSever ps = new ResponseSever();
		ps.start();
	}
}
