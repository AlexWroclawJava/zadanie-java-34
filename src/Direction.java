
public enum Direction {

    NORTH("północ"),
    EAST("wschód"),
    SOUTH("południe"),
    WEST("zachód");


    private String direction;

    public String getDirection() {
        return direction;
    }

    Direction(String direction) {
        this.direction = direction;
    }

}
