package ua.org.oa.mrsuperdan;

public class Main {

    public static void main(String[] args) {

        Buyer buyer1 = new Buyer("apple", 30, 3.5, 'L', 1250);
        buyer1.buySomeFood();
        buyer1.checkAbleToBringFood();
        buyer1.checkPackageSize();
        buyer1.toString();

        System.out.println("----------------");

        Buyer buyer2 = new Buyer("carrot", 15, 3, 'M', 2000);
        buyer2.buySomeFood();
        buyer2.checkAbleToBringFood();
        buyer2.checkPackageSize();
        buyer2.toString();

    }

}
