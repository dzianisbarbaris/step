package by.savik.L03_02_2025;

public class EBook extends Book {

    private int fileSize;

    public EBook(String title, Author author, int year, int fileSize) {
        super(title, author, year);
        this.fileSize = fileSize;
    }

    @Override
    public String toString() {
        return super.toString() + " fileSize " + fileSize + " Мб ";
    }


    public String getDescription() {
        return super.getDescription() + " fileSize " + fileSize + " Мб ";
    }
}
