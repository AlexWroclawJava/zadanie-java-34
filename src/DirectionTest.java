
import java.util.Scanner;

public class DirectionTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Direction[] values = Direction.values();

        System.out.println("Dostępne kierunki świata to: ");
        for (Direction value : values) {
            System.out.println(value);
        }

        System.out.println("Podaj kierunek geograficzny: ");
        String wybor = scanner.nextLine();

        Direction direction = Direction.valueOf(wybor);
        System.out.println("Ok więc idziemy na " + direction.getDirection());

    }
}

