import Teacher;

package ds;
class Teacher {
    String name;
    int rate;
    int totalHours;

    public Teacher(String name, int rate, int totalHours) {
        this.name = name;
        this.rate = rate;
        this.totalHours = totalHours;
    }

    public String getName() {
        return name;
    }

    public int getRate() {
        return rate;
    }
}

public class gpt {
    public static void main(String[] args) {
        Teacher john = new Teacher("John", 400, 2);
        Teacher mary = new Teacher("Mary", 300, 4);
        Teacher peter = new Teacher("Peter", 400, 9);
        Teacher paul = new Teacher("Paul", 300, 12);
        Teacher eric = new Teacher("Eric", 350, 15);

        Teacher[] teachers = {john, mary, peter, paul, eric};

        for (Teacher teacher : teachers) {
            System.out.println("老師姓名: " + teacher.getName() + ", 時薪: " + teacher.getRate());
        }
    }
}

