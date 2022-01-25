import java.util.Scanner;
public class constructor {
    int a,b;
    constructor(int x,int y)
    {
        a=x;
        b=y;
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first value"+a );
        a=sc.nextInt();
        System.out.println("Enter first value"+b );
        b=sc.nextInt();
    }
    void display(){
        System.out.println("a" +a+ "b"+b);
    }
    
    void output(){
        int c;
        c=a+b;
        System.out.println(c);
    }


}

