import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created 1.4.2016 г..
 */
public class StartsEndsWithCapitalLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        Pattern pattern = Pattern.compile("\\b[A-Z][a-zA-Z]*?[A-Z]\\b");
        Matcher matcher = pattern.matcher(sentence);
        while (matcher.find()){
            System.out.print(matcher.group()+" ");
        }
    }
}
