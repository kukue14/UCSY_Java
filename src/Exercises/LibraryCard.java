package Exercises;

public class LibraryCard {
    private Student owner;
    private int borrowCnt;

    public LibraryCard() {

    }

    public void checkOut(int check) {
        borrowCnt = check;
    }
    public int getNumberOfBooks() {
        return borrowCnt;
    }
    public Student getOwnerName() {
        return owner;
    }
    public void setOwner(Student stu) {
        this.owner = stu;
    }
    public void display() {
        System.out.println(owner.getName() + " / " + owner.getEmail() + " / " + borrowCnt);
    }
}