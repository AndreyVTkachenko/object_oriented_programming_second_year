package lesson.example_06.Interface;

import lesson.example_06.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
