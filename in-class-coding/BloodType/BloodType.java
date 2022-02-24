package BloodType;

import java.io.*;

public class BloodType {
    public static void main(String[] args) {
        String[] idNumbers = { "360541", "736049", "609746", "939949", "139572", "351394", "822071", "160351", "494867",
                "521934" };
        String[] bloodTypes = { "A+", "B-", "O+", "A+", "A+", "B-", "AB-", "O-", "A-", "B+" };

        createFile(idNumbers, bloodTypes);
    }

    public static void createFile(String[] patientID, String[] bloodType) {

        if (patientID.length != bloodType.length) {
            System.out.println("Please ensure each patient has exactly 1 specified blood type.");
        } else {
            try {
                File file = new File(
                        "C:\\Users\\306972\\Desktop\\AP CSA\\vedantgrover\\in-class-coding\\BloodType\\patientBloodType.csv");

                if (file.createNewFile()) {
                    System.out.println("File Creation : Successful");
                } else {
                    System.out.println("File Creation : Failure. File Already Exists");
                }
                FileWriter writer = new FileWriter(file);

                for (int i = 0; i < patientID.length; i++) {
                    writer.write(patientID[i] + "," + bloodType[i] + "\n");
                }

                writer.close();

            } catch (Exception e) {
                System.out.println("Something went wrong. Error: " + e);
            }
        }
    }
}
