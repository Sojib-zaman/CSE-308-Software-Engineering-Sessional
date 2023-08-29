package ItemList.Processor;

import ItemList.Processor.Processor;

public class Ryzen extends Processor {
    @Override
    public String getname() {
        return "AMD Ryzen 7 5700X"  ;
    }

    @Override
    public int getprice() {
        return 28000;
    }
}
