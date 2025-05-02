import java.util.Scanner;

interface Playable {
    void play();
    void pause();
    void stop();
}

class MusicPlayer implements Playable {
    public void play() {
        System.out.println("Music is playing...");
    }

    public void pause() {
        System.out.println("Music is paused.");
    }

    public void stop() {
        System.out.println("Music is stopped.");
    }
}

public class TestPlayer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MusicPlayer player = new MusicPlayer();

        while (true) {
            System.out.println("\n1. Play\n2. Pause\n3. Stop\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: player.play(); break;
                case 2: player.pause(); break;
                case 3: player.stop(); break;
                case 4: System.out.println("Exiting Music Player."); sc.close(); return;
                default: System.out.println("Invalid option.");
            }
        }
    }
}
