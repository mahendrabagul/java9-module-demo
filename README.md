//Compile parent module
javac -d output io.github.mahendrabagul.helloworld\module-info.java
javac -d output io.github.mahendrabagul.helloworld\io\github\mahendrabagul\helloworld\HelloWorld.java

//compile client module 
javac --module-path mlib -d output io.github.mahendrabagul.helloworldclient\module-info.java
javac --module-path mlib -d output io.github.mahendrabagul.helloworldclient\io\github\mahendrabagul\helloworldclient\HelloWorldClient.java

//Create module jar
jar -c -f mlib\io.github.mahendrabagul.helloworld.jar -C output .

//Run client class
java --module-path "mlib;output" -m io.github.mahendrabagul.helloworldclient/io.github.mahendrabagul.helloworldclient.HelloWorldClient

