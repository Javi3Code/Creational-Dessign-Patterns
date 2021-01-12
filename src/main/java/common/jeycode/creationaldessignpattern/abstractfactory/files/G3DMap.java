package common.jeycode.creationaldessignpattern.abstractfactory.files;

public class G3DMap implements Map
{

						private final static String MAP = "Drawing a 3D map";

						@Override
						public String draw()
						{
												return MAP;
						}

						@Override
						public String name()
						{
												return "Mapa3D";
						}

						@Override
						public int size()
						{
												return 10000;
						}

						@Override
						public String toString()
						{
												return "\nG3DMap [Name: " + name() + " Size: " + size() + "]";
						}

}
