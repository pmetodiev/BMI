import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BMItest {
    BMImain bmiPage;


    @BeforeMethod
    public void setUp() {
        bmiPage = new BMImain();
        bmiPage.goTo();
    }

    @Test
    public void calculateOverweightBmiTest() {
        bmiPage.calculateBmi("150", "50");

        String actualBmi = bmiPage.getBmi();
        String actualBmiCategory = bmiPage.getBmiCategory();

        Assert.assertEquals(actualBmi, "22.2", "Ima buuuuug");
        Assert.assertEquals(actualBmiCategory, "Normal", "Ima buuuuug");

        bmiPage.quit();
    }

    @Test
    public void calculateObesityBmiTest() {
        bmiPage.calculateBmi("187", "80");
        String actualBmi = bmiPage.getBmi();
        String actualBmiCategory = bmiPage.getBmiCategory();

        Assert.assertEquals(actualBmi, "22.9");
        Assert.assertEquals(actualBmiCategory, "Normal");


        bmiPage.quit();
    }


}

