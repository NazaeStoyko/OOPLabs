public class Main {
    public static void main(String[] args) {

        String inputText = "Text with emails: ivan.doe@gmail.com, ostap.smith@gmail.com.";
        TextProcessor textProcessor = new TextProcessor(inputText);

        System.out.println("Text: " + inputText);
        System.out.println("Emails: " + textProcessor.findEmails());
    }
}
