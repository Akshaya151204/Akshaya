package src;

public class Shop extends Dealer{
    protected int boostMrp = 100;
    protected int boostSellingPrice = 98;
    public void printBoostMRP(){
        System.out.println("BoostMRP using this Shop BoostMRP"+this.boostMrp);
        System.out.println("BoostMRP using Shop BoostMRP:"+super.boostMrp);
    }
}
