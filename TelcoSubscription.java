public interface TelcoSubscription{
    public String accept(UsagePromo usagePromo, double price);
    public String accept(UnliCallsTextOffer unliCallsTextOffer, boolean unliCallText);
    public String getTelcoName();
    public double getPromoPrice();
    public boolean getUnliCallText();
}