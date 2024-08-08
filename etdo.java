public class Redactor {
    public static void main(String[] args) {
        String originalString = "Sensitive data: 1234567890";
        boolean attributesPresent = true; // Example condition, replace with your logic

        String redactedString = redactIfNeeded(originalString, attributesPresent);
        System.out.println(redactedString); // Output based on condition
    }

    public static String redactIfNeeded(String originalString, boolean attributesPresent) {
        if (attributesPresent) {
            // Redact only if attributes are present
            return redactDigits(originalString);
        } else {
            // Do something else, perhaps leave the string as is or handle differently
            return originalString;
        }
    }

    public static String redactDigits(String input) {
        // Replace all digits with 'X'
        String redacted = input.replaceAll("\\d", "X");
        return redacted;
    }
}
