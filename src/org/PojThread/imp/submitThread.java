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
	         * ����Ҫ��URL�µ�URLConnection�Ի��� URLConnection���Ժ����׵Ĵ�URL�õ������磺 // Using   
	         *  java.net.URL and //java.net.URLConnection   
	         */    
	        URL url = new URL(surl);   
	        HttpURLConnection connection = (HttpURLConnection)url.openConnection();   
	          
	        /**   
	         * Ȼ���������Ϊ���ģʽ��URLConnectionͨ����Ϊ������ʹ�ã���������һ��Webҳ��   
	         * ͨ����URLConnection��Ϊ���������԰����������Webҳ���͡��������������   
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
	         * ���Ϊ�˵õ�OutputStream�������������Լ����Writer���ҷ���POST��Ϣ�У����磺 ...   
	         */    
	        OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream(), "UTF-8");     
	        out.write("user_id1=conquerheaven&password1=zengbin520"); //post�Ĺؼ����ڣ�     
	        // remember to clean up     
	        out.flush();     
	        out.close();     
	        
	        String cookieVal = connection.getHeaderField("Set-Cookie");
	        /**   
	         * �����Ϳ��Է���һ����������������POST��    
	         * POST /jobsearch/jobsearch.cgi HTTP 1.0 ACCEPT:   
	         * text/plain Content-type: application/x-www-form-urlencoded   
	         * Content-length: 99 username=bob password=someword   
	         */    
	        // һ�����ͳɹ��������·����Ϳ��Եõ��������Ļ�Ӧ��
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
	        out1.write("problem_id="+solution.getProblemId()+"&language=4&source="+code+"&submit=Submit"); //post�Ĺؼ����ڣ�     
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
