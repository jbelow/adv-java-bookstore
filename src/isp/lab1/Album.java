package isp.lab1;


import java.time.Duration;
import java.time.LocalDate;

public interface Album extends Product{

    public String getArtist();

    public double getCost();

    public String getFormattedReleaseDate();

    public Duration getPlayingTime();

    public int getQuantityOnHand();

    public LocalDate getReleaseDate();

    public String getTitle();

    public void order(int quantity);

}
