package definition;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchContact {
    public void searchContact(ArrayList<Person> ob) {
        System.out.println("You could search for a contact from their first names:");
        Scanner sc = new Scanner(System.in);
        String searchName = sc.nextLine();
        int count = 0;
        ArrayList<Integer> ar = new ArrayList<>();
        int i = 0;
        for (Person oj : ob) {
            if (oj.getFirstName().equals(searchName)) {
                ar.add(i);
                count++;
            }
            i++;
        }
        if (count == 0)
            System.out.println("No match found!");
        else
            System.out.println(count + " match found!");
        ar.forEach(index -> {
            ViewContactList object = new ViewContactList();
            object.viewDetails(ob.get(index));
        });

    }
}
