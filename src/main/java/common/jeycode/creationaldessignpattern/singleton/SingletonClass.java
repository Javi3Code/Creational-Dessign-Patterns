package common.jeycode.creationaldessignpattern.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class SingletonClass implements Message
{

						private static SingletonClass instance;
						private final List<String> listOfMessage = new ArrayList<>();
						private static int countOfInstance = 0;

						private SingletonClass()
						{
												countOfInstance++;
						}

						public static SingletonClass getInstance()
						{
												instance = Objects.isNull(instance) ? new SingletonClass() : instance;
												return instance;
						}

						@Override
						public void accept(String mmessage)
						{
												listOfMessage.add(mmessage);
						}

						@Override
						public void showMessage()
						{
												var textBuffer = new StringBuffer(100);
												listOfMessage.forEach(textBuffer::append);
												var text = textBuffer.toString();
												System.out.println(text);

						}

						public static int getCountOfInstance()
						{
												return countOfInstance;
						}

}
