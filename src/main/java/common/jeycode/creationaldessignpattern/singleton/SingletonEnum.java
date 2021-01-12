package common.jeycode.creationaldessignpattern.singleton;

import java.util.ArrayList;
import java.util.List;

public enum SingletonEnum implements Message {

// @formatter:off
																INSTANCE {

																@Override
																						public void accept(String mmessage) {
																												 listOfMessage.add(mmessage);
																						}

																@Override
																						public void showMessage() {
																													var textBuffer = new StringBuffer(100);
                 												listOfMessage.forEach(textBuffer::append);
                 												var text = textBuffer.toString();
                 												System.out.println(text);
																						}
																};
			// @formatter:on

						protected static SingletonClass instance;
						protected final List<String> listOfMessage = new ArrayList<>();

}
