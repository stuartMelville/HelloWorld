package com.plural.finaltest;

/**
 * Created by stuart on 7/26/2016.
 */
class TwoInts {
    private int int100;


    private int int200;
    private String bob = "BOB";
    private String cat = "CAT";
    private String dog = "DOG";
    private boolean cow = true;
    private char ch = 'c';

    public TwoInts(int int100, int int200){
        this.int100= int100;
        this.int200 = int200;
    }

    public int getInt100() { return int100; }
    public int getInt200() { return int200; }
    public void setInt100(int int100) { this.int100 = int100; }
    public void setInt200(int int200) { this.int200 = int200; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TwoInts twoInts = (TwoInts) o;

        if (int100 != twoInts.int100) return false;
        if (int200 != twoInts.int200) return false;
        if (cow != twoInts.cow) return false;
        if (ch != twoInts.ch) return false;
        if (!bob.equals(twoInts.bob)) return false;
        if (!cat.equals(twoInts.cat)) return false;
        return dog.equals(twoInts.dog);

    }

    @Override
    public int hashCode() {
        int result = int100;
        result = 31 * result + int200;
        result = 31 * result + bob.hashCode();
        result = 31 * result + cat.hashCode();
        result = 31 * result + dog.hashCode();
        result = 31 * result + (cow ? 1 : 0);
        result = 31 * result + (int) ch;
        return result;
    }
}
