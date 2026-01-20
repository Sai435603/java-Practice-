// Dependency (Uses-A)
// What is Dependency?

// A class uses another class temporarily

// Think in real life

// You use a Pen to write

class Printer {
    void print() {}
}

class Computer {
    void start(Printer p) { // dependency
        p.print();
    }
}

// Step-by-step

// Computer does NOT store Printer

// Printer is used only inside method

// After method ends, relation ends