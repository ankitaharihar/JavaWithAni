public class NumberToWordsQuestion {
    public static void main(String[] args) {
        int number = 5637;
        String text = Integer.toString(number);

        StringBuilder basic = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            switch (ch) {
                case '0':
                    basic.append("zero ");
                    break;
                case '1':
                    basic.append("one ");
                    break;
                case '2':
                    basic.append("two ");
                    break;
                case '3':
                    basic.append("three ");
                    break;
                case '4':
                    basic.append("four ");
                    break;
                case '5':
                    basic.append("five ");
                    break;
                case '6':
                    basic.append("six ");
                    break;
                case '7':
                    basic.append("seven ");
                    break;
                case '8':
                    basic.append("eight ");
                    break;
                case '9':
                    basic.append("nine ");
                    break;
                default:
                    break;
            }
        }

        String[] words = {
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
        };
        StringBuilder alternate = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            int digit = text.charAt(i) - '0';
            alternate.append(words[digit]).append(' ');
        }

        System.out.println("Basic: " + basic.toString().trim());
        System.out.println("Alternate: " + alternate.toString().trim());
    }
}
