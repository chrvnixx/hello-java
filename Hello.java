public class Hello
{
    public static void main(String a[])
    {
        int nums[][] = new int [9][];

        nums[0] = new int[6];
        nums[1] = new int[2];
        nums[2] = new int[7];
        nums[3] = new int[9];
        nums[4] = new int[1];
        nums[5] = new int[4];
        nums[6] = new int[7];
        nums[7] = new int[3];
        nums[8] = new int[2];

        for(int i=0;i<9;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                nums[i][j] = (int) Math.floor(Math.random() * 10);
                // System.out.print(nums[i][j]+" ");
            }
            // System.out.println();
        }
        

        for(int n[] : nums)
        {
            for(int m: n)
            {
                System.out.print(m);
            }
             System.out.println();
        }
       
    }
}