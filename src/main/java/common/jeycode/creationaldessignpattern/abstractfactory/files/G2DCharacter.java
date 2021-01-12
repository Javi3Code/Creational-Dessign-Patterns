package common.jeycode.creationaldessignpattern.abstractfactory.files;

public class G2DCharacter implements Character
{

      private final static String CHARACTER = "Drawing a 2D character";

      @Override
      public String draw()
      {
            return CHARACTER;
      }

      @Override
      public int lifeTime()
      {
            return 100;
      }

      @Override
      public int power()
      {
            return 5;
      }

      @Override
      public int totalPoints()
      {
            return 0;
      }

      @Override
      public String toString()
      {
            return "\nG2DCharacter [Lifetime: " + lifeTime() + " power: " + power() + " InitialPoints: " + totalPoints() + "]";
      }
}
