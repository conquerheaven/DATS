package org.PojThread.imp;

import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.PojThread.SubmitThread;
import org.model.Solution;

public class submitThread implements SubmitThread{
	public boolean submit(Solution solution) {
		try{
			String surl = "http://poj.org/login";  
	          
	        /**   
	         * 首先要和URL下的URLConnection对话。 URLConnection可以很容易的从URL得到。比如： // Using   
	         *  java.net.URL and //java.net.URLConnection   
	         */    
	        URL url = new URL(surl);   
	        HttpURLConnection connection = (HttpURLConnection)url.openConnection();   
	          
	        /**   
	         * 然后把连接设为输出模式。URLConnection通常作为输入来使用，比如下载一个Web页。   
	         * 通过把URLConnection设为输出，你可以把数据向你个Web页传送。下面是如何做：   
	         */    
	        connection.setConnectTimeout(30000);  
	        connection.setReadTimeout(30000);
	        connection.setDoOutput(true);   
	        connection.setDoInput(true);
	        connection.setRequestMethod("POST");
	        try{
	        	connection.connect();
	        }catch(Exception e){
	        	return false;
	        }
	        /**   
	         * 最后，为了得到OutputStream，简单起见，把它约束在Writer并且放入POST信息中，例如： ...   
	         */    
	        OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream(), "UTF-8");     
	        out.write("user_id1=conquerheaven&password1=zengbin520"); //post的关键所在！     
	        // remember to clean up     
	        out.flush();     
	        out.close();     
	        
	        String cookieVal = connection.getHeaderField("Set-Cookie");
	        /**   
	         * 这样就可以发送一个看起来象这样的POST：    
	         * POST /jobsearch/jobsearch.cgi HTTP 1.0 ACCEPT:   
	         * text/plain Content-type: application/x-www-form-urlencoded   
	         * Content-length: 99 username=bob password=someword   
	         */    
	        // 一旦发送成功，用以下方法就可以得到服务器的回应：
	        surl = "http://poj.org/submit";
	        url = new URL(surl);
	        HttpURLConnection connection1 = (HttpURLConnection )url.openConnection();
	        connection1.setDoOutput(true);   
	        connection1.setDoInput(true);
	        connection1.setRequestMethod("POST");
	        connection1.setRequestProperty("Cookie", cookieVal);
	        connection1.setConnectTimeout(30000);  
	        connection1.setReadTimeout(30000);  
	        try{
	        	connection1.connect(); 
	        }catch(Exception e){
	        	return false;
	        }
	        OutputStreamWriter out1 = new OutputStreamWriter(connection1.getOutputStream(), "utf-8");     
	        String code = URLEncoder.encode(solution.getCode(),"utf-8");
	        out1.write("problem_id="+solution.getProblemId()+"&language=4&source="+code+"&submit=Submit"); //post的关键所在！     
	        // remember to clean up     
	        out1.flush();     
	        out1.close();     
	        connection1.getInputStream();
			return true;
		}catch(Exception e){
			return false;
		}

	}

}
