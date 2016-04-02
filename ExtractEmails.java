import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        Pattern pattern = Pattern.compile
                ("(\\b[a-zA-Z0-9]+)([a-zA-Z0-9._-]+)[^-_](@)([a-zA-Z0-9._-]+)([^. ]\\b)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
