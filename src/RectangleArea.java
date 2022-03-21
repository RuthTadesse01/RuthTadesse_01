import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        RectangleArea rg = new RectangleArea();
        rg.getData();
        rg.computeField();
        rg.fieldDisplay();
    }

    public static class RectangleArea {

        float width;
        float height;
        float area;

        public void getData() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("hey user;) \n Here we will calculate the area of a rectangle");
            System.out.println("please type in width of a rectangle:");
            width = Float.parseFloat(br.readLine());
            System.out.println("Now please type in the height of rectangle:");
            height = Float.parseFloat(br.readLine());
        }
        //  }

        public void computeField() {
            area = width * height;
        }

        public void fieldDisplay() {
            System.out.println("the area of a rectangle is : " + area);
        }

    }
}


