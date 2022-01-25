import java.util.Scanner;

public class BubbleSort {
    
    public static void main(String[] args){
        int a[]=new int[10];
        int i;
        
        for(i=0;i<a.length;i++){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no: ");
            a[i]=sc.nextInt();
        }
        System.out.print("Unsorted Array is: ");
        for(i=0;i<a.length;i++){
            System.out.print(a[i]+ ",");
          }
          int n=a.length;
            int j,k,temp;
            for(j=0;j<n;j++){
            for(k=1;k<(n-j);k++){ // k will start from 1 
                    if(a[k-1]>a[k]){ //compare a[k-1]>a[k]
                        temp=a[k]; //compare a[k-1]>a[k]
                        a[k]=a[k-1];//compare a[k-1]>a[k]
                        a[k-1]=temp; /// save temp to a[k+1]
                    }
                    
                }     }
            System.out.print("Sorted Array is: ");
            for(i=0;i<n;i++){
             System.out.print(a[i]+ ",");
}
            }
        }