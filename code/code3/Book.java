package code3;/*
 * Book.java
 *
 * Copyright (c) University of Sheffield 2011
 */

public class Book extends Publication {

    // instance fields
    private int numChapters;

    public Book(String t, String a, int i, int n, int c) {
//        super(t, a, i, n);
        numChapters = c;
    }

    // methods
    public String getTitle() {
        return super.getTitle();
    }

    public String getAuthor() {
        return super.getAuthor();
    }

    public String toString() {
        return super.toString() + "[numChapters=" + numChapters + "]";
    }
}
