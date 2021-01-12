package common.jeycode.creationaldessignpattern.abstractfactory.files;

public class G3DCharacter implements Character
{

      private final static String CHARACTER = "Drawing a 3D character";

      @Override
      public String draw()
      {
            return CHARACTER;
      }

      @Override
      public int lifeTime()
      {
            return 50;
      }

      @Override
      public int power()
      {
            return 1;
      }

      @Override
      public int totalPoints()
      {
            return 0;
      }

      @Override
      public String toString()
      {
            return "\nG3DCharacter [Lifetime: " + lifeTime() + " power: " + power() + " InitialPoints: " + totalPoints() + "]";
      }

}
