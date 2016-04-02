import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        Pattern pattern = Pattern.compile("([a-zA-Z]+){2,}");
        Matcher matcher = pattern.matcher(sentence);
        while (matcher.find()){
            System.out.print(matcher.group() + " ");
        }
    }
}
