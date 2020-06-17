package dot.bpm.core;

/**
 * An key-value attribute.
 * @param <V> The attribute type
 *
 * @author Brennan Spies
 */
public final class Attribute<V> {

    private final QualifiedName qualifiedName;
    private final V value;

    public Attribute(QualifiedName qualifiedName, V value) {
        this.qualifiedName = qualifiedName;
        this.value = value;
    }

    public QualifiedName getQualifiedName() {
        return qualifiedName;
    }

    public V getValue() {
        return value;
    }
}
