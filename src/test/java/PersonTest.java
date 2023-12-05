import models.Person;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PersonTest {

    @Test  //adnotacja
    void shouldCalculateCorrectSalary()
    {
        Person tomHanks = new Person("Tom","Hanks");
        int actual = tomHanks.caltulateSalary(3, 3);
        int expected = 9;

        // asercje (porównanie)

        //assertThat(actual).isEqualTo(expected);
        //assertThat(actual).isGreaterThan(5);
        assertThat(actual).as("wynagrodzenie obliczone nieprawidłowo").isGreaterThan(5);
        //assertThat(actual).as("wynagrodzenie obliczone nieprawidłowo").isGreaterThan(15);


    }

    @Test
    void shouldCalculateBonus()
    {
        Person tomHanks = new Person("Tom","Hanks");
        int actual = tomHanks.giveBonus(2,10);
        int expected = 20;
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    void shouldCaluculateBonusforRatingGraterThan10()
    {
        Person tomekHanks = new Person("Tom","Hanks");
        int actual = tomekHanks.giveBonus(11,10);
        int expected = 10;
        assertThat(actual).as("Bonus policzony nieprawidłowo").isEqualTo(expected);
    }

}


