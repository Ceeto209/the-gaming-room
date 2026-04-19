package com.gamingroom;

/**
 * A base class for all entities in the game application.
 * Holds the common attributes id and name.
 */
public class Entity {
    protected long id;
    protected String name;

    /**
     * Constructor for Entity.
     *
     * @param id   unique identifier
     * @param name unique name
     */
    public Entity(long id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Returns the entity id.
     *
     * @return id
     */
    public long getId() {
        return id;
    }

    /**
     * Returns the entity name.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns a string representation of the entity.
     *
     * @return formatted entity string
     */
    @Override
    public String toString() {
        return "Entity [id=" + id + ", name=" + name + "]";
    }
}