import javax.swing.*;
import java.awt.*;

public class BasketBallCourt extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

      
        g.setColor(new Color(210, 180, 140)); 
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.WHITE);

      
        g.drawRect(50, 50, getWidth() - 100, getHeight() - 100);

       
        g.drawLine(getWidth() / 2, 50, getWidth() / 2, getHeight() - 50);

      
        g.drawOval(getWidth() / 2 - 50, getHeight() / 2 - 50, 100, 100);

     
        g.drawRect(50, getHeight() / 3, 130, getHeight() / 3);

        g.drawRect(getWidth() - 180, getHeight() / 3, 130, getHeight() / 3);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Basketball Court");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BasketBallCourt court = new BasketBallCourt();
        frame.add(court);

        frame.setVisible(true);
    }
}
