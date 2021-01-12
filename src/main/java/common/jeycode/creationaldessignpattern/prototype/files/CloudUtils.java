package common.jeycode.creationaldessignpattern.prototype.files;

import java.awt.image.BufferedImage;

import jeycodeutils.spritemethods.LoadImage;

public final class CloudUtils
{

      private static final String[] PATH = {"src/imagecloud/blue.png","src/imagecloud/gray.png","src/imagecloud/white.png",
                                            "src/imagecloud/bluecomplex.png","src/imagecloud/graycomplex.png",
                                            "src/imagecloud/whitecomplex.png",};

      private final BufferedImage[] cloudImage = new BufferedImage[6];
      private static CloudUtils instance;

      private CloudUtils()
      {
            LoadImage.on(PATH,cloudImage);
      }

      public static CloudUtils getInstance()
      {
            instance = instance == null ? new CloudUtils() : instance;
            return instance;
      }

      public BufferedImage image(int index)
      {
            return cloudImage[index];
      }

}
