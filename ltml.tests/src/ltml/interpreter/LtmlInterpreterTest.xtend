package ltml.interpreter

import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import com.google.inject.Inject
import com.ino9dev.ltml.Model
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import com.ino9dev.interpreter.LtmlInterpreter
import static extension org.junit.Assert.*
import com.ino9dev.ltml.impl.LoadTestImpl

class LtmlnInterpreterTest {
    //@Inject extension ParserHelper<LtmlModel>
    @Inject extension ParseHelper<Model>
    @Inject extension ValidationTestHelper
    @Inject extension LtmlInterpreter
    @Test def void intConstant(){
        '''
        Manifest {
            
        }
        '''.assertInterpret(1)
    }
    
    def assertInterpret(CharSequence input, Object expected){
        input.parse => [
            assertNoErrors
            //expected.assertEquals(statements.filter(LoadTestImpl).last.interpret)
        ]
    }
}