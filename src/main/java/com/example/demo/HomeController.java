/*
 * Copyright 2015 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {

        String kk = RandomStringUtils.randomAlphanumeric(151);
        String mm = kk;

        String asdasdsad,
        
                adasdasdasd,
                asdadaaa,
                
                asdadadasdadadassddadasdasdsdasdasdasdasdasdasdadadasdasdasdaasasdadasdasdsdasdadadasdadadassddadasdasdsdasdasdasdasdasdasdadadasdasdasdaasasdadasdasdsdasdadadasdadadassddadasdasdsdasdasdasdasdasdasdadadasdasdasdaasasdadasdasdsd =
                        kk.toLowerCase();
        List<String> mm1 =
                List.of(
                        "asdasd",
                        "asdadasdasd",
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null);
        return kk;
    }
}

class StreamMain {

    // create an object of list using ArrayList
    static List<String> places = new ArrayList<>();

    // preparing our data
    public static List getPlaces() {

        // add places and country to the list
        places.add("Nepal, Kathmandu");
        places.add("Nepal, Pokhara");
        places.add("India, Delhi");

        places.add("USA, New York");
        places.add("Africa, Nigeria");

        return places;
    }

    public static void main(String[] args) {

        List<String> myPlaces = getPlaces();
        System.out.println("Places from Nepal:");

        // Filter places from Nepal
        myPlaces
        .stream()
                .filter((p
                		) -> p.startsWith("Nepal"))
                .map((p) -> p.toUpperCase())
                .sorted()
                .forEach((p) -> System.out.println(p));
    }
}
