package me.dylanburton.blastarreborn.enemies;

import android.graphics.Bitmap;

import me.dylanburton.blastarreborn.spaceships.ShipType;

/**
 * Created by Dylan on 7/19/2017.
 */

public class Battlecruiser extends Enemy {
    private int RANDOM_DIRECTION_SPEED = 10000;

    public Battlecruiser(Bitmap shipBitmap, Bitmap btmHit, boolean isWorthEnemyDestroyedPoint) {
        //calls main Enemy constructor
        super(shipBitmap, btmHit, ShipType.BATTLECRUISER, isWorthEnemyDestroyedPoint);

    }

    @Override
    public int getRandomDirectionSpeed() {
        return RANDOM_DIRECTION_SPEED;

    }
}
