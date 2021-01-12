package common.jeycode.creationaldessignpattern.abstractfactory.files;

public class GPixelEnemie implements Enemy
{

						private final static String ENEMY = "Drawing a pixelated enemy";

						@Override
						public String draw()
						{
												return ENEMY;
						}

						@Override
						public int lifeTime()
						{
												return 150;
						}

						@Override
						public int power()
						{
												return 5;
						}

						@Override
						public byte points()
						{
												return 15;
						}

						@Override
						public String toString()
						{
												return "\nGPixelEnemie [Lifetime: " + lifeTime() + " power: " + power() + " Points: " + points() + "]";
						}

}
