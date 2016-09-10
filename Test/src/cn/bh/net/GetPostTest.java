package cn.bh.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class GetPostTest {

	public static String sendGet(String url, String param){
		String result = "";
		String realName = url + "?" + param;
		
		try {
			URL realUrl = new URL(realName);
			URLConnection conn = realUrl.openConnection();
			
			//设置一些通用属性
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			
			conn.connect();
			//获取所有的相应头字段
			Map<String, List<String>> map = conn.getHeaderFields();
			for(String key:map.keySet())
				System.out.println(key + "--->" + map.get(key));
			
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
			
			String line = "";
			while((line = br.readLine())!=null)
				result += "\n"+line;		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;	
	}
	public static String sendPost(String url, String param){
		String result = "";
		String realName = url;
		
		try {
			URL realUrl = new URL(realName);
			URLConnection conn = realUrl.openConnection();
			
			//设置一些通用属性
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");  
			
			//发送post请求必须设置如下两行
			conn.setDoInput(true);
			conn.setDoOutput(true);
			
			
			//获取URLConnection对象对应的输出流
			PrintWriter out = new PrintWriter(conn.getOutputStream());
			out.print(param);
			out.flush();
	
			//获取URLConnection对象对应的输入流
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
			
			String line = "";
			while((line = br.readLine())!=null)
				result += "\n"+line;		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;	
	}
	public static void main(String args[]){
		
		//String s = GetPostTest.sendGet("http://graduate.buaa.edu.cn/ch/", null);
		String s1 = GetPostTest.sendPost("http://graduate.buaa.edu.cn/ch/", null);
		System.out.println(s1);
	}
	
	
}
