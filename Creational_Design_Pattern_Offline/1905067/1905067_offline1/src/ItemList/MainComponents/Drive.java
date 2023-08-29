package ItemList.MainComponents;

import ItemList.PC_components;

public class Drive implements PC_components {
    @Override
    public String getname() {
        return "DVD drive";
    }

    @Override
    public int getprice() {
        return 6000;
    }
    String type = "Added Component" ;
    public String getType()
    {
        return type;
    }
}
