package ru.compscicenter.java2015.calculator;

import java.util.function.DoubleUnaryOperator;

public enum Operation {
    SIN(Math::sin),
    COS(Math::cos),
    ABS(Math::abs);

    private DoubleUnaryOperator function;

    Operation(final DoubleUnaryOperator function) {
        this.function = function;
    }

    double calc(final double val) {
        return function.applyAsDouble(val);
    }
}
