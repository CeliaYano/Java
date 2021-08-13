public class Main {

  public static void main(String[] args) {
      Book a = new Book(
              "The lord of the Rings",
              "J.R.R Tolkein",
              "Gregory Allen and Unwin",
              "Fnatasy");
      Poem b = new Poem(
              "The Iliad",
              "Homer",
              "Dactylic Hexameter");
      Poem c = new Poem("Captured Voices","Renne Sara",
              "Modern Rhetoric");


      Literature[] lits = new Literature[3];
      lits[0] = a;
      lits[1] = b;
      lits[2] = c;

      for(int i =0; i< lits.length; i++ ){
           lits[i].Print();
       }

      //a.Print();
      //b.Print();
  }
}
