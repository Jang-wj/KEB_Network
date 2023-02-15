import Diablo.Axe;
import Diablo.Barbarian;
import Diablo.Bow;
import Diablo.Sorceress;

public class Day23 {
    public static void main(String[] args) {
        Barbarian b1 = new Barbarian();
        Sorceress s1 = new Sorceress();
        Axe berserkerAxe = new Axe();
        Bow windForce = new Bow();
        b1.setWeapon(berserkerAxe);
        s1.setWeapon(windForce);
        b1.performWeapon();
        s1.performWeapon();
        s1.setWeapon(new Axe());
        s1.performWeapon();
        s1.info();

        b1.setWeapon(() -> System.out.println("신오브"));
        b1.performWeapon();
    }
}
