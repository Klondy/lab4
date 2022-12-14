import java.util.Objects;

public class Skills {
    private final String name;
    private final String info;

    public Skills(String name, String info){
        this.name = name;
        this.info = info;
    }

    public String getName(){
        return name;
    }

    public String getInfo(){
        return Objects.requireNonNullElse(info, "...");
    }

    public void useSkill(String name){
        if (this.info == null){
            System.out.println(name + " начал " + this.name);
            return;
        }
        System.out.println(name + " начал " + this.name + " " + info);
    }
}
