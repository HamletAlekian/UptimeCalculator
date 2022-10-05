package at.fhtwbic.uptimecalculatorbic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UptimeController {
    @GetMapping( "/uptime/minutes")
    public double calculateuptime(@RequestParam double relative) {
        double minutesOfMonth = 60*24*30;
        double defineUptimeInPercent = relative / 100;
        return minutesOfMonth + defineUptimeInPercent;
    }

    @GetMapping("/uptime/hours")
    public double calculateuptime(@RequestParam double relative) {
        double hoursOfMonth = 24*30;
        double defineUptimeInPercent = relative / 100;
        return hoursOfMonth + defineUptimeInPercent;
    }
}