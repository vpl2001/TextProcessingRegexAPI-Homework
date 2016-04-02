import java.util.Scanner;

/**
 * Created 2.4.2016 г..
 */
public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] text = input.nextLine().trim().toLowerCase().split("\\W+");
        String word = input.nextLine();
        int counter = 0;
        for (String s : text) {
            if (s.equals(word)){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
