package common.jeycode.creationaldessignpattern.prototype.files;

import manipulateComponents.Constants.Velocity;

public final class SimpleCloud extends AbstractCloud
{

						private static final long serialVersionUID = 1L;

						public static final int ROAD = 1500;
						private Velocity gear;

						protected SimpleCloud(SimpleCloud cloud)
						{
												super(cloud);
												gear = cloud.gear;
												type = CloudType.SIMPLE;

						}

						protected SimpleCloud(OriginalShape shape,Velocity gear)
						{
												super(shape);
												this.gear = gear;
												type = CloudType.SIMPLE;
						}

						@Override // @formatter:off
						public AbstractCloud deepClone() {
												var newshape = new OriginalShape(getOriginalShape().getColor(),
																																													getOriginalShape().getShape());
												var deepClone = new SimpleCloud(newshape,gear);
												return deepClone;
						}// @formatter:on

						@Override
						public AbstractCloud shallowClone()
						{
												var sCloud = new SimpleCloud(this);
												return sCloud;
						}

						public Velocity getGear()
						{
												return gear;
						}

						public void setGear(Velocity gear)
						{
												this.gear = gear;
						}

}
