package common.jeycode.creationaldessignpattern.prototype.view;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

import common.jeycode.creationaldessignpattern.prototype.files.AbstractCloud;
import common.jeycode.creationaldessignpattern.prototype.files.CloudFactory;
import common.jeycode.creationaldessignpattern.prototype.files.OriginalShape.JColor;
import common.jeycode.creationaldessignpattern.prototype.files.SimpleCloud;
import jeycodeutils.checkmethods.CheckIf;
import manipulateComponents.Constants.ManipulateBounds;
import manipulateComponents.pattern.abstractWay.bounds.ManipulationEffect;

public class CloudFrame extends JFrame
{

						private static CloudFrame instance;
						private static final long serialVersionUID = 1L;
						private final Dimension dimension;
						private JButton changeColorToBlue;
						private JButton changeColorToGray;
						private JButton changeColorToWhite;
						private final JButton[] changeColor = {changeColorToBlue,changeColorToGray,changeColorToWhite};
						private final JColor[] color = {JColor.LIGHTBLUE,JColor.GREY,JColor.WHITE};
						private final int[] btnYlocation = {400,480,560};
						private final CloudFactory cloudFactory;
						private final List<AbstractCloud> cloudList = new ArrayList<>();
						private ManipulationEffect effect;
						private final List<ManipulationEffect> listEffects = new ArrayList<>();

						private CloudFrame(CloudFactory cloudFactory)
						{
												this.cloudFactory = cloudFactory;
												dimension = java.awt.Toolkit.getDefaultToolkit()
																																								.getScreenSize();
												setSize(dimension);
												setLocationRelativeTo(null);
												setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
												getContentPane().setLayout(null);
												initBtn();
												createComponents(cloudFactory);
						}

						public static CloudFrame cloudFrame(CloudFactory cloudFactory)
						{
												instance = instance == null ? new CloudFrame(cloudFactory) : instance;
												return instance;
						}

						public void init()
						{
												setVisible(true);
												listEffects.forEach(ManipulationEffect::start);
						}

						private void initBtn()
						{
												for (var i = 0; i < changeColor.length; i++)
												{
																		assignProperties(i);
												}
						}

						private void assignProperties(int i)
						{
												changeColor[i] = new JButton(color[i].name());
												changeColor[i].setBounds(40,btnYlocation[i],100,60);
												changeColor[i].addActionListener(e-> setPrototypeColor(i));
												getContentPane().add(changeColor[i]);
						}

						private void setPrototypeColor(int i)
						{
												cloudFactory.getOriginalShape()
																								.setColor(color[i]);
												cloudList.forEach(AbstractCloud::repaint);
						}

// @formatter:off
						private void createComponents(CloudFactory cloudFactory) {
												for (var count = 0; count < 7; count++) {
																		var cloudS = cloudFactory.createSimpleCloud();
																		var cloudC = cloudFactory.createComplexCloud();
																		cloudS.setSize(cloudS.getOriginalShape().getShape().width,
																																	cloudS.getOriginalShape().getShape().height);	
																		cloudC.setSize(cloudC.getOriginalShape().getShape().width<<2,
																																	cloudC.getOriginalShape().getShape().height<<2);		// @formatter:on
																		var x = CheckIf.isOdd(count) ? 0 : getWidth() - cloudS.getWidth();
																		var y = (count + 1) * 50;
																		cloudS.setLocation(x,y);
																		cloudC.setLocation(20,200);
																		cloudList.add(cloudS);
																		cloudList.add(cloudC);
																		var temp = CheckIf.isOdd(count) ? SimpleCloud.ROAD : -SimpleCloud.ROAD;
																		effect = ManipulationEffect.simple(cloudS,((SimpleCloud)cloudS).getGear())
																																													.params(ManipulateBounds.X_AXIS,temp)
																																													.create();
																		listEffects.add(effect);
																		getContentPane().add(cloudS);
																		getContentPane().add(cloudC);
												}

						}
}
