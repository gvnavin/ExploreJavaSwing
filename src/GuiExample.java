import java.io.File;
import java.net.MalformedURLException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class GuiExample {

  private JTextPane textPane1;
  private JTextPane textPane2;
  private JPanel jpanel;

  public GuiExample() {
    textPane1.setContentType("text/html");
    String s = "";
    try {
      s = new File("src/test.png").toURL().toExternalForm();
    } catch (MalformedURLException e) {
    }
    System.out.println("s = " + s);
    textPane1.setText("<html><p style=\"color:green\"> Test Test </p> <img src=\""+ s +"\"/> </html>");
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Calculator");
    frame.setContentPane(new GuiExample().jpanel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }

}
