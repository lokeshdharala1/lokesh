package com.moaddi;

import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class EachcountinjavaProgramm {
	
	
	
	
	
	    static void characterCount(String inputString)
	    {
	        
	       /* HashMap<String, Integer> charCountMap = new HashMap<String, Integer>();
	 
	        
	        String[] strArray = inputString.split(" ");
	       
	 
	     
	        for (String c : strArray)
	        {
	        	if(c.equals("Java"))
	        	{
	            if(charCountMap.containsKey(c))
	            {
	              
	 
	                charCountMap.put(c, charCountMap.get(c)+1);
	            }
	            else
	            {
	               
	 
	                charCountMap.put(c, 1);
	            }
	        	}
	        }
	 
	        //Printing the charCountMap
	 
	        System.out.println(charCountMap);
	    }*/
	  
        String findStr = "hello";
        int count =0;
        int findStrLength = findStr.length();
        for(int i=0;i<inputString.length();i++){
            if(findStr.startsWith(Character.toString(inputString.charAt(i)))){
                if(inputString.substring(i).length() >= findStrLength){
                    if(inputString.substring(i, i+findStrLength).equals(findStr)){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
	 
	    	Pattern p = Pattern.compile("hello");
	    	Matcher m = p.matcher(inputString);
	    	int count1 = 0;
	    	while (m.find()){
	    	    count1 ++;
	    	}
	    	System.out.println(count1); 
	    	
	    	
	    	String findStr1 = "hello";
	    	int numberOfMatches = 0;
	    	while (inputString.contains(findStr1)){
	    		inputString = inputString.replaceFirst(findStr1, "0");
	    	    numberOfMatches++;
	    	}
	    	System.out.println(numberOfMatches);
	    	System.out.println(	inputString);
	    	while (inputString.contains("0")){
	    		inputString = inputString.replaceFirst("0",findStr1 );
	    	    numberOfMatches++;
	    	}
	    	System.out.println(	inputString);
	    }
	    public static void main(String[] args)
	    {
	       /*characterCount("Java J2EE Java JSP J2EE");*/
	 
	       characterCount("helloslkhellodjladfjhello");
	 
	      /* characterCount("Done all And Gone");*/
	    }
	}


