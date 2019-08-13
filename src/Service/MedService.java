package Service;

import Domain.Medicament;
import Repo.Repo;

public class MedService {
    private Repo<Medicament> medicamente = new Repo<Medicament>();

    public void addMed(float price, String name, boolean necesitaReteta){
        Medicament med = new Medicament(price, name, necesitaReteta);
        medicamente.add(med.getId(), med);
    }

    public Repo<Medicament> getRepo(){
        return medicamente;
    }
}
