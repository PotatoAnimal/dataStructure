package rmnk.vld.BONUS.keyWordRecord;

public final class Person extends Anime {
    public Person() {
    }

    @Override
    public boolean equals(Object obj) {
        return obj == this || obj != null && obj.getClass() == this.getClass();
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "Person[]";
    }

}
