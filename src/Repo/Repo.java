package Repo;

import Domain.Entity;
import Domain.IEntity;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Repo<E extends IEntity> {
    private Map<Integer, E> repo = new HashMap<>();

    public E get(int key){
        return this.repo.get(key);
    }

    public void add(int i, E elem){
      repo.put(i, elem);
    }

    public void remove(int i){
        repo.remove(i);
    }
    public Map<Integer, E> getRepo(){
        return this.repo.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue));
    }
}
