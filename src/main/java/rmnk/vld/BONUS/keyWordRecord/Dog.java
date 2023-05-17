package rmnk.vld.BONUS.keyWordRecord;

public record Dog(int id, String name, double weigh)
        implements Animals{
    @Override
    public void voice() {
        System.out.println("Dog says BARK-BARK, my name is: " + name);
    }
    @Override
    public void info() {
        System.out.println("INFO\nMy name: " + name + "\nID: " + id + "\nWeigh: " + weigh());
    }
}
