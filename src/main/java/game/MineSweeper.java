package game;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class MineSweeper extends JFrame {
    private JLabel status;



    public MineSweeper() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Difficulty Level:" +
                System.lineSeparator() +
                "Press 0 for BEGINNER (9 x 9 Cells and 10 Mines)" +
                System.lineSeparator() +
                "Press 1 for INTERMEDIATE (16 x 16 Cells and 40 Mines)" +
                System.lineSeparator() +
                "Press 2 for ADVANCED (24 x 24 Cells and 99 Mines)");



        status = new JLabel("");
        add(status, BorderLayout.SOUTH);
        int boardType = Integer.parseInt(reader.readLine());
        switch (boardType){
            case 0 -> add(new BeginnerBoard(status));
            case 1 -> add(new IntermediateBoard(status));
            case 2 -> add(new AdvancedBoard(status));

        }
        setResizable(true);
        pack();
        setTitle("Minesweeper");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws IOException {
        MineSweeper ms = new MineSweeper();



        ms.setVisible(true);


    }
}
