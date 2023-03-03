import java.util.Scanner;

public class Game {
    private String intro =
                    """
                          _  __                  _____                     \s
                         / |/ /__ __ ___  ___  / ___/____ ___  ___  ___  ___
                        /    // // // _ \\/ -_)/ /__ / __// -_)/ _ \\/ -_)(_-<
                       /_/|_/ \\_,_//_//_/\\__/ \\___//_/   \\__// .__/\\__//___/
                                                            /_/           \s
                    """;
    private String instructions =
                    """
                    -------------------------------------------------------------
                        You are a new adventurer to the World of NuneCrepes.
                        The world has has treasure, monsters and lots of text!
                        Read the text carefully and choose your actions wisely
                        by typing the number of the option you want to choose.
                        
                                            Good luck!
                    -------------------------------------------------------------
                    """;
    private String gameName =
                    """
                    --------------------------
                            NuneCrepes
                    --------------------------
                    """;
    private String help =
                    """
                        If stuck, try turning it off and on again.
                    """;

    public Game() {
        this.intro = intro;
        this.instructions = instructions;
        this.gameName = gameName;
        this.help = help;
    }

    void startGame() {
        System.out.println(this.intro);
        System.out.println(this.instructions);
        System.out.println(this.help);
    }

    public Human newCharacter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        return new Human(name, 100, null, null);
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }
}

