package com.kinopoisk;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Maksim Shkurko on 12/14/2017
 *
 * @author m.shkurko
 */

@RestController
public class CheckStatus {

    @RequestMapping("/status")
    public ResponseEntity status(){
        return ResponseEntity.status(200).body("Gateway service is available");
    }

}
