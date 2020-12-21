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
	        implementation 'com.github.Elalem2902Ma:GoldHelperLibrary:1.0'
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
	    <artifactId>GoldHelperLibrary</artifactId>
	    <version>1.0</version>
	</dependency>


Or In Sbt 


    resolvers += "jitpack" at "https://jitpack.io"
        
    
Step 2. Add the dependency

	
	libraryDependencies += "com.github.Elalem2902Ma" % "GoldHelperLibrary" % "1.0"	
  
  
  Or In leiningen
  
Add it in your project.clj at the end of repositories:

 
    :repositories [["jitpack" "https://jitpack.io"]]
        
    
Step 2. Add the dependency

	
	:dependencies [[com.github.Elalem2902Ma/GoldHelperLibrary "1.0"]]	
        
        
How To Use It :-


    GoldHelper helper = new GoldHelper();
        
        
Please Use "this" If You Using Code In Activity Or Use "getContext()" If You Use It In Fragment

  This Method Is Check If App  Is First Time Launch
	
        boolean IsFirstLaunch = GoldHelper.IsFirstLaunch(this);
        
        if (IsFirstLaunch) {
            
            // Run Your Code Here If Is First Launch
            
        }else {
            
            //Its Not First Launch
        }
        
   To Save Data In SharedPreferences
        
        // Replace Gold Library With Your Data
        helper.SaveStringInSharedPreferences(this,"Write Your Key Here","GoldHelper Library");
        
        //Replace 1 With Your Data
        helper.SaveIntInSharedPreferences(this,"Write Your Key Here",1);
        
        //Replace radioButton.isChecked With Your Data
        helper.SaveBooleanInSharedPrefs(this,"Write Your Key Here",radioButton.isChecked());
        
        
   For Load Data From SharedPreferences
        
        helper.LoadStringFromSharedPreferences(this,"Write Your Key Here");
        helper.LoadIntFromSharedPreferences(this,"Write Your Key Here");
        helper.LoadBooleanFromSharedPrefs(this,"Write Your Key Here");
        
   Example 
        
        // String
        String LibraryName = helper.LoadStringFromSharedPreferences(this,"Write Your Key Here");
        textView.setText(LibraryName);
        
        //int
        int LibraryVersion = helper.LoadIntFromSharedPreferences(this,"Write Your Key Here");
        textView.setText(LibraryVersion);


        //Boolean
       radioButton.setChecked(helper.LoadBooleanFromSharedPrefs(this,"Write Your Key Here"));








  
