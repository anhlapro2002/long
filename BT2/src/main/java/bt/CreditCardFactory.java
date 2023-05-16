package bt;

public class CreditCardFactory {
    public static creditcard createCreditCard(String cardType) {
        switch (cardType.toLowerCase()) {
            case "MoneyBack":
                return new MoneybackCard();
            case "Platinum":
                return new PlatiumCard();
            case "Titanium":
                return new TitanniumCard();
            // Thêm các loại thẻ khác vào đây nếu cần
            default:
                throw new IllegalArgumentException("Invalid card type: " + cardType);
        }
    }
}
