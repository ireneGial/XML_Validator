package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class XMLLoaderGUI extends JFrame {
    private JTextField pathField;
    private JButton loadButton;

    public XMLLoaderGUI() {
        setTitle("XML Loader");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Δημιουργία panel για τα στοιχεία
        JPanel panel = new JPanel(new FlowLayout());

        pathField = new JTextField(20); // Textbox για το path
        loadButton = new JButton("Load"); // Κουμπί φόρτωσης

        panel.add(new JLabel("XML Path:"));
        panel.add(pathField);
        panel.add(loadButton);

        add(panel, BorderLayout.CENTER);

        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String filePath = pathField.getText();
                JOptionPane.showMessageDialog(null, "Loading XML: " + filePath);
            
            }
        });

        setVisible(true);
    }
}
