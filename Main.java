public class Main {
    public static void main(String[] args) throws Exception{
        Person person = new Person("", "Dana", -9);
        try {
            person.validatePerson();
        } catch (InvalidAgeException a){
            person.setAge(9);
        } catch (InvalidNameException a){
            person.setFirstName("Dana");
            person.setLastName("Rusu");
        }
        Numbers number = new Numbers(8);
//        number.divideBy(0);
        number.countDivisibleBy7Numbers(8, 7);
    }
}