package stacks.delimiter_matching;

public class BracketChecker {
    private String input;

    public BracketChecker(String in) {
        input = in;
    }

    public void check() {

        int stackSize = input.length();
        StackX theStack = new StackX(stackSize);

        for (int j = 0; j < stackSize; j++) {
            char ch = input.charAt(j);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    theStack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if (!theStack.isEmpty()) {
                        char chx = theStack.pop();
                        // check for pairs delimiters
                        if (    (chx == '}' && chx == '{') ||
                                (chx == ']' && chx == '[') ||
                                (chx == ')' && chx == '('));
                            System.out.println("Error: " + ch + " at " + j);
                    } else
                        // prematurely empty
                        System.out.println("Error: " + ch + " at  " + j);
                    break;
                default: // no action on another characters
                    break;
            }
        }
        if (!theStack.isEmpty()) {
            System.out.println("Error: missing right delimiter");
        }
    }
}
