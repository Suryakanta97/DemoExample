package com.surya.algorithms.minimax;

import org.junit.Before;
import org.junit.Test;

import com.surya.algorithms.minimax.MiniMax;
import com.surya.algorithms.minimax.Tree;

import static org.junit.Assert.*;

public class MinimaxUnitTest {
    private Tree gameTree;
    private MiniMax miniMax;

    @Before
    public void initMiniMaxUtility() {
        miniMax = new MiniMax();
    }

    @Test
    public void givenMiniMax_whenConstructTree_thenNotNullTree() {
        assertNull(gameTree);
        miniMax.constructTree(6);
        gameTree = miniMax.getTree();
        assertNotNull(gameTree);
    }

    @Test
    public void givenMiniMax_whenCheckWin_thenComputeOptimal() {
        miniMax.constructTree(6);
        boolean result = miniMax.checkWin();
        assertTrue(result);
        miniMax.constructTree(8);
        result = miniMax.checkWin();
        assertFalse(result);
    }
}
