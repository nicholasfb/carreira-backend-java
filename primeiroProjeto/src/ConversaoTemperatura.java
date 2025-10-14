public class ConversaoTemperatura {
    public static void main(String[] args) {

    Double grausFahrenheit = converteTempratura(28.0);

        System.out.println(grausFahrenheit + "ºF");


    }

    private static Double converteTempratura(double grausCelsius) {
        return (grausCelsius * 1.8) + 32;
    }
}
