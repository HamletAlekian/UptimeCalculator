package at.fhtwbic.uptimecalculatorbic.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UptimeControllerTest {

    @Test
    void calculateUptimeMinutes() {
        // a - arrange - anordnen, vorbereiten, d.h. Instanz der Klasse anlegen die ich testen will
        var controller = new UptimeController();
        // a - act = Test ausführen
        var result = controller.calculateUptimeMinutes(0.0);
        // a - assert - behaupten, begründen (Vergleichen, ob das Ergebnis der Erwartung entspricht)
        assertEquals(0.0, result);

    }

    @Test
    void calculateUptimeHours() {
       assertEquals(0, 0);
    }
}