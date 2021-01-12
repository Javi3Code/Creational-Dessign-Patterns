package common.jeycode.creationaldessignpattern.abstractfactory.files;

import java.util.Objects;

public final class Graphics3DFactory implements SpritesFactory
{

						private static SpritesFactory instance;

						private Graphics3DFactory()
						{}

						protected static SpritesFactory getInstance()
						{
												instance = Objects.isNull(instance) ? new Graphics3DFactory() : instance;
												return instance;
						}

						@Override
						public Character createCharacter()
						{
												return new G3DCharacter();
						}

						@Override
						public Weapon createWeapon()
						{
												return new G3DWeapon();
						}

						@Override
						public Map createMap()
						{
												return new G3DMap();
						}

						@Override
						public Enemy createEnemy()
						{
												return new G3DEnemie();
						}
}
