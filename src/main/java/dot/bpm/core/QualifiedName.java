package dot.bpm.core;

import java.util.Objects;

public final class QualifiedName {

    private final String namespace, name;

    public QualifiedName(String namespace, String name) {
        this.namespace = namespace;
        this.name = name;
    }

    public QualifiedName(String name) {
        this(Namespaces.defaultNamespace, name);
    }

    public String getNamespace() {
        return namespace;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QualifiedName that = (QualifiedName) o;
        return namespace.equals(that.namespace) &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, name);
    }
}
