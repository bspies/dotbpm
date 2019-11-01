package dot.bpm.diagram;

import java.util.Collection;
import java.util.HashSet;

/**
 * Describes an organization participating in the workflow.
 */
public class Pool {

    private boolean main = false;
    private String name;
    private Collection<Lane> lanes;

    public Pool(String name) {
        this.name = name;
        this.lanes = new HashSet<>();
    }

    public Pool(String name, boolean isMain) {
        this(name);
        setMain(isMain);
    }

    /**
     * Returns true if this is the main pool in the process.
     * @return True if this is main pool
     */
    public boolean isMain() {
        return main;
    }

    /**
     * Sets the main flag to indicate whether or not
     * this pool is the main one.
     * @param isMainPool True if this pool is main
     */
    public void setMain(boolean isMainPool) {
        this.main = isMainPool;
    }

    /**
     * The name of this pool.
     * @return The pool name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the lanes contained by this pool (must be at least one).
     * @return The swim lanes
     */
    public Collection<Lane> getLanes() {
        return lanes;
    }

    /**
     * Adds a lane to this pool.
     * @param lane The lane to add
     * @return True if lane added
     */
    public boolean addLane(Lane lane) {
        return lanes.add(lane);
    }
}
