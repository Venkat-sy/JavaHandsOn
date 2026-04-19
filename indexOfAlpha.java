public class indexOfAlpha {
    public static void main(String[] args) {
        String str = "Hello World";
        int n = str.length();
        
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            
            // Check if the character is actually a letter
            if (Character.isLetter(c)) {
                // 'a' becomes 0, 'b' becomes 1, etc.
                int index = Character.toLowerCase(c) - 'a';
                System.out.println("Character '" + c + "' has alphabetical index: " + index);
            } else {
                System.out.println("Character '" + c + "' is not a letter.");
            }
        }
    }
}