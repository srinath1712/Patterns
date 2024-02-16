public class RightDecrease {
    public static void main(String[] args) {
        int num = 5;
        for(int i =1 ;i<=num;i++)
        {
            for(int k=1; k<=i-1; k++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=num-i+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
