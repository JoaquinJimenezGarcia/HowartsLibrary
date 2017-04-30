package me.jojigarcia.model;

import java.util.Date;

/**
 * Created by joaquinjimenezgarcia on 27/4/17.
 */
public class Book extends Available implements Loan{
    java.util.Date date = new java.util.Date();

    public Book() {
    }

    public Book(int code, String title, int year, Date date) {
        super(code, title, year);
        this.date = date;
    }

    @Override
    public String toString() {
        return "Book{" +
                "date=" + date +
                '}';
    }

    public void date(){

    }
}
