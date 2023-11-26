public class Person {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void validatePerson() throws Exception{
        if(firstName==null || lastName==null && firstName.length()==0 || lastName.length()==0){
            throw new InvalidNameException("Numele nu e complet");
        }
        if(age<0 || age>150){
            throw new InvalidAgeException("Varsta nu e corecta");
        }
    }
}
