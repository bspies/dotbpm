package dot.bpm.diagram.builder;

import dot.bpm.diagram.Lane;
import dot.bpm.diagram.Pool;

import java.util.*;

public class PoolBuilder implements Builder<Pool> {

    private final String id;
    private String name;
    private boolean isMain = false;
    private final Deque<Lane> lanes;

    public PoolBuilder(String id) {
        this.id = id;
        lanes = new ArrayDeque<>();
    }

    public String getId() {
        return id;
    }

    public PoolBuilder withLane(Lane lane) {
        lanes.add(lane);
        return this;
    }

    public Optional<Lane> getLastLane() {
        return lanes.isEmpty() ? Optional.empty() : Optional.of(lanes.getLast());
    }

    public PoolBuilder withMain(boolean isMain) {
        this.isMain = isMain;
        return this;
    }

    public PoolBuilder withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Pool build() {
        return new Pool(id, name, lanes, isMain);
    }
}
