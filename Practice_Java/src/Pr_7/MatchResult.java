package Pr_7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MatchResult extends JFrame {

    private int milanScore = 0;
    private int madridScore = 0;
    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    public MatchResult() {
        setTitle("Футбольный матч");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        setVisible(true);
    }

    private void initComponents() { // Инициализируем компоненты
        setLayout(new GridLayout(4, 1));

        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");
        resultLabel = new JLabel("Result: " + milanScore + " X " + madridScore);
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");

        milanButton.addActionListener(new ActionListener() { // Создаем обработчик событий для кнопки Милана
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                updateLabels("AC Milan");
            }
        });

        madridButton.addActionListener(new ActionListener() { // Создаем обработчик событий для кнопки Мадрида
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                updateLabels("Real Madrid");
            }
        });

        add(milanButton);
        add(madridButton);
        add(resultLabel);
        add(lastScorerLabel);
        add(winnerLabel);
    }

    private void updateLabels(String lastScorer) { // Обновление надписей
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        lastScorerLabel.setText("Last Scorer: " + lastScorer);

        if (milanScore > madridScore) { // Определение победителя
            winnerLabel.setText("Winner: AC Milan");
        } else if (milanScore < madridScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MatchResult();
            }
        });
    }
}
