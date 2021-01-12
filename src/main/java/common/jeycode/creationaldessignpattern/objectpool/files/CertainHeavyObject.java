package common.jeycode.creationaldessignpattern.objectpool.files;

public class CertainHeavyObject implements HeavyObjectAutoCloseable
{

						protected boolean locked = false;

						public CertainHeavyObject()
						{}

						@Override
						public void close() throws Exception
						{
												if (!locked)
												{
																		throw new Exception("CertainHeavyObject is null");
												}
												System.out.println("Closing CertainHeavyObject");
												locked = false;
						}

						@Override
						public void enable()
						{
												locked = true;

						}

						@Override
						public void doHeavyOperations() throws Exception
						{
												if (!locked)
												{
																		throw new Exception("CertainHeavyObject is closed");
												}
												Thread.sleep(1000);
												System.out.println(operationMessage());

						}

						protected String operationMessage()
						{
												return "HeavyOperations chu chuuuuuuuuu";
						}

}
