package lesson.example_06;

import lesson.example_06.Applications.Notepad;
import lesson.example_06.Format.*;

public class Program {
    public static void main(String[] args) {
        
        Notepad notes = new Notepad();
        notes.newFile();
        notes.currentDocument().addAllText("text1");
        notes.currentDocument().addAllText("text2");
        notes.currentDocument().addAllText("text3");
        notes.currentDocument().addAllText("text4");

        notes.SaveAs("src/main/java/lesson/example_06/file1", new Txt());
        notes.SaveAs("src/main/java/lesson/example_06/file2", new Md());
        notes.SaveAs("src/main/java/lesson/example_06/file3", new Doc());
        notes.SaveAs("src/main/java/lesson/example_06/file4", new Pdf());

    }
}
