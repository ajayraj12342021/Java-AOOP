import java.util.Scanner;
public class AreanPeri{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length:");
        int l=sc.nextInt();
        System.out.println("Enter breadth:");
        int b=sc.nextInt();
        int area=l*b;
        int peri=(2*(l+b));

        System.out.println("Area:"+area);
        System.out.println("Perimeter:"+peri);
        sc.close();
    } 
}   
    

