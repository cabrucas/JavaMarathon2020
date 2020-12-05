package day6;

public class Teacher {
    private String name;
    private String dicipline;

    public Teacher(String name, String dicipline) {
        this.name = name;
        this.dicipline = dicipline;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDicipline() {
        return dicipline;
    }

    public void setDicipline(String dicipline) {
        this.dicipline = dicipline;
    }

    public void evaluate(Student student) {
        int degree = (int)(Math.random() * 5);
        String degreeWord = null;
        switch (degree) {
            case 0 :
            case 1 :
            case 2 :
                degreeWord = "неудовлетворительно";
                break;
            case 3 :
                degreeWord = "удовлетворительно";
                break;
            case 4 :
                degreeWord = "хорошо";
                break;
            case 5 :
                degreeWord = "Отлично";
                break;
        }
        System.out.println(String.format("Преподаватель %s оценил студента с именем %s по предмету %s на оценку %s",
                getName(),
                student.getName(),
                getDicipline(),
                degreeWord));
    }
}
