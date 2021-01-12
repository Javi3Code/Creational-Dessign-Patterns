package common.jeycode.creationaldessignpattern.abstractfactory.files;

public class G2DWeapon implements Weapon {

						private final static String WEAPON = "Drawing a 2D weapon";

						@Override
						public String draw() { return WEAPON; }

						@Override
						public int durability() { return 20; }

						@Override
						public int power() { return 1; }

						@Override
						public String toString() { return "\nG2DWeapon [Durability: " + durability() + " Power: " + power() + "]"; }

}
