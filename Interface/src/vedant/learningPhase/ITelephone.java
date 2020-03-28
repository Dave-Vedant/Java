package vedant.learningPhase;

// interface is one kind of commitment or contract that whatever method,and parameter it has never changed in other class usage
public interface ITelephone {
    // in interface all methods called as one class so no meaning of public or private
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
