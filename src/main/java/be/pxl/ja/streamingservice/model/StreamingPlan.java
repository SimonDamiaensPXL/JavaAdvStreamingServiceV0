package be.pxl.ja.streamingservice.model;

import java.math.BigDecimal;

public enum StreamingPlan {
    BASIC,
    STANDARD,
    PREMIUM;

    private int numberOfScreens;
    private BigDecimal price;
}
