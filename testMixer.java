public class testMixer{
  public static void main(String[] args){

    /* two inputs from the command line */
    WordMixer M1 = new WordMixer(args[0],args[1]);
    System.out.println(M1.getNewWord());
  }
}