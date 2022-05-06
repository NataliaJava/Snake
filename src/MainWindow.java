import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    public MainWindow(){
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320, 345);
        setLocation(400, 400);
        add(new GameField());
        //getContentPane().add(new Button("Restart"), BorderLayout.CENTER);
        setVisible(true);
    }

    public void button(){
        add(new Button("Restart"), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }
}
