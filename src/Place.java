public class Place extends AbstractPlace {
//    private final List<Skills> skills = new ArrayList<>();

    private Places type;

    public Place(String name){
        this.placeName = name;
        System.out.println("Место - " + name  + " успешно создано!");
    }

    public void setType(Places type){
        this.type = type;
        typeName = "";
        switch (type){
            case RoundTable: typeName = "Круглый стол";
                break;
            case LivingRoom: typeName = "Гостиная";
                break;
            case Hallway : typeName = "Прихожая";
                break;
        }
        System.out.println(placeName +" объявлена как " + typeName);
    }

    public String getPlace() {
        return placeName == null ? "..." : placeName;
    }
}