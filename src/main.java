import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        x = in.nextInt();
        if (x >= 0 && x <= 9){
            System.out.println("DIGIT");
        } else if (x >= 10 && x <= 99){
            System.out.println("NUM");
        } else {
            System.out.println("OTHER");
        }
    }
}
