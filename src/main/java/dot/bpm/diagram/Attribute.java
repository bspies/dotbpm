package dot.bpm.diagram;

public class Attribute<V> {

    private Class<V> type;
    private String name;
    private V value;

    public Attribute(Class<V> type, String name, V value) {
        this.type = type;
        this.name = name;
        this.value = value;
    }

    public Class<V> getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public V getValue() {
        return value;
    }
}
