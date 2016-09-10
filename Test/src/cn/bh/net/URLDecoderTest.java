package cn.bh.net;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLDecoderTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String keyWord = URLDecoder.decode("%B7%E8%BF%F1java", "GBK");
		System.out.println(keyWord);
		
		String urlStr = URLEncoder.encode("·è¿ñjava", "GBK");
		System.out.println(urlStr);
	}

}
