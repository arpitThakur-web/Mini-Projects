import java.util.*;

public class Drive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age :");
        int age = sc.nextInt();
        System.out.println("Do you have licsence ?");
        boolean haveLicsence = sc.nextBoolean();

        if ( age >= 18 && haveLicsence == true ) {
            System.out.println("You can drive :)");
        } else {
            System.out.println("You can't drive :(");
        }
          sc.close();
    }
}