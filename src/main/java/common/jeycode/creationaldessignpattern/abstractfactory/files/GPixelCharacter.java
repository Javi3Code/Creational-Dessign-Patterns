package common.jeycode.creationaldessignpattern.abstractfactory.files;

public class GPixelCharacter implements Character {

						private final static String CHARACTER = "Drawing a pixelated character";

						@Override
						public String draw() { return CHARACTER; }

						@Override
						public int lifeTime() { return 25; }

						@Override
						public int power() { return 1; }

						@Override
						public int totalPoints() { return 0; }

						@Override
						public String toString() {
												return "\nGPixelCharacter [Lifetime: " + lifeTime() + " power: " + power() + " InitialPoints: " + totalPoints() + "]";
						}
}
