package ZooClub;

public class Pet {
    private String typeOfAnimal;
    private String name;

    public Pet(String typeOfAnimal, String name) {
        this.typeOfAnimal = typeOfAnimal;
        this.name = name;
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet pet)) return false;

        if (getTypeOfAnimal() != null ? !getTypeOfAnimal().equals(pet.getTypeOfAnimal()) : pet.getTypeOfAnimal() != null)
            return false;
        return getName() != null ? getName().equals(pet.getName()) : pet.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getTypeOfAnimal() != null ? getTypeOfAnimal().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return " Pet { typeOfAnimal = " + typeOfAnimal + ", name = " + name + " } ";
    }
}
