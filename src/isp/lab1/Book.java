package isp.lab1;

import java.time.LocalDate;

public interface Book extends Product{

    public String getAuthor();

    public double getCost();

    public String getFormattedReleaseDate();

    public String getISBN();

    public int getPages();

    public int getQuantityOnHand();

    public LocalDate getReleaseDate();

    public String getTitle();

    public void order(int quantity);
}
