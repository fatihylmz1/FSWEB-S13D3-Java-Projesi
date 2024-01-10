public class Main {
    public static void main(String[] args) {
        Person person = new Person("John","Doe",20);
        System.out.println("Firstname: " + person.getFirstName());
        System.out.println("LastName: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("-----------------------------------");
        Person person2 = new Person("Fatih","Yilmaz",23,"Developer","Turkish","Man");
        System.out.println("Firstname: " + person2.getFirstName());
        System.out.println("LastName: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Job: " + person2.getJob());
        System.out.println("Nationality: " + person2.getNationality());
        System.out.println("Gender: " + person2.getGender());
    }
}