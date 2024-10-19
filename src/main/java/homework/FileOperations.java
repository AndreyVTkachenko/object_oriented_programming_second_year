package homework;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

interface FileOperations {
    void saveToFile(FamilyTree familyTree, String fileName) throws
            IOException;
    FamilyTree loadFromFile(String fileName) throws IOException,
            ClassNotFoundException;

}
