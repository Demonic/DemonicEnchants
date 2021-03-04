package net.Demonly.util;

public class Probability {

    public static boolean chance(double chance)
    {
        if (Math.random() <= chance) {
            return true;
        }
        return false;
    }
}
