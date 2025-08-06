public class LCM {
    
    public static int cal(int a,int b)
    {
        int max=Math.max(a, b);//initialize the variable to the max of two number
        int min=Math.min(a, b); //initialize the variable to the min of two number

        for(int i=max;i<=a*b;i+=max)//loop through factorials of max number till the product of two given number
        {
            if(i%min==0) //check if the given number is divisible by smaller number
            return i; //if yes then i is the LCM of two number
        }
       return a*b;//else product of two numbers is the LCM of two number

    }
    public static void main(String[] args) {
        int a=20,b=28;
        System.out.println("The LCM of the given number is "+cal(a,b));
    }
}
