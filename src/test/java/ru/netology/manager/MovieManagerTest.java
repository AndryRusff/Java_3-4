package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    @Test
    public void addTest() {

        MovieManager manager = new MovieManager();

        Movie one = new Movie(3, "url1", "Fighter", "pron");
        Movie two = new Movie(4, "url2", "AndroidDream", "tragedy");
        Movie three = new Movie(5, "url3", "Life", "comedy");

        manager.save(one);
        manager.save(two);
        manager.save(three);

        Movie[] expected = {one, two, three};
        Movie[] actual = manager.getMovies();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void getLastFilmIfMoreThanTen() {
        MovieManager manager = new MovieManager();
        Movie eleven = new Movie(15, "url1", "born", "comedy");
        Movie ten = new Movie(16, "url2", "grown", "comedy");
        Movie nine = new Movie(17, "url3", "noname", "comedy");
        Movie eight = new Movie(18, "url4", "school", "comedy");
        Movie seven = new Movie(19, "url5", "university", "comedy");
        Movie six = new Movie(20, "url6", "wedding", "comedy");
        Movie five = new Movie(21, "url7", "divorse", "comedy");
        Movie four = new Movie(22, "url8", "oldman", "comedy");
        Movie three = new Movie(23, "url9", "death", "comedy");
        Movie two = new Movie(24, "url10", "revativeswars", "comedy");
        Movie one = new Movie(25, "url11", "goverment", "comedy");

        manager.save(eleven);
        manager.save(ten);
        manager.save(nine);
        manager.save(eight);
        manager.save(seven);
        manager.save(six);
        manager.save(five);
        manager.save(four);
        manager.save(three);
        manager.save(two);
        manager.save(one);

        Movie[] expected = {one, two, three, four, five, six, seven, eight, nine, ten};
        Movie[] actual = manager.getLastFilm();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void getLastFilmIfLessThanTen() {
        MovieManager manager = new MovieManager();

        Movie six = new Movie(1, "url3", "born", "tragedy");
        Movie five = new Movie(2, "url1", "grown", "tragedy");
        Movie four = new Movie(3, "url2", "school", "tragedy");
        Movie three = new Movie(4, "url3", "university", "tragedy");
        Movie two = new Movie(5, "url1", "wedding", "tragedy");
        Movie one = new Movie(6, "url2", "devorse", "tragedy");

        manager.save(six);
        manager.save(five);
        manager.save(four);
        manager.save(three);
        manager.save(two);
        manager.save(one);

        Movie[] expected = {one, two, three, four, five, six};
        Movie[] actual = manager.getLastFilm();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void getLastFilmRandomAmount() {
        MovieManager manager = new MovieManager(8);
        Movie eleven = new Movie(1, "url1", "godzilla", "tragedy");
        Movie ten = new Movie(2, "url2", "godzilla2", "tragedy");
        Movie nine = new Movie(3, "url3", "godzilla3", "tragedy");
        Movie eight = new Movie(4, "url1", "godzillareturns", "tragedy");
        Movie seven = new Movie(5, "url2", "godzilla5", "tragedy");
        Movie six = new Movie(6, "url3", "HPandgodzilla", "comedy");
        Movie five = new Movie(7, "url1", "godzilla77", "horror");
        Movie four = new Movie(8, "url2", "godzilla1999", "horror");
        Movie three = new Movie(9, "url3", "godzillavista", "POV");
        Movie two = new Movie(10, "url1", "godzilla9", "horror");
        Movie one = new Movie(1, "url2", "godzilla11", "opera");

        manager.save(eleven);
        manager.save(ten);
        manager.save(nine);
        manager.save(eight);
        manager.save(seven);
        manager.save(six);
        manager.save(five);
        manager.save(four);
        manager.save(three);
        manager.save(two);
        manager.save(one);

        Movie[] expected = {one, two, three, four, five, six, seven, eight};
        Movie[] actual = manager.getLastFilm();

        assertArrayEquals(expected, actual);
    }
}