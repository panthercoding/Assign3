public class WordMixer{
  private String word1, word2, mixedWord;
  /* constructor method */
  public WordMixer(String w1, String w2){
    word1 = w1;
    word2 = w2;
    mixedWord = combineWords(w1,w2);
  }

  public String combineWords(String w1, String w2){
    /* to be implemented */
  }

  public String getNewWord(){
    return(mixedWord); /* accessor method */
  }
}