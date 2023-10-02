import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cat> arrayList = new ArrayList<>();
        arrayList.add(new Cat("sharik",3));
        arrayList.add(new Cat("alym",2));
        arrayList.add(new Cat("kodirali",4));

        System.out.println(arrayList);

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();


        for (Cat cat1:arrayList) {
            if (Objects.equals(cat1.getName(), name) && cat1.getAge() == age){
                System.out.println(cat1);
            }
        }
    }
}