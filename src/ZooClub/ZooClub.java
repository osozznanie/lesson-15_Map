package ZooClub;

import java.util.*;

public class ZooClub {
    private Map<Person, List<Pet>> members;

    public ZooClub(Map<Person, List<Pet>> members) {
        this.members = new HashMap<>();
    }

    public Map<Person, List<Pet>> getMembers() {
        return members;
    }

    public void setMembers(Map<Person, List<Pet>> members) {
        this.members = members;
    }

    public void addPerson() {
        System.out.println("Enter name:");
        Scanner scanner = new Scanner(System.in);
        String namePerson = scanner.next();

        System.out.println("Enter age:");
        Scanner scanner2 = new Scanner(System.in);
        int agePerson = scanner2.nextInt();

        members.put(new Person(namePerson.toUpperCase(), agePerson), new ArrayList());
    }

    public void addPetToPerson() {
        System.out.println("Enter exist person which you want add pet");

        System.out.println("Name:");
        Scanner scanner = new Scanner(System.in);
        String namePerson = scanner.next();

        System.out.println("Now enter pet which you want add");

        System.out.println("Type of animal:");
        Scanner scanner3 = new Scanner(System.in);
        String typeOfAnimal = scanner3.next();

        System.out.println("Name");
        Scanner scanner4 = new Scanner(System.in);
        String nameOfAnimal = scanner4.next();

        Iterator<Map.Entry<Person, List<Pet>>> iterator = members.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Person, List<Pet>> next = iterator.next();

            if (namePerson.equalsIgnoreCase(next.getKey().getName())) {
                List<Pet> value = next.getValue();
                value.add(new Pet(typeOfAnimal.toUpperCase(), nameOfAnimal.toUpperCase()));
                next.setValue(value);
            }
        }
    }

    public void removePetByPerson() {
        System.out.println("Enter exist person which you want remove pet");

        System.out.println("Name:");
        Scanner scanner = new Scanner(System.in);
        String namePerson = scanner.next();

        System.out.println("Now enter pet which you want remove");

        System.out.println("Type of animal:");
        Scanner scanner3 = new Scanner(System.in);
        String typeOfAnimal = scanner3.next();

        System.out.println("Name");
        Scanner scanner4 = new Scanner(System.in);
        String nameOfAnimal = scanner4.next();

        Iterator<Map.Entry<Person, List<Pet>>> iterator = members.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Person, List<Pet>> next = iterator.next();

            if (namePerson.equalsIgnoreCase(next.getKey().getName())) {
                List<Pet> value = next.getValue();
                Iterator<Pet> iterator1 = value.iterator();
                while (iterator1.hasNext()) {
                    Pet next2 = iterator1.next();
                    if (nameOfAnimal.equalsIgnoreCase(next2.getName()) && typeOfAnimal.equalsIgnoreCase(next2.getTypeOfAnimal())) {
                        iterator1.remove();
                    }
                }
            }
        }

    }

    public void removePerson() {
        System.out.println("Enter person which you want to remove");

        System.out.println("Name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        Iterator<Map.Entry<Person, List<Pet>>> iterator = members.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Person, List<Pet>> next = iterator.next();
            if (name.equalsIgnoreCase(next.getKey().getName())) {
                iterator.remove();
            }
        }
    }

    public void removePetAnyWhere(){
        System.out.println("Enter pet which you want to remove");

        System.out.println("Type of animal:");
        Scanner scanner = new Scanner(System.in);
        String typeOfAnimal = scanner.next();

        System.out.println("Name");
        Scanner scanner2 = new Scanner(System.in);
        String nameOfAnimal = scanner2.next();

        Iterator<Map.Entry<Person, List<Pet>>> iterator = members.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<Person, List<Pet>> next = iterator.next();
            List<Pet> value = next.getValue();
            Iterator<Pet> iterator1 = value.iterator();
            while(iterator1.hasNext()){
                Pet next1 = iterator1.next();
                if(typeOfAnimal.equalsIgnoreCase(next1.getTypeOfAnimal()) && nameOfAnimal.equalsIgnoreCase(next1.getName())){
                    iterator1.remove();
                }
            }

        }

    }

    public void showZooClub() {
        Iterator<Map.Entry<Person, List<Pet>>> iterator = members.entrySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void exit() {
        System.exit(0);
    }
}
