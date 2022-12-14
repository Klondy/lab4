public class Thing {
    private final String name;

    public Thing(String name) {
        System.out.println("Объект " + name + " успешно создан");
        this.name = name;
    }

    public void noise(String noise){
        System.out.println(name + " " + noise);
    }

    public void action(String action){
        System.out.println(name + " " + action);
    }

    public String getName() {
        return name;
    }
}
