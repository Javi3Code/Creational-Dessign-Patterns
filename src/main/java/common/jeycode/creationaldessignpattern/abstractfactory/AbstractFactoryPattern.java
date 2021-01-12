package common.jeycode.creationaldessignpattern.abstractfactory;

import common.jeycode.creationaldessignpattern.abstractfactory.files.FactoryProducer;
import common.jeycode.creationaldessignpattern.abstractfactory.files.SpritesFactory;
import common.jeycode.creationaldessignpattern.abstractfactory.view.DinamicGame;

public class AbstractFactoryPattern
{

      private final DinamicGame game;
      private final SpritesFactory factory;

      public AbstractFactoryPattern()
      {
//            factory = FactoryProducer.getGraphicsPixelFactoryInstance();
//            factory = FactoryProducer.getGraphics3DFactoryInstance();
            factory = FactoryProducer.getGraphics2DFactoryInstance();

            game = DinamicGame.initGame(factory);
            game.start();
      }

      public static void main(String[] args)
      {
            new AbstractFactoryPattern();
      }
}
