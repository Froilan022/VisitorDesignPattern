public class Telco implements TelcoSubscription{
    private String telcoName;
    private double promoPrice;
    private int dataAllowance;
    private boolean unliCallText;

    public Telco(int dataAllowance, double price, String telcoName, boolean unliCallText){
        this.promoPrice = price;
        this.dataAllowance = dataAllowance;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    @Override
    public String accept(UsagePromo usagePromo, double price){
        this.promoPrice = price;
        return usagePromo.showAllowance(telcoName, promoPrice);
    }

    @Override
    public String accept(UnliCallsTextOffer unliCallsTextOffer, boolean unliCallText){
        this.unliCallText = unliCallText;
        return unliCallsTextOffer.showUnliCallsTextOffer(telcoName, unliCallText);
    }

    public void setTelcoName(String telcoName){
        this.telcoName = telcoName;
    }

    public void setPromoPrice(double promoPrice){
        this.promoPrice = promoPrice;
    }

    public void setDataAllowance(int dataAllowance){
        this.dataAllowance = dataAllowance;
    }

    public void setUnliCallText(boolean unliCallText){
        this.unliCallText= unliCallText;
    }

    @Override
    public String getTelcoName(){
        return telcoName;
    }

    @Override
    public double getPromoPrice(){
        return promoPrice;
    }

    public int getDataAllowance(){
        return dataAllowance;
    }

    @Override
    public boolean getUnliCallText(){
        return unliCallText;
    }
}