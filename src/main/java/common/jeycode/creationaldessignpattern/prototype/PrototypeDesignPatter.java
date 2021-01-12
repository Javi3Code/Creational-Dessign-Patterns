package common.jeycode.creationaldessignpattern.prototype;

import common.jeycode.creationaldessignpattern.prototype.files.CloudFactory;
import common.jeycode.creationaldessignpattern.prototype.files.DeepCloneFactory;
import common.jeycode.creationaldessignpattern.prototype.files.OriginalShape;
import common.jeycode.creationaldessignpattern.prototype.files.OriginalShape.JColor;
import common.jeycode.creationaldessignpattern.prototype.files.OriginalShape.JShape;
import common.jeycode.creationaldessignpattern.prototype.view.CloudFrame;

public class PrototypeDesignPatter
{

      CloudFrame cloudframe;
      CloudFactory cloudFactory;
      OriginalShape shape = new OriginalShape(JColor.GREY,JShape.SMALL);

      public PrototypeDesignPatter()
      {
            cloudFactory = DeepCloneFactory.getFactory(shape);
//            cloudFactory = ShallowCloneFactory.getFactory(shape);
            cloudframe = CloudFrame.cloudFrame(cloudFactory);
            cloudframe.init();
      }

      public static void main(String[] args)
      {
            new PrototypeDesignPatter();
      }

}
