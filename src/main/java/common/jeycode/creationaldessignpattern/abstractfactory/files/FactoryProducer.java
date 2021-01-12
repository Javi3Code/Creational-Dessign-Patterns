package common.jeycode.creationaldessignpattern.abstractfactory.files;

public final class FactoryProducer
{

						private FactoryProducer()
						{}

						public static SpritesFactory getGraphics3DFactoryInstance()
						{
												return Graphics3DFactory.getInstance();
						}

						public static SpritesFactory getGraphics2DFactoryInstance()
						{
												return Graphics2DFactory.getInstance();
						}

						public static SpritesFactory getGraphicsPixelFactoryInstance()
						{
												return GraphicsPixelFactory.getInstance();
						}
}
