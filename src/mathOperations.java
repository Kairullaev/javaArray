import java.util.Random;

public class mathOperations {
    public static void main(String[] args) {
        int a = 125;
        a++;
        System.out.println(a);
        Random random = new Random();
        int m = random.nextInt(15);
        System.out.println(m);
        int m2 = random.nextInt(25);
        System.out.println(m2);
        int m3 = random.nextInt(35);
        System.out.println(m3);
        System.out.println(m+m2+m3);
        System.out.println((m+m2+m3)/3);

    }
}
