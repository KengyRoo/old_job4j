package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book comics = new Book("Comics", 10);
        Book classic = new Book("Classic", 4);
        Book detective = new Book("Detective", 5);
        Book roman = new Book("Clean code", 6);

        Book[] books = new Book[4];

        books[0] = comics;
        books[1] = classic;
        books[2] = detective;
        books[3] = roman;

        for (int index = 0; index < books.length; index++) {
            Book lb = books[index];
            System.out.println(lb.getName() + " - " + lb.getCount());
        }

        System.out.println("Replace index 3 to 0.");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (int index = 0; index < books.length; index++) {
            Book lb = books[index];
            System.out.println(lb.getName() + " - " + lb.getCount());
        }
    }
}
