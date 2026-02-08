package i;

public class AllInOnePrinter implements IPrinter, IScanner, IFax {
    public void print(String content) { System.out.println("Печать: " + content); }
    public void scan(String content) { System.out.println("Сканирование: " + content); }
    public void fax(String content) { System.out.println("Факс: " + content); }
}
