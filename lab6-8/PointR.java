public record PointR(int x, int y) {
    public PointC konwertujDoPointC(){
        return new PointC(x,y);
    }
}
