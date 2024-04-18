import java.util.*;
public class TelcoAllowance implements UsagePromo{
    private static Map<String, Integer> usagePromoMap = new HashMap<>();

    static{
        usagePromoMap.put("Smart", 15);
        usagePromoMap.put("Globe", 10);
        usagePromoMap.put("Ditto", 8);
    }

    @Override
    public String showAllowance(String telcoName, double price){
        return usagePromoMap.get(telcoName) + " GB" + " for " + "₱"+ price + " per month";
    }
}
