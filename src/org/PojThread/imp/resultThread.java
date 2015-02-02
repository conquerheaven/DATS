package org.PojThread.imp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.htmlparser.Node;
import org.htmlparser.NodeFilter;
import org.htmlparser.Parser;
import org.htmlparser.util.NodeList;
import org.htmlparser.util.ParserException;

import org.PojThread.ResultThread;
import org.model.Solution;


public class resultThread implements ResultThread{

	public Solution result(Solution solution) {
		try{
			String url="http://poj.org/status?problem_id="+solution.getProblemId()+"&user_id=conquerheaven&result=&language=4";
	        ArrayList<Solution> rt= getNodeList(url , solution);
	        Iterator<Solution> it = rt.iterator();
	        while(it.hasNext()){
	        	Solution P = it.next();
	        	if(P.getProblemId().equals(solution.getProblemId())){
	        		//System.out.println(P.getResult()+"+"+P.getSubTime());
	        		return P;
	        	}
	        }
	        return solution;
		}catch(Exception e){
			e.printStackTrace();
			return solution;
		}
	}
	
	public static ArrayList<Solution> getNodeList(String url , Solution solution){
        final ArrayList<Solution> result=new ArrayList<Solution>();
        final Solution P = solution;
        final String s = P.getLocTime().toString().substring(0, 17);
        //System.out.println(s);
        Parser parser = null;
        NodeList nodeList=null;
        try {
           parser = new Parser(url);
           parser.setEncoding("GBK");
           nodeList = parser.parse(
                  new NodeFilter(){
					private static final long serialVersionUID = 1L;

					@Override
                      public boolean accept(Node node){
                          Node need=node;
                         if(getStringsByRegex(node.getText())){
                        	 String str = need.toPlainTextString();
                        	 if(str.length()>17){
	                        	 //System.out.println(str.substring(0,17)+" "+s+" "+str.substring(0,17).matches(s));
	                        	 if(str.substring(0,17).matches(s)){
	                        		 Solution tem = new Solution();
	                        		 tem.setSubTime(P.getSubTime());
	                        		 need=need.getPreviousSibling();
	                        		 tem.setCodeLength(need.toPlainTextString());
	                        		 need=need.getPreviousSibling();
	                        		 tem.setLanguage(need.toPlainTextString());
	                        		 need=need.getPreviousSibling();
	                        		 tem.setRunTime(need.toPlainTextString());
	                        		 need=need.getPreviousSibling();
	                        		 tem.setMemory(need.toPlainTextString());
	                        		 need=need.getPreviousSibling();
	                        		 tem.setResult(need.toPlainTextString());
	                        		 need=need.getPreviousSibling();
	                        		 tem.setProblemId(Integer.parseInt(need.toPlainTextString()));
	                        		 result.add(tem);
	                        		 
	                        	 }
                        	 }
                             return true;
                         }                          
                         return false;
                      }                   
                  }
           );               
        }catch (ParserException e) {
           e.printStackTrace();
        }
        return result;
    }    
   
    public static boolean getStringsByRegex(String txt) {
        String regex="td";   
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(txt);
        if (m.find()){
            return true;
        }  
        return false;
    }


}
