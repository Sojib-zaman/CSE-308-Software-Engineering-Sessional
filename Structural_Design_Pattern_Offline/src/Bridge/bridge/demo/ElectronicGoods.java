package jdp2e.bridge.demo;

public abstract class ElectronicGoods {
    //Composition - implementor
    protected State state;
/*Alternative approach:
    We can also pass an implementor (as input argument) inside a
constructor.
*/
/*public ElectronicGoods(State state)
{
this.state = state;
}*/
    public State getState()
    {
        return state;
    }
    public void setState(State state)
    {
        this.state = state;
    }
    /*Implementation specific:
    We are delegating the implementation to the Implementor object.
    */
    public void moveToCurrentState()
    {
        System.out.print("The electronic item is functioning at : ");
        state.moveState();
    }
    public void hardButtonPressed()
    {
        state.hardPressed();
    }
}
