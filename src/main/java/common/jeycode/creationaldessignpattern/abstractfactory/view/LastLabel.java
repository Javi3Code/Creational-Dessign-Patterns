package common.jeycode.creationaldessignpattern.abstractfactory.view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.Timer;

import manipulateComponents.Constants.ManipulateBounds;
import manipulateComponents.Constants.Velocity;
import manipulateComponents.pattern.abstractWay.bounds.ManipulationEffect;

public class LastLabel extends JLabel
{

						private static final long serialVersionUID = 1L;
						private BufferedImage image;
						private ManipulationEffect effect;

						private final static String PATH = "src/image/labelEnd.png";

						public LastLabel(int width,int height)
						{
												this.setSize(width,height);
												loadImage();
						}

						public void createEvent()
						{
												effect = ManipulationEffect.simple(this,Velocity.ULTRAGEAR)
																																							.params(ManipulateBounds.X_AXIS,0)
																																							.create();
						}

						private void loadImage()
						{
												try
												{
																		image = ImageIO.read(new File(PATH));
												}
												catch (IOException ex)
												{
																		ex.printStackTrace();
												}
						}

						public void start()
						{
												effect.start();
						}

						@Override
						protected void paintComponent(Graphics g)
						{
												super.paintComponent(g);
												final var g2d = (Graphics2D)g;
												g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
												g2d.drawImage(image,0,0,getWidth(),getHeight(),this);
						}

						public Timer getTimer()
						{
												return effect.getTimer();
						}
}
