import java.util.Scanner;

public class conditionalStatements {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a);
        int b = scanner.nextInt();
        System.out.println(b);
        if (a>b){
            System.out.println(b);
        }else {
            System.out.println(a);
        }

        */
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a);
        int b = scanner.nextInt();
        System.out.println(b);
        int c = scanner.nextInt();
        System.out.println(c);
        if (a>b && a>c){
            System.out.println(a);
        }else if (b>c){
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
