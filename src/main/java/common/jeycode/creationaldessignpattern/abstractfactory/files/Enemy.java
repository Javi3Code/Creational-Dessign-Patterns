package common.jeycode.creationaldessignpattern.abstractfactory.files;

public interface Enemy extends Character {


						byte points();

						@Override
						default int totalPoints() { return 0; }

}
