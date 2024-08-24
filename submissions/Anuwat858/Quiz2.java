import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter Word: ");
        Scanner sc = new Scanner(System.in);
        String np = sc.nextLine();
        String[] a = np.split(" ");
        //The quick brown fox jumps over the lazy dog
        np = np.toLowerCase();

        boolean isPangram = true;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (np.indexOf(ch) == -1) { 
                isPangram = false;
                break;
            }
        }
        if (isPangram) {
            System.out.println("Pengram");
            Arrays.sort(a, (F, B) -> Integer.compare(B.length(), F.length()));
            System.out.println(a[0]);
        } else {
            System.out.println("No Pengram");
        }
    }
}
