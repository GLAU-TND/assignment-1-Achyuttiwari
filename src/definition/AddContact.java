package definition;

import java.util.*;

import java.util.regex.Pattern;

class Expression {
   public boolean phoneNumber(String phone) {
       String pattern = "^[0-9+;,*#]+$";
       return Pattern.matches(pattern, phone);
   }

   public boolean email(String mail) {
       String pattern = "^[\\w\\d_][\\w\\d_.]*@[\\w\\d_.]+$";
       return Pattern.matches(pattern, mail);
   }
}
public class AddContact {
    Person person = new Person();
    Expression ob1 = new Expression();

    public void addFirstName(String first) {
        person.setFirstName(first);
    }

    public void addLastName(String last) {
        person.setLastName(last);
    }

    public boolean addNumber(String number) {
        if (ob1.phoneNumber(number)) {
            person.setContactNumbers(number);
            return true;
        }
        return false;
    }

    public boolean addEmail(String mail) {
        if (ob1.email(mail)) {
            person.setEmailAddress(mail);
            return true;
        }
        return false;
    }

    public Person addContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You have chosen to add a new contact:");
        System.out.println("Please enter the name of the Person");
        System.out.print("First Name: ");
        addFirstName(sc.nextLine());
        System.out.print("Last Name: ");
        addLastName(sc.nextLine());
        boolean a = true;
        while (a) {
            System.out.print("Contact Number: ");
            String phoneNumber = sc.nextLine();
            a = addNumber(phoneNumber);
            if (!a) {
                System.out.println("invalid no please re-enter");
                a = true;
                continue;
            }
            System.out.println("Would you like to add another contact number? (y/n): ");

            char ch = (sc.nextLine()).charAt(0);

            a = (ch == 'y') || (ch == 'Y');

        }

        System.out.println("Would you like to add email address? (y/n): y");

        char ch = (sc.nextLine()).charAt(0);
        if (ch == 'y' || ch == 'Y') {
            System.out.print("Email Address: ");
            String mail = sc.nextLine();
            boolean a1 = addEmail(mail);
            while (!a1) {
                System.out.println("invalid email please re-enter");
                System.out.print("Email Address: ");
                a1 = addEmail(sc.nextLine());
            }
        }
        return person;


    }
}
