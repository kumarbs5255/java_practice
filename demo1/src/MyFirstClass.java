import static java.lang.System.out;

/**
 * Created by sai on 17/04/2016.
 */
public class MyFirstClass {
    public static void main(String[] args)
    {
        int value1=5,value2=10;
        long val1=25687,val2=34976;
        String message="100      ";
        int newnum=Integer.parseInt(message.trim());
        int sum=value1+newnum;
        //int diff=value2-value1;
        //int div=value2/value1;
       // int rem=value2%value1;
      //  int mul=value1*value2;
       // System.out.println(val1);
     //   System.out.println(val2);
        System.out.println(sum);
      //  System.out.println(diff);
       // System.out.println(div);
        //System.out.println(rem);
        //System.out.println(mul);
        //System.out.println(message.trim());
        System.out.println(String.valueOf(value2)+value1);

    }
}