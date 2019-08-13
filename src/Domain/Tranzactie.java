package Domain;

public class Tranzactie extends Entity {
    private int id;
    private int id_med;
    private int id_card_client;
    private int nr_buc;
    private String date;
    private String time;


    public int getId() {
        return id;
    }
    public Tranzactie(int id_med, int id_card_client, int nr_buc, String date, String time) {
        DateValidator dateValidator = new DateValidator();
        dateValidator.validateDate(date);
        dateValidator.validateTime(time);
        this.id_med = id_med;
        this.id = Entity.assignId();
        this.id_card_client = id_card_client;
        this.nr_buc = nr_buc;
        this.date = date;
        this.time = time;
    }
    public Tranzactie(int id_med, int nr_buc, String date, String time) {
        DateValidator dateValidator = new DateValidator();
        dateValidator.validateDate(date);
        dateValidator.validateTime(time);
        this.id_med = id_med;
        this.id = Entity.assignId();
        this.nr_buc = nr_buc;
        this.date = date;
        this.time = time;
    }



    public int getId_med() {
        return id_med;
    }

    public void setId_med(int id_med) {
        this.id_med = id_med;
    }

    public int getId_card_client() {
        return id_card_client;
    }

    public void setId_card_client(int id_card_client) {
        this.id_card_client = id_card_client;
    }

    public int getNr_buc() {
        return nr_buc;
    }

    public void setNr_buc(int nr_buc) {
        this.nr_buc = nr_buc;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
