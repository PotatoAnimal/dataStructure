package rmnk.vld.BONUS.keyWordRecord;

public record Cat (int id, String name, double weigh)
    implements Animals{
    @Override
    public void voice() {
        System.out.println("Cat says meow, my name is: " + name);
    }
    @Override
    public void info() {
        System.out.println("INFO\nMy name: " + name + "\nID: " + id + "\nWeigh: " + weigh);
    }
}
