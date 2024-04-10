public class Main {
    public static void main(String[] args) {


        System.out.println(buildFullName("Alessandro", "Gueli"));
    }


    public static String buildFullName(String name, String surname) {
        if (name.isEmpty() || surname.isEmpty()) {
            return null;
        }

        return (name + " " + surname);
    }
}