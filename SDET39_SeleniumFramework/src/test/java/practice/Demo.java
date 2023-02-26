package practice;

import java.util.HashSet;

import org.testng.annotations.Test;

public class Demo 
{
	   public static void main(String[] args)
	    {
	        String str="AABBACDDD";
	        int count=0;
	        
	       for(int i=0;i<str.length();i++)
	          {
	    	   if(str.charAt(i)>='A' && str.charAt(i)<='Z')
	    	   {
	            System.out.println(str.charAt(i)+count++);
	    	   }
	          }
	 
	           
	            
	         }



	    
	}


