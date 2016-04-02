import java.util.Scanner;

public class CountAllWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] text = input.nextLine().toLowerCase().split("\\W+");
        System.out.println(text.length);
    }
}
