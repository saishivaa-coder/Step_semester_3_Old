import java.util.Scanner;

class book {
    int bookid;
    String bookname;
    String studentName;
    int daysLate;
    int F;

    book(int id, String bname, String sname, int dlate) {
        bookid = id;
        bookname = bname;
        studentName = sname;
        daysLate = dlate;
    }

    void display() {
        if (daysLate <= 5) {
            System.out.println("Fine: 0");
        } else if (daysLate <= 10) {
            F = daysLate * 2;
            System.out.println("Fine: " + F);
        } else if (daysLate <= 20) {
            F = daysLate * 5;
            System.out.println("Fine: " + F);
        } else {
            F = daysLate * 10;
            System.out.println("Fine: " + F);
        }
    }
}

public class main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the book id:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter book name:");
        String bname = sc.nextLine();

        System.out.println("Enter name:");
        String sname = sc.nextLine();

        System.out.println("Enter how many days late:");
        int dlate = sc.nextInt();

        book s = new book(id, bname, sname, dlate);
        s.display();

        sc.close();
    }
}
