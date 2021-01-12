package common.jeycode.creationaldessignpattern.abstractfactory.files;

public class G2DEnemie implements Enemy
{

						private final static String ENEMY = "Drawing a 2D enemy";

						@Override
						public String draw()
						{
												return ENEMY;
						}

						@Override
						public int lifeTime()
						{
												return 250;
						}

						@Override
						public int power()
						{
												return 2;
						}

						@Override
						public byte points()
						{
												return 10;
						}

						@Override
						public String toString()
						{
												return "\nG2DEnemie [Lifetime: " + lifeTime() + " power: " + power() + " Points: " + points() + "]";
						}

}
