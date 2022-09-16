package cab.cpd.abstractfactory;

public class MasterCardFactory extends CardFactory{

  @Override
  public Card createCard(TypeCard typeCard) {
    switch (typeCard) {
      case CREDIT:
        return new MasterCardCreditCard();
      case DEBIT:
        return new MasterCardDebitCard();
      default:
        return null;
    }
  }
}
