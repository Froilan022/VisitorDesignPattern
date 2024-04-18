import java.util.*;
public class UnliCallTextPackage implements UnliCallsTextOffer{
    private static Map<String, Boolean> offerMap = new HashMap<>();

    static{
        offerMap.put("Smart", false);
        offerMap.put("Globe", true);
        offerMap.put("Ditto", true);
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText){
        boolean offer = offerMap.get(telcoName);

        if (offer == true && telcoName == "Globe"){
            return "This plan comes with unlimited calls and texts to subscribers within the network. Calls and texts to other networks are charged extra.";
        }

        else if (offer == true && telcoName == "Ditto"){
            return "This plan includes unlimited calls and texts to all networks within the country.";
        }

        else{
            return "There are no any free calls or texts offers. You will be charged per use.";
        }
    }
}
