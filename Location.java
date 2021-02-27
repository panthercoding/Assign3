public class Location
{
  private String country, province, city;

  /* Precondition: locationText is of the form country/province/city */ 
  public Location(String locationText){
    int firstSlash = locationText.indexOf("/");
    int secondSlash = locationText.indexOf("/",firstSlash+1);
    
    country = locationText.substring(/* to be finished */); 
    province = locationText.substring(/* to be finished */);
    city = locationText.substring(/* to be finished */);
  }

  /* public methods for accessing private variables */
  public String getCountry(){ /*returns String */
    return(country);
  }
  public String getProvince(){ /*returns String */
    return(province);
  }
  public String getCity(){ /*returns String */
    return(city);
  }

  /* printing out all geographic information */

  public void printAll(){
    System.out.println(country);
    System.out.println(province);
    System.out.println(city);
  }
}
