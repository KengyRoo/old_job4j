package ru.job4j.other;

//00 11 21 32 42
public class ClassTest {
    public static void main (String[]args){
        int x=0;
        int y=0;
        while (x<5){
            y=x-y;
            System.out.println(x+""+y+"");
            x=x+1;

        }
    }
}

//00 11 23 36 410
class ClassTest1 {
    public static void main (String[]args){
        int x=0;
        int y=0;
        while (x<5){
            y=y+x;
            System.out.println(x+""+y+"");
            x=x+1;

        }
    }
}

//02 14 25 36 47
class ClassTest2 {
    public static void main (String[]args){
        int x=0;
        int y=0;
        while (x<5){
            y=y+2;
            if(y>4){
                y=y-1;
            }
            System.out.println(x+""+y+"");
            x=x+1;

        }
    }
}

//11 34 59
class ClassTest3 {
    public static void main (String[]args){
        int x=0;
        int y=0;
        while (x<5){
            x=x+1;
            y=y+x;
            System.out.println(x+""+y+"");
            x=x+1;

        }
    }
}

//02 14 36 48
class ClassTest4 {
    public static void main (String[]args){
        int x=0;
        int y=0;
        while (x<5){
            if (y<5){
                x=x+1;
                if (y<3){
                    x=x-1;
                }
            }
            y=y+2;
            System.out.println(x+""+y+"");
            x=x+1;

        }
    }
}