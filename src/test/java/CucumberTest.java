import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberTest {
    int currentAccount;
    int savingAccount;



    @Given("I have {int} on currentAccount")
    public void setCurrentAccount(int value) {
        currentAccount = value;

    }

    @And("I have {int} on savingAccount")
    public void setSavingAccount(int value) {
        savingAccount = value;
    }

    @When("I transfer {int} fom currentAccount to savingAccount")
    public void transferMoney(int value) {
        currentAccount = currentAccount - value;
        savingAccount = savingAccount + value;
    }

    @Then("Transfer was executed")
    public void showTransfer() {
        System.out.println("currentAccount =" + currentAccount);
        System.out.println("savingAccount =" + savingAccount);
    }
    @And("Statement apper {string}")
    public void statement(String wesoło){
        System.out.println(wesoło);
    }

}
