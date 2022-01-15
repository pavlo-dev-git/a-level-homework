public class Main {
    public static void main(String[] args) {
        String firstName = "Pavlo";
        String lastName = "Popov";
        System.out.println(firstName + " " + lastName);

        int firstNameLength = firstName.length();
        if( firstNameLength > 7 ) {
            System.out.println("More than 7");
        }
        else if( firstNameLength < 7 ) {
            System.out.println("Less than 7");
        }

        int value = 5;
        for( int i = 0; i <= 10; i++ ) {
            System.out.println("Шаг " + i + ", значение " + value);
            value += 2;
        }
    }
}
