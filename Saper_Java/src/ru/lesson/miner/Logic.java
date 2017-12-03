package ru.lesson.miner;

import ru.lesson.miner.Cell;

public interface Logic {

	void loadBoard(Cell[][] cells);

	boolean shouldBang(int x, int y);

	boolean finish();
    boolean finish(int bomb);

	void suggest(int x, int y, boolean bomb);
}
