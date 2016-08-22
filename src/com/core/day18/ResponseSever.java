/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
 */
package com.core.day18;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

import com.core.day19.Port;

/**
 * 服务端程序
 * 
 * @author yejf
 *
 */
public class ResponseSever {

	private Map<String, Socket> clients = new HashMap<>();
	//
	private int max; // 客户端上限

	private int port; //

	@Port(1314)
	public ResponseSever() {
		this.max = 100;
		//通过反射，来解析出注解中的值，并为port赋值
		this.port = getPortFromAnnotation();
	}

	//通过反射来读取Port注解的值
	private int getPortFromAnnotation() {
		Class<ResponseSever> c = ResponseSever.class;
		//通过class来获取空参构造器
		try {
			Port p = c.getConstructor()
								.getAnnotation(Port.class);
			//返回
			return p.value();
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
			throw new RuntimeException("获取注解数据失败...");
		}
	}

	/****
	 * 启动服务端
	 */
	public void start() {
		// 创建ServerSocket
		try (ServerSocket ss = new ServerSocket(port);) {
			System.out.println("\n服务器启动成功...");
			System.out.printf("服务器正在[%d]端口监听...\n", port);
			// 监听
			while (true) {
				if (clients.size() >= max) {
					System.out.printf("对不起，已达到人数上限...");
					
				} else {
					Socket client = ss.accept(); // 阻塞方法
					// 添加到集合中
					String clientIp = client.getInetAddress().getHostAddress();

					clients.put(clientIp, client);

					System.out.printf("新加入1个客户[%s]，当前在线数: %d\n", clientIp, clients.size());
					// 启动服务线程为此客户端服务
					new ResponseThread(client, clients).start();
				}
			}
		} catch (IOException e) {
			System.out.println("\n服务器启动失败...");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// 创建
		ResponseSever ps = new ResponseSever();
		ps.start();
	}
}
