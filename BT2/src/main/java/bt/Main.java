package bt;



public class Main {
    public static void main(String[] args) {
        creditcard card1 = new PlatiumCard();
        creditcard card2 = new MoneybackCard();
        creditcard card3 = new TitanniumCard();

        System.out.println("Card 1: " + card1.GetCardType());
        System.out.println("Credit Limit: " + card1.GetCreditLimit());
        System.out.println("Annual Charge: " + card1.GetAnnualCharge());

        System.out.println("Card 2: " + card2.GetCardType());
        System.out.println("Credit Limit: " + card2.GetCreditLimit());
        System.out.println("Annual Charge: " + card2.GetAnnualCharge());

        System.out.println("Card 3: " + card3.GetCardType());
        System.out.println("Credit Limit: " + card3.GetCreditLimit());
        System.out.println("Annual Charge: " + card3.GetAnnualCharge());
    }
}

