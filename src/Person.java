public class Person {

    String firstName;
    String lastName;
    int age;
    String job;
    String nationality;
    String gender;


    public Person(String firstName,String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public Person(String firstName,String lastName, int age,String job,String nationality, String gender) {
    this(firstName, lastName, age);
    this.job = job;
    this.nationality = nationality;
    this.gender = gender;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    public String getJob(){
        return this.job;
    }
    public String getNationality(){
        return this.nationality;
    }
    public String getGender(){
        return this.gender;
    }
    public boolean isTeen(){
        return this.age > 13 && this.age < 19;
    }

}
