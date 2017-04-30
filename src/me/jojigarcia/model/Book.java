package me.jojigarcia.model;

/**
 * Created by joaquinjimenezgarcia on 27/4/17.
 */
public class Book extends Available implements Loan{
    public Book() {
    }

    public Book(int code, String title, int year) {
        super(code, title, year);
    }
}
