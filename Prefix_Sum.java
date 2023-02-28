import java.util.Scanner;

public class Prefix_Sum{
    
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int length,number,sum=0;;
        System.out.println("Enter Length of the array: ");
        length=input.nextInt();
        int arr[]=new int[length];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter number: ");
            number=input.nextInt();
            arr[i]=number;
        }
        System.out.println("Your array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            arr[i]=sum;
        }
        System.out.println();
        System.out.println("Your prefix sum arrya: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}