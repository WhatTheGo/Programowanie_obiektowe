public record Book(String title, String author, int yearOfPublication) {
    public String Describe(){
        return '"' + author + " - " +
                title + " (" + yearOfPublication + ")\"";
    }
}
