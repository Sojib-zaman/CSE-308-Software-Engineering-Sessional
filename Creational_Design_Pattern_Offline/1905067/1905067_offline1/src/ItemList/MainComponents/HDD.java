package ItemList.MainComponents;

import ItemList.PC_components;

public class HDD implements PC_components {
    @Override
    public String getname() {
        return "HDD";
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
