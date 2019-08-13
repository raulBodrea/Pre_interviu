package Domain;

public class Medicament extends Entity{
    private int id;
    private float price;
    private String name;
    private boolean necesitaReteta;


    public Medicament(float price, String name, boolean necesitaReteta) {
        if(price <= 0){
            throw new DomainException("Price can't be less than or equal to 0");
        }
        this.price = price;
        this.name = name;
        this.necesitaReteta = necesitaReteta;
        this.id = Entity.assignId();
    }

    public int getId() {
        return id;
    }
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNecesitaReteta() {
        return necesitaReteta;
    }

    public void setNecesitaReteta(boolean necesitaReteta) {
        this.necesitaReteta = necesitaReteta;
    }
}
