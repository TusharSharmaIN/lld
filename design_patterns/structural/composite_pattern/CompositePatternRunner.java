package design_patterns.structural.composite_pattern;

import design_patterns.structural.composite_pattern.file_system.File;
import design_patterns.structural.composite_pattern.file_system.FileSystemItem;
import design_patterns.structural.composite_pattern.file_system.Folder;

public class CompositePatternRunner {
    public static void main(String[] args) {
        System.out.println("Composite Pattern Runner");

        FileSystemItem file1 = new File("readme.md", 5);
        FileSystemItem file2 = new File("logs.txt", 100);
        FileSystemItem file3 = new File("wallpaper.png", 2000);
        FileSystemItem file4 = new File("data.csv", 1000);

        Folder documents = new Folder("Documents");
        documents.addItem(file1);
        documents.addItem(file4);

        Folder pictures = new Folder("Pictures");
        pictures.addItem(file3);

        Folder home = new Folder("Home");
        home.addItem(documents);
        home.addItem(pictures);
        home.addItem(file2);

        System.out.println("Home Dir Size: " + home.getSize());

        System.out.println("Home Dir Sturcture: ");
        home.printStructure("");

        System.out.println("Deleting Home Dir");
        home.delete();
    }
}
