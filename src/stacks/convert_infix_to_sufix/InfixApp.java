package stacks.convert_infix_to_sufix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InfixApp {
    public static void main(String[] args) throws IOException {
        String input, output;
        while (true) {
            System.out.println("Enter a infix: ");
            System.out.flush();
            input = getString();

            if(input.equals(""))
                break;

            output = "";

            InToPost inToPost = new InToPost(input);
            output = inToPost.doTrans();  // do translation
            System.out.println("Postfix is " + output + '\n');
        }

    }

    private static String getString() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
