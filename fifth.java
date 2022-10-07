import java.util.*;
public class fifth
{
    public  static void  compareAge(int a){
        if(a>18)
        {
            System.out.println("They are eligible for Vote");
        }
        else
        {
            System.out.println("You are Under the age");

        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        compareAge(a);
    }
}
