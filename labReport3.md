# Lab Report 3

## Different Commands using grep

1. using grep to find a word

`grep the ch1.txt`
<img width="683" alt="Screen Shot 2023-02-13 at 6 03 34 PM" src="https://user-images.githubusercontent.com/122496000/218619939-fe8c513f-7666-436b-a8e9-aaf661b01840.png">

`grep processes ch2.txt`

<img width="540" alt="Screen Shot 2023-02-13 at 6 06 45 PM" src="https://user-images.githubusercontent.com/122496000/218620383-4ad591f5-a5c5-4b9a-8d70-586cc10450e1.png">

grep finds and returns any lines in ch1 or ch2 that contain the word "the" and "processes". This is useful for finding specific keywords in files.

2. Multiple Files:
`grep processes *.txt`
<img width="666" alt="Screen Shot 2023-02-13 at 6 09 40 PM" src="https://user-images.githubusercontent.com/122496000/218620712-0916a43a-bb63-46c2-9e8b-a147748994e2.png">

`grep everywhere ch1.txt ch2.txt ch3.txt`

<img width="603" alt="Screen Shot 2023-02-13 at 6 08 23 PM" src="https://user-images.githubusercontent.com/122496000/218620546-d17dcff6-803f-4a31-8d48-4ad15c76b1c1.png">

This does the same thing as grep, but is very useful for sorting through multiple files at once. 

3. using grep to find whole words only

`grep -w processes *.txt`
<img width="618" alt="Screen Shot 2023-02-13 at 6 13 15 PM" src="https://user-images.githubusercontent.com/122496000/218621337-b47dd998-d3e1-4e87-bb8b-97bb195d806f.png">
`grep -w textiles ch1.txt`

<img width="684" alt="Screen Shot 2023-02-13 at 6 17 11 PM" src="https://user-images.githubusercontent.com/122496000/218621748-f7010d6d-5c67-4634-a0bb-eb785efe187f.png">

The -w command finds whole word matches. This is useful for telling whether or not the words you were searching for were actually in the file. 

4. inverse grep search

`grep -v the *`

<img width="676" alt="Screen Shot 2023-02-13 at 6 20 17 PM" src="https://user-images.githubusercontent.com/122496000/218622159-d5d784d3-95c5-4a9b-8366-64b3bcceed0b.png">

`grep -v processes *`

<img width="683" alt="Screen Shot 2023-02-13 at 6 21 03 PM" src="https://user-images.githubusercontent.com/122496000/218622256-143b1e70-33e1-4c62-a73f-5e3d451ac4f8.png">

-v is the inverse search, which finds files that don't have the word you are searching for. This is useful when you don't want a word to pop up in a search. 
