package common.jeycode.creationaldessignpattern.objectpool.files;

public class ReusableCertainHeavyObject extends CertainHeavyObject
{

						private static int NUMBER = 0;
						public final int realNumber;

						public ReusableCertainHeavyObject()
						{
												NUMBER++;
												realNumber = NUMBER;
						}

						@Override
						public void close()
						{
												System.out.println("Calling Close method Objt Nº: " + realNumber);
												unLock();
						}

						public boolean isLocked()
						{
//												System.out.println("Test if Object Nº:" + realNumber + " is locked = " + locked);

												return locked == true;
						}

						public boolean isUnLocked()
						{
//												System.out.println("Test if Object Nº:" + realNumber + " is Unlocked= " + locked);
												return locked == false;
						}

						public void lock()
						{
												System.out.println("Blocking Object Nº: " + realNumber);
												locked = true;
						}

						private void unLock()
						{
												System.out.println("Unlocking Object Nº: " + realNumber);
												locked = false;
						}

						@Override
						protected String operationMessage()
						{
												return super.operationMessage() + "  Nº:  " + realNumber;
						}

						public void reallyClose() throws Exception
						{
												locked = true;
												super.close();
						}

}
