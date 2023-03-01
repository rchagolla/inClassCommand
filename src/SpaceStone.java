/*
 * @author: Rolando Chagolla-Bonilla
 * @since: 1 March 2023
 * Description: A derived class representing a command object.
 * In this case it changes the location of a person.
 */
public class SpaceStone implements IStone {
    private String spaceStoneLocation = "Space";

    private static SpaceStone spaceStone = null;

    private SpaceStone() {

    }

    public static SpaceStone getInstance() {
        if (spaceStone == null) {
            spaceStone = new SpaceStone();
        }
        return spaceStone;
    }

    public void setLocation(String location) {
        this.spaceStoneLocation = location;
    }

    public String getLocation() {
        return spaceStoneLocation;
    }

    @Override
    public void special(Person person) {
        System.out.println(person.getName() + " is at " + person.getLocation());
        System.out.println("BAMPH!");
        person.setLocation(spaceStoneLocation);
        System.out.println(person.getName() + " is now at " + person.getLocation());
    }
}
