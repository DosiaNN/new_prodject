import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeStep;
import org.junit.Before;

public class Before_after {
    @BeforeStep
    public static void printItBeforeStep(){
        System.out.println("Print it before each step");
    }

}
