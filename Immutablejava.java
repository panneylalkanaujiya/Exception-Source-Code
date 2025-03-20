import java.util.ArrayList;
import java.util.List;

final class ImmutableClass {
    private final String name;
    private final int id;
    private final List<String> address;

    // Constructor to initialize the fields
    public ImmutableClass(String name, int id, List<String> address) {
        this.name = name;
        this.id = id;

        // Create a new list to ensure immutability
        this.address = new ArrayList<>(address);
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // Return a copy of the list to prevent external modifications
    public List<String> getAddress() {
        return new ArrayList<>(address);
    }

    // No setters or methods to modify the state

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address=" + address +
                '}';
    }
}