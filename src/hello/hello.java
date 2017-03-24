package hello;

import static org.joda.time.LocalTime;


/**
 * Created by wojciechswiatkowski on 3/24/17.
 */
public class hello {

    public static void main(String[] args) {
        greeter greeter = new greeter();
        System.out.println(greeter.sayHi());
        LocalTime curr = new LocalTime();
        System.out.println("" + curr);
    }
}
