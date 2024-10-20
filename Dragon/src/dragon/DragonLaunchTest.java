package dragon;

public class DragonLaunchTest {
    public static void main(String[] args) {
        DragonLaunch launch = new DragonLaunch();

        launch.kidnap(new Person(Gender.BOY));  
        launch.kidnap(new Person(Gender.GIRL));   
        launch.kidnap(new Person(Gender.BOY));  
        launch.kidnap(new Person(Gender.GIRL));  

        System.out.print("Initial lineup: ");
        launch.getKidnappedPeople(); 

        if (launch.willDragonEatOrNot()) {
            System.out.println("Dragon will eat!");
        } else {
            System.out.println("Dragon will NOT eat!");
        }

        System.out.print("Final lineup after magic: ");
        launch.getKidnappedPeople();
    }
}
