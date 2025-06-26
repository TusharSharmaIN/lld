package design_patterns.structural.composite_pattern.file_system;

public interface FileSystemItem {
    int getSize();

    void printStructure(String indent);

    void delete();
}
