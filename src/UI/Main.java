package UI;

import Domain.CardClient;
import Domain.Medicament;
import Repo.Repo;
import Service.CardService;
import Service.MedService;
import Service.TranzactionService;

public class Main {
    private static CardService cardService = new CardService();
    private static MedService medService = new MedService();
    private static TranzactionService tranzactionService = new TranzactionService();

    Repo<CardClient> cards = cardService.getRepo();
    Repo<Medicament> medicamente = medService.getRepo();

    public static void main(String[] args){
        medService.addMed(11, "para", false);
        medService.addMed(11, "para2", false);
        medService.addMed(11, "para3", false);
        medService.addMed(11, "para4", false);

        cardService.addCard("raul", "bod", "1111111111111", "16.04.1995", "8.12.2019");
        cardService.addCard("raul", "bod", "1111111113111", "16.04.1995", "8.12.2019");
        cardService.addCard("raul", "bod", "1111111112111", "16.04.1959", "8.12.2019");
        cardService.addCard("raul", "bod", "1111111311111", "16.03.1995", "8.12.2019");
        cardService.addCard("raul", "bod", "1111121111111", "10.03.1995", "8.12.2019");
        cardService.addCard("raul", "bod", "1111112111111", "16.03.1995", "8.12.2019");

        


    }

}
