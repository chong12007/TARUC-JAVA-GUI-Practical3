package p3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Q2 extends JFrame {

    private JPanel arrayPanel = new JPanel(new GridLayout(0, 2));
    private JTextField inputIndex = new JTextField();
    private JTextField outputIndex = new JTextField();
    private JButton btnShowElement = new JButton("Show Element");
    private int[] arrayIndex;

    public Q2() {

        setLayout(new BorderLayout());
        inputIndex.setText("0");
        outputIndex.setText("0");
        outputIndex.setEditable(false);
        arrayPanel.add(new JLabel("Array Index"));
        arrayPanel.add(inputIndex);
        arrayPanel.add(new JLabel("Array Element"));
        arrayPanel.add(outputIndex);

        add(arrayPanel, BorderLayout.CENTER);

        ShowElementListner elementListner = new ShowElementListner();

        btnShowElement.addActionListener(elementListner);
        btnShowElement.setPreferredSize(new Dimension(40, 40));
        add(btnShowElement, BorderLayout.SOUTH);

        setSize(400, 130);
        setTitle("Display: Show Bounds Error");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    //ActionListner
    public class ShowElementListner implements ActionListener {

        boolean found;
        int arrayElement;
        int result;

        @Override
        public void actionPerformed(ActionEvent e) {

            int[] arrayIndex = new int[100];
            for (int i = 0; i < 100; i++) {
                arrayIndex[i] = i + 1;
            }

            try {
                arrayElement = Integer.parseInt(inputIndex.getText());

                if (arrayElement >= 0 && arrayElement <= 100) {
                    found = true;
                    result = arrayElement * arrayElement;
                    outputIndex.setText("" + result);

                }//if
                else
                    System.out.println(arrayIndex[101]);

            } catch (NumberFormatException ex) {
                outputIndex.setText("Please Enter integer");
            } catch (ArrayIndexOutOfBoundsException ex) {
                outputIndex.setText("Index out of Bounds");
            }

        }
    }
}
