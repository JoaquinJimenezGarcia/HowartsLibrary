package me.jojigarcia.model;

import java.util.Date;

/**
 * Created by joaquinjimenezgarcia on 27/4/17.
 */
public class Book extends Available implements Loan{
    java.util.Date date;

    public Book() {
    }

    public Book(int code, String title, int year) {
        super(code, title, year);
        this.date  = new java.util.Date();
    }

    @Override
    public String toString() {
        return "Book( " +
                "date = " + date +
                " ha devolver en "+toReturn() + " días " +
                super.toString();
    }

    public int toReturn(){
        int days = 30;

        return days;
    }
}
