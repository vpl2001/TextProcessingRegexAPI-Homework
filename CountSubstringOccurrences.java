import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine().toLowerCase();
        String word = input.nextLine();
        int counter = 0;
        int index = text.indexOf(word);
        while (index != -1){
            counter++;
            index = text.indexOf(word, index+1);
        }
        System.out.println(counter);
    }
}
