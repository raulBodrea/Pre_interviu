package Domain;

public class CardClient extends Entity implements IEntity{
    private int id;
    private String name;
    private String lName;
    private String CNP;
    private String bDate;
    private String rDate;

    public CardClient(String name, String lName, String CNP, String bDate, String rDate) {
        DateValidator dateValidator = new DateValidator();
        dateValidator.validateDate(bDate);
        dateValidator.validateDate(rDate);
        if(CNP.length()!= 13) throw new DomainException("CNP Invalid");
        this.id = Entity.assignId();
        this.name = name;
        this.lName = lName;
        this.CNP = CNP;
        this.bDate = bDate;
        this.rDate = rDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public String getbDate() {
        return bDate;
    }

    public void setbDate(String bDate) {
        this.bDate = bDate;
    }

    public String getrDate() {
        return rDate;
    }

    public void setrDate(String rDate) {
        this.rDate = rDate;
    }
}
