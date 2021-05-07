
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Clicker extends JPanel {
    int clicks = 0;
    int clickrate = 1;
    int timeClicks = 0;
    JButton but, up1, up2;

    public Clicker() {
        this.setPreferredSize(new Dimension(500, 500));
        but = new JButton("Press Me");
        up1 = new JButton("Upgrade1");
        up2 = new JButton(("Upgrade2"));
        add(but);
        add(up1);
        add(up2);
        but.addActionListener(new TestListener());
        up1.addActionListener(new TestListener());
        up2.addActionListener(new TestListener());
        Timer timer = new Timer(500, new TimerListener());
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Clicks: " + clicks, 10, 10);
    }

    public class TestListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(but)) {
                clicks += clickrate;
                repaint();
            }

            if(e.getSource().equals(up1) && clicks >= 100){
                clickrate += 1;
                clicks -= 100;
                repaint();
            }

            if(e.getSource().equals(up2) && clicks >= 50){
                timeClicks += 1;
                clicks -= 50;
                repaint();
            }
        }
    }

    public class TimerListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            clicks += timeClicks;
            repaint();
        }
    }
}

