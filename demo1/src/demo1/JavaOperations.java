package demo1;

public class JavaOperations {
	public static void main(String[] args)
	{
		long a = 60;
		long b = 13;
		long c = 0;
		long d = 20;
		float x=31;
		float y=11;
		float z=0;
		System.out.println("a= " +a);
		System.out.println("b= " +b);
		
		//multiplicative
	    c=a*b;
		System.out.println("a * b = " +c);
		
	    c=a/b;
		System.out.println("a / b = " +c);
		
		c=a%b;
		System.out.println("a % b = " +c);
		
		//additive
		c=a+b;
		System.out.println("a + b = " +c);
		
		c=a-b;
		System.out.println("a - b = " +c);
		
		//relational operator,logical AND
		if(a>b && a>d){
			System.out.println("a is greater than b and d");
		}
			else if(b>a && b>d){	
			System.out.println("b is greater than a and d");
		}
			else{
				System.out.println("d is greater than a and b");
			}
		
		  //post increment
		  long a1 = a++;
		  long b1= b++;
		  System.out.println("post increment");
		  System.out.println(a1);
		  System.out.println(b1);
		
		  //pre-increment
		  long a2 = ++a;
		  long b2 = ++b;
		  System.out.println("pre increment");
		  System.out.println(a2);
		  System.out.println(b2);
		
		        //post decrement
				long a3 = a--;
				long b3= b--;
				System.out.println("post decrement");
				System.out.println(a3);
				System.out.println(b3);
				
				//pre-decrement
				long a4 = --a;
				long b4 = --b;
				System.out.println("pre decrement");
				System.out.println(a4);
				System.out.println(b4);
		

	     c = a & b;    /*bitwise AND*/   
	     System.out.println("a & b = " + c );

	     c = a | b;     /*bitwise inclusive OR*/  
	     System.out.println("a | b = " + c );

	     c = a ^ b;       /*bitwise exclusive OR*/ 
	     System.out.println("a ^ b = " + c );

	     c = ~a;         /*unary op*/
	     System.out.println("~a = " + c );

	     //shift operations
	     c = a << 2;    
	     System.out.println("a << 2 = " + c );

	     c = a >> 2;     
	     System.out.println("a >> 2  = " + c );

	     c = a >>> 2;     
	     System.out.println("a >>> 2 = " + c );
	     
	     //operations using float
	     z=x/y;
	     System.out.println("value of z: " +z);
		
	}
}
