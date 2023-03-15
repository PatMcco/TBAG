public class Main {
    public static void main(String[] args) {

        Hub hub = new Hub();
        Game game = new Game();
        game.startGame();
        Human player = game.newCharacter();
        System.out.println("Welcome " + player.getName() + "!");

        while (!game.quit) {
            hub.hubPrompts();
        }

    }
}