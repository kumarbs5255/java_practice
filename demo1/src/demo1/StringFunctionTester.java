package demo1;

public class StringFunctionTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//length of a string
		String str=new String("Saikumar");
		System.out.println("String Length :" +str.length());
		
		//character at particular position 
		char res = str.charAt(7);
		System.out.println("character at 8th position: " +res);
		
		//determining whether string is empty or not 
		System.out.println("is string empty? = " + str.isEmpty());
		 
		//converting uppercase to lowercase
		System.out.println(" uppercase to lowercase: "+str.toLowerCase());
		
		//converting lowercase to uppercase
		System.out.println(" lowercase to uppercase: "+str.toUpperCase());
		
		//lastIndexOf
		System.out.println("last index of letter 'a' =  " + str.lastIndexOf('a', 7)); 
		System.out.println("last index of letter 'm' =  "+ str.lastIndexOf('m'));
		
		//indexOf
		System.out.println("index of letter 'u' =  "+ str.indexOf('u', 4)); 
		System.out.println("index of letter 'u' =  "+ str.indexOf('i'));
		
		//concat
		str=str.concat(" is good");
		System.out.println(str);
		
		String str1="kumar";
		
		//compareTo
		int result = str1.compareTo( str );
	      System.out.println(result);
	      
	      //compareToIgnoreCase
	      result = str.compareToIgnoreCase( str1 );
	      System.out.println(result);
	      
	      //contains
	      boolean retval = str.contains(str1);
	      System.out.println("Method returns : " + retval);
	      
	      //substring
	      System.out.println("Return Value :" +str.substring(3) );
	      System.out.println("Return Value :" +str.substring(3,8) );
	      
	}

}
