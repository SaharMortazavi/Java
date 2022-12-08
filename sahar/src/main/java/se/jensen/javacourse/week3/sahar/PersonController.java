package se.jensen.javacourse.week3.sahar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
@RestController
public class PersonController {
    @GetMapping("/author")
    public Person getPerson(){
        LocalDate date = LocalDate.of(1984,4,1);
        //return List.of(new Person("Sahar", "Sahar@gmail.com", 38, date));
        return new Person("Sahar", "Sahar@gmail.com", 38, date);
    }
    @GetMapping("/author/name")
    public String getPersonName(){
        Person person=new Person("Sahar");
        return person.getName();
    }
    @GetMapping("/square-number/{stNr}")
    public String getNumber(@PathVariable String stNr){
        double dbNr;
        try{
        int intNr= Integer.parseInt(stNr);
        dbNr = intNr;
        }
        catch (NumberFormatException e){
        return stNr + " is not a number";
    }
        return "Squared_number = " + dbNr*2;
    }


}
