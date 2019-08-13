package Service;

import Domain.Medicament;
import Domain.Tranzactie;
import Repo.Repo;

public class TranzactionService {
    private Repo<Tranzactie> tranzactii = new Repo();

    public void addTransaction(Repo<Medicament> medicamente, int id_med, int idCardClient, int nr_buc, String date, String time){
        float pret = medicamente.get(id_med).getPrice()*nr_buc;
        double discount = pret*0.15;
        Tranzactie tranzactie = new Tranzactie(id_med, idCardClient, nr_buc, date, time);
        tranzactii.add(tranzactie.getId(), tranzactie);
        System.out.println("Pret total brut: "  + pret
                            + "\nDiscount: "    + discount
                            + "\nPret Final: "  + (pret-discount));
    }
    public void addTransaction(Repo<Medicament> medicamente, int id_med, int nr_buc, String date, String time){
        float pret = medicamente.get(id_med).getPrice()*nr_buc;
        double discount = pret*0.10;
        Tranzactie tranzactie = new Tranzactie(id_med, nr_buc, date, time);
        tranzactii.add(tranzactie.getId(), tranzactie);
        System.out.println("Pret total brut: "  + pret
                            + "\nDiscount: "    + discount
                            + "\nPret Final: "  + (pret-discount));
    }

}
