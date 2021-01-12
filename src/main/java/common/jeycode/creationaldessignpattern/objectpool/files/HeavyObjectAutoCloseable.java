package common.jeycode.creationaldessignpattern.objectpool.files;

public interface HeavyObjectAutoCloseable extends AutoCloseable
{

						void enable();

						void doHeavyOperations() throws Exception;

}
