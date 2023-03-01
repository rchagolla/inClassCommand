import java.util.HashMap;
public class InfinityWar {
    public static void main(String[] args){
        Titan thanos = new Titan();
        HashMap<String, IStone> stones = new HashMap<>();
        PowerStone powerStone = PowerStone.getInstance();
        powerStone.special(thanos);
        SpaceStone spaceStone = SpaceStone.getInstance();
        SpaceStone spaceStone2 = SpaceStone.getInstance();

        spaceStone.setLocation("Knowwhere");
        System.out.println(spaceStone2.getLocation());

//        stones.put("Space", spaceStone);
//        stones.put("Power",powerStone );
//        for(String stone : stones.keySet()){
//            System.out.println("Activating "+stone);
//            stones.get(stone).special(thanos);
//        }
        thanos.addStone(spaceStone);
        thanos.addStone(powerStone);

        thanos.activateGauntlet();
    }
}
