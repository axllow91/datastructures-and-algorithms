package stacks.reverse_word;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseApp {
    public static void main(String[] args) {
        String input;
        StringBuilder output;

        while (true) {
            System.out.println("Enter a string: ");
            System.out.flush();
            input = getString();
            if (input.equals(""))
                break;

            Reverser theReverser = new Reverser(input);
            output = theReverser.doReV();
            System.out.println("Reversed: " + output);
        }
    }

    public static String getString() {
        String s = "";
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            s = br.readLine();

        }catch (IOException e) {
            System.out.println("Something went wrong!");
            e.printStackTrace();
        }
        return s;
    }
}
