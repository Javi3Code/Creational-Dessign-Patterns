package common.jeycode.creationaldessignpattern.singleton;

import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import jeycodeutils.checkmethods.CheckIf;

public class Init_Window extends JFrame
{

      private static final long serialVersionUID = 1L;
      private static final int HEIGHT = 50;
      private static final int WIDTH = 100;
      private final JButton[] button = new JButton[5];
      private final String[] tag = {"uno","dos","tres","cuatro","cinco"};

      public Init_Window()
      {
            initComponents();
      }

      private void initComponents()
      {
            this.setSize(Toolkit.getDefaultToolkit()
                                .getScreenSize());
            setLocationRelativeTo(null);
            getContentPane().setLayout(null);
            initButtons();
      }

      private void initButtons()
      {
            for (var index = 0; index < tag.length; index++)
            {
                  initialize(index);
            }
      }

      private void initialize(int index)
      {
            button[index] = new JButton(tag[index]);
            var btn = button[index];
            btn.setBounds(index * WIDTH,index * WIDTH,WIDTH,HEIGHT);
            ActionListener event = null;
            if (CheckIf.isOdd(index))
            {
                  event = e-> System.exit(0);
            }
            else
            {
                  event = EventEnum.SHOWMESSAGE;
            }
            btn.addActionListener(event);
            getContentPane().add(btn);
            btn.setVisible(true);
      }

}
