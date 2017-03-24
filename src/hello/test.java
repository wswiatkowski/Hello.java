package hello;
import org.jetbrains.annotations.TestOnly;
import static org.hamcrest.CoreMatchers.containsString;

import static org.junit.Assert.*;
/**
 * Created by wojciechswiatkowski on 3/24/17.
 */
public class test {
    private greeter greeter = new greeter();

    @Test
    public void greeterSayHello() {
        assertThat(greeter.sayHi(), containtsString("hello"));
    }
}
