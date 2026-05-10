public class Hello
{
    public static void main(String a[])
    {
        int nums[][] = new int[6][];
        
        nums[0] = new int[2];
        nums[1] = new int[9];
        nums[2] = new int[7];
        nums[3] = new int[4];
        nums[4] = new int[8];
        nums[5] = new int[6];

        for(int i=0;i<6;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                nums[i][j] = (int)Math.floor(Math.random() * 10);
            }
           
        }

        for(int m[]:nums)
        {
            for(int n : m)
                System.out.print(n + " ");

            System.out.println();
        }
           
            


            
       
    }
}