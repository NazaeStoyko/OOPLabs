import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextProcessor {
    private String text;

    public TextProcessor(String text) {
        this.text = text;
    }

    public String findEmails() {
        // Регулярний вираз для визначення електронних адрес
        String emailRegex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(text);

        //  find all email addresses
        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            result.append(matcher.group()).append(", ");
        }

        // Remove the last comma and space that were added at the end
        if (result.length() > 0) {
            result.delete(result.length() - 2, result.length());
        }

        return result.toString();
    }
}
