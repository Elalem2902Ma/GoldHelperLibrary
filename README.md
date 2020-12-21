# GoldHelperLibrary
 GoldHelper Is Library To Help People In Coding
 

How To Add Dependency
To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

In Gradle
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.Elalem2902Ma:GoldHelper:Tag'
	}
  
  
  Or In Maven 

	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
  
Step 2. Add the dependency

	<dependency>
	    <groupId>com.github.Elalem2902Ma</groupId>
	    <artifactId>GoldHelper</artifactId>
	    <version>Tag</version>
	</dependency>


Or In Sbt 


    resolvers += "jitpack" at "https://jitpack.io"
        
    
Step 2. Add the dependency

	
	libraryDependencies += "com.github.Elalem2902Ma" % "GoldHelper" % "Tag"	
  
  
  Or In leiningen
  
Add it in your project.clj at the end of repositories:

 
    :repositories [["jitpack" "https://jitpack.io"]]
        
    
Step 2. Add the dependency

	
	:dependencies [[com.github.Elalem2902Ma/GoldHelper "Tag"]]	
        
        
How To Use It :-








  
