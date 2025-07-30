public class NumberSwapUsingArithmetic {
     public static void main(String[] args) {
    int a=2; int b=3;
   System.out.println("a="+a+" b="+b);//before swap
   a=a+b;//store sum in a
   b=a-b;//store the difference in b
   b=a-b;//store the differene again in b as we got a's real value above
System.out.println("a="+a+" b="+b);
     
   }

}
