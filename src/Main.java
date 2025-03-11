import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
    
        String fileName = "./resources/text files/testing.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        ReadFile readFile = new ReadFile();
        readFile.displayMessage();
        
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }
    
    private static void createAndShowGUI() {
        // Create the main application frame
        JFrame frame = new JFrame("Swing Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a label and add it to the frame's content pane
        JLabel label = new JLabel("Hello, Swing!", SwingConstants.CENTER);
        frame.getContentPane().add(label, BorderLayout.CENTER);

        // Display the window
        frame.setVisible(true);
    }
}
