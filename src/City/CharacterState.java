package City;

public class CharacterState {
    private int hubState;
    private int forestState;
    private int blackSmithState;

    public CharacterState(int hubState, int forestState, int blackSmithState) {
        this.hubState = hubState;
        this.forestState = forestState;
        this.blackSmithState = blackSmithState;
    }

    public int getBlackSmithState() {
        return blackSmithState;
    }

    public void setBlackSmithState(int blackSmithState) {
        this.blackSmithState = blackSmithState;
    }

    public int getHubState() {
        return hubState;
    }

    public void setHubState(int hubState) {
        this.hubState = hubState;
    }

    public int getForestState() {
        return forestState;
    }

    public void setForestState(int forestState) {
        this.forestState = forestState;
    }


}
