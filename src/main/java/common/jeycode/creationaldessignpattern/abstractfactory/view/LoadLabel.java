package common.jeycode.creationaldessignpattern.abstractfactory.view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.RenderingHints.Key;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JLabel;

import jeycodeutils.spritemethods.LoadImage;

public class LoadLabel extends JLabel
{

      private static final long serialVersionUID = 1L;
      private final BufferedImage[] sprite = new BufferedImage[7];
      private int index = 0;

      private final String[] path = {"src/image/load0.png","src/image/load1.png","src/image/load2.png","src/image/load3.png",
                                     "src/image/load4.png","src/image/load5.png","src/image/load6.png"};

      public LoadLabel()
      {
            LoadImage.on(path,sprite);
      }

      @Override
      protected void paintComponent(Graphics g)
      {
            super.paintComponent(g);
            final var g2d = (Graphics2D)g;
            final Map<Key,Object> hintsMap = new HashMap<>();
            hintsMap.put(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
            hintsMap.put(RenderingHints.KEY_RENDERING,RenderingHints.VALUE_RENDER_QUALITY);
            hintsMap.put(RenderingHints.KEY_RESOLUTION_VARIANT,RenderingHints.VALUE_RESOLUTION_VARIANT_SIZE_FIT);
            hintsMap.put(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BICUBIC);
            hintsMap.put(RenderingHints.KEY_STROKE_CONTROL,RenderingHints.VALUE_STROKE_PURE);
            g2d.setRenderingHints(hintsMap);
            final var widthImage = getWidth();
            final var heightImage = getHeight();
            g2d.drawImage(sprite[index],0,0,widthImage,heightImage,this);
      }

      public void setIndex()
      {
            index++;
      }

}
