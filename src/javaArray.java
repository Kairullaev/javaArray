import java.util.Random;
import java.util.Scanner;

public class javaArray {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int d = scanner.nextInt();
        int[] a = new int[5];
        a [0] = 15;
        a [1] = 7;
        a [2] = 45;
        a [3] = 225;
        a [4] = 9;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);


        int [] arr = {133,432,44,33,11,21,12,12,};
        for (int i=0;i<arr.length;i++){
            System.out.println(i);
        }


        int [] arr = new int[5];
        arr [0] = 125;
        arr [1] = 24;
        arr [3] = 78;
        arr [2] = 66;
        arr [4] = 55;
        System.out.println();

        int [] f = new int[7];
        f [2] = 12;
        f [0] = 25;
        f [1] = 45;
        f [3] = 66;
        f [4] = 125;


        Random random =  new Random();
        int a = 0;
        int b = 0;
        int [] m = new int[10];
        for (int i =0; i <m.length; i++){
            m [i] = random.nextInt(10);
            a += m[i];
            b++;
            System.out.println(m[i]);
        }
        System.out.println("srednaia orifmetikasy"+a/b);

        */
        Random random = new Random();
        int a = 0;
        int s = 0;
        int[] arr = new int[20];
        for (int i = 0;i < arr.length;i++){
            arr [i] = random.nextInt(100);
            a += arr[i];
            s++;
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 50) {
                a+= arr[i];
                s++;
                System.out.println(arr[i]);

            }
        }







    }
}
