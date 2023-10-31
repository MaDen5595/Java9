package T4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;
public class TestComparable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<People> club = new ArrayList<>();
        People Vasya = new People("Вася",180,56);
        People Vasya1 = new People("Игорь",180,42);
        People Vasya2 = new People("Коля",170,78);
        club.add(Vasya);
        club.add(Vasya1);
        club.add(Vasya2);
        Collections.sort(club);
        for(int i = 0; i<club.size();i++){
            System.out.println(club.get(i).toString());
        }
    }
}
