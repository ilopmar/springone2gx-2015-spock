package springone2gx

import static E13_Requires_IgnoreIf.isGroovyConference

import spock.lang.IgnoreIf
import spock.lang.Requires
import spock.lang.Specification
import spock.util.environment.Jvm
import spock.util.environment.OperatingSystem

class E13_Requires_IgnoreIf extends Specification {

    @Requires({ OperatingSystem.current.linux })
    void 'should only run on Linux'() {
        expect:
            true
    }

    @Requires({ OperatingSystem.current.windows })
    void 'should only run on Windows'() {
        expect:
            false
    }

    @IgnoreIf({ Jvm.current.java8Compatible })
    void 'should be ignored in Java8+'() {
        expect:
            false
    }

    @IgnoreIf({ Jvm.current.java9 })
    void 'should be ignored in Java9'() {
        expect:
            true
    }

    @Requires({ isGroovyConference('SpringOne 2GX')})
    void 'should run for Groovy conferences'() {
        expect:
            true
    }

    static boolean isGroovyConference(String conference) {
        conference in ['Greach', 'SpringOne 2GX', 'GR8Conf', 'GGX']
    }

}
