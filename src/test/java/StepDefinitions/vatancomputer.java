package StepDefinitions;

import Pages.BodyContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import java.util.List;

public class vatancomputer {

    BodyContent vatan = new BodyContent();

    @Given("Navigate to vatanbilgisayar.com")
    public void navigateToVatanbilgisayarCom() {
        GWD.getDriver().get("https://www.vatanbilgisayar.com/");
        GWD.getDriver().manage().window().maximize();

    }

    @And("Search to Product")
    public void searchToProduct(DataTable product) {
        List<List<String>> listElement = product.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++)
            vatan.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }

    @And("Click")
    public void click(DataTable click) {
        List<String> listElement = click.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            vatan.findAndClick(listElement.get(i));
        }
    }


    @And("Type info")
    public void typeInfo(DataTable info) {

        List<List<String>> listElement = info.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++)
            vatan.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));

    }

    @And("SelectValue")
    public void selectvalue(DataTable value) throws InterruptedException {

        // Thread.sleep(3000);
        List<List<String>> listElement = value.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            vatan.findandselectvalue(listElement.get(i).get(0), listElement.get(i).get(1));
        }

       Thread.sleep(6000);


    }

    @And("Check")
    public void check(DataTable check) {

        List<String> listElement = check.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            vatan.findAndContainsText("check", "SEPETİNİZDE");
        }
    }
}
