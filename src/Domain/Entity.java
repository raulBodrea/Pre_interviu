package Domain;

public class Entity implements IEntity{
    private static int id = 1;

    public static int assignId(){
        id++;
        return id;
    }
}
