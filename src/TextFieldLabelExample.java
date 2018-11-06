import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/** Displays a Frame with a label, a text field and some buttons
 *  Needs travelbug.gif in the same folder
 */
public class TextFieldLabelExample extends JFrame implements ActionListener {
    // declare all the GUI objects
    private JButton cancelButton;
    private JButton okButton;
    private JTextField inputLine;
    private JLabel promptLabel;
    private JLabel imageLabel;

    /** create and display the frame */
    public static void main(String[] args) {
        TextFieldLabelExample frame = new TextFieldLabelExample();
        frame.setVisible(true);
    }

    public TextFieldLabelExample() {
        Container cPane;
        //set the frame properties
        setTitle     ("JMenuFrame");
        setSize      (300,200);
        setResizable (false);
        setLocation  (250,200);

        cPane = getContentPane( );
        cPane.setLayout(new FlowLayout());

        //add two JLabel objects
        imageLabel = new JLabel(new ImageIcon("travelbug.gif"));

        
        promptLabel = new JLabel( "Please enter your name");
        cPane.add(promptLabel);

        //add the text field
        inputLine = new JTextField(22);
        //inputLine.setFont(new Font("Courier", Font.PLAIN, 14));
        cPane.add(inputLine);
        inputLine.addActionListener(this);
        
        //create and place two buttons on the frame
        okButton = new JButton("OK");
        cPane.add(okButton);

        cancelButton = new JButton("CANCEL");
        cPane.add(cancelButton);

        //register this frame as an action listener of the two buttons
        cancelButton.addActionListener(this);
        okButton.addActionListener(this);
        
        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation( EXIT_ON_CLOSE );


    }

    /** Standard method to respond the action event.
     * @param e the ActionEvent object     */
    public void actionPerformed(ActionEvent e) {
    	// getSource() returns objectid, so == works: you are testing for the same object
    	 if (e.getSource() == okButton )
    	    setTitle("You clicked OK");
         else if (e.getSource() == cancelButton) {
         	setTitle("You clicked Cancel");
         }  // end of elseif
        else { //the only other event source is inputLine
            setTitle("You entered '" + inputLine.getText() + "'");
        } // end of else
    }// end actionPerformed

} // end class