package com.ino9dev.generator

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import com.ino9dev.ltml.Manifest
import com.ino9dev.ltml.LoadTest

class LoadTestDocumentGenerator implements IGenerator {
    
    override doGenerate(Resource resource, IFileSystemAccess fsa) {
//        
//        //to get mnifest
//        var manifest = resource.allContents.filter(typeof(Manifest)).head
//        
//        //to get loadtest
//        var loadtest = resource.allContents.filter(typeof(LoadTest))
//
//        //todo namespace
//        fsa.generateFile(
//           '''«manifest.»_«manifest.version».latex''',
//           '''
//           <title>«manifest.name»</title>
//           {subtitle}第«manifest.version»版{/subtitle}
//           '''
//        )
    }
    
}