import static java.lang.System.*;
import javax.swing.JOptionPane;

public class Hello2017 {

  public static void main(String[] args) {

      final String[] GREETINGS = {"Hello", "Wassup", "Yo", "Hi", "Howdy"};

      final String GREETING = GREETINGS[(int)(Math.random() * GREETINGS.length)];

      String name;
      do  {
        name = System.console().readLine("What's your name? ");
      } while (name.isEmpty());

      final String RESPONSE = String.format("%s, %s\n", GREETING, name);

      out.print(RESPONSE);
      JOptionPane.showMessageDialog(null, RESPONSE);
  }
}
