package vinicius_padilha;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) throws Exception {
        Estadio Estadio1 = new Estadio("Estadio Cícero Pompeu de Toledo", 1);
        Estadio Estadio2 = new Estadio("Estadio Maracana", 3);
        Estadio.add(Estadio1);
        Estadio.add(Estadio2);
    }
}
