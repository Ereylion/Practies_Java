package Pr_17;

import java.util.ArrayList;

public class Starter {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("Молотов Сергей Юрьевич", 69, 17, 19));
        s.add(new Student("Фролов Александ Алексеевич", 64, 20, 18));
        s.add(new Student("Иванова Юлия Николаевна", 53, 9, 17));
        s.add(new Student("Сыщиков Семен Александрович", 55, 3, 19));
        s.add(new Student("Фулина Екатерина Андреевна", 78, 17, 18));
        new LabClassUI(s);
    }

}
