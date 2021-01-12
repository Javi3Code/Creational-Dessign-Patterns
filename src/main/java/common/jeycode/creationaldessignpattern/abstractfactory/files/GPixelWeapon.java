package common.jeycode.creationaldessignpattern.abstractfactory.files;

public class GPixelWeapon implements Weapon {

						private final static String WEAPON = "Drawing a pixelated weapon";

						@Override
						public String draw() { return WEAPON; }

						@Override
						public int durability() { return 5; }

						@Override
						public int power() { return 1; }

						@Override
						public String toString() { return "\nGPixelWeapon [Durability: " + durability() + " Power: " + power() + "]"; }

}
