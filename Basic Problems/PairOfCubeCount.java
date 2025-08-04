public class PairOfCubeCount {
    
    public static int countCube(int n)//brute force approach to count the pair of cubes
    {
        int count=0;
        for(int a=1;a<n;a++)
        for(int b=0;b<n;b++)
        {
             if(a*a*a+b*b*b==n)
             count++;
        }
        return count;

    }
    public static void main(String[] args) {
        int n=9;
        System.out.println("The count of pairs of cube is "+countCube(n));
      
    }
}
