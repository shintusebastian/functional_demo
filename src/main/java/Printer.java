@FunctionalInterface
public interface Printer {// it is preferred to mark this interface as functional interface to avoid future addition of
    //extra abstract methods. It is not compulsory. But, it is a hint to future people accessing this interface.
    void print();
    /*interface without any abstract method are called marker interface. Such as
    * Cloneable, serializable are marker interfaces. */
}
