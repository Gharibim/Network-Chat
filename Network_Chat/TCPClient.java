import java.io.*; 
import java.net.*; 
class TCPClient { 

    public static void main(String argv[]) throws Exception 
    { 
        String sentence; 
        String modifiedSentence; 

        BufferedReader inFromUser = 
          new BufferedReader(new InputStreamReader(System.in)); 

        Socket clientSocket = new Socket("server.First.ch-geni-net.instageni.rnet.missouri.edu", 4444); 

        DataOutputStream outToServer = 
          new DataOutputStream(clientSocket.getOutputStream()); 
        BufferedReader inFromServer = 
          new BufferedReader(new
          InputStreamReader(clientSocket.getInputStream())); 

        sentence = inFromUser.readLine(); 

        outToServer.writeBytes(sentence + '\n'); 

        modifiedSentence = inFromServer.readLine(); 

        System.out.println("Hello FROM SERVER: " + modifiedSentence); 

        clientSocket.close(); 
                   
    } 
} 