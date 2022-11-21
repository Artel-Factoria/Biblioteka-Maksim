class biblioteka {
    public static void main(String[] args) {
        Book carmilla =new Book("Carmilla", "Sheridan Le Fanu", 270);
        AudioBook dracula=new AudioBook("Dracula", "Bram Stoker", 3000);
        Ebook jeeves = new Ebook("Carry On Jeeves", "P.G. Wodehouse", 260, "PDF");
        System.out.println(jeeves.toString());
    }
}
