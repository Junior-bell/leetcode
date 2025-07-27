public class closestTo 
{
    public static int closest(int m,int n)
    {
    int closest=0;//instantiate variable to store closest value
    int minDifference=Integer.MAX_VALUE;

    for(int i=n-Math.abs(m);i<n+Math.abs(m);++i)//used loop to loop through n-m to n+m to look for nearest value
{
       if(i%m==0) //check if the value is divisible by m 
       {
             int difference=Math.abs(n-i); //if divisible by zero then check for how long value is from n
             if(difference<minDifference ||difference==minDifference&& Math.abs(i)>Math.abs(closest) )/*choose the number closest if the differene is same from the number check which number have highest absolute value */
             {
                closest=i;//store the valued in closest
                minDifference=difference;//and store the difference in mindifference
             }
       }
       
    
    
}
return closest;
}
public static void main(String[] args) {
    int n=-13, m=4;
  System.out.println( closest(m,n));

}
}