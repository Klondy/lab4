import java.util.ArrayList;
import java.util.List;
public class main {
    public static void main(String[] args){
        System.out.println();
        HumanAble Carlson = new Human("Карлсон");
        Carlson.addSkills(new Skills("Стонать и вздыхать", "не жалея сил"));
        Carlson.addSkills(new Skills("Выпускать воздух", "из шарика"));
        Carlson.addSkills(new Skills("Залепить дырку", "жвачкой"));
        Carlson.addSkills(new Skills("Ловко вытащить ", "из глазка трубочку со спущенным резиновым шариком"));
        System.out.println();

        HumanAble old = new Human("лунный старик");
        old.addSkills(new Skills("Расстаять", null));
        System.out.println();

        HumanAble boy = new Human("Малыш");
        boy.addSkills(new Skills("Дуть", null));
        System.out.println();

        HumanAble they = new Human("Те двое, что сидели запершись в гостиной");
        System.out.println();

        HumanAble bock = new Human("фрекен Бок");
        System.out.println();

        PlaceAble location1 = new Place("Гостиная");
        location1.setType(Places.LivingRoom);
        they.addSkills(new Skills("Запереться в ", location1.getPlace()));
        they.addSkills(new Skills("Услышать стоны в ", location1.getPlace()));
        they.addSkills(new Skills("Увидели  "+ old.getName() + " в ", location1.getPlace()));
        System.out.println();

        PlaceAble location2 = new Place("Круглый столик, покрытый скатертью");
        location2.setType(Places.RoundTable);
//        boy.addSkills(new Skills("Скрыться следом под", location2.getPlace()));
//        Carlson.addSkills(new Skills("Заползти под", location2.getPlace()));
        System.out.println();

        PlaceAble location3 = new Place("Прихожая");
        location3.setType(Places.Hallway);
        bock.addSkills(new Skills("Просунуть голову", location3.getPlace()));
        System.out.println();

        Thing key = new Thing("Замок");
        Thing door = new Thing("Дверь");
        System.out.println();

        Human.blow(boy.getName().toString());
        Human.sigh(Carlson.getName());
        System.out.print(they.getName());
        System.out.println(" " + they.getSkills().get(1).getName() + they.getSkills().get(1).getInfo());
        System.out.println(they.getSkills().get(2).getName() + they.getSkills().get(2).getInfo());
        Noise.createUnexpectedNoise("крик, которого Карлсон ждал");
        Carlson.getSkills().get(1).useSkill(Carlson.getName());
        Noise.createNoise("тихий и таинственный свистящий звук");
        old.getSkills().get(0).useSkill(old.getName());
        Carlson.getSkills().get(3).useSkill(Carlson.getName());
        Human.wentFastUnder(Carlson.getName(), location2.getPlace());
        Human.wentAfter(boy.getName());
        key.noise(" щёлкнул");
        door.action(" раздвинулась");
        Human.peekIn(bock.getName(), location3.getPlace());

    }
}