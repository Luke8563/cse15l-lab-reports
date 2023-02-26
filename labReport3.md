# Lab Report 3

## Different Commands using the `find ` command

Commands were found here: 
[https://www.redhat.com/sysadmin/linux-find-command](https://www.redhat.com/sysadmin/linux-find-command)  

[https://geekflare.com/linux-find-commands/](https://geekflare.com/linux-find-commands/)


1. using `find . -name`

a. `find . -name ch1.txt`

<img width="444" alt="Screen Shot 2023-02-25 at 4 39 52 PM" src="https://user-images.githubusercontent.com/122496000/221386288-83f8107c-30c5-4e4d-8349-7bbb12b6f374.png">


b. `find . -name ch2.txt`

<img width="419" alt="Screen Shot 2023-02-25 at 4 40 22 PM" src="https://user-images.githubusercontent.com/122496000/221386292-0a1318fe-6b37-4868-a481-0280d5bd4999.png">

Here, the command is finding the files in the directories that containt he name we're searching for. This is important for finding the locations of files that we know are there but can't find. 

2. Using `find . -type d`

a. `find . -type d` in docsearch
<img width="397" alt="Screen Shot 2023-02-25 at 5 06 10 PM" src="https://user-images.githubusercontent.com/122496000/221386894-e835dc68-864f-4b1b-b388-39fae1900c96.png">


b. 'find . -type d` in non-fiction
<img width="368" alt="Screen Shot 2023-02-25 at 5 06 44 PM" src="https://user-images.githubusercontent.com/122496000/221386899-611c2596-1157-42f9-b2bf-c8b1944bec32.png">

The command -type d returns all the directories in the current file that you are in. This is useful for knowing directory locations. 

3. Finding file names 

a. `find . -type f -name "*.txt" `
<img width="524" alt="Screen Shot 2023-02-25 at 5 37 56 PM" src="https://user-images.githubusercontent.com/122496000/221387709-d3048766-6166-4586-8c78-f3d4a4a7d91d.png">


b. `find . -type f -name "Hand*" `
<img width="497" alt="Screen Shot 2023-02-25 at 5 38 17 PM" src="https://user-images.githubusercontent.com/122496000/221387711-b72b3a5b-c408-4d62-b7b0-7c92d68d5510.png">


The command `-type f` for `find` returns files, and `-name` along with the search returns files with the search words in their name. This is useful for finding checking if certain files exist within a directory. 

4. Finding files containing certain text

a. `find . -type f -exec grep -l "Bahamas" {} \;  `
<img width="524" alt="Screen Shot 2023-02-25 at 5 37 56 PM" src="https://user-images.githubusercontent.com/122496000/221388078-5969487f-f5c2-4f25-9889-472cac2fa6b6.png">

b. `find . -type f -exec grep -l "Malaysia" {} \; `
<img width="497" alt="Screen Shot 2023-02-25 at 5 38 17 PM" src="https://user-images.githubusercontent.com/122496000/221388081-ec45b657-ee62-4fac-8062-d0b76fd03fbf.png">

Now that we know that `-type f` searches the files, we can use `-exec grep -l` to search through files with a certain text. `-l` returns only the file name. 
