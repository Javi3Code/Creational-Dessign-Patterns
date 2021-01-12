package common.jeycode.creationaldessignpattern.abstractfactory.files;

public class G3DWeapon implements Weapon
{

						private final static String WEAPON = "Drawing a 3D weapon";

						@Override
						public String draw()
						{
												return WEAPON;
						}

						@Override
						public int durability()
						{
												return 10;
						}

						@Override
						public int power()
						{
												return 1;
						}

						@Override
						public String toString()
						{
												return "\nG3DWeapon [Durability: " + durability() + " Power: " + power() + "]";
						}

}
