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
        if (health < 0) throw new PlayerDefeatedException("Player has been defeated!");
        System.out.println("Remaining health: " + health);
    }
}

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player player = new Player();
        try {
            System.out.print("Enter damage amount: ");
            int damage = sc.nextInt();
            player.takeDamage(damage);
            System.out.print("Enter next damage amount: ");
            damage = sc.nextInt();
            player.takeDamage(damage);
        } catch (PlayerDefeatedException e) {
            System.out.println("Game Over: " + e.getMessage());
        }
        sc.close();
    }
}
