import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*[NOTES]
        [split between frame and panel obj--> panel is used for switches.]
    * The setVisible(true) method makes the frame appear on the screen. If you forget to do this,
    * the frame object will exist as an object in memory, but no picture will appear on the screen.
 */

public class GUI implements ActionListener{
    private int count = 0;
    JFrame frame;
    JPanel panel;
    JLabel label;
    JButton button;

    public GUI(){ // constructor
        // [OBJs]
        frame = new JFrame();
        panel = new JPanel();
        button = new JButton("[Send Message]");
        label = new JLabel("[MSG Send Count]: 0");

        // [EVENT-LISTENERS]
        button.addActionListener(this);

        // [SETUP]
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0,1));
        panel.setBackground(Color.green);

        frame.add(label, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.add(button, BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("[GUI-TEMPLATE-2]");
        frame.pack(); // --> sets frame sixe
        frame.setVisible(true);

    }
    public static void main(String[] args){
        new GUI(); // calls constcutor
        System.out.println("2nd GUI");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("[MSG Send Count]: " + count);
    }
}
