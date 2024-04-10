public class Main {
    public static void main(String[] args) {

        System.out.println("Risultato: " + buildFullName("Fabrizio", "Lagioia"));
    }
    public static String buildFullName (String name, String surname) {
        if(name.isEmpty()){
            return null;
        }
        return (name + " " + surname);
    }
}