
public class Main {
    public static void main(String[] args) {
        long initialAccount = 100;
        int replenishmentAmount = 1100;
        int bonus;
        if (replenishmentAmount > 1000){
            bonus = replenishmentAmount / 100 * 1;
        }
        else {
            bonus = 0;
        }
        long total = initialAccount + replenishmentAmount +bonus;
        System.out.println(total);

    }
}
