package org.example.local_date.controllers;

import org.example.local_date.dto.DateDTO;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDateTime;

import static org.springframework.http.HttpStatus.OK;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/getDate/{date}")
    public ResponseEntity<DateDTO> getFormattedDate(@PathVariable
                                                    @DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
                                                        LocalDateTime date) {
        DateDTO dateDTO = DateDTO.builder()
                .localDateTime(date)
                .build();
        return ResponseEntity.status(OK).body(dateDTO);
    }
}
