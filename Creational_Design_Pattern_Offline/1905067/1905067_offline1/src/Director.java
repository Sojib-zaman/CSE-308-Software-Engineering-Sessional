import java.util.LinkedList;

public class Director {
    PC_Builder builder ;
    LinkedList<String>RamChoice = new LinkedList<String>() ;
    LinkedList<String>GraphicsCardChoice = new LinkedList<String>() ;


    public void setGC(LinkedList<String>Graphics)
    {
        GraphicsCardChoice = Graphics ;

    }
    public void setRam(LinkedList<String>Ram)
    {
        RamChoice = Ram ;

    }

    public void Construct (PC_Builder x)
    {
        builder = x;
        builder.setBasePrice(); //same for all




        builder.setProcessor(); //Primary Distinctive Element

        //basic computer
        builder.setCPU();
        builder.setHDD();
        builder.setMotherboard();

        //pc type dependent
        builder.setCooler();
        builder.setDrive();

        //user dependent
        builder.setGraphicsCard(GraphicsCardChoice);
        builder.setRam(RamChoice);


    }
}
