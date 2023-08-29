package jdp2e.bridge.demo;

public class DVD extends ElectronicGoods
{
    /*public DVD(State state)
    {
    super(state);
    }*/
/* Notice that following DVD specific method is coded with superclass
methods but not with the implementor (State) method.So, this approach
will allow to vary the abstraction and implementation independently.
*/
    public void doublePress() {
        hardButtonPressed();
        hardButtonPressed();
    }
}
