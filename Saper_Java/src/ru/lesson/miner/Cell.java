package ru.lesson.miner;


public interface Cell<T>  {

	boolean isBomb();

	boolean isSuggestBomb();

	boolean isSuggestEmpty();

	void suggectEmpty();

	void suggectBomb();

	void draw(T paint, boolean real);

	void draw(T paint,int x,int y, boolean real);

}
