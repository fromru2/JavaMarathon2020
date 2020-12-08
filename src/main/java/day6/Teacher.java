package day6;

import java.util.Random;

public class Teacher {
    String name;
    String pred;

    public void setName(String name) {
        this.name = name;
    }

    public void setPred(String pred) {
        this.pred = pred;
    }

    public String getName() {
        return name;
    }

    public String getPred() {
        return pred;
    }

    Random rand = new Random();

    public Teacher(String name, String pred) {
        this.name = name;
        this.pred = pred;
    }

    public void evaluate(Student ba) {
        int x = rand.nextInt(4) + 2;
        String z = "";

        switch (x) {
            case 2:
                z = "Неудовлетворительно";
                break;
            case 3:
                z = "Удовлетворительно";
                break;
            case 4:
                z = "Хорошо";
                break;
            case 5:
                z = "Отлично";
                break;
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем "
                + ba.getName() + " по предмету " + pred + " на оценку " + z); }
}

