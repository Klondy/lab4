import java.util.ArrayList;
import java.util.List;

public class Human extends AbstractHuman {
    private final List<Skills> skills = new ArrayList<>();

    public Human(){
        System.out.println("Обычный человек успешно создан...");
    }

    public Human (String name){
        this.name = name;
        System.out.println("Человек - " + name  + " успешно создан!");
    }

    public List<Skills> getSkills() {
        return skills;
    }

    public boolean addSkills(Skills skill){
        skills.add(skill);
        System.out.println("Объекту - \"" + this.getName() + "\" успешно присвоено умение " + skill.getName()
                + " (" + skill.getInfo()+ ")");
        return true;
    }

    public static void wentFastUnder(String name, String place){
        System.out.println(name + " быстро заполз под " + place);
    }

    public static void wentAfter(String name){
        System.out.println(name + " скрылся следом");
    }

    public static void wentAfter(String name1, String name2){
        System.out.println(name1 + " проследовал за " + name2);
    }

    public static void peekIn(String name, String place){
        System.out.println(name + " просунул(-а) голову в " + place);
    }

    public static void blow(String name){
        System.out.println(name + " стал дуть");
    }

    public static void sigh(String name){
        System.out.println(name + " начал стонать и вздыхать, не жалея сил.");
    }

    @Override
    public int hashCode() {
        return super.hashCode()+this.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return "Человек по имени " + this.getName();
    }

    @Override
    public String getName() {
        return name;
    }
}