package Domain;

import java.util.stream.Stream;

public class DateValidator {
    private Stream stream;
    public void validateDate(String input){
        String[] sDate = input.split("[.]");
        int[] date = new int[3];
        for(int i = 0; i<3; i++){
            date[i] = Integer.parseInt(sDate[i]);
        }
        if(date[0] > 31 || date[0] <= 0) throw new DomainException("Ziua invalida!");
        if(date[1] > 12 || date[1] <= 0) throw new DomainException("Luna invalida!");
        if(date[2] < 1900 || date[2] <= 0) throw new DomainException("Anul invalid!");
    }

    public void validateTime(String input){
        String [] sTime = input.split(":");
        int []time = new int[3];
        time[0] = Integer.parseInt(sTime[0]);
        time[1] = Integer.parseInt(sTime[1]);
        if(time[0] >24 || time[0] <=0) throw new DomainException("Ora invalida");
        if(time[1] > 59 || time[1] < 0) throw new DomainException("Minutul invalid");
    }
}
