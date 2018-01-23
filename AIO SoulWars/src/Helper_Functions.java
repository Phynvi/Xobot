import xobot.script.wrappers.Area;

/**
 * Created by SRH on 1/22/2018.
 */

public class Helper_Functions {
    public enum State {
        GHOST,
        WALKING_TO_AVATAR,
        WALKING_TO_WEST_GRAVEYARD,
        WALKING_TO_EAST_GRAVEYARD,
        WALKING_TO_MIDDLE,
        FIGHTING,
        WALKING_TO_JELLIES,
        WALKING_TO_PYREFIENDS,
        COLLECTING_SHARDS,
        USING_SHARDS_ON_OBLISK
        //More states will probably need to be added.
    }

    public Area blueSpawnArea = new Area(0, 0, 0, 0);
    public Area redSpawnArea = new Area(0, 0, 0, 0);
    public Area eastGraveyardArea = new Area(0, 0, 0, 0);
    public Area westGraveyardArea = new Area(0, 0, 0, 0);
    public Area obliskArea = new Area(0, 0, 0, 0);
}
