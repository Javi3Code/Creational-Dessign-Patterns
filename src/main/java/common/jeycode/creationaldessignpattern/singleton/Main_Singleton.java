package common.jeycode.creationaldessignpattern.singleton;

import java.lang.reflect.InvocationTargetException;

import common.jeycode.reflectionutil.methods.JCReflectionUtils;

public class Main_Singleton implements JCReflectionUtils
{

						private final Message singleton;
						private Message singleton2 = null;

						public Main_Singleton() throws SecurityException,ClassNotFoundException,InstantiationException,IllegalAccessException,
												IllegalArgumentException,InvocationTargetException
						{
												singleton = SingletonEnum.INSTANCE;
												singleton2 = declaredBuild(SingletonEnum.class,0,null);

												if (singleton.equals(singleton2))
												{
																		System.out.println("Singleton");
												}
												else
												{
																		System.out.println("Error");
												}
						}

						public static void main(String[] args)
						{
												try
												{
																		new Main_Singleton();
												}
												catch (SecurityException | ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException |
																		InvocationTargetException ex)
												{
																		// TODO Auto-generated catch block
																		ex.printStackTrace();
												}
						}

}
