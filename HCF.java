public class HCF{
    public static int calculate(int a,int b)
    {
        if(a==0)//if a is 0 then gcd is b;
        return b;
        if(b==0)//if b is 0 then gcd is a;
        return a;
        if(a>b) {//if a is greater than b then 
       if(a%b==0) //check if a a is factorial of b or not
       return b;  //if yes then this is hcf
       return calculate(a-b,b);
       }//if not then substract b from a;

       
    
        if(b%a==0){
        return a;
        }
        return calculate(a,b-a);
    
    }
    
    public static void main(String[] args) {
        int a=20,b=28;
        System.out.println("The HCF of two given number is "+calculate(a, b));
    }
    
}