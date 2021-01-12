package common.jeycode.creationaldessignpattern.prototype.files;

import manipulateComponents.Constants.Velocity;

public class ShallowCloneFactory implements CloudFactory {

						private static CloudFactory instance;
						private final OriginalShape shape;
						private static AbstractCloud prototypeSimple;
						private static AbstractCloud prototypeComplex;

						private ShallowCloneFactory(OriginalShape shape) {
												this.shape = shape;
												initPrototype();
						}

						public static CloudFactory getFactory(OriginalShape shape) {
												instance = instance == null ? new ShallowCloneFactory(shape) : instance;
												return instance;
						}

						private void initPrototype() {
												prototypeSimple = new SimpleCloud(shape,Velocity.GEARZERO);
												prototypeComplex = new ComplexCloud(shape);
						}

						@Override
						public AbstractCloud createSimpleCloud() { return prototypeSimple.shallowClone(); }

						@Override
						public AbstractCloud createComplexCloud() { return prototypeComplex.shallowClone(); }

						@Override
						public OriginalShape getOriginalShape() { return shape; }
}
