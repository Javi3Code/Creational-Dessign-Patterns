package common.jeycode.creationaldessignpattern.prototype.files;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JLabel;

public abstract class AbstractCloud extends JLabel implements JCodeClonable
{

						private static final long serialVersionUID = 1L;
						private OriginalShape shape;
						private final static CloudUtils IMAGE_PROVIDER = CloudUtils.getInstance();
						protected CloudType type;

						protected AbstractCloud(OriginalShape shape)
						{
												this.shape = shape;
						}

						protected AbstractCloud(AbstractCloud cloud)
						{
												shape = cloud.shape;
						}

						@Override
						protected void paintComponent(Graphics g)
						{// @formatter:off
												super.paintComponent(g);
												final var g2d = (Graphics2D)g;
												var index = type.equals(CloudType.SIMPLE) ?
																		shape.getColor().cloudSimpleColor : shape.getColor().cloudComplexColor;
												g2d.drawImage(IMAGE_PROVIDER.image(index),0,0,getWidth(),getHeight(),this);
						}// @formatter:on		

						public OriginalShape getOriginalShape()
						{
												return shape;
						}

						public void setOriginalShape(OriginalShape shape)
						{
												this.shape = shape;
						}

						protected enum CloudType
						{
							SIMPLE,
							COMPLEX
						}
}
