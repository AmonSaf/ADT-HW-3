package i;

public class MainISP {
    public static void main(String[] args) {
        IPrinter basicPrinter = new BasicPrinter();
        basicPrinter.print("Документ 1");

        AllInOnePrinter allInOne = new AllInOnePrinter();
        allInOne.print("Документ 2");
        allInOne.scan("Документ 2");
        allInOne.fax("Документ 2");
    }
}
