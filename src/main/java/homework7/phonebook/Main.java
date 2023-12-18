package homework7.phonebook;

public class Main {
    public static void main(String[] args) {
        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        telephoneDirectory.add(new Recording("Oleg", "0631113855"));
        telephoneDirectory.add(new Recording("Alice", "0665994333"));
        telephoneDirectory.add(new Recording("Oleg", "0504444855"));
        telephoneDirectory.add(new Recording("Tom", "0985555855"));
        telephoneDirectory.find("Alice");
        telephoneDirectory.find("Oleg");
        telephoneDirectory.find("Igor");
    }
}