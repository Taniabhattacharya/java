import java.util.Scanner;
public class stringg{
    public static void main(String[] args){

        Scanner a= new Scanner(System.in);
        System.out.println("Enter something ");
        String b=a.nextLine();
        System.out.println(b.toUpperCase());
        System.out.println(b.charAt(2));
        System.out.println(b.codePointAt(2));

    }
}