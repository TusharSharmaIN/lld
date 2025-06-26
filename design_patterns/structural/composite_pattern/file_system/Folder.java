package design_patterns.structural.composite_pattern.file_system;

import java.util.ArrayList;

// composite class
public class Folder implements FileSystemItem {
    private final String name;
    private final ArrayList<FileSystemItem> children = new ArrayList<FileSystemItem>();

    public Folder(String name) {
        this.name = name;
    }

    public void addItem(FileSystemItem item) {
        children.add(item);
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemItem item : children) {
            totalSize += item.getSize();
        }
        return totalSize;
    }

    @Override
    public void printStructure(String indent) {
        System.out.println(indent + "+ " + name + "/");
        for (FileSystemItem item : children) {
            item.printStructure(indent + " ");
        }
    }

    @Override
    public void delete() {
        for (FileSystemItem item : children) {
            item.delete();
        }
        System.out.println("Deleting Folder: " + name);
    }

}
