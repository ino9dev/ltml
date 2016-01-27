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
import java.util.Map

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
        
        //document generator use html5 libs
        var d3libpath = "C:\\Users\\oni\\git\\ltml\\ltml.tests\\lib\\3rdparty\\d3.min.js"

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
                    .axis path,
                    .axis line {
                        fill: none;
                        stroke: #000;
                        shape-rendering: crispEdges;
                    }
                    .x.axis path {
                        display: none;
                    }
                    .line {
                        fill: none;
                        stroke: steelblue;
                        stroke-width: 1.5px;
                    }
                </style>
            </head>
            <script src="«d3libpath»" charset="utf-8"></script>

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

            «FOR l:loadtests.sortBy([k|k.name])»
            <section>
                <h1>TestName</h1><p>«l.name»</p>
                <h1>Purpose</h1><p>«l.purpose»</p>
                «FOR lg:l.loadgroups»
                <h2>Connccurent Num</h2><p>«lg.cc»</p>
                <h2>Rampup</h2><p>«lg.rampup»</p>
                <h2>LoadImage</h2>
                <p>
                <span id="loadimage«l.name»" />
                <script>
                function type(d) {
                  d.date = formatDate.parse(d.date);
                  d.close = d.close;
                  return d;
                }
                var margin = {top: 20, right: 20, bottom: 30, left: 50};
                width = 960 - margin.left - margin.right;
                height = 500 - margin.top - margin.bottom;
                
                var formatDate = d3.time.format("%h:%m:%s");
                
                var x = d3.time.scale()
                    .domain([0, «l.loadgroups.head.schedule.duration»])
                    .range([0, width]);
                    
                var y = d3.scale.linear()
                    .range([height, 0]);
                    
                var xAxis = d3.svg.axis()
                    .scale(x)
                    .orient("bottom")
                    .tickFormat(d3.time.format('%H:%M:%S'));
                
                var yAxis = d3.svg.axis()
                    .scale(y)
                    .orient("left");
                
                var line = d3.svg.line()
                    .x(function(d) { return x(d.date); })
                    .y(function(d) { return y(d.close); });
                
                var svg = d3.select("#loadimage«l.name»").append("svg")
                    .attr("width", width + margin.left + margin.right)
                    .attr("height", height + margin.top + margin.bottom)
                  .append("g")
                    .attr("transform", "translate(" + margin.left + "," + margin.top + ")");
                
                svg.append("g")
                        .attr("class", "x axis")
                        .attr("transform", "translate(0," + height + ")")
                        .call(xAxis)
                    .append("text")
                        .text("Time(sec)");
                
                svg.append("g")
                      .attr("class", "y axis")
                      .call(yAxis)
                    .append("text")
                      .attr("transform", "rotate(-90)")
                      .attr("y", 6)
                      .attr("dy", ".71em")
                      .style("text-anchor", "end")
                      .text("A mount of Users");
                      
                var data = [
                    {"date" : "00:00:00", "close":  0}
                    ,{"date" : "00:05:00", "close":  5}
                    ,{"date" : "00:10:00", "close":  10}
                    ,{"date" : "00:15:00", "close":  10}
                    ,{"date" : "00:20:00", "close":  5}
                    ,{"date" : "00:25:00", "close":  0}
                ];
                
                var dataset = data.map(function(d) {
                    return {
                        'date' : formatDate.parse(d.date)
                        ,'close': d.close
                    };
                });
                
                x.domain(d3.extent(dataset, function(d) {return d.date;}));
                y.domain(d3.extent(dataset, function(d) {return d.close;}));
                
                console.info(dataset);
                
                svg.append("path")
                    .datum(dataset)
                    .attr("class", "line")
                    .attr("d", line);
                
                </script>
                </p>
                <h2>LoadGenerator</h2><p>«lg.rampup»</p>
                «ENDFOR»
            </section>
            «ENDFOR»
            <hooter>Copyright «manifest.corpname»</hooter>
            </body>
            </html>
           '''
        )
    }
    
    def toJavaScriptHashMap(Map target){
        val a = newArrayList()
        target.forEach[k, v|a.add(k)]
    }
    
    def createFolder(String target){
        var folder = new File(target)
        if(!folder.exists){folder.mkdir}
    }   
}