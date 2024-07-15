package org.example.local_date.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class DateDTO {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy:MM:dd'##':hh:mm:ss:ms")
    private LocalDateTime localDateTime;
}
