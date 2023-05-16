package bt;

public class PlatiumCard implements creditcard
{
    @Override
    public String GetCardType() {
        return "Platinum";
    }

    @Override
    public int GetCreditLimit() {
        return 10000;
    }

    @Override
    public int GetAnnualCharge() {
        return 100;
    }
}
