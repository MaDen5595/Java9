package T4;

public class People implements Comparable<People>{
    private String name;
    private int height;
    private int age;

    People(String name, int height, int age){
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(People o) {
        if(this.getHeight()-o.getHeight()==0){
            return this.getAge()-o.getAge();
        }
        else{
            return this.getHeight()-o.getHeight();
        }
    }
}
