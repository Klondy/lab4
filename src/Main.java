public class Main {
    public static void main(String[] args){
        System.out.println();
        Human Carlson = new Human("Карлсон");
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

        HumanAble Yulius = new Human("Юлиус");
        Yulius.addSkills(new Skills("Убеждение", ""));
        System.out.println();

        PlaceAble location1 = new Place("Гостиная");
        location1.setType(Places.LivingRoom);
        they.addSkills(new Skills("Запереться в ", location1.getPlace()));
        they.addSkills(new Skills("Услышать стоны в ", location1.getPlace()));
        they.addSkills(new Skills("Увидели  "+ old.getName() + " в ", location1.getPlace()));
        System.out.println();

        PlaceAble location2 = new Place("Круглый столик, покрытый скатертью");
        location2.setType(Places.RoundTable);
        System.out.println();

        PlaceAble location3 = new Place("Прихожая");
        location3.setType(Places.Hallway);
        bock.addSkills(new Skills("Просунуть голову", location3.getPlace()));
        System.out.println();

        Thing key = new Thing("Замок");
        Thing door = new Thing("Дверь");
        System.out.println();

        Carlson.new Search("ящиках Малыша", true,
                new String[]{"длинную стеклянную трубочку, через которую Малыш стрелял горошинами",
                        "еще предмет, отличный предмет -- воздушный шар, который можно было надуть до огромных размеров"})
                .start();
        Noise.createGoodEvent("хохотал");




        Human.blow(boy.getName());
        Human.sigh(Carlson.getName());
        System.out.print(they.getName());
        System.out.println(" " + they.getSkills().get(1).getName() + they.getSkills().get(1).getInfo());
        System.out.println(they.getSkills().get(2).getName() + they.getSkills().get(2).getInfo());
        Noise.createUnexpectedNoise("крик, которого Карлсон ждал");
        Carlson.getSkills().get(1).useSkill(Carlson.getName());
        Noise.createNoise("тихий и таинственный свистящий звук");
        old.getSkills().get(0).useSkill(old.getName());
        Carlson.getSkills().get(3).useSkill(Carlson.getName());
        try {
            Human.wentFastUnder(Carlson.getName(), location2);
        } catch (Human.NoSuchPlaceException e) {
            System.out.println(e.getMessage());
        }
        Human.wentAfter(boy.getName());
        key.noise(" щёлкнул");
        door.action(" раздвинулась");
        Human.peekIn(bock.getName(), location3.getPlace());




        Human.standAfter(Yulius.getName());
        Human.compareVisions(Yulius.getName(), true, false);
        try{
            Human.standOnTheirVision(Yulius, bock);
        } catch (Human.CannotResistException e){
            System.out.println(e.getMessage());
        }
        Human.angry(bock.getName(), "сказочные существа мешали ей пить кофе с дядей Юлиусом");
        Human.wentTo(bock.getName(), location1, Yulius.getName());
        Human.stand(new String[]{boy.getName(), Carlson.getName()}, "закрытой дверью");
        Human.think(boy.getName(), "И смотреть в глазок было не очень-то весело");
        Human.compareVisions(Carlson.getName(), true, true);
    }
}