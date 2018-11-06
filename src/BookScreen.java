import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookScreen extends JFrame implements ActionListener {

    JMenu fileMenu;
    JMenu bookMenu;
    Book myBook;

    public static void main(String[] args) {

        BookScreen bs = new BookScreen();
        bs.setVisible(true);

    }

    public BookScreen()
    {
        Container cPane;

        setTitle("Booklist");
        setSize(300,300);
        setResizable(false);
        setLocation(250,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        cPane = getContentPane();
        cPane.setLayout(new FlowLayout());

        createFileMenu();
        createBookMenu();

        JMenuBar menuBar= new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        menuBar.add(bookMenu);
    }

    public void actionPerformed(ActionEvent event)
    {
        String itemName;

        itemName = event.getActionCommand();

        if(itemName.equals("Add"))
        {
            String bookTitle = JOptionPane.showInputDialog("Name of the book");
            int numOfPages = Integer.parseInt(JOptionPane.showInputDialog("Number of pages"));

            myBook = new Book(bookTitle, numOfPages);
        }

        else if(itemName.equals("Display"))
        {
            JOptionPane.showMessageDialog(null, myBook.toString());
        }

        else if(itemName.equals("Quit"))
        {
            JOptionPane.showMessageDialog(null, "The System is closing");
            System.exit(0);
        }
    }

    private void createFileMenu()
    {
        JMenuItem item;

        fileMenu = new JMenu("File");

        item = new JMenuItem("Quit");
        item.addActionListener(this);
        fileMenu.add(item);
    }

    private void createBookMenu()
    {
        JMenuItem item;

        bookMenu = new JMenu("Book");

        item = new JMenuItem("Add");
        item.addActionListener(this);
        bookMenu.add(item);

        item = new JMenuItem("Display");
        item.addActionListener(this);
        bookMenu.add(item);
    }

}
