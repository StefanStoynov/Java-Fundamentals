import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;


public class p11_StudentsJoinedToSpecialties {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String line;
        while (true) {
            if ("Students:".equals(line = reader.readLine())) {
                break;
            }
            String[] tokens = line.split("\\s+");
            String specialty = tokens[0] + " " + tokens[1];
            String facilityNumber = tokens[2];


        }


        while (true) {
            if ("END".equals(line = reader.readLine())) {
                break;
            }
            String[] tokens1 = line.split("\\s+");
            String facilityNumber = tokens1[0];
            String fullName = tokens1[1] + " " + tokens1[2];


        }


    }

}

class StudentSpecialty {
    public String name;
    public String facilityNumber;

    public StudentSpecialty(String name, String facilityNumber) {
        this.name = name;
        this.facilityNumber = facilityNumber;
    }

}

