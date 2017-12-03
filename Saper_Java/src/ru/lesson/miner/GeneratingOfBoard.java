package ru.lesson.miner;

import ru.lesson.miner.Cell;


public interface GeneratingOfBoard {
    Cell[][] generate();

    int getCountBomb();
}
