import service.FileService;
import service.StudentService;

public class Main {

    public static final String URL = "C:\\Users\\miasn\\IdeaProjects\\DiGi School Projects\\CreateFilesHomeWork\\StudentData.txt";
    public static void main(String[] args) throws Exception{

        String [] students = FileService.read(URL);
        StudentService.createFile(students);
    }
}