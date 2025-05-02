import java.io.*;

// Step 1: Create the Serializable Person class
class Person implements Serializable {
    private static final long serialVersionUID = 1L; // Recommended for Serializable
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person info
    public void display() {
        System.out.println("👤 Name: " + name);
        System.out.println("🎂 Age: " + age);
    }
}

// Step 2: Main class to serialize and deserialize
public class PersonSerializationDemo {
    public static void main(String[] args) {
        // Creating a Person object
        Person person = new Person("Aarav", 22);

        // Serialization
        try {
            FileOutputStream fos = new FileOutputStream("person.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person);
            oos.close();
            fos.close();

            System.out.println("✅ Person object serialized to person.txt");
        } catch (IOException e) {
            System.out.println("❌ Error during serialization: " + e.getMessage());
        }

        // Deserialization
        try {
            FileInputStream fis = new FileInputStream("person.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person deserializedPerson = (Person) ois.readObject();
            ois.close();
            fis.close();

            System.out.println("\n📦 Deserialized Person object:");
            deserializedPerson.display();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("❌ Error during deserialization: " + e.getMessage());
        }
    }
}
