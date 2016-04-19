package demo1;

public class SampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long i = 10 , j =10;
		Long l = new Long(i);
		Long l1 = new Long(j);
		
		
		System.out.println(l);
		System.out.println(l1);
		
		//perform operations
		Long add = new Long(l+l1);
		System.out.println("addition: " + add);
		
		Long sub = new Long(l-l1);
		System.out.println("subtraction: " + sub);
		
		Long mul = new Long(l*l1);
		System.out.println("multiplication: " + mul);
		
		Long div = new Long(l/l1);
		System.out.println("division: " +div);
		
		Long rem = new Long(l%l1);
		System.out.println("remainder: " + rem);
		
		Long posi = new Long(++l);
		System.out.println("post increment: " + posi);
		
		Long prei = new Long(l++);
		System.out.println("pre increment: " + prei);
		
		Long posd = new Long(--l1);
		System.out.println("post decrement: " + posd);
		
		Long pred = new Long(l1--);
		System.out.println("pre decrement: " + pred);
		
		Long sftr = new Long(l>>2);
		System.out.println("shift right: " + sftr);
		
		Long sftl = new Long(l1<<2);
		System.out.println("shift left: " + sftl);
		
		Long uop = new Long(~l);
		System.out.println("unay operator of l: " + uop);
		
		
	System.out.println("primitive data type comparision");
		if( i == j ){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
		System.out.println("Object data type comparision");
		if( l == l1){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
		if( l > l1){
			System.out.println("l is greater");
		}else{
			System.out.println("l1 is greater");
		}

	}

}
