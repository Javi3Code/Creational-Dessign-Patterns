package common.jeycode.creationaldessignpattern.objectpool.files;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

import javax.swing.Timer;

public class HeavyObjectsPoolManager implements PoolManager<ReusableCertainHeavyObject>,ActionListener
{

						private static int realNumber = 1;
						private static int maxNumber = 2;
						private static int idealNumber = 2;
						private static long waitTime = 2000;
						private static List<ReusableCertainHeavyObject> pool;
						private static Timer objectController;
						private static HeavyObjectsPoolManager managerInstance;

						private HeavyObjectsPoolManager()
						{
												pool = new LinkedList<>();
												pool.add(new ReusableCertainHeavyObject());
												pool.add(new ReusableCertainHeavyObject());
												objectController = new Timer(100,this);
						}

						public static HeavyObjectsPoolManager getPoolManager()
						{
												if (managerInstance == null)
												{
																		managerInstance = new HeavyObjectsPoolManager();
												}
												return managerInstance;
						}

						@Override
						public synchronized ReusableCertainHeavyObject getReusableObject() throws Exception
						{
												if (!objectController.isRunning())
												{
																		objectController.start();
												}
												var object = getObjectUnlocked();

												if (object == null)
												{
																		var on = System.currentTimeMillis();
																		while (object == null && realTimeOut(on) < waitTime)
																		{
//																								System.out.println("Waiting.... -->" + realTimeOut(on));
																								object = getObjectUnlocked();
																		}
																		if (object == null)
																		{
																								if (pool.size() >= maxNumber && realTimeOut(on) >= waitTime)
																								{
																														throw new Exception("timeout, please try again later");
																								}
																								var newReusableObject = new ReusableCertainHeavyObject();
																								pool.add(newReusableObject);
																								object = newReusableObject;
																		}

												}
												object.lock();
												return object;
						}

						private long realTimeOut(long on)
						{
												return System.currentTimeMillis() - on;
						}

						private synchronized ReusableCertainHeavyObject getObjectUnlocked()
						{
												var objt = pool.stream()
																											.filter(ReusableCertainHeavyObject::isUnLocked)
																											.findAny()
																											.orElse(null);
												if (objt != null)
												{
																		System.out.println(" Return an unlocked RObject" + objt.realNumber);
												}
												return objt;
						}

						@Override
						public void setInitialNumberOfObjects(int quantity)
						{
												realNumber = quantity;
												IntStream.range(0,realNumber - 2)
																					.forEach(e-> pool.add(new ReusableCertainHeavyObject()));
						}

						@Override
						public void idealNumberOfObjects(int quantity)
						{
												idealNumber = quantity;
						}

						@Override
						public void setMaxNumberOfObjects(int max)
						{
												maxNumber = max;
						}

						@Override
						public void setTimeOut(float f)
						{
												waitTime = (long)(f * 1000);
						}

						protected static void remove(ReusableCertainHeavyObject e)
						{
												if (e != null)
												{
																		System.out.println("Removing Nº: " + e.realNumber);
																		try
																		{
																								e.reallyClose();
																		}
																		catch (Exception ex)
																		{
																								ex.printStackTrace();
																		}
																		pool.remove(e);
												}
						}

						public void close()
						{
												if (zeroInUse())
												{
																		System.out.println("Close the dOor");
																		objectController.stop();
												}
						}

						private boolean zeroInUse()
						{
												return pool.stream()
																							.filter(ReusableCertainHeavyObject::isLocked)
																							.count() == 0;
						}

						@Override
						public void actionPerformed(ActionEvent e)
						{
												close();
												if (pool.size() > idealNumber)
												{
																		System.out.println("Checking Pool Size//NºBefore " + pool.size());
																		remove(pool.parallelStream()
																													.filter(ReusableCertainHeavyObject::isUnLocked)
																													.findAny()
																													.orElse(null));
																		System.out.println("Checking Pool Size//NºAfter " + pool.size());
												} // adjustNumberOfInstance()

						}

}
