package City;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import com.opencsv.CSVWriter;
public class Hub {
    private String hubTitle =
            """
            --------------------------
                   City of Nune
            --------------------------
            """;
    private String innTitle =
            """
            --------------------------
                The BlackSmoke Inn
            --------------------------
            """;
    private String blackSmithTitle =
            """
            --------------------------
                 Blade & Barrier
            --------------------------
            """;
    private String generalStoreTitle =
            """
            --------------------------
                The General Store
            --------------------------
            """;
    private String quitMenu =
            """
            --------------------------
                 Are you sure?
            --------------------------
            """;

    private int choice;
    private String input;

    public ArrayList<String> getHubPrompts() {
        ArrayList<String> hubOptions = new ArrayList<>();
        hubOptions.add("1. Enter the Inn");
        hubOptions.add("2. Enter the Blacksmith");
        hubOptions.add("3. Enter the General Store");
        hubOptions.add("4. Enter the Forest");
        hubOptions.add("5. Quit Game");
        return hubOptions;
    }

    // main menu for the hub where player can get ready for the next adventure
    // or save and quit.
    //TODO: Add save and quit functionality
    //TODO: Add forest
    //TODO: Add blacksmith and general store

    public void hubPrompts() {
        System.out.println(hubTitle);
        for (String option : getHubPrompts()) {
            System.out.println(option);
        }
        try {
            choice = getInput();
        } catch (NumberFormatException e) {
            System.out.println("That is not a valid response.");
            hubPrompts();
        }
        if (choice == 1) {
            stayTheNight();
        } else if (choice == 2) {
            System.out.println("Blacksmith coming soon.");
            // blackSmith();
        } else if (choice == 3) {
            System.out.println("General Store coming soon.");
            // generalStore();
        } else if (choice == 4) {
            System.out.println("Forest coming soon.");
            // enterForest();
        } else if (choice == 5) {
            System.out.println("You quit the game.");
            // saveAndQuit()
        } else {
            System.out.println("That is not a valid response.");
            hubPrompts();
        }
    }

    // Options to sleep at the inn to restore health status to full
    public void stayTheNight() {
        System.out.println(innTitle);
        System.out.println("Would you like to stay the night? (1/2)");
        System.out.println("1. Yes (Heal to full)");
        System.out.println("2. No");
        try {
            choice = getInput();
        } catch (NumberFormatException e) {
            System.out.println("That is not a valid response.");
            stayTheNight();
        }
        if(choice == 1){
            System.out.println("You decide to stay the night.");
//            System.out.println("You pay the Innkeeper 10 gold.");
            System.out.println("You wake up the next morning feeling refreshed.");
            // healToFull();
        } else if(choice == 2){
            System.out.println("You decide to leave the Inn.");
            hubPrompts();
        } else {
            System.out.println("That is not a valid response.");
            stayTheNight();
        }
    }

    // Options to buy and sell items at the blacksmith
    // TODO: Add buy and sell menus
    public void blackSmith() {
        System.out.println(blackSmithTitle);
        System.out.println("Would you like to buy or sell? (1/2)");
        System.out.println("1. Buy");
        System.out.println("2. Sell");
        try {
            choice = getInput();
        } catch (NumberFormatException e) {
            System.out.println("That is not a valid response.");
            blackSmith();
        }
        if(choice == 1){
            System.out.println("You decide to buy.");
            // buyMenu();
        } else if(choice == 2){
            System.out.println("You decide to sell.");
            // sellMenu();
        } else {
            System.out.println("That is not a valid response.");
            blackSmith();
        }
    }

    //TODO: add save functionality
    public void quitGame() throws IOException {
        System.out.println("Are you sure you'd like to quit the game? (1/2)");
        choice = getInput();
        if (choice == 1) {
            String quitMessage = "Save and Quit.";
            // TODO: add save functionality and call here
            //instantiate new CSVWriter object
            CSVWriter writer = new CSVWriter(new FileWriter("save.csv"));
            //write data to CSV
            String save1[] = {Human.getName(), }
            System.out.println(quitMessage);
            System.exit(0);
        } else if (choice == 2) {
            System.out.println("You decide to continue playing.");
        } else {
            System.out.println("That is not a valid response.");
            quitGame();
        }
    }

    public int getInput() {
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        choice = Integer.parseInt(input);
        return choice;
    }
}
