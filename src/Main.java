import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,total=0;

        Scanner input=new Scanner(System.in);
        
        System.out.print("Bir sayı giriniz: ");
        n=input.nextInt();

        for (int i =1; i<n;i++){
            if(n==1){
                break;
            }
            if(n%i==0){
                total+=i;
            }
        }
        if (n==1){
            System.out.println(n+" Mükemmel sayıdır.");
        }else if(n==total){
            System.out.println(n+" Mükemmel sayıdır.");

        }else {
            System.out.println(n+" Mükemmel sayı değildir.");
        }

    }
}