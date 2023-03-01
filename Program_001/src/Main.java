//WAP to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' with constructor having the three sides as its parameters.
public class Main {
    public static void main(String[] args)
    {
        Triangle obj = new Triangle(3, 4, 5); // Create an object of class Triangle (This will call the constructor)

        System.out.println("Perimeter of the triangle: "+obj.per);
        System.out.println("Area of the triangle: "+obj.area);
    }
}
