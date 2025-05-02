// File: Game.java
import java.util.Scanner;

class PlayerDefeatedException extends Exception {
    public PlayerDefeatedException(String message) {
        super(message);
    }
}

class Player {
    int health = 100;

    public void takeDamage(int damage) throws PlayerDefeatedException {
        health -= damage;
        if (health < 0) {
            throw new PlayerDefeatedException("Player has been defeated!");
        }
        System.out.println("Remaining health: " + health);
    }
}

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player player = new Player();

        try {
            System.out.print("Enter first attack damage: ");
            int damage1 = sc.nextInt();
            player.takeDamage(damage1);

            System.out.print("Enter second attack damage: ");
            int damage2 = sc.nextInt();
            player.takeDamage(damage2);
        } catch (PlayerDefeatedException e) {
            System.out.println("Game Over: " + e.getMessage());
        }
        sc.close();
    }
}
