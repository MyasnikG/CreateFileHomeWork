package service;

import java.io.File;

public class StudentService {


    public static void createFile(String[] students) throws Exception {
        for (int i = 0; i < students.length; i++) {
            String[] name = students[i].split("-");
            String fileName = name[0];
            String filePath = "C:\\Users\\miasn\\IdeaProjects\\DiGi School Projects\\CreateFilesHomeWork\\" + fileName + ".txt";
            File newFile = new File(filePath);
            newFile.createNewFile();
            FileService.write(filePath, students[i]);
        }
    }
}
