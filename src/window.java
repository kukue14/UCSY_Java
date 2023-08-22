import java.util.jar.JarEntry;

import javax.swing.JButton;
import javax.swing.JFrame;

public class window {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("New Window");

        button.setBounds(100, 160, 200, 40);
        button.setFocusable(false);

        frame.setSize(500, 200);
        frame.setTitle("Hello World");
        frame.setVisible(true);

    }

}
