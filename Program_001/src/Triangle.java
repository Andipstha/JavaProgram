import java.lang.Math;

public class Triangle { //create a class name Triangle
    /*
        Formulas
        perimeter = a + b + c;
        s = (a + b + c)*1/2
        area = root[s(s-a)(s-b)(s-c)]
    */
    //class attribute
    /*public double s1 = 3; side 1
    public double s2 = 4;
    public double s3 = 5;*/

    public double s1, s2, s3, per, area, s;

    public Triangle(double x1,double x2,double x3) //create a constructor for class Triangle
    {
        s1 = x1;
        s2 = x2;
        s3 = x3;

        per = s1 + s2 + s3;

        s = per/2;

        area = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));

    }

}
