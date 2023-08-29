package ItemList.Processor;

import ItemList.PC_components;

public abstract class Processor implements PC_components {
    String type = "Base Component" ;
    public String getType()
    {
        return type;
    }

}
