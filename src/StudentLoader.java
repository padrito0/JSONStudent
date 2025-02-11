import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class StudentLoader {
    public static void main(String[] args) {
        String filePath = "students.json";  // Ensure this file is in the project directory

        try {
            // Read JSON file as a string
            String content = new String(Files.readAllBytes(Paths.get(filePath)));

            // Convert JSON to List of Student objects using Gson
            Gson gson = new Gson();
            List<Student> students = gson.fromJson(content, new TypeToken<List<Student>>() {}.getType());

            // Display students
            System.out.println("Student Details:\n----------------------");
            for (Student student : students) {
                student.display();
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error processing JSON: " + e.getMessage());
        }
    }
}
