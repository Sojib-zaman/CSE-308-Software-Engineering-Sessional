package ItemList.Cooler;

import ItemList.PC_components;

public abstract class Cooler implements PC_components {
    String type = "Base Component" ;
    public String getType()
    {
        return type;
    }
}
