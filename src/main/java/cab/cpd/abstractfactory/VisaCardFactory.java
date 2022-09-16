package cab.cpd.abstractfactory;

public class VisaCardFactory extends CardFactory{

  @Override
  public Card createCard(TypeCard typeCard) {
    switch (typeCard) {
      case CREDIT:
        return new VisaCreditCard();
      case DEBIT:
        return new VisaDebitCard();
      default:
        return null;
    }
  }
}
