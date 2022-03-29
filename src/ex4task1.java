
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex4task1 {
    private static ex4task1 ra;
    double a, b, area;

    void getData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        System.out.println("With this program you will calculate the area of a rectangle");
        System.out.println("Enter the length of the side a:");
        a = Double.parseDouble(br.readLine());
        System.out.println("Enter the length of the side b");
        b = Double.parseDouble(br.readLine());
    }

    void computeField() { area = a * b; }

    void fieldDisplay(){
        System.out.print("The area the rectangle with the side a = ");
        System.out.printf("%2.2f",a);
        System.out.print(" and side b = ");
        System.out.printf("%2.2f", b);
        System.out.print(" is = ");
        System.out.printf("%2.2f.\n", area);
    }

    static void start() throws IOException{
        ex4task1 ra = new ex4task1();
        ra.getData();
        ra.computeField();
        ra.fieldDisplay();
    }
}
public class RectangleDemo{
    public static void main(String[] args) throws IOException{
        ex4task1.start();
    }
}
