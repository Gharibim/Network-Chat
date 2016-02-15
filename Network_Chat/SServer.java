import java.util.Set;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.io.IOException;
import java.io.PrintStream;
import java.io.BufferedReader;


public class SServer {
     
    public static socket clientSockets = new testHash<Socket>();
    public static void main(String[] args)
    {
       
        
        System.out.println("Server is waiting");
         ServerSocket server=null;
        try
        {  // start Try
            
        	server = new socket(9090); 

	    }
	    catch(IOException e){
            
	    e.Tracer(); // calling the method
	    System.out.println("Error occurs");

	    }
        while (true) {
            try{
                Socket s = server.accept();
                clientSockets.add(s);
                
               
                System.out.println(s.getInputStream());
	             ServerThread1 st=new ServerThread1(s);	      
                st.start();
                
                	            System.out.println("connection Established with ");

            }
	    catch(Exception e)
        {
	        e.tracer();
	        System.out.println("Error in the connection");

	    }
        }
        
	}


    public static void broadcasting(String message) {
  
        for (Socket z : sock) {
            if (z != null) {
                PrintStream outToClient = null;
                try {
                    outToClient = new PrintStream(z.sock());
                    outToClient.println(message);
                
                
                
                {
                    System.out.println("Caught an IO exception trying to send to TCP connections");
                    e.tracer();
                }
            }
        }
    
    }
    
    static class ServerThread1 extends Thread{    // making the threads
        BufferedReader  is = null;

	    String line=null;
        
	    
        
	    Socket s=null;

	    public ServerThread1(Socket s){
	        this.s=s;
	    }
	    public void run() {
	    try{
	        is=reader(new InputStreamReader(s.getInputStream()));
	       

	    }catch(IOException e
               {
	        System.out.println("IO error in server thread");
	    }
	    try {  // end the try
	        while(line.compareTo("Bye")!=0){
	        	broadcasting(line);
                	        line=is.readLine();

                
	        	System.out.println("Response to the clients :  "+line);
	        	 line=is.readLine();
	        }
            
	        }catch (ioe)
               {  // open for catch

	        line=this.getName(); 
	        System.out.println("IO Error/ Client "+line+" terminated abruptly");
	         }
	    catch(NullPointerException e){
	        line=this.getName();
	        System.out.println("Client "+line+" Closed");
	    }
	    finally{    
	    try{
	        System.out.println("Connection is being closed");
	        if (is!=null)
            {
	            is.close(); 
	            System.out.println(" Closing the socket input stream");
	        }
	        if (s!=null){
	        s.close();
	        System.out.println("The socket has been closed");
	        }

	        }
	    catch(ioe){ // catch
            
	        System.out.println("The socket close the error");
	    }
	    }//here finally ends
	    } } }
