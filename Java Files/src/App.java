import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        File file_centerFile = new File("ProgrammingWorkshopNewsLab\\Article Text Files\\Center.txt");
        File file_rightFile = new File("ProgrammingWorkshopNewsLab\\Article Text Files\\Right.txt");
        File file_leftFile = new File("ProgrammingWorkshopNewsLab\\Article Text Files\\Left.txt");

        try (
            BufferedReader br_center = new BufferedReader(new FileReader(file_centerFile));
            BufferedReader br_right = new BufferedReader(new FileReader(file_rightFile));
            BufferedReader br_left = new BufferedReader(new FileReader(file_leftFile));
        ) {
            // Read and print Center file
            String line;
            while ((line = br_center.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("--------------------------------------------------------------");

            // Read and print Right file
            while ((line = br_right.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("--------------------------------------------------------------");

            // Read and print Left file
            while ((line = br_left.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("--------------------------------------------------------------");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
