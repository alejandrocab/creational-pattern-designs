package cab.cpd.abstractfactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CardFactoryTest {

  @Test
  void when_getCardMasterCardFactoryTypeOfCredit_then_returnMasterCard() {
    CardFactory factory = CardFactory.getCardFactory(BrandCard.MASTERCARD);
    Card card = factory.createCard(TypeCard.CREDIT);
    Assertions.assertTrue(factory instanceof MasterCardFactory);
    Assertions.assertTrue(card instanceof MasterCardCreditCard);
  }

  @Test
  void when_getCardVisaFactoryTypeOfDebit_then_returnVisaCard() {
    CardFactory factory = CardFactory.getCardFactory(BrandCard.VISA);
    Card card = factory.createCard(TypeCard.DEBIT);
    Assertions.assertTrue(factory instanceof VisaCardFactory);
    Assertions.assertTrue(card instanceof VisaDebitCard);
  }
}
