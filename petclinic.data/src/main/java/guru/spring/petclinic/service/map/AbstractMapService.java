package guru.spring.petclinic.service.map;

import guru.spring.petclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {
    private Map<Long, T> abstractMap = new HashMap<Long, T>();

    Set<T> findAll() {
        return  new HashSet<T>(abstractMap.values());
    }

    T findByID(ID id) {
        return abstractMap.get(id);
    }

    T save(T t) {
        if( t == null || t.getId() == null) {
            t.setId(getNextID());
        }
        abstractMap.put(t.getId(), t);
        return t;
    }

    void deleteById(ID id) {
        abstractMap.remove(id);
    }

    void deleteByObject(T t) {
        abstractMap.entrySet().removeIf(entry -> entry.getValue().equals(t));
    }

    Long getNextID() {
        if ( abstractMap != null && abstractMap.size() >0 ){
            return Collections.max(abstractMap.keySet()) + 1;
        } else {
            return 1L;
        }
    }

}
