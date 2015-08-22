package springone2gx

import spock.lang.Specification

class E1_Basic extends Specification {

    void 'should add two integers'() {
        given: 'two numbers'
            def x = 1
            def y = 2

        expect: 'the right sum'
            x + y == 5
    }

    void 'should reverse a string'() {
        given: 'a string'
            def myString = 'Hello SpringOne 2GX!'

        when: 'reversing it'
            def reversed = myString.reverse()

        then: 'it is reversed'
            reversed == '!XG2 enOgnirpS olleH'
    }

    void 'should reverse a string (II)'() {
        expect:
            'Hello SpringOne 2GX!'.reverse() == '!XG2 enOgnirpS olleH'
    }

}
