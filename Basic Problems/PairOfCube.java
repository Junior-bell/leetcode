public class PairOfCube {
 
 public static int PairCube(int n)
 {
    int count=0;
    for(int i=1;i<=Math.cbrt(n);i++)
    {
        int cb=i*i*i;

        int diff=n-cb;
        int cbdif=(int) Math.cbrt(diff);
        if(cbdif*cbdif*cbdif==diff)
        {
            count++;
        }
        

    }
    return count;
 }
 public static void main(String[] args) {
    int n=10;
    System.out.println(PairCube(n));
 }

}
