package ru.lesson.miner;

import ru.lesson.miner.Cell;

/**
 * ��������� ��������� �����.
 */
public interface Board {

	/**
	 * ������ ����� ������ �� ��������� ������� �����.
	 * @param cells ������ �����.
	 */
	void drawBoard(Cell[][] cells);

	/**
	 * ������ �������.
	 * @param x ������� �� �����������.
	 * @param y ������� �� ���������.
	 */
	void drawCell(int x, int y);

	/**
	 * ������ ����� ���� ����.
	 */
	void drawBang();

	/**
	 * ������ ������������ ����� ���� ��������.
	 */
	void drawCongratulate();
}
