package bt;

public class TitanniumCard implements creditcard {
    @Override
    public String GetCardType() {
        return "Titanium";
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


