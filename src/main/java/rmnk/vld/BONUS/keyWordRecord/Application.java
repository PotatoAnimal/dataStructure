package rmnk.vld.BONUS.keyWordRecord;

public class Application {
    public static void main(String[] args) {
        // U can create a record classes N implement interfaces to it
        // But u can`t extend nothing inside them
        // records useful to know
        Cat cat = new Cat(1, "Buy", 3);
        cat.voice();
        cat.info();
        Dog dog = new Dog(1, "Buy", 3);
        dog.voice();
        dog.info();
            double d = dog.weigh();
            double c = cat.weigh();
            if (c == d){
                System.out.println("c==d");         //true
            }
            String dd = dog.name();
            String cc = cat.name();
        boolean equals = dd.equals(cc);             //true
        System.out.println(equals);
            if (cc.hashCode() == dd.hashCode()){
                System.out.println("true");         //true
            }
        System.out.println(cc.equals(dd));          //true
        System.out.println(cat.equals(dog));        //false
    }
}
