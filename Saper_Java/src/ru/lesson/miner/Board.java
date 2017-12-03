package ru.lesson.miner;

import ru.lesson.miner.Cell;

/**
 * ќписывает поведение доски.
 */
public interface Board {

	/**
	 * –исует доску исход€ из вход€щего массива €чеек.
	 * @param cells ћассив €чеек.
	 */
	void drawBoard(Cell[][] cells);

	/**
	 * –исует €чеейку.
	 * @param x позици€ по горизонтали.
	 * @param y позици€ по вертикали.
	 */
	void drawCell(int x, int y);

	/**
	 * –исует взрыв всех бомб.
	 */
	void drawBang();

	/**
	 * –исует подзравлени€ когда игра выиграна.
	 */
	void drawCongratulate();
}
