package com.plural.comparable;

/**
 * Created by stuart on 7/26/2016.
 */
class TwoInts implements Comparable<TwoInts>{
    private int int100;
    private int int200;

    public TwoInts(int int100, int int200){
        this.int100= int100;
        this.int200 = int200;
    }

    public int getInt100() { return int100; }
    public int getInt200() { return int200; }
    public void setInt100(int int100) { this.int100 = int100; }
    public void setInt200(int int200) { this.int200 = int200; }

//    @Override
//    public int compareTo(Object o) {
//        TwoInts target = (TwoInts)o;
//        if(this.getInt200() > ((TwoInts) o).getInt200()){  //BIGGER
//            return 1;
//        }else if(this.getInt200() < ((TwoInts) o).getInt200()){ //SMALLER
//            return -1;
//        }else{      //SAME
//            return 0;
//        }
//    return this.getInt200() - ((TwoInts) o).getInt200();
//
//    }

    @Override
    public int compareTo(TwoInts o) {
        return this.getInt200() - o.getInt200();
    }
}
