class Main{
    public static void main(String[] args)
    {
    int n=10;
        for(int i=1;i<=n;i++)
        {
            for(int space=0;space<i;space++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
