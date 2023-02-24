public class Main {
    public static void main(String[] args) {

        Game game = new Game();
        game.startGame();
        Human player = game.newCharacter();
        while (player.healthRemaining() >= 1) {

        }

    }
}