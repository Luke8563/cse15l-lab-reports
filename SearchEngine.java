import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    int num = 0;
    ArrayList <String> words = new ArrayList<String>();
    String list = "";

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return String.format("Luke's Empty List:");
        } else if (url.getPath().equals("/search")) {
            String[] parameters = url.getQuery().split("=");
            if(parameters[0].equals("s")){
                ArrayList<String> matches = new ArrayList<String>();
                for(int i= 0; i < words.size(); i++){
                    if(words.get(i).contains(parameters[1])){
                    matches.add(parameters[1]);
                }
            }
            return String.format("%d was found in the list!", parameters[1]);
            }
            return String.format("Word not found!");
        } else {
            System.out.println("Path: " + url.getPath());
            if (url.getPath().contains("/add")) {
                String[] parameters = url.getQuery().split("=");
                if(parameters[0].equals("s")){
                    words.add(parameters[1]);
                }
                
                return String.format("Words have been added!");
            }
            return "404 Not Found!";
        }
    }

    public void arrayString(){
        for(int i = 0; i < words.size(); i++){
            list = list + words.get(i);
        }
    }
}



class SearchEngine {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
