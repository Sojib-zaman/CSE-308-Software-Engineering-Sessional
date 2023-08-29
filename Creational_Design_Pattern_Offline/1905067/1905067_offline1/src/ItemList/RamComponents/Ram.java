package ItemList.RamComponents;

import ItemList.PC_components;

public abstract class Ram implements PC_components {
    String type = "Added Component" ;
    public String getType()
    {
        return type;
    }
}
