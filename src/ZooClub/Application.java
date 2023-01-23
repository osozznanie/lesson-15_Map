package ZooClub;

import java.util.HashMap;
import java.util.Scanner;


public class Application {
    public static void main(String[] args) {
        ZooClub zooClub = new ZooClub(new HashMap<>());

        while (true) {
            menu();
            Scanner scanner = new Scanner(System.in);
            byte num = scanner.nextByte();

            switch (num) {
                case 1:
                    zooClub.addPerson();
                    break;
                case 2:
                    zooClub.addPetToPerson();
                    break;
                case 3:
                    zooClub.removePetByPerson();
                    break;
                case 4:
                    zooClub.removePerson();
                    break;
                case 5:
                    zooClub.removePetAnyWhere();
                    break;
                case 6:
                    zooClub.showZooClub();
                    break;
                case 7:
                    zooClub.exit();
                default:
                    System.out.println(num + " : Doesn't exist");
                    throw new Error();

            }

        }

    }

    public static void menu() {
        System.out.println("1-Додати учасника клубу\n" +
                "2-Додати тваринку до учасника клубу\n" +
                "3-Видалити тваринку з учасника клубу\n" +
                "4-Видалити учасника з клубу\n" +
                "5-Видалити конкретну тваринку зі всіх власників\n" +
                "6-Вивести на екран зооклуб\n" +
                "7-Вийти з програми");
    }
}
