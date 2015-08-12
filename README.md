# Ltml

Ltml is a LoadTest Modeling Language(DSL).  
It has some features to define load model(load test cases), script and generate load test instance(e.g. a JMeter Test Plan (jmx file)).  
It could generate not only a JMeter Test Plan (jmx file) but other documentations.    

# Motivations

- System users could write loadmodel
- it is often diffiecult for system users
- Load testers coudd write with model(MDD)
- Load testers and System users could communicate with model
- A lot of load testing tools exists. However, A load tester would not want to learn about these tools and languages.
- We(load testers) needs a unified modeling language
- (I think it becomese a role of system users and devs/testers are closely.)

# How to get Ltml

`$ git clone git@github.com:ino9dev/ltml.git`

# **Please Note**

This language is still developing and you could only use experimental language.  
It maybe include not implemented area, bugs, and any changes of specification.  
Please tell me your advice for improvement or pull request.  
Thank you.  

# Compile and Build Ltml

##The Fast Way:  

1. Environment Prerequisite: Java 1.6 or newer; Eclipse 3.8 or 4.2 or newer; Xtext 2.4.  
2. Download this plugin jarfile[(here)](https://github.com/ino9dev/ltml/tree/master/ltml/plugin) and save to eclipse plugin folder(\<\<eclipse_home\>\>\plugins)  
3. Run Eclipse  
4. Create a Java Project  
5. Create a Untitled File *.ltml(ex. test.ltml)
6. Write a Ltml and it auto-generate jmx file.

##The Manual Way:

1. Environment Prerequisite: Java 1.6 or newer; Eclipse 3.8 or 4.2 or newer; Xtext 2.4.
2. Clone https://github.com/ino9dev/ltml (this repository)
3. Import all projects into your Eclipse workspace.
4. Select a project ltml
5. Run as Eclipse Application
6. Create a Java Project
7. Create a Untitled File *.ltml(ex. test.ltml)
8. Write a Ltml and it auto-generate jmx file.

# Ltml Grammar

This grammar is defined with Xtext.  

![Alt text](ltml/ltmlgrammar.png)

# Ltml Sample

```
Manifest {
    Id lt20150801
    Version "1.0"
}

//Testcase 1
LoadTest {
    Id lt001
    LoadGroups LG01
}

//Testcase 2
LoadTest {
    Id lt002
    LoadGroups LG01
    Report {
       NoReport
    }
}

//Testcase 3
LoadTest {
    Id lt003
    LoadGroups LG01
    Report {
       Summary
       Result "D:\\data\\report_result.csv"
       HitPerSecond
       TransactionPerSecond
    }
}

LoadGroup {
    Id LG01
    Cc 20
    Script BP01
    Iteration "INFINITY"
    LoadGenerator LGen01
    RampUp "20/1min"
    Schedule {
        Duration 500
        Delay 0
    }
}

LoadGenerator {
    Id LGen01
    TargetIp "192.168.0.5"
    TargetPort "1008"
    Location "America"
    AuthUsername "test001"
    AuthPassword "test001"
}

Script {
    Id BP01
    Name "BusinessProcess01"
    Trs {
        Tr {
            Id BP01_01
            Name "BP01_01"
            No 001
            Method GET
            URL "http://localhost/test1"
            CaptureFileName "image001"
        }
        Tr {
            Id BP01_02
            Name "BP01_02"
            No 002
            Method GET
            URL "http://localhost/test2"
            CaptureFileName "image002"
        }
    }
}

Script {
    Id BP02
    Name "BusinessProcess02"
    Trs {
        Tr {
            Id BP02_01
            Name "BP02_01"
            No 201
            Method GET
            URL "http://localhost/test1"
            CaptureFileName "image001"
        }
        Tr {
            Id BP02_01
            Name "BP02_01"
            No 202
            Method POST
            URL "http://localhost/test2"
            Body a=asvalue&b=bsvalue
            CaptureFileName "image002"
        }
    }
}
```

# Task list
- [x] implement to handle Report/TransactionPerSecond syntax (20150811 done)
- [x] implement to handle Report/HitPerSecond syntax (20150811 done)
- [x] implement to handle Report/ResponseTimeOverTime syntax (20150811 done)
- [x] implement to handle Report/ConccurentCountOverTime syntax (20150811 done)
- [ ] implement to handle Report/Result syntax
- [ ] modify Manifest syntax for designation of outputpath
- [ ] modify Manifest syntax for designation of instance type(like JMeter/LoadRunner/OtherTools)
- [ ] implement to handle Parameter syntax
- [ ] implement to handle Correlation(this name will be changed) syntax
- [ ] implement to handle Load Generator syntax and new method for generating load(e.g using JMeter server or other methods)
- [ ] implement to handle LoadTest/rampup syntax
- [ ] implement to handle Transactions syntax
- [ ] implement to execute interpreter modeled load tests   
- [ ] implement to handle Transaction syntax and convert function from Fiddler 4
- [ ] implement to handle Load Generator syntax and Load Generator without JMeter remote execution
- [ ] implement to handle difference of locale with load generator
- [ ] implement to export and generate Load Test Document Generator
- [ ] implement to export and generate Load Test Image Generator
- [ ] implement to gather performance data from Load Generator
- [ ] implement to define performance objects(it normally means SLA)
- [ ] implement to analysis performance data and new method for gathering(e.g using JMeter)


# Architecture
## current
- Xtext
- Ltml
- JMeter

## future
- Xtext
- Ltml
- Other Load Test Software(Like Jmeter but not business(=license needs) use) .. for not depend on JMeter, I think JMeter has some issues for scalability, transaction mix, finish controller and so on(toughness, availability, and maintenancebility). However it should left test cases with Ltml as assets.  
- Software defined middleware/server (Like a chef/vagrant .. for deploy loadtest generator to remote servers 
- Jetty(and so on) on SD middleware/server..  for handling remote execution as restful api and load generator instance

# Licenses

Copyright (c) [2015] [ino9dev]  

License is MIT (MIT license http://opensource.org/licenses/mit-license.php)  

Learn more at [ino9oni](http://sites.google.com/site/ino9oni/).  
Follow [@inoque](https://twitter.com/inoque) on twitter.  