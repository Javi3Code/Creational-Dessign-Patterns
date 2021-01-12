package common.jeycode.creationaldessignpattern.abstractfactory.view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JTextArea;
import javax.swing.Timer;

import common.jeycode.creationaldessignpattern.abstractfactory.files.Item;

public class JArea extends JTextArea implements ActionListener
{

						private static final long serialVersionUID = 1L;
						private static final String WAIT_A_MOMENT = "\n\n\nPlease wait a minute, don't close the game right now.\n";
						private static final String BIP = "src/sound/step.wav";
						private static final String UP = "src/sound/Powerup.wav";
						private static final String OOOH = "src/sound/Default.wav";
						private final Timer timer;
						private List<Item> listOfItems;
						private boolean stepOne = true;
						private int index;
						private final LoadLabel label;
						private final LastLabel lastlabel;

						public JArea(String loadingGraphics,LoadLabel label,LastLabel lastlabel)
						{
												super(loadingGraphics);
												this.label = label;
												this.lastlabel = lastlabel;
												timer = new Timer(2000,this);
												index = 0;
												setFont(new Font("Sitka Text",Font.BOLD,15));
						}

						@Override
						public void actionPerformed(ActionEvent e)
						{
												if (stepOne)
												{
																		initialize();
												}
												else
												{
																		if (index < listOfItems.size())
																		{
																								loadItemsEvent();
																		}
																		else
																		{
																								ultimateEvent();
																		}
												}
						}

						private void initialize()
						{
												loadSound(BIP);
												append(WAIT_A_MOMENT);
												stepOne = false;
												updateLabel();
						}

						public void setListOfItems(List<Item> items)
						{
												listOfItems = items;
						}

						private void loadItemsEvent()
						{
												append(listOfItems.get(index)
																														.draw());
												append(listOfItems.get(index)
																														.toString() + "\n\n");
												loadSound(BIP);
												updateLabel();
												index++;
						}

						private void ultimateEvent()
						{
												if (index == listOfItems.size())
												{
																		updateLabel();
																		index++;
																		lastlabel.createEvent();
																		loadSound(UP);
												}
												else
												{
																		lastEffect();
												}
						}

						private void lastEffect()
						{
												lastlabel.start();
												if (!lastlabel.getTimer()
																										.isRunning())
												{
																		timer.stop();
												}
												else
												{
																		loadSound(OOOH);
												}
						}

						private void updateLabel()
						{
												label.setIndex();
												label.repaint();
						}

						private void loadSound(String path)
						{
												try (var sound = AudioSystem.getAudioInputStream(new File(path).getAbsoluteFile()))
												{
																		final var clip = AudioSystem.getClip();
																		clip.open(sound);
																		clip.start();
												}
												catch (IOException | UnsupportedAudioFileException | LineUnavailableException ex)
												{
																		ex.printStackTrace();
																		System.out.println("Load sound phase Error");
												}
						}

						public void startTimer()
						{
												timer.start();
						}

						public void setItems(List<Item> items)
						{
												listOfItems = items;
						}

}
