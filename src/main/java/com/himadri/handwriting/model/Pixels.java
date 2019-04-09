package com.himadri.handwriting.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Pixels {
    private final double[] transformedPixels;
    private final double[] rawPixels;
}
