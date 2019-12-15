public class PersonTest {
    public static void main(String[] args) {
        Person bob = new Person();

        bob.setName("Bobescu");
        bob.setAge(3);
        bob.setFavoriteColor("Blue");

        System.out.println("The Bob name is " + bob.getName() + " he is " + bob.getAge() +
                " old and his favorite color is " + bob.getFavoriteColor());

    }
}
