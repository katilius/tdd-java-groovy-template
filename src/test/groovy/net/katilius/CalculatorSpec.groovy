package net.katilius

import spock.lang.Specification

class CalculatorSpec extends Specification {
    def calculator;

    def setup() {
        calculator = new Calculator();
    }

    def "#sum should sum two numbers"() {
        when: "two numbers are positive"
        then: "it should sum them"
        calculator.sum(6, 5) == 11
        when: "one number is negative"
        then: "it should subtract it from positive number"
        calculator.sum(10, -5) == 5
    }
}

