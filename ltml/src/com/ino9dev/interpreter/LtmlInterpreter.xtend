package com.ino9dev.interpreter

import com.ino9dev.LtmlStandaloneSetup
import com.ino9dev.ltml.impl.ManifestImpl
import java.io.InputStreamReader
import java.util.Scanner
import org.eclipse.xtext.parser.IParser
import org.eclipse.xtext.util.StringInputStream
import org.eclipse.xtext.parser.IParseResult
import org.eclipse.xtext.parser.ParseResult

enum Mode {
    Run,
    Define
}

class LtmlInterpreter {

    def static void main(String[] args){
        (new LtmlInterpreter).main
    }
    
    def main(){
        var guiceInjector = new LtmlStandaloneSetup().createInjectorAndDoEMFRegistration();
        var parser = guiceInjector.getInstance(IParser);

        var scannar = new Scanner(System.in).useDelimiter(System.getProperty("line.separator")+System.getProperty("line.separator")); //[\r\n\r\n|\n\n]
        var input = new StringBuffer
        var status = Mode.Define
        var IParseResult parseresult = null
        var memory = newArrayList()
        while(!(input.equals("quit") || input.equals("exit"))) {
            print('''[ltml][Mode=«status»]$''')
            input.append(scannar.next());
            if(input.toString.equals("Run")){status = Mode.Run}
            else if(input.toString.equals("Define")){status = Mode.Define}
            else if(input.toString.equals("Show")){
                memory.forEach[e|
                    println(e)
                ]
            }
            else{
                switch(status){
                    case Mode.Run:
                    {
                        println("todo execution parse")
                    }
                    case Mode.Define:
                    {
                        parseresult = parser.parse(new InputStreamReader(new StringInputStream(input.toString)))
                        //todo to check parse result
                        var errors = parseresult.syntaxErrors
                        //has Parse Error
                        if(errors.length != 0){
                            println("Syntax error occurred.")
                        }else {
                            println(parseresult.rootASTElement)
                            memory.removeAll
                            memory.addAll(parseresult.rootASTElement.eContents)
                            val manifest = parseresult.rootASTElement.eAllContents.filter(typeof(ManifestImpl)).head
                            println(manifest.name)

                            //todo to save on memory
                            //todo to load from file
                        }
                        //todo to move syntax defin Mode
                    }
                }
            }
            input = new StringBuffer
        }
        println("Bye")
    }
}
