// What is Aggregation?

// Aggregation is HAS-A + independence

// Think in real life

// University has Departments


class Department {} //[ part of ]

class University {
    Department dept; // aggregation
}
// Step-by-step

// Department exists separately

// University only references it

// University does NOT own it