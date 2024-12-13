public record Point2D(int x, int y) {
    public double distance(Point2D otherPoint) {
        return Math.sqrt(Math.pow(x - otherPoint.x, 2) + Math.pow(y - otherPoint.y, 2));
    }
}
