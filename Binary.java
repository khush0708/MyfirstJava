import java.util.Scanner;

public class Binary {
  
    public static void main(String[] args){
        {  
            int key;
            int a[]= new int[10];

            Scanner sc=new Scanner(System.in);
            for(int i=0; i<a.length; i++)
            {
                System.out.println("Enter no: ");
                a[i]=sc.nextInt();
            }
            System.out.println("Enter no. to search: ");
            key=sc.nextInt();
    
            int i,j,mid,x;
            i=0;
            j=a.length-1;
            int flag=0;
            while(i<=j&&flag==0){
            mid=(i+j)/2;{
            }
                    if(a[mid]==key){
                        flag=1;
                        System.out.println("Value is found at "+(mid+1));
                    }
                    if(a[mid]>key){
                        j=mid-1;
                    }
                    if(a[mid]<key){
                        i=mid+1;
                    }
        }
           
    }
}
}

