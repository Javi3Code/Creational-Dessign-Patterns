package common.jeycode.creationaldessignpattern.abstractfactory.files;

public class G2DMap implements Map
{

						private final static String MAP = "Drawing a 2D map";

						@Override
						public String draw()
						{
												return MAP;
						}

						@Override
						public String name()
						{
												return "Mapa2D";
						}

						@Override
						public int size()
						{
												return 5000;
						}

						@Override
						public String toString()
						{
												return "\nG2DMap [Name: " + name() + " Size: " + size() + "]";
						}

}
