package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GreeterTest {
    String message = "Hello Diogo";
    @Test
    public void testSayHello() {
        message = "Hello World";
        Greeter greeter = new Greeter();
        String result = greeter.sayHello();
        assertThat(result, containsString("Hello"));
        assertThat(result, containsString("How"));
        assertThat(result, not(containsString("shit")));
    }

    @Test
    public void testSayHelloToName() {
        Greeter greeter = new Greeter();
        String result = greeter.sayHello(message);
        assertThat(result, containsString("Hello Diogo"));
    }



}