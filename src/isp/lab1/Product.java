package isp.lab1;

import java.time.Duration;
import java.time.LocalDate;

public interface Product {


    public double getCost();

    public String getFormattedReleaseDate();

    public int getQuantityOnHand();

    public LocalDate getReleaseDate();

    public String getTitle();

    public void order(int quantity);

}
