package ru.lesson.miner;

import ru.lesson.miner.Board;
import ru.lesson.miner.Cell;
import ru.lesson.miner.GeneratingOfBoard;
import ru.lesson.miner.Logic;
import ru.lesson.miner.ActionOfUser;


public class Action implements ActionOfUser {
	private final GeneratingOfBoard generator;
	private final Board board;
	private final Logic logic;

	public Action(final Logic logic, final Board board, final GeneratingOfBoard generator) {
		this.generator = generator;
		this.board = board;
		this.logic = logic;
	}

	public void initGame() {
		final Cell[][] cells = generator.generate();
		this.board.drawBoard(cells);
		this.logic.loadBoard(cells);
	}

	public void select(int x, int y, boolean bomb) {
		this.logic.suggest(x, y, bomb);
		board.drawCell(x, y);
		if (this.logic.shouldBang(x, y)) {
			this.board.drawBang();
		}
		if (this.logic.finish()) {
			board.drawCongratulate();
		}
	}

    public void select(int x, int y, boolean bomb, int numBombs) {
        this.logic.suggest(x, y, bomb);
        board.drawCell(x, y);
        if (this.logic.shouldBang(x, y)) {
            this.board.drawBang();
        }
        if (this.logic.finish(numBombs)) {
            board.drawCongratulate();
        }
    }
}
