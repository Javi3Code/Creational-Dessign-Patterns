package common.jeycode.creationaldessignpattern.abstractfactory.files;


public class GPixelMap implements Map {

						private final static String MAP = "Drawing a pixelated map";

						@Override
						public String draw() { return MAP; }

						@Override
						public String name() { return "MapaPixelArt"; }

						@Override
						public int size() { return 600; }

						@Override
						public String toString() { return "\nGPixelMap [Name: " + name() + " Size: " + size() + "]"; }

}
