package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User jozek = new Millenials("Jozef Nowak");
        User magda = new YGeneration("Magdalena Kowalska");
        User franek = new ZGeneration("Franciszek Brzęczydupa");
        //When
        String jozekLikeToUse = jozek.sharePost();
        System.out.println("Jozek używa " + jozekLikeToUse);
        String magdaLikeToUse = magda.sharePost();
        System.out.println("Magda używa " + magdaLikeToUse);
        String franekLikeToUse = franek.sharePost();
        System.out.println("Franek używa " + franekLikeToUse);
        //Then
        Assert.assertEquals("Facebooka", jozekLikeToUse);
        Assert.assertEquals("Twittera", magdaLikeToUse);
        Assert.assertEquals("Snapchata", franekLikeToUse);
    }
    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User jozek = new Millenials("Jozef Nowak");
        User magda = new YGeneration("Magdalena Kowalska");
        User franek = new ZGeneration("Franciszek Brzęczydupa");
        //When
        String jozekLikeToUse = jozek.sharePost();
        System.out.println("Jozek używa " + jozekLikeToUse);
        String magdaLikeToUse = magda.sharePost();
        System.out.println("Magda używa " + magdaLikeToUse);
        String franekLikeToUse = franek.sharePost();
        System.out.println("Franek używa " + franekLikeToUse);

        jozek.setSharingStrategy(new SnapchatPublisher());
        magda.setSharingStrategy(new FacebookPublisher());
        franek.setSharingStrategy(new TwitterPublisher());

        String jozekIsUsing = jozek.sharePost();
        System.out.println("Jozek teraz używa " + jozekIsUsing);
        String magdaIsUsing = magda.sharePost();
        System.out.println("Magda teraz używa " + magdaIsUsing);
        String franekIsUsing = franek.sharePost();
        System.out.println("Franek teraz używa " + franekIsUsing);

        //Then
        Assert.assertEquals("Snapchata", jozekIsUsing);
        Assert.assertEquals("Facebooka", magdaIsUsing);
        Assert.assertEquals("Twittera", franekIsUsing);

    }
}
