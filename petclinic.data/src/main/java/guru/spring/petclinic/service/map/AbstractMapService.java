package guru.spring.petclinic.service.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {
    private Map<ID, T> abstractMap = new HashMap<ID, T>();

    Set<T> findAll() {
        return  (HashSet<T>)abstractMap.values();
    }

    T findByID(ID id) {
        return abstractMap.get(id);
    }

    T save(ID id, T t) {
        abstractMap.put(id, t);
        return t;
    }

    void deleteById(ID id) {
        abstractMap.remove(id);
    }

    void deleteByObject(T t) {
        abstractMap.entrySet().removeIf(entry -> entry.getValue().equals(t));
    }

}
