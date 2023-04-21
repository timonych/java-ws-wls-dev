package ru.alfabank.pc.uoks.pa.ws.soap;
import javax.jws.WebService;

@WebService(name="GreetingsPortType", serviceName="soap/GreetingsService")

public class GreetingsImpl {

  public String message(String message) {
  try {
    System.out.println("message is" + message);
  } catch (Exception exception) { exception.printStackTrace(); }
 
    return "The message sent is'" + message + "'";
  }
}