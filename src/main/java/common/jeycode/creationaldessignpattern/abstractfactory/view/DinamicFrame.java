package common.jeycode.creationaldessignpattern.abstractfactory.view;

import java.awt.Color;
import java.util.List;

import javax.swing.JFrame;

import common.jeycode.creationaldessignpattern.abstractfactory.files.Item;

public final class DinamicFrame extends JFrame
{

						private static final long serialVersionUID = 1L;
						private static final String LOADING_GRAPHICS = "*****************************LOADING TEXTURES*******************************";
						private JArea textArea;
						private Wallpaper panel;
						private LoadLabel label;
						private LastLabel lastLabel;

						public DinamicFrame()
						{}

						public void initComponents()
						{
												label = new LoadLabel();
												panel = new Wallpaper(getWidth(),getHeight());
												lastLabel = new LastLabel(getWidth(),getHeight());
												textArea = new JArea(LOADING_GRAPHICS,label,lastLabel);
												getContentPane().add(panel);
												panel.setLayout(null);
												panel.add(lastLabel);
												lastLabel.setLocation(getWidth(),0);
												putTextAreaProperties();
												putLabelProperties();
						}

						private void putLabelProperties()
						{
												panel.add(label);
												label.setSize(getWidth() >> 2,getHeight() >> 3);
												label.setLocation(textArea.getWidth() + 100,textArea.getY());
						}

						private void putTextAreaProperties()
						{
												textArea.setBackground(Color.black);
												textArea.setForeground(Color.orange);
												panel.add(textArea);
												textArea.setSize(getWidth() >> 1,getHeight() >> 1);
												textArea.setLocation(0,getHeight() - textArea.getHeight());
												textArea.setEditable(false);
						}

						JArea getTextArea(List<Item> items)
						{
												textArea.setItems(items);
												return textArea;
						}
}
