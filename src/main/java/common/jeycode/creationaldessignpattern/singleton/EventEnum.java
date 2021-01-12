package common.jeycode.creationaldessignpattern.singleton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public enum EventEnum implements ActionListener
{

	SHOWMESSAGE;

						@Override
						public void actionPerformed(ActionEvent e)
						{

												System.out.println("Evento Singleton");
						}

}
//