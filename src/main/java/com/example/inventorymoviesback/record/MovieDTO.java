package com.example.inventorymoviesback.record;

import com.example.inventorymoviesback.entity.Country;

public record MovieDTO(Long movieId, String movieTitle, Long movieYear, Long movieLengthMin) {

}
