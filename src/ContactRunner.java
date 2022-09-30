import java.util.Scanner;
public class ContactRunner {
    private String name;
    private String number;
    private String birthday;

    public ContactRunner(String cName, String cNumber, String cBirthday) {
        name = cName;
        number = cNumber;
        birthday = cBirthday;
    }

    public void askForInfo() {
        Scanner s = new Scanner(System.in);
        System.out.print("Who are you searching for?: ");
        String search = s.nextLine();
        if (name == search) {
            System.out.println("Name: " + name);
            System.out.println("Number: " + number);
            System.out.println("Birthday: " + birthday);
        } else {
            System.out.println("No results found.");
        }
    }
}

