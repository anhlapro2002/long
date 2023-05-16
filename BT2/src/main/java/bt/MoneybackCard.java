package bt;

public class MoneybackCard implements creditcard
{
    @Override
    public String GetCardType() {
        return "MoneyBack";
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
