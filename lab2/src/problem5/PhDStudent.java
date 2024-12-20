package problem5;

public class PhDStudent extends Student {
    public PhDStudent(String name, int age, String major) {
        super(name, age, major);
    }

    @Override
    public void assignPet(Animal pet) {
        if (pet instanceof Dog) {
            System.out.println("PhD students can't take care of dogs!");
        } else if (!this.hasPet()){
            super.assignPet(pet);
        }
    }

    @Override
    public String getOccupation() {
        return "PhD Student, Major: " + super.getOccupation();
    }
}
