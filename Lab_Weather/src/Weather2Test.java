import static org.junit.jupiter.api.Assertions.*;

class Weather2Test {

    @org.junit.jupiter.api.Test
    void TestWeather1() {
        Weather weatherTest1 = new Weather("rainy", 12);
        String test = weatherTest1.getDayDescription();
        assertEquals("", test);
    }

}