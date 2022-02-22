package edu.bristol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IMDBRatingTest
{
    @Test
    public void testAverageRating()
    {
        float averageRating;
        IMDBRating rater = new IMDBRating();

        averageRating = rater.addNewRating(2);
        assertTrue(averageRating == 2.0, "Adding 1st rating: average should be 2.0");

        averageRating = rater.addNewRating(4);
        assertTrue(averageRating == 3.0, "Adding 2nd rating: average should be 3.0");

        // happy path tests
        averageRating = rater.addNewRating(6);
        assertTrue(averageRating == 4.0, "Adding 3rd rating: average should be 4.0");

        averageRating = rater.addNewRating(8);
        assertTrue(averageRating == 5.0, "Adding 4th rating: average should be 5.0");


        // unhappy tests
        averageRating = rater.addNewRating(-1);
        assertTrue(averageRating == 5.0, "Adding 5th rating: average should be 5.0");

        averageRating = rater.addNewRating(15);
        assertTrue(averageRating == 5.0, "Adding 6th rating: average should be 5.0");

    }

    @Test
    public void test_checkResultsContainS1Ep1() throws Exception{
        IMDBRating obj = new IMDBRating();
        assertTrue(obj.checkResultsContain("Private Ear"));
    }

    @Test
    public void test_checkResultsContainS1Ep2() throws Exception {
        IMDBRating obj = new IMDBRating();
        assertTrue(obj.checkResultsContain("Knock for Knock"));
    }

    @Test
    public void test_checkResultsContainS1Ep3() throws Exception {
        IMDBRating obj = new IMDBRating();
        assertTrue(obj.checkResultsContain("Higher Ground"));

    }

    @Test
    public void test_checkResultsContainS1Ep4() throws Exception {
        IMDBRating obj = new IMDBRating();
        assertTrue(obj.checkResultsContain("An Uncertain Circle"));

    }


    @Test
    public void test_checkResultsContainS1Ep5() throws Exception {
        IMDBRating obj = new IMDBRating();
        assertTrue(obj.checkResultsContain("Listen to Me"));

    }

    @Test
    public void test_checkResultsContainS1Ep6() throws Exception {
        IMDBRating obj = new IMDBRating();
        assertTrue(obj.checkResultsContain("Nine Tenths of the Law"));

    }

    @Test
    public void test_checkResultsContainS1Ep7() throws Exception {
        IMDBRating obj = new IMDBRating();
        assertTrue(obj.checkResultsContain("The Link-Up"));

    }

    @Test
    public void test_checkResultsContainS1Ep8() throws Exception {
        IMDBRating obj = new IMDBRating();
        assertTrue(obj.checkResultsContain("Stamp Duty"));

    }

    @Test
    public void test_checkResultsContainS1Ep9() throws Exception {
        IMDBRating obj = new IMDBRating();
        assertTrue(obj.checkResultsContain("Find the Lady"));

    }

    @Test
    public void test_checkResultsContainS1Ep10() throws Exception {
        IMDBRating obj = new IMDBRating();
        assertTrue(obj.checkResultsContain("The Partnership"));

    }

    @Test
    public void test_checkResultsContainS1Ep11() throws Exception {
        IMDBRating obj = new IMDBRating();
        assertTrue(obj.checkResultsContain("I’m a Believer"));

    }

    @Test
    public void test_checkResultsContainS2Ep1() throws Exception {
        IMDBRating obj = new IMDBRating();
        assertTrue(obj.checkResultsContain("Room with a View"));

    }

    @Test
    public void test_checkResultsContainS2Ep2() throws Exception {
        IMDBRating obj = new IMDBRating();
        assertTrue(obj.checkResultsContain("The Teddy Bears’ Nightmare"));

    }

    @Test
    public void test_checkResultsContainS2Ep3() throws Exception {
        IMDBRating obj = new IMDBRating();
        assertTrue(obj.checkResultsContain("Mocking Bird"));

    }

    @Test
    public void test_checkResultsContainS2Ep4() throws Exception {
        IMDBRating obj = new IMDBRating();
        assertTrue(obj.checkResultsContain("The Mayfly Dance"));

    }

    @Test
    public void test_checkResultsContainS2Ep5() throws Exception {
        IMDBRating obj = new IMDBRating();
        assertTrue(obj.checkResultsContain("The Farmer Had a Wife"));

    }

    @Test
    public void test_checkResultsContainS2Ep6() throws Exception {
        IMDBRating obj = new IMDBRating();
        assertTrue(obj.checkResultsContain("Utmost Good Faith"));

    }

    @Test
    public void test_checkResultsContainS2Ep7() throws Exception {
        IMDBRating obj = new IMDBRating();
        assertTrue(obj.checkResultsContain("Looking for Mr Wright"));

    }

    @Test
    public void test_checkResultsContainS2Ep8() throws Exception {
        IMDBRating obj = new IMDBRating();
        assertTrue(obj.checkResultsContain("Another Man’s Castle"));


    }

    @Test
    public void test_checkResultsContainS2Ep9() throws Exception {
        IMDBRating obj = new IMDBRating();
        assertTrue(obj.checkResultsContain("Where Was I?"));

    }

    @Test
    public void test_checkResultsContainS2Ep10() throws Exception {
        IMDBRating obj = new IMDBRating();
        assertTrue(obj.checkResultsContain("The Dangerous Game"));
    }
}
