package org.riwi.Spring_Workshop_Week_3.service.CRUD;

public interface Disable <Entity, ID>{
    public Entity update(ID id, Entity entity);
}
