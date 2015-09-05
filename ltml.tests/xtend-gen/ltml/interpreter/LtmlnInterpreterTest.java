package ltml.interpreter;

import com.google.inject.Inject;
import com.ino9dev.interpreter.LtmlInterpreter;
import com.ino9dev.ltml.Model;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Test;

@SuppressWarnings("all")
public class LtmlnInterpreterTest {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private LtmlInterpreter _ltmlInterpreter;
  
  @Test
  public void intConstant() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Manifest {");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.assertInterpret(_builder, Integer.valueOf(1));
  }
  
  public Model assertInterpret(final CharSequence input, final Object expected) {
    try {
      Model _parse = this._parseHelper.parse(input);
      final Procedure1<Model> _function = new Procedure1<Model>() {
        public void apply(final Model it) {
          LtmlnInterpreterTest.this._validationTestHelper.assertNoErrors(it);
        }
      };
      Model _doubleArrow = ObjectExtensions.<Model>operator_doubleArrow(_parse, _function);
      return _doubleArrow;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
