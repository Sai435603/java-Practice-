// High-level modules should not depend on low-level modules.
// Both should depend on abstractions.

// class MySQLDatabase {
//     void save() {}
// }

// class UserService {
//     MySQLDatabase db = new MySQLDatabase();

//     void saveUser() {
//         db.save();
//     }
// }

interface Database {
    void save();
}

class MySQLDatabase implements Database {
    public void save() {}
}

class MongoDatabase implements Database {
    public void save() {}
}

class UserService {
    Database db;

    UserService(Database db) {
        this.db = db;
    }

    void saveUser() {
        db.save();
    }
}
