package com.surya.app.rest;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.surya.app.api.Flower;
import com.surya.domain.service.FlowerService;

@RunWith(MockitoJUnitRunner.class)
public class FlowerControllerUnitTest {

    @Mock
    private FlowerService flowerService;

    @InjectMocks
    private FlowerController flowerController;

    @Test
    public void isAFlower_withMockito_OK() {
        when(flowerService.analize(eq("violetta"))).thenReturn("Flower");

        String response = flowerController.isAFlower("violetta");

        Assert.assertEquals("Flower", response);
    }

    @Test
    public void isABigFlower_withMockito_OK() {
        when(flowerService.isABigFlower(eq("violetta"), anyInt())).thenReturn(true);

        Flower flower = new Flower("violetta", 15);

        Boolean response = flowerController.isABigFlower(flower);

        Assert.assertTrue(response);
    }
}
