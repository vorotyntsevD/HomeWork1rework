package ua.org.oa.mrsuperdan;

// Покупатель
public class Buyer {

    private String product;             // покупаемый продукт
    private int money;                  // денег у покупателя
    private double purchaseWeight;      // вес покупки, кг
    private char packageSize;           // размер пакета для покупок S, M or L
    private int distanceToHome;         // расстояние до дома в метрах
    private double maxLiftingWeight;    // маскимальный переносимый вес, КГ
    private final int appleCost = 10;   // стоимость яблок за КГ
    private final int carrotCost = 15;  // стоимость морковки за КГ

    public Buyer(String product, int money, double maxLiftingWeight, char packageSize, int distanceToHome) {
        this.product = product;
        this.money = money;
        this.maxLiftingWeight = maxLiftingWeight;
        this.packageSize = packageSize;
        this.distanceToHome = distanceToHome;
    }

    // Покупаю еду
    public void buySomeFood() {
        if (money <= 0) {
            System.out.println("У меня слишком мало денег");
        } else {
            if (product == "apple") {
                purchaseWeight = money / appleCost;
                System.out.println("Вы купили " + purchaseWeight + " кг яблок");
            } else if (product == "carrot") {
                purchaseWeight = money / carrotCost;
                System.out.println("Вы купили " + purchaseWeight + " кг морковки");
            } else {
                System.out.println("В магазине нет этого продукта");
            }

        }

    }

    // Проверяю смогу ли донести еду домой сам
    public void checkAbleToBringFood() {
        if (purchaseWeight > maxLiftingWeight || distanceToHome > 1500) {
            System.out.println("Сам я это не донесу. Надо позвать кого-то на помощь");
        } else {
            System.out.println("Я смогу это донести");
        }
    }

    // Проверяю подходит ли пакет для этого количества еды
    public void checkPackageSize() {
        if (packageSize == 'S' || packageSize == 'M' || packageSize == 'L') {
            if ((purchaseWeight < 1 && packageSize != 'S')) {
                System.out.println("Надо купить другой пакет");
            } else if (((purchaseWeight >= 1 || purchaseWeight < 3)) && packageSize != 'M') {
                System.out.println("Надо купить другой пакет");
            } else if ((purchaseWeight >= 3) && packageSize != 'L') {
                System.out.println("Надо купить другой пакет");
            } else {
                System.out.println("У меня подходящий пакет");
            }
        } else {
            System.out.println("UNKNOWN PACKAGE SIZE. Correct it, please");
        }
    }
    

    @Override
    public String toString() {
        return "Buyer{" +
                "product='" + product + '\'' +
                ", money=" + money +
                ", packageSize=" + packageSize +
                ", distanceToHome=" + distanceToHome +
                ", maxLiftingWeight=" + maxLiftingWeight +
                '}';
    }
}
