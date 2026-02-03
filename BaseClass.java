import java.util.Scanner;

class BaseClass{
    Scanner sc=new Scanner(System.in);

    public String getString()
    {
        String string=sc.nextLine();
        if(string==null)
        {
            System.out.println("Input Mismatch");
        }
        return string;
    }
    public int getInt()
    {
        int i=sc.nextInt();
        return i;
    }
}