import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Year;

public class Friends extends JFrame implements ActionListener {

    JMenu friendMenu;
    JLabel response;

    public static void main(String[] args) {

        Friends f= new Friends();
        f.setVisible(true);

    }

    public Friends()
    {
        Container cPane;

        setTitle("Friends");
        setSize(300,300);
        setResizable(false);
        setLocation(250,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        cPane = getContentPane();
        cPane.setLayout(new FlowLayout());

        createFriendMenu();

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(friendMenu);

        response = new JLabel();
        response.setSize(50, 50); // optional
        cPane.add(response);
    }

    public void actionPerformed(ActionEvent event)
    {
        String itemName;

        itemName = event.getActionCommand();

        if(itemName.equals("Tom"))
        {
            response.setText("I really like Dick");
        }

        else if(itemName.equals("Dick"))
        {
            response.setText("I really like Harry");
        }

        else if(itemName.equals("Harry"))
        {
            response.setText("I really like Tom");
        }
    }

    private void createFriendMenu()
    {
        JMenuItem item;

        friendMenu = new JMenu("Friends");

        item = new JMenuItem("Tom");
        item.setBackground(Color.yellow);
        item.addActionListener(this);
        friendMenu.add(item);

        item = new JMenuItem("Dick");
        item.setBackground(Color.green);
        item.addActionListener(this);
        friendMenu.add(item);

        item = new JMenuItem("Harry");
        item.setBackground(Color.blue);
        item.addActionListener(this);
        friendMenu.add(item);
    }

}
