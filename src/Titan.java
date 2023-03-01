import java.util.HashMap;

public class Titan extends Person {
    private HashMap<String, IStone> iGuantlet = new HashMap<>();

    public Titan() {
        super(500.0, "Thanos", "Titan");
    }

    public void activateGauntlet() {
        for (String stone : iGuantlet.keySet()) {
            System.out.println("Activating " + stone);
            iGuantlet.get(stone).special(this);
        }
    }

    public void addStone(IStone stone) {
        if (stone instanceof SpaceStone) {
            iGuantlet.put("space", stone);
        }

        if (stone instanceof PowerStone) {
            iGuantlet.put("power", stone);
        }
    }
}
