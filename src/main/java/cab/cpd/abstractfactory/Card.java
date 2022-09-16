package cab.cpd.abstractfactory;

public abstract class Card {

  private String numberCard;
  private String csc;

  public String getNumberCard() {
    return numberCard;
  }

  public void setNumberCard(String numberCard) {
    this.numberCard = numberCard;
  }

  public String getCsc() {
    return csc;
  }

  public void setCsc(String csc) {
    this.csc = csc;
  }
}
