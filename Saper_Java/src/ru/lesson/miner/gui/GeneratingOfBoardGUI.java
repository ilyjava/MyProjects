package ru.lesson.miner.gui;

import ru.lesson.miner.Cell;
import ru.lesson.miner.GeneratingOfBoard;

import java.util.Random;

public class GeneratingOfBoardGUI implements GeneratingOfBoard {

    private CellGUI[][] cells;
    private static int DEFAULT_SIZE = 4;
    private static int PLUS_BOMB = 2;
    private int countBomb;

    public GeneratingOfBoardGUI() {
        cells = new CellGUI[DEFAULT_SIZE][DEFAULT_SIZE];
    }

    public GeneratingOfBoardGUI(int size) {
        cells = new CellGUI[size][size];
    }


    public Cell[][] generate() {
        this.countBomb = this.cells.length + PLUS_BOMB;
        Random rand = new Random(System.currentTimeMillis());

        for (int i = 0; i < this.cells.length; i++)
            for (int j = 0; j < cells[i].length; j++)
                cells[i][j] = new CellGUI();

        for (int z = 0; z < countBomb; z++) {
            int i = rand.nextInt(this.cells.length);
            int j = rand.nextInt(this.cells.length);

            if (!this.cells[i][j].isBomb())
                this.cells[i][j].setBomb();
            else
                z--;
        }

        for (int i = 0; i < this.cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++)
                if (this.cells[i][j].isBomb())
                    System.out.print('0');
                else
                    System.out.print('*');
            System.out.println();
        }

        return cells;
    }

    public int getCountBomb() {
        return this.cells.length + PLUS_BOMB;

    }
}
