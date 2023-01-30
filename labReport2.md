#Part 1#  
Using the code from the NumberServer, I was able to create StringServer. 
These are 2 instances of the successful search query: 

<img width="954" alt="Screen Shot 2023-01-29 at 11 31 07 PM" src="https://user-images.githubusercontent.com/122496000/215415838-513803f7-fedd-48da-b90d-c527682953c5.png">

<img width="581" alt="Screen Shot 2023-01-29 at 11 33 57 PM" src="https://user-images.githubusercontent.com/122496000/215415885-37ad2f48-f6fb-40ce-ac17-0b22f4573b0c.png">

And here is the code: 
`   int num = 0;
    ArrayList<String> arr = new ArrayList<String>();
    

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return String.format("Luke's Number: %d", num);
        } else if (url.getPath().equals("/increment")) {
            num += 1;
            return String.format("Number incremented!");
        } else {
            System.out.println("Path: " + url.getPath());
            if (url.getPath().contains("/add-message")) {
                String[] parameters = url.getQuery().split("=");
                if (parameters[0].equals("s")) {
                    arr.add(parameters[1]);
                    String list = "";
                    for(int i = 0; i < arr.size(); i++){
                        list += arr.get(i) + "\n";
                    }
                    return list;
                }
            }
            return "404 Not Found!";
        }
    }
}
`

#Part 2#  
An input that caused an error was
`
@Test
  public void testReverseInPlace2() {
    int[] input1 = {1,2,3,4,5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{5,4,3,2,1}, input1);
  }
` <br /> 
  
  An input that didn't induce a failure was
  `public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}`  <br/>
  The symptoms: 
  <img width="453" alt="Screen Shot 2023-01-29 at 11 50 50 PM" src="https://user-images.githubusercontent.com/122496000/215418453-4a5c1914-5327-45cf-9e11-36131334b76b.png">  
  
#The Code Before#  
`static void reverseInPlace(int[] arr) {
    
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = holder;
    }
  }`
  #The Code After#  
  `static void reverseInPlace(int[] arr) {
   
    for(int i = 0; i < arr.length/2; i += 1) {
      int holder = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = arr[i];
      arr[i] = holder;
    }
  }`  
For Reversed in place, we need a holder so that the value isn't removed/lost. 
Only half the values need to be switched, and the middle value stays the same, so we
only need half the array length for the loop. <br />

#Part 3#
I learned how to start my own webserver on my local device. I also learned how to interact with the url and create code to return inputs.  
Furthermore, with lab 3, I really got the hang of using Junit to test my code. 


