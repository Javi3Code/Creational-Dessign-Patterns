package common.jeycode.creationaldessignpattern.prototype.files;

import java.util.Objects;

public class OriginalShape
{

      private JColor color;
      private JShape shape;

      public OriginalShape(JColor color,JShape shape)
      {
            this.color = color;
            this.shape = shape;
      }

      @Override
      public String toString()
      {
            return "OriginalShape [color=" + color + ", shape=" + shape + "]";
      }

      @Override
      public int hashCode()
      {
            return Objects.hash(color,shape);
      }

      @Override
      public boolean equals(Object obj)
      {
            if (this == obj)
            {
                  return true;
            }
            if (!(obj instanceof OriginalShape))
            {
                  return false;
            }
            var other = (OriginalShape)obj;
            return color == other.color && shape == other.shape;
      }

      public void setColor(JColor color)
      {
            this.color = color;
      }

      public void setShape(JShape shape)
      {
            this.shape = shape;
      }

      public JColor getColor()
      {
            return color;
      }

      public JShape getShape()
      {
            return shape;
      }

      public enum JShape
      {

       SMALL(170,90),
       BIG(300,140);

            public int width,height;

            JShape(int width,int height)
            {
                  this.width = width;
                  this.height = height;
            }

      }

      public enum JColor
      {

// @formatter:off
																										LIGHTBLUE(0,3), 
																										GREY(1,4),
																										WHITE(2,5);
// @formatter:on

            int cloudSimpleColor,cloudComplexColor;

            JColor(int cloudSimpleColor,int cloudComplexColor)
            {
                  this.cloudSimpleColor = cloudSimpleColor;
                  this.cloudComplexColor = cloudComplexColor;
            }

      }
}
