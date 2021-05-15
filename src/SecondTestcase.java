import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestcase {


    @Test
    public void setup() {

        System.out.println("setup completed");


    }
    @Test
    public  void  searchcust()
    {
        System.out.println("this is search cust test");
    }
    @Test
    public  void  addcust()
    {
        System.out.println("thi is add cust tests");
    }
    @Test
    public void teardown() {
        Assert.assertTrue(true);
        System.out.println("teardowm completed");

    }
}
