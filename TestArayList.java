import java.util.ArrayList;

public class TestArayList {
    public static void main(String[] args) {

        // Create a list to store cities
        ArrayList <String> cityList = new ArrayList<>();

        // Add cities in the list
        cityList.add("London");
        cityList.add("Denver");
        cityList.add("Paris");
        cityList.add("Miami");
        cityList.add("Seoul");
        cityList.add("Tokyo");

        System.out.println("List size is " + cityList.size());
        System.out.println("Is Miami in the list ? " + cityList.contains("Miami"));
        System.out.println("The location of Denver in the list? " + cityList.indexOf("Denver"));
        System.out.println("Is the list empty ? " + cityList.isEmpty());
        cityList.add(2, "Xian");
        cityList.remove("Miami");
        cityList.remove(1);

        // Display the content in the list
        System.out.println(cityList.toString());

        ArrayList<CircleFromSimpleGeometricObject> list = new ArrayList<>();
        list.add(new CircleFromSimpleGeometricObject(2));
        list.add(new CircleFromSimpleGeometricObject(3));
        System.out.println("The area of the circle ? " + list.get(0).getArea() );


    }
}
