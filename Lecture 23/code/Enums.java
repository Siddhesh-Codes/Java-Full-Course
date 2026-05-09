public class Enums {
    public static void main(String[] args) {
        // int status = PaymentStatus2.SUCCESS;

        // PaymentStatus status = PaymentStatus.FAILED;
        PaymentStatus status = PaymentStatus.FAILED;

        System.out.println(status.name());
    }
}

enum PaymentStatus {
    SUCCESS,
    FAILED,
    PENDING;
}

class PaymentStatus2 {
    public static final int SUCCESS = 1;
    public static final int FAILED = 2;
    public static final int PENDING = 3;
}

// Enum --> Enumerations ( Enumerated type)
// Enum --> Predefined set of constants.
// Enum: A fixed set of predefined constants.

// Advantages of Enum:
// 1. Type-safe
// 2. Readable
// 3. Groups related constants
