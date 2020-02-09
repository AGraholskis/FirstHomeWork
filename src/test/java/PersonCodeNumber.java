import org.junit.jupiter.api.Test;


public class PersonCodeNumber {

    //одать персональный код старого образца и по нему бы появилась строка в консоле с полной датой рожения,
    // например: "Твоя дата рождения: 27 января 2020 года"
    @Test
    public void code() {
        int codeDay = 22;
        String codeMounth;
        codeMounth = "Января";
        int codeYear;
        codeYear = 2020;
        System.out.println("Моя дата рожения: " + codeDay + codeMounth + codeYear + " Года");

    }


}


