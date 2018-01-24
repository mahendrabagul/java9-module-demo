package io.github.mahendrabagul.helloworldclient;

import io.github.mahendrabagul.helloworld.HelloWorld;

public class HelloWorldClient {
  public static void main (String arg[]) {
    HelloWorld hello = new HelloWorld();
    System.out.println(hello.sayHelloWorld());
  }
}