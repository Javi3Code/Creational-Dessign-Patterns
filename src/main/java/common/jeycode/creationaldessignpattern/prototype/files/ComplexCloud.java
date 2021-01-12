package common.jeycode.creationaldessignpattern.prototype.files;

import putMovementToComponent.PutMovementToComponent;

public class ComplexCloud extends AbstractCloud
{

						private static final long serialVersionUID = 1L;

						protected ComplexCloud(OriginalShape shape)
						{
												super(shape);
												assignProperties();
						}

						protected ComplexCloud(AbstractCloud cloud)
						{
												super(cloud);
												assignProperties();
						}

						private void assignProperties()
						{
												type = CloudType.COMPLEX;
												PutMovementToComponent.newInstance()
																																		.giveMovementToTheComponent(this);

						}

						@Override
						public AbstractCloud shallowClone()
						{
												return new ComplexCloud(this);
						}

						@Override
						public AbstractCloud deepClone()
						{
												var deepClone = new ComplexCloud(new OriginalShape(getOriginalShape().getColor(),getOriginalShape().getShape()));
												return deepClone;
						}

}
