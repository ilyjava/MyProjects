package ru.lesson.miner.console;

import ru.lesson.miner.Cell;

import java.io.PrintStream;

public class CellCnsl implements Cell<PrintStream> {
	private boolean bomb;
	private boolean suggestBomb = false;
	private boolean suggestEmpty = false;

	public CellCnsl(boolean bomb) {
		this.bomb = bomb;
	}

	public boolean isBomb() {
		return this.bomb;
	}

	public boolean isSuggestBomb() {
		return this.suggestBomb;
	}

	public boolean isSuggestEmpty() {
		return this.suggestEmpty;
	}

	public void suggectEmpty() {
		this.suggestEmpty = true;
	}

	public void suggectBomb() {
		this.suggestBomb = true;
	}

	public void draw(PrintStream paint, boolean real) {
		if (real) {
			if (this.isBomb()) {
				paint.print("[*] ");
			} else {
				paint.print("[ ] ");
			}
		} else {
			if (this.suggestBomb) {
				paint.print("[?] ");
			} else if (this.suggestEmpty) {
				paint.print("[ ] ");
			} else {
				paint.print("[Õ] ");
			}
		}
	}

	public void draw(PrintStream g, int x, int y, boolean real) {

	}
}