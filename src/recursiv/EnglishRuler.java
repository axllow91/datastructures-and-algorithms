package recursiv;

// rigla de masurat
public class EnglishRuler {

    public static void drawRule(int nInches, int majorLength) {
        drawLine(majorLength, 0);  // draw inch 0 and label
        for(int i = 0; i <= nInches; i++) {
            drawInterval(majorLength - 1);
            drawLine(majorLength, i);
        }
    }

    private static void drawInterval(int centralLength) {
        if(centralLength >= 1) {
            drawInterval(centralLength - 1);
            drawLine(centralLength);
            drawInterval(centralLength - 1);
        }
    }

    private static void drawLine(int ticketLength, int ticketLabel) {
        for(int i = 0; i < ticketLength; i++)
            System.out.println("-");

        if(ticketLabel >= 0)
            System.out.print(" " + ticketLabel);
        System.out.println("\n");

    }

    private static void drawLine(int ticketLength) {
        drawLine(ticketLength - 1);
    }


    public static void main(String[] args) {
        drawRule(2, 3);
    }
}
