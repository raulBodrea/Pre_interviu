package Service;

import Domain.CardClient;
import Domain.Entity;
import Domain.IEntity;
import Domain.Medicament;
import Repo.Repo;

import java.util.Map;

public class CardService {
    private Repo<CardClient> repo = new Repo<CardClient>();

    //add card
    public void addCard(String Name, String lName, String CNP, String bDate, String rDate){
        validateCNP(CNP);
        CardClient card = new CardClient(Name, lName, CNP, bDate, rDate);
        repo.add(card.getId(), card);
    }

    public void validateCNP(String cnp){
        Map<Integer, CardClient> cards = repo.getRepo();
        boolean valid = cards.entrySet().stream().anyMatch(card -> cards.get(card.getKey()).getCNP().equals(cnp));
        if (valid == true) throw new ServiceException("Acest CNP este deja folosit");
    }

    public Repo<CardClient> getRepo(){
        return repo;
    }

}
