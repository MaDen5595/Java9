package T1;

public class Test {
    public static void Sortr(Student[] array){
        for(int left = 0; left < array.length; left++){
            Student value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value.getiDNumber() < array[i].getiDNumber()) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
    }
    public static void main(String[] args){
        Student Matvey = new Student("Матвей",842);
        Student Vasya = new Student("Вася",785);
        Student Kolya = new Student("Коля",552);
        Student Oleg = new Student("Олег",727);
        Student Tolyan = new Student("Анатолий",227);
        Student[] spis = new Student[]{Matvey,Vasya,Kolya,Oleg,Tolyan};
        System.out.println("Изначальный список:");
        for(int e = 0;e<5;e++){
            System.out.println(spis[e].toString());
        }
        Sortr(spis);
        System.out.println("Сортированный список:");
        for(int e = 0;e<5;e++){
            System.out.println(spis[e].toString());
        }
    }
}
