package ItemList.MainComponents;

import ItemList.PC_components;

public class CPU implements PC_components {
    @Override
    public String getname() {
        return "CPU";
    }

    @Override
    public int getprice() {
        return 0;
    }
    String type = "Added Component" ;
    public String getType()
    {
        return type;
    }
}
