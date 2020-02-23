package execution;

import java.util.ArrayList;
import java.util.Scanner;
import definition.*;

class Execution {
    public static void main(String[] args) {
        ArrayList<Person> ob = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Achyut's Contact List App");
        boolean a = true;
        while (a) {
            try {
                System.out.println("Press 1 to add a new contact");
                System.out.println("Press 2 to view all contacts");
                System.out.println("Press 3 to search for a contact");
                System.out.println("Press 4 to delete a contact");
                System.out.println("Press 5 to exit program");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        //System.out.println("You have chosen to add a new contact: ");
                        //System.out.println("Please enter the name of the Person");
                        AddContact ob1 = new AddContact();
                        ob.add(ob1.addContact());

                        break;
                    case 2:
                        ViewContactList obj = new ViewContactList();
                        obj.viewContactList(ob);

                        break;
                    case 3:
                        SearchContact obj1 = new SearchContact();
                        obj1.searchContact(ob);

                        break;
                    case 4:
                        DeleteContact obj2 = new DeleteContact();
                        int index = obj2.printContact(ob);
                        System.out.println(ob.get(index).getFirstName() + " " + ob.get(index).getLastName() + "'s contact removed!");
                        ob.remove(ob.get(index));

                        break;
                    case 5:
                            a = false;
                        break;
                    default:
                        System.out.println("invalid choice please re-enter");
                        break;

                }
            }
            catch(Exception e){
                e.printStackTrace();
            }

        }
    }
}
