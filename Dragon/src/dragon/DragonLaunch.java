package dragon;
import java.util.Vector;

public class DragonLaunch {
    private Vector<Person> kidnappedPeople;

    public DragonLaunch() {
        kidnappedPeople = new Vector<>();
    }

    public void kidnap(Person person) {
        kidnappedPeople.add(person);
    }

    public boolean willDragonEatOrNot() {
        for (int i = 0; i < kidnappedPeople.size() - 1; i++) {
            if (kidnappedPeople.get(i).getGender() == Gender.BOY &&
                kidnappedPeople.get(i + 1).getGender() == Gender.GIRL) {

                kidnappedPeople.remove(i + 1);
                kidnappedPeople.remove(i);

                i -= 2;
                if (i < -1) i = -1;
            }
        }
        return kidnappedPeople.size() > 0;
    }

    public void getKidnappedPeople() {
        for (Person p : kidnappedPeople) {
            System.out.print(p.toString() + " ");
        }
        System.out.println();
    }
}
