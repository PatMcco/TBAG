import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static int getInput() {
        String input;
        int choice;
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        try {
            choice = Integer.parseInt(input);
            return choice;
        } catch (NumberFormatException e) {
            System.out.println("INVALID INPUT!");
            return getInput();
        }
    }

    public static int shopMenuDisplay(ArrayList<ItemLibrary> lib) {
        int line = 1;
        for (ItemLibrary i : lib) {
            System.out.println(line + ". " + i.getItemName());
            line++;
        }
        return line;
    }
}
