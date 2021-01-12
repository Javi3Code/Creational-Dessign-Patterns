package common.jeycode.creationaldessignpattern.abstractfactory.files;

import java.util.Objects;

public class Graphics2DFactory implements SpritesFactory
{

      private static SpritesFactory instance;

      private Graphics2DFactory()
      {}

      protected static SpritesFactory getInstance()
      {
            instance = Objects.isNull(instance) ? new Graphics2DFactory() : instance;
            return instance;
      }

      @Override
      public Character createCharacter()
      {
            return new G2DCharacter();
      }

      @Override
      public Weapon createWeapon()
      {
            return new G2DWeapon();
      }

      @Override
      public Map createMap()
      {
            return new G2DMap();
      }

      @Override
      public Enemy createEnemy()
      {
            return new G2DEnemie();
      }

}
