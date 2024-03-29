package ba.unsa.etf.rpr.zadaca3;

import javafx.collections.ObservableList;

public interface VozilaDAO {    // Interfejs

    ObservableList<Vlasnik> getVlasnici();
    ObservableList<Mjesto> getMjesta();
    ObservableList<Vozilo> getVozila();
    void dodajVlasnika(Vlasnik vlasnik);
    ObservableList<Proizvodjac> getProizvodjaci();
    void promijeniVlasnika(Vlasnik vlasnik);
    void promijeniVozilo(Vozilo vozilo);
    void dodajVozilo(Vozilo vozilo);
    void obrisiVozilo(Vozilo vozilo);
    void obrisiVlasnika(Vlasnik vlasnik);
    void close();
}
