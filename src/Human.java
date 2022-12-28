import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Human extends AbstractHuman {
    private final List<Skills> skills = new ArrayList<>();

    public Human (String name){
        this.name = name;
        System.out.println("Человек - " + name  + " успешно создан!");
    }

    public List<Skills> getSkills() {
        return skills;
    }

    public void addSkills(Skills skill){
        skills.add(skill);
        System.out.println("Объекту - \"" + this.getName() + "\" успешно присвоено умение " + skill.getName()
                + " (" + skill.getInfo()+ ")");
    }

    public static void wentFastUnder(String name, PlaceAble place) throws NoSuchPlaceException{
        if (Objects.equals(place.getPlace(), "...")) {
            throw new NoSuchPlaceException(place);
        }
        System.out.println(name + " быстро заполз под " + place.getPlace());
    }

    public static void wentTo(String name, PlaceAble place){
        System.out.println(name + " переместился в " + place.getPlace());
    }

    public static void wentTo(String name, PlaceAble place, String with){
        wentTo(name, place);
        System.out.println(name + " увлекла за собой " + with);
    }

    public static void wentAfter(String name){
        System.out.println(name + " скрылся следом");
    }

    public static void stand(String[] names, String place){
        class Repeater {
            public String enumeration(String[] names){
                StringBuilder output = new StringBuilder();
                for(String name : names){
                    output.append("И ").append(name).append(" ");
                }
                return output.toString();
            }
        }
        Repeater repeater = new Repeater();
        System.out.println(repeater.enumeration(names) + " стояли перед " + place);
    }

    public static void standAfter(String name){
        System.out.println(name + " стоял за ним(-ей)");
    }

    public static void compareVisions(String name2, boolean vision1, boolean vision2) {
        if (vision1 != vision2) {
            System.out.println("И " + name2 + " был другого мнения");
        } else {
            System.out.println("И " + name2 + " разделял его/её мнение");
        }
    }

    public static void standOnTheirVision(HumanAble person1, HumanAble person2) throws CannotResistException{
        if (person1.getSkills().contains(new Skills("Убеждение", "")) ||
        person2.getSkills().contains(new Skills("Убеждение", ""))){
            throw new CannotResistException();
        } else {
            System.out.println("Она настояла на своём");
        }
    }

    public static void think(String name, String thought){
        System.out.println("\"" + thought + "\" -- думал " + name);
    }

    public static void angry(String who, String why){
        System.out.println(who + " явно не была рада, что " + why);
    }

    public static void peekIn(String name, String place){
        System.out.println(name + " просунул(-а) голову в " + place);
    }

    public static void searchAt(String name, String place){
        System.out.println(name + "ищет в " + place);
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

    @SuppressWarnings("EqualsWhichDoesntCheckParameterClass")
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

    static class NoSuchPlaceException extends Exception {
        private static String errorMessage = "Попытка попасть в несуществующую локацию: ";

        public NoSuchPlaceException(PlaceAble place){
            super(errorMessage + place.getPlace());
            errorMessage += place.getPlace();
        }
    }

    public static class CannotResistException extends RuntimeException {
        static String message = "Она покорилась и послушно сказала, что она, конечно, это тоже способна понять, если как следует подумает.";
        public CannotResistException(){
            super(message);
        }
    }

    class Search {
        private final String[] itemsFound;
        private final boolean isLong;
        private final String place;

        public Search(String place, boolean isLong, String[] itemsFound){
            this.itemsFound = itemsFound;
            this.isLong = isLong;
            this.place = place;
        }

        public void start(){
            if(isLong){
                System.out.println(name + " долго шарил в " + place + ", но никак не мог напасть на то, что искал");
            } else {
                searchAt(name, place);
            }

            for (String item:
                 itemsFound) {
                System.out.println(name + " нашёл " + item);
            }
        }
    }
}