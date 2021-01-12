package common.jeycode.creationaldessignpattern.prototype.files;

public interface CloudFactory
{

						AbstractCloud createSimpleCloud();

						AbstractCloud createComplexCloud();

						OriginalShape getOriginalShape();
}
