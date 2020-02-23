package definition;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteContact {
    public int printContact(ArrayList<Person> ob) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("Here are all your contacts: ");
        for (Person oj : ob) {
            System.out.println(i++ + ". " + oj.getFirstName() + " " + oj.getLastName());
        }
        System.out.println("Press the number against the contact to delete it: ");
        int fno;
        fno = sc.nextInt() - 1;
        return fno;

    }
}
