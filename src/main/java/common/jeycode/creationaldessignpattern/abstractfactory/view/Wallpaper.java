package common.jeycode.creationaldessignpattern.abstractfactory.view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Wallpaper extends JPanel
{

      private static final long serialVersionUID = 1L;

      private BufferedImage image;

      private final static String PATH = "src/image/panel.png";

      public Wallpaper(int width,int height)
      {
            this.setSize(width,height);
            loadImage();
      }

      private void loadImage()
      {
            try
            {
                  image = ImageIO.read(new File(PATH));
            }
            catch (IOException ex)
            {
                  ex.printStackTrace();
            }
      }

      @Override
      protected void paintComponent(Graphics g)
      {
            super.paintComponent(g);
            final var g2d = (Graphics2D)g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.drawImage(image,0,0,getWidth(),getHeight(),this);
      }
}
