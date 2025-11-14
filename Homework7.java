public class Homework7 {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T730DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while (inkjet.print());
        while (laser.print());
    }
}
abstract class Printer{
    protected String model;
    protected int printedCount, availableCount;
    public Printer(String model, int availableCount){
        this.model = model;
        this.availableCount = availableCount;
    }
    public abstract boolean print();
}
class InkjetPrinter extends Printer{
    public InkjetPrinter(String model, int availableCount){super(model, availableCount);}
    @Override
    public boolean print(){
        if(availableCount == 0){
            System.out.printf("모델명 %s매째 인쇄 실패 - 잉크 부족.\n", printedCount+1);
            return false;
        }
        else{
            printedCount+=1;
            availableCount-=1;
            return true;
        }
    }
}
class LaserPrinter extends Printer{
    public LaserPrinter(String model, int availableCount){super(model, availableCount);}
    @Override
    public boolean print(){
        if(availableCount == 0){
            System.out.printf("모델명 %s매째 인쇄 실패 - 토너 부족.\n", printedCount+1);
            return false;
        }
        else{
            printedCount+=1;
            availableCount-=1;
            return true;
        }
    }
}