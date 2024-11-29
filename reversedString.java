// Reverse String
class StringReverser {
    private String inputString;

    public StringReverser(String inputString) {
        this.inputString = inputString;
    }

    public String reverseString() {
        StringBuilder reversed = new StringBuilder(inputString);
        return reversed.reverse().toString();
    }

    public String getInputString() {
        return inputString;
    }
}

public class reversedString {
    public static void main(String[] args) {
        StringReverser reverser = new StringReverser("Hello, World!");

        System.out.println("Original String: " + reverser.getInputString());
        System.out.println("Reversed String: " + reverser.reverseString());
    }
}
