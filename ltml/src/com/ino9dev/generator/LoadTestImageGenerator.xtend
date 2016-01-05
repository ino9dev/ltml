package com.ino9dev.generator

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import com.ino9dev.ltml.LoadTest
import com.ino9dev.ltml.Manifest
import java.io.File
import org.eclipse.xtext.generator.AbstractFileSystemAccess
import com.ino9dev.ltml.impl.ManifestImpl
import com.ino9dev.ltml.impl.LoadTestImpl

class LoadTestImageGenerator implements IGenerator {
    
    val PATHSEPARATOR = "\\"
    
    override doGenerate(Resource resource, IFileSystemAccess fsa) {

        //to get mnifest
        var manifest = resource.allContents.filter(typeof(ManifestImpl)).head
        
        //to get loadtest
        var loadtests = resource.allContents.filter(typeof(LoadTestImpl)).toList

        val afsa = if(fsa instanceof AbstractFileSystemAccess){fsa as AbstractFileSystemAccess}
        val path = if(manifest.modelinstancedpath != null || manifest.modelinstancedpath != ""){manifest.modelinstancedpath}else{"."+PATHSEPARATOR}

        //pathに対してフォルダを作り、pathを出力先とする
        afsa.setOutputPath(path)
        path.createFolder

        //todo deplory resource folder
        //todo namespace
        fsa.generateFile(
           '''«manifest.name»_«manifest.version».html''',
           '''
            <html>
            <head>
                <style>
                  body {
                    width:1024px;
                    margin:20px;
                  }
                  header, nav, section, footer {
                    display:block;
                    border:2px solid #ccc;
                    margin:0px;
                    padding:20px;
                  }
                  header {
                    text-align:center;
                    padding:30px;
                  }
                  nav ul, nav li{
                      list-style-type:none;display:inline;
                  }
                  section {
                    float:center;
                  }
                  footer {
                    clear:both !important;
                    text-align: center;
                  }
                </style>
            </head>
            <body>
            <header>
                <hgroup>
                    <h1>«manifest.manifestname»</h1>
                    <h2>version «manifest.version»</h2>
                </hgroup>
            </header>
            <nav>
              <h1>Navigation</h1>
              <ul>
                <li><a href="#">example 1 </a></li>
                <li><a href="#">example 2 </a></li>
                <li><a href="#">example 3 </a></li>
                <li><a href="#">example 4 </a></li>
                <li><a href="#">example 5 </a></li>
                <li><a href="#">example 6 </a></li>
                <li><a href="#">example 7 </a></li>
                <li><a href="#">example 8 </a></li>
              </ul>
            </nav>          
            <section>
                <article>
                    «manifest.name»'s Test Plan
                <article>
                <article>
                    «manifest.version»'s Test Plan
                <article>
            </section>
            <section>
            «FOR l:loadtests.sortBy([k|k.name])»
                <h1>TestName</h1><p>«l.name»</p>
                <h1>Purpose</h1><p>«l.purpose»</p>
                «FOR lg:l.loadgroups»
                <h2>Connccurent Num</h2><p>«lg.cc»</p>
                <h2>Rampup</h2><p>«lg.rampup»</p>
                <h2>LoadGenerator</h2><p>«lg.rampup»</p>
                <h2>Load Images</h2><p><!-- insert load images --></p>
                «ENDFOR»
            «ENDFOR»
            </section>
            <hooter>Copyright «manifest.corpname»</hooter>
            </body>
            </html>
           '''
        )
    }
     def createFolder(String target){
        var folder = new File(target)
        if(!folder.exists){folder.mkdir}
    }   
}