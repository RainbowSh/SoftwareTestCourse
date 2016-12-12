package edu.shanda.testcourse.demo;

public class InputStack {
	    String string = "";
	    
	    public String push (String word){
	    	string += word;
	    	return string;
	    }
	  
 /*     StringBuffer string = new StringBuffer();
      
      public StringBuffer push(String word){
    	  string.append(word);
    	  return string;
      }
 */     
	
      public char pop(){
    	 char output = 0 ;
    	 String str = string;
//    	 String str = string.toString();
    	  		 
    	 
    	 try {
    		 output = str.charAt(str.length()-1);
    		 string = str.substring(0,str.length()-1);
    	 } catch (Exception e){
    		 System.out.println(e);
    	 }
    	 
    	 return output;
        }
}
