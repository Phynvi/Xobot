package nodes;

import xobot.script.util.Time;

/**
 * kekgod - ksoulwars.nodes.
 */
public class Idle extends Node {
    @Override
    public boolean validate() {
        return true;
    }

    @Override
    public void execute() {
        Time.sleep(50);

    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
