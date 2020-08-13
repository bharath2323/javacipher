import java.util.Scanner;

public class program2 {
    void sum(int x,int y)
    {
        System.out.println(x+y);
    }
    void sum(String s1,String s2)
    {
        System.out.println(s1+s2);
    }
    public static void main(String[] args) {
        program2 obj=new program2();
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        int operation = sc.nextInt();
        if(operation == 1)
        {
            int x=0;
            int y=0;
            for(int i=0;i<input1.length();i++)
            {
                x+=input1.charAt(i);
            }
            for(int i=0;i<input2.length();i++)
            {
                y+=input2.charAt(i);
            }
            obj.sum(x,y);
        }
        else if(operation == 2)
        {
            obj.sum(input1,input2);
        }
        else
        {
            int x=Integer.parseInt(input1);
            int x=0;
            for(int i=0;i<input2.length();i++)
            {
                y+=input2.charAt(i);
            }
            obj.sum(x,y);
        }
    }
}