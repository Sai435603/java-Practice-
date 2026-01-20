// Association (Very Loose Connection)
// What does Association mean?

// Two classes know each other, but no ownership

class Teacher {  // [ jz Connected ]
    String name;
}

class Student {
    Teacher teacher; // association
}


// What does Association mean?

// Two classes are related, but:

// No ownership

// No lifecycle control

// Just “knows about”

// Real-life example

// Teacher ↔ Student

// Student has a teacher

// Teacher has many students

// Both can live without each other

// If student leaves school → teacher still exists
// If teacher resigns → student still exists