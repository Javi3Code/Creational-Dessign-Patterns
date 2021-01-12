package common.jeycode.creationaldessignpattern.abstractfactory.view;

import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;

import javax.swing.WindowConstants;

import common.jeycode.creationaldessignpattern.abstractfactory.files.Item;
import common.jeycode.creationaldessignpattern.abstractfactory.files.SpritesFactory;

public final class DinamicGame
{

      private DinamicFrame frame;
      private final JArea textArea;
      private final List<Item> listOfItems = new ArrayList<>();

      private DinamicGame(SpritesFactory factory)
      {
            setFrame();
            loadList(factory);
            textArea = frame.getTextArea(listOfItems);
      }

      private void loadList(SpritesFactory factory)
      {
            listOfItems.add(factory.createCharacter());
            listOfItems.add(factory.createEnemy());
            listOfItems.add(factory.createMap());
            listOfItems.add(factory.createWeapon());
      }

      private void setFrame()
      {
            frame = new DinamicFrame();
            var dimension = Toolkit.getDefaultToolkit()
                                   .getScreenSize();
            var width = (int)dimension.getWidth() - 200;
            var height = (int)dimension.getHeight() - 200;
            frame.setSize(width,height);
            frame.initComponents();
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      }

      public static DinamicGame initGame(SpritesFactory factory)
      {
            return new DinamicGame(factory);
      }

      public void start()
      {
            frame.setVisible(true);
            textArea.startTimer();
      }

}
