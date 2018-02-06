import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener; import java.awt.event.ActionEvent; import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane; import javax.swing.JTextField;

public class View extends JFrame implements ActionListener
{
    private JTextField mText;
    private JButton mButton;
    private JLabel mLabel;
    public View()
    {
        JPanel panel = new JPanel();
        mText = new JTextField(3);
        mButton = new JButton("Even or Odd?");
        mButton.addActionListener(this);
        mLabel = new JLabel();
        panel.add(mText);
        panel.add(mButton);
        panel.add(mLabel);
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 100);
        setTitle("Even or Odd");
        setVisible(true);
    }

    public void actionPerformed(ActionEvent pEvent) {
        String textValue = mText.getText();
        if (Integer.parseInt(textValue) % 2 == 0) {
            mLabel.setText("Even");
        } else {
            mLabel.setText("Odd");
        }
    }
}