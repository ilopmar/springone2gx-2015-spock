package springone2gx

import spock.lang.Specification
import spock.util.mop.ConfineMetaClassChanges

class E11_ConfineMetaClassChanges extends Specification {

    @ConfineMetaClassChanges(String)
    void 'should have sayHi method on String'() {
        given:
            String.metaClass.sayHi = { -> "Hi ${delegate}" }

        expect:
            "SpringOne 2GX".sayHi() == 'Hi SpringOne 2GX'
    }

    void 'should not have sayHi method on String'() {
        when:
            "SpringOne 2GX".sayHi()

        then:
            thrown MissingMethodException
    }

}
