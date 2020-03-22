package com.demo;

import java.util.Collection;

public interface StormtrooperDao {

    Stormtrooper getStormtrooper(String id);

    Stormtrooper addStormtrooper(Stormtrooper stormtrooper);

    Stormtrooper updateStormtrooper(String id, Stormtrooper stormtrooper);

    boolean deleteStormtrooper(String id);

    Collection<Stormtrooper> listStormtroopers();
}
