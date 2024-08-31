package org.riwi.Spring_Workshop_Week_3.service.CRUD;

public interface ReadByID<Entity, ID> {
    public Entity readById(ID id);
}
