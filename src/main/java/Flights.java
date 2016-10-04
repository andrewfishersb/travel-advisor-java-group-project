public class Flights{
  private int price;
  private boolean direct;
  private int outBoundCarrierId;
  private int outBoundOriginId;
  private int outBoundDestinationId;
  private String outBoundDestinationDate;
  private String inBoundDestinationDate;
  private int inBoundCarrierId;
  private int inBoundOriginId;
  private int inBoundDestinationId;


  public Flights(int price, boolean direct){
    this.price = price;
    this.direct = direct;
  }

  public void setOutBoundDestinationInformation(int outBoundOriginId, int outBoundDestinationId, String outBoundDestinationDate){
    this.outBoundOriginId = outBoundOriginId;
    this.outboundPartialDate = outBoundDestinationId;
    this.outBoundDestinationDate = outBoundDestinationDate;
  }

  public void setOutBoundCarrierId(int outBoundCarrierId){
      this.outBoundCarrierId = outboundBoundCarrierId;
  }

  public void setInBoundDestinationInformation(int inBoundOriginId, int inBoundDestinationId, String inBoundDestinationDate){
    this.inBoundOriginId = inBoundOriginId;
    this.inboundPartialDate = inBoundDestinationId;
    this.inBoundDestinationDate = inBoundDestinationDate;
  }

  public void setInBoundCarrierId(int inBoundCarrierId){
      this.inBoundCarrierId = inBoundBoundCarrierId;
  }

  public int getOutBoundCarrierId(){
    return outBoundCarrierId;
  }
  public int getOutBoundOriginId(){
    return outBoundOriginId;
  }

  public int getOutBoundDestinationId(){
    return outBoundDestinationId;
  }

  public String getOutDestinationDate(){
    return outBoundDestinationDate;
  }


  public int getInBoundCarrierId(){
    return inBoundCarrierId;
  }
  public int getInBoundOriginId(){
    return inBoundOriginId;
  }

  public int getInBoundDestinationId(){
    return inBoundDestinationId;
  }

  public String getInDestinationDate(){
    return inBoundDestinationDate;
  }

}
