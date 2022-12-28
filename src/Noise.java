public class Noise {
    public String createTooMuchNoise(String name){
        return "";
    }

    public static void createNoise(String name){
        System.out.println("Раздался " + name);
    }

    public static void createUnexpectedNoise(String name){
        System.out.println("Вдруг раздался " + name);
    }

    public static void createGoodEvent(String name){
        Noise malish = new Noise(){
            @Override
            public String createTooMuchNoise(String name){
                return "И Малыш так " + name + " , что чуть все не испортил. ";
            }
        };
        System.out.println("И дела пошли на лад. " + malish.createTooMuchNoise(name));
    }
}
