package com.flippy25101.SkillTree;

import java.util.concurrent.atomic.AtomicInteger;

public class Exp {
    private final AtomicInteger exp = new AtomicInteger(0);

    public void setExp(int xp) {
        exp.set(xp);
    }

    public int getExp() {
        return exp.get();
    }

    // -------------------------------------------
    private static final Exp instance = new Exp();

    public static Exp getInstance() {
        return instance;
    }
}
