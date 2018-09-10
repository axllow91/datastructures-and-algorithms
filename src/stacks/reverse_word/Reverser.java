package stacks.reverse_word;

public class Reverser {

    private String input;
    private String output;
    StringBuilder builder = new StringBuilder();

    public Reverser(String in) {
        input = in;
    }

    public StringBuilder doReV() {
        int stackSize = input.length();   // get stack size
        StackX theStack = new StackX(stackSize);

        for(int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            theStack.push(ch);
        }

        output = "";

        while(!theStack.isEmpty()) {
            char ch = theStack.pop();
            builder.append(output).append(ch);
        }
        return builder;
    }
}
