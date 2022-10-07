import java.util.*;
public class array {
    public static void  main(String agrs[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  size of array");
        int size = sc.nextInt();
       int number[] = new int[size];
        for(int i=0;i<size;i++)
        {
            number[i] = sc.nextInt();

        }
        
        System.out.println("Enter the  element to be searched");
        int x =sc.nextInt();
        for(int i=0;i<size;i++)
        {
            if(number[i]==x)
            {
                System.out.println("FOUND AT"+i);
            }
            
        }
       

    }
    
}
