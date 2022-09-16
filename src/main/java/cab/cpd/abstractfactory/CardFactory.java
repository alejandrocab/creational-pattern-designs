package cab.cpd.abstractfactory;

public abstract class CardFactory {

  public static CardFactory getCardFactory(final BrandCard type) {
    switch (type) {
      case MASTERCARD:
        return new MasterCardFactory();
      case VISA:
        return new VisaCardFactory();
      default:
        return null;
    }
  }

  public abstract Card createCard(final TypeCard typeCard);
}
