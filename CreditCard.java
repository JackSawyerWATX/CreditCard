public class CreditCard{

  private String name;
  private String creditCardNumber;
  private String expirationDate;
  private String cvv;

  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }
    public void setCreditCardNumber(String creditCardNumber){
    this.creditCardNumber = creditCardNumber;
  }
    public String getCreditCardNumber(){
    return creditCardNumber;
  }
      public void setExpirationDate(String expirationDate){
    this.expirationDate = expirationDate;
  }
    public String getExpirationDate(){
    return expirationDate;
  }
      public void setCvv(String cvv){
    this.cvv = cvv;
  }
    public String getCvv(){
    return cvv;
  }
}