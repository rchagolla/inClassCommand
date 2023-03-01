/*
 * @author: Rolando Chagolla-Bonilla
 * @since: 1 March 2023
 * Description: A derived class representing a command object.
 * In this case it raises the power of a person.
 */
public class PowerStone implements IStone {
    private Double powerMultiplier = 1.5;

    private static PowerStone powerStone = null;

    private PowerStone() {

    }

    public static PowerStone getInstance() {
        if (powerStone == null) {
            powerStone = new PowerStone();
        }
        return powerStone;
    }

    @Override
    public void special(Person person) {
        Double temp = person.getPower();
        System.out.println(person.getName() + "'s power == " + person.getPower());
        temp *= powerMultiplier;
        person.setPower(temp);
        System.out.println(person.getName() + "'s power is now == " + person.getPower());
    }
}
