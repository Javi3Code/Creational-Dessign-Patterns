package common.jeycode.creationaldessignpattern.abstractfactory.files;

import java.util.Objects;

public class GraphicsPixelFactory implements SpritesFactory
{

						private static SpritesFactory instance;

						private GraphicsPixelFactory()
						{}

						protected static SpritesFactory getInstance()
						{
												instance = Objects.isNull(instance) ? new GraphicsPixelFactory() : instance;
												return instance;
						}

						@Override
						public Character createCharacter()
						{
												return new GPixelCharacter();
						}

						@Override
						public Weapon createWeapon()
						{
												return new GPixelWeapon();
						}

						@Override
						public Map createMap()
						{
												return new GPixelMap();
						}

						@Override
						public Enemy createEnemy()
						{
												return new GPixelEnemie();
						}
}
