class Main {
  public static void main(String[] args) {

      CreditCard card = new CreditCard();
    
    card.setName("Frank Bullitt");
    card.setCreditCardNumber("3242542123112744");
    card.setExpirationDate("01/25");
    card.setCvv("633");

    System.out.println(card.getName());
    System.out.println("Your card details: ");
    System.out.println("Cardholder Name: " + card.getName());
    System.out.println("Card Number: " + card.getCreditCardNumber());
    System.out.println("Expiration Date: " + card.getExpirationDate());
    System.out.println("CVV: " + card.getCvv());
  }
}