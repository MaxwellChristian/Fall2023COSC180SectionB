package lo_inheritance.monsters;

public class UnDead extends  Monster
{
    public boolean bCanFly;

    public UnDead(String sName, int nScare, int nSpeed, boolean bCanFly)
    {
        super(sName,nSpeed,nScare);
        this.bCanFly = bCanFly;
    }


    @Override
    public boolean isDeadly()
    {
        return true;
    }

    @Override
    public String consumes()
    {
        return "Blood";

    }


    @Override
    public String toString()
    {
        return String.format("UnDead: %s Can Fly %b", super.toString(), bCanFly);
    }

}
