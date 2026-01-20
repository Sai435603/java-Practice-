// No client should be forced to implement methods it doesn’t use
// interface Worker {
//     void work();
//     void eat();
// }

// class Robot implements Worker {
//     public void work() {}
//     public void eat() {} // ❌ robot doesn’t eat
// }


interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Human implements Workable, Eatable {
    public void work() {}
    public void eat() {}
}

class Robot implements Workable {
    public void work() {}
}
