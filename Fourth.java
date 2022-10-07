import java.util.*;
public class Fourth {
    public static void circumCircle(int r){
        double cir;
        cir=2*3.14*r;
        System.out.println("Circumference of CIrcle"+cir);
        return ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        circumCircle(r);
        return;
    }

    
}
