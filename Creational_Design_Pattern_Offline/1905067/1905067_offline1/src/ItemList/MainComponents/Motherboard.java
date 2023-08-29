package ItemList.MainComponents;

import ItemList.PC_components;

public class Motherboard implements PC_components {
    @Override
    public String getname() {
        return "Motherboard";
    }

    @Override
    public int getprice() {
        return 0;
    }
    String type = "Base Component" ;
    public String getType()
    {
        return type;
    }
}
