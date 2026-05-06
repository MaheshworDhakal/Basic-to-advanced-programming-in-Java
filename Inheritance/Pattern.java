public class Pattern {
    public static void main(String aarg[])
    {
        String s="JAVA";
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(s.charAt(j)+"\t");
            }
            System.out.print("\n");
        }
    }
    
}
