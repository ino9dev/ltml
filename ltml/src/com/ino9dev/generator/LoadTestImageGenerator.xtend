package com.ino9dev.generator

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import com.ino9dev.ltml.LoadTest
import com.ino9dev.ltml.Manifest

class LoadTestImageGenerator implements IGenerator {
    
    override doGenerate(Resource resource, IFileSystemAccess fsa) {
//
//        //to get mnifest
//        var manifest = resource.allContents.filter(typeof(Manifest)).head
//        
//        //to get loadtest
//        var loadtest = resource.allContents.filter(typeof(LoadTest)).head
//
//        //todo namespace
//        fsa.generateFile(
//           '''«manifest.name»_«manifest.version».html''',
//           '''
//           <html>
//           
//           <body>
//           
//           <canvas id="loadimage" />
//           <script src="" />
//           <script>
//           
//           </script>
//           </body>
//           
//           </html>
//           '''
//        )
        
    }
    
}