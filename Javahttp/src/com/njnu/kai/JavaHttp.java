package com.njnu.kai;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import org.apache.http.Header;
//import org.apache.http.HttpEntity;
//import org.apache.http.HttpResponse;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.impl.client.DefaultHttpClient;
//import org.apache.http.util.EntityUtils;


public class JavaHttp {

	static public void exe(String urlAsString) throws IOException{
	     URL url = new URL(urlAsString);
	     HttpURLConnection conn = (HttpURLConnection)url.openConnection();
	     int size = conn.getHeaderFields().size();
	     for(int i=0; i< size; i++){
	         System.out.print(conn.getHeaderFieldKey(i)+":\t");
	         System.out.println(conn.getHeaderField(i));
	     }
	     System.out.println("Request Method: "+conn.getRequestMethod());
	     System.out.println("Response Code: "+conn.getResponseCode());
	     System.out.println("Response Message: " +conn.getResponseMessage());
	     System.out.println("Last Modified: " +conn.getLastModified());
	     System.out.println("ContentHandler: " +conn.getContent().getClass().getName());
	     InputStream in = (InputStream)conn.getContent();
//	     FileOutputStream out = new FileOutputStream(new File("index.html"));
//	     copyStream(in, out);

	 }

	public static void exeHttpClient(String urlAsString) throws IOException{
//	    HttpClient client = new DefaultHttpClient();
//	    try {
//	    	HttpGet httpGet = new HttpGet(urlAsString);
//	    	httpGet.setHeader("Referer", "http://baidu.com");
//	    	httpGet.setHeader("User-Agent", "kai kai browser 1983.12.24");
//	    	System.out.println("execting request: " + httpGet.getURI());
//	    	Header[] allHeader = httpGet.getAllHeaders();
//	    	for (Header h : allHeader) {
//	    		System.out.println(h);
//	    	}
//	    	HttpResponse response = client.execute(httpGet);
//	    	HttpEntity entity = response.getEntity();
//	    	System.out.println("------------------");
//	    	System.out.println(response.getStatusLine());
//	    	if (entity != null) {
//	    		String charset = EntityUtils.getContentCharSet(entity);
//	    		System.out.println("Response content length: " + entity.getContentLength() + " CharSet:" + charset);
////	    		String ls_content = EntityUtils.toString(entity);
//	    		String ls_content = EntityUtils.toString(entity, ((charset == null) ? "UTF-8" : charset));
////	    		String ls_content = EntityUtils.toString(entity, "UTF-8");
//	    		System.out.println("Response content: " + ((ls_content.length() > 1000) ? ls_content.substring(0, 1000) : ls_content));
//	    	}
//	    	System.out.println("--------------------");
//	    }
//	    finally {
//	    	client.getConnectionManager().shutdown();
//	    }
	}

	public static void main(String[] args) throws IOException {
		String ls_test = "红\u7ea2";
		System.out.println(ls_test);;
		System.out.println("hello, java http");
//		exeHttpClient("http://wap.baidu.com");
//		exeHttpClient("http://wap.google.com");
//		exeHttpClient("http://apt.ttpod.com/ttpod.html");
//		exeHttpClient("https://github.com/qhkyzf/FeiAndroid");
//		exeHttpClient("http://whatsmyua.com/");
//		exeHttpClient("http://www.devdiv.com/%E7%81%8C%E6%B0%B4%E5%8C%BA-forum-14-1.html");
		
		boolean aa = "".equals("abc");
		boolean bb = "".equals(null);
		System.out.println(aa + " bb=" + bb);
		
		String needTest = "kaikaikai";
		String test = String.format("haha_%s\t_good.", needTest);
		System.out.println(test);;
		
		String url = "http://www.devdiv.com/10.9上班啦- thread-144532-1-1.html?aa=2&xx=1";
		String encodeUrl = URLEncoder.encode(url, "UTF8");
		System.out.println(encodeUrl);
		encodeUrl = encodeUrl.replace("%2F", "/");
		encodeUrl = encodeUrl.replace("%3A", ":");
		encodeUrl = encodeUrl.replace("+", "%20");
		encodeUrl = encodeUrl.replace("%3F", "?");
		encodeUrl = encodeUrl.replace("%3D", "=");
		encodeUrl = encodeUrl.replace("%26", "&");
		System.out.println(encodeUrl);
	}

}
