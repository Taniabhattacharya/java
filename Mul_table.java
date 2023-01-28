import java.util.Scanner;
public class Mul_table{
    public static void main(String[] args){
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number whose multiplication table is required");
        a = scan.nextInt();
        for(int i=1; i<a ;i++){
            System.out.println(a*i);
        }
    }
}