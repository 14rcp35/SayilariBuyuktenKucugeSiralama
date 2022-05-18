import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        b = sc.nextInt();
        System.out.print("Enter the value of c : ");
        c = sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println("a is greatest");
            if(b>c)
            {
                System.out.println("b is greater than c");
                System.out.println(a+">"+b+">"+c);
            }
            else
            {
                System.out.println("c is greater than b");
                System.out.println(a+">"+c+">"+b);
            }

        }else if(b>a && b>c)
        {
            System.out.println("b is greatest");
            if(a>c)
            {
                System.out.println("a is greater than c");
                System.out.println(b+">"+a+">"+c);
            }
            else
            {
                System.out.println("c is greater than a");
                System.out.println(b+">"+c+">"+a);
            }
        }
        else
        {
            System.out.println("c is greatest");
            if(a>b)
            {
                System.out.println("a is greater than b");
                System.out.println(c+">"+a+">"+b);
            }
            else
            {
                System.out.println("b is greater than a");
                System.out.println(c+">"+b+">"+a);
            }
        }

    }
}
