package Cognitree;

import java.io.File;

public class FileOperations {

    private String code_directory = System.getProperty("user.dir");
    private String filename = "input.txt";
    private String inputdir ="input";
    private String fileFullPath = code_directory + File.separator + inputdir + File.separator + filename;

    public String getinputfile() {
        return fileFullPath;
    }

    public void getFileContents() {

    }

    public static void main(String argvs[]) {
        // for testing
        FileOperations a = new FileOperations();
        System.out.println(a.getinputfile());
        System.out.println(System.getProperty("java.class.path"));
        System.out.println(System.getProperties());

    }
}
