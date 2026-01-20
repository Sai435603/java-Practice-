// Child class must be replaceable for parent class without breaking behavior

// interface Bird {}

// interface FlyingBird extends Bird {
//     void fly();
// }

// class Sparrow implements FlyingBird {
//     public void fly() {
//         System.out.println("Flying");
//     }
// }

// class Ostrich implements Bird {
//     // no fly method
// }


// Ostrich is not truly a Bird here

// Breaks parent behavior


interface Bird {}

interface FlyingBird extends Bird {
    void fly();
}

class Sparrow implements FlyingBird {
    public void fly() {
        System.out.println("Flying");
    }
}

class Ostrich implements Bird {
    // no fly method
}
