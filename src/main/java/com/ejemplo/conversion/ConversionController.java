package com.ejemplo.conversion;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/convert")
public class ConversionController {

    @GetMapping("/celsius-to-fahrenheit")
    public double celsiusToFahrenheit(@RequestParam double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    @GetMapping("/kilometers-to-miles")
    public double kilometersToMiles(@RequestParam double km) {
        return km * 0.621371;
    }
}
