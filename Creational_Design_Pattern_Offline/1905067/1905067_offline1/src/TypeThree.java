import ItemList.MainComponents.CPU;
import ItemList.MainComponents.Drive;
import ItemList.MainComponents.HDD;
import ItemList.MainComponents.Motherboard;
import ItemList.Processor.Intel_Core_I7;
import ItemList.Processor.Intel_Core_I9;
import ItemList.RamComponents.M2666;
import ItemList.RamComponents.M3200;
import ItemList.GraphicsCard.GC2gb;
import ItemList.GraphicsCard.GC4gb;
import java.util.LinkedList;

public class TypeThree implements PC_Builder{
    private PC_Product object = new PC_Product();

    @Override
    public void setProcessor() {
        object.addComponent(new Intel_Core_I9());
    }

    @Override
    public void setBasePrice() {
        object.addPrice(70000);
    }

    @Override
    public void setCPU() {
        object.addComponent(new CPU());

    }

    @Override
    public void setMotherboard() {
        object.addComponent(new Motherboard());
    }

    @Override
    public void setHDD() {
        object.addComponent(new HDD());
    }

    @Override
    public void setCooler() {

    }
    @Override
    public void setDrive()
    {
        object.addComponent(new Drive());
    }


    @Override
    public void setRam(LinkedList<String> ram) {
        for(int i=0 ; i<ram.size() ; i++)
        {
            if(ram.get(i) .equalsIgnoreCase("8 GB DDR4 RAM - 2666 MHz")) object.addComponent(new M2666());
            else if(ram.get(i).equalsIgnoreCase("8 GB DDR4 RAM - 3200 MHz"))object.addComponent(new M3200());
        }
    }

    @Override
    public void setGraphicsCard(LinkedList<String> graphicsCard) {
        for(int i=0 ; i<graphicsCard.size() ; i++)
        {
            if(graphicsCard.get(i) .equalsIgnoreCase("2GB")) object.addComponent(new GC2gb());
            else if(graphicsCard.get(i).equalsIgnoreCase("4GB"))object.addComponent(new GC4gb());
        }
    }
    @Override
    public PC_Product getfinalproduct() {
        return object;
    }
}
