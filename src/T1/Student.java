package T1;

public class Student {
    private String name;
    private int iDNumber;
    public Student(String name, int iDNumber){
        this.name = name;
        this.iDNumber = iDNumber;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public String toString() {return name + " " + iDNumber;}
}
