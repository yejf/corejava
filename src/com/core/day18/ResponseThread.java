/**
 * 本代码归xxx公司版权所有，
 * 未经许可，不得复制、转载、分发...
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
	
	//构造方法
	public ResponseThread(Socket s, Map<String, Socket> map) {
		super();
		this.s = s;
		this.map = map;
	}
	
	@Override
	public void run() {
		//处理客户的请求
		//...
		//往客户端写客户IP和在线人数和系统日期
		try (PrintWriter pw = new PrintWriter(s.getOutputStream())) {
			//
			String ip = s.getInetAddress().getHostAddress();
			Date now = new Date();
			int size = map.size();
			//拼接成字符串
			StringBuilder builder = new StringBuilder();
			builder.append("你好，你的IP:").append(ip)
					.append("\n").append("当前系统时间：").append(now)
					.append("\n").append("在线人数:").append(size);
			//写出
			pw.println(builder.toString());
			pw.flush(); //手动刷新
			
			System.out.printf("线程【%s】服务结束.\n",getName());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


