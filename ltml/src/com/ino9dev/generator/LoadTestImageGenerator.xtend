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
        afsa.setOutputPath(".")
        path.createFolder

        //todo deplory resource folder
        //todo namespace
        fsa.generateFile(
           '''«manifest.name»_«manifest.version».html''',
           '''
            <html>
            <head>
                <style type="text/css">
                  #loadimage {
                    width : 600px;
                    height: 384px;
                    margin: 8px auto;
                  }
                  body {
                    width:960px;
                    margin:20px auto;
                  }
                  header, nav, section, footer {
                    display:block;
                    border:1px solid #ccc;
                    margin:5px;
                    padding:20px;
                  }
                  header {
                    text-align:center;
                    padding:30px;
                  }
                  header ul, header li {
                    list-style-type:none;
                    display:inline;
                  }
                  nav {
                    float:right;
                    width:236px; 
                  }
                  section {
                    float:right;
                    width:620px;
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
                <ul>
                    <li><a href="#">Home</a></li>
                    <li><a href="#">Menu 1</a></li>
                    <li><a href="#">Menu 2</a></li>
                    <li><a href="#">Menu 3</a></li>
                </ul>
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
            «FOR l:loadtests»
            <sction>
                <h1>«l.name»</h1>
                <p></p>
                <h1>«l.purpose»</h1>
                <h2>Schedule</h2>
                <!-- include image here -->
            </sction>
            «ENDFOR»
            <section>
                <h1>Test Case</h1>
                <div id="loadimage" />
            </section>
            <hooter>Copyright «manifest.corpname»</hooter>

            <script type="text/javascript" src="resources/flotr2/flotr2.min.js"></script>
            <script type="text/javascript">
                (function basic(container) {
                var
                d1 = [[0, 0], [1, 8],[1, 8],[1, 8],[1, 8],[1, 8],[1, 8], [8, 5], [9, 13]], // First data series
                d2 = [],                                // Second data series
                i, graph;
            
                // Generate first data set
                //for (i = 0; i < 14; i += 0.5) {
                //    d2.push([i, Math.sin(i)]);
                //}
                // Draw Graph
                graph = Flotr.draw(container, [ d1, d2 ], {
                    xaxis: {
                        minorTickFreq: 4
                    }, 
                    grid: {
                        minorVerticalLines: true
                    }
                });
            })(document.getElementById("loadimage"));
            </script>

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