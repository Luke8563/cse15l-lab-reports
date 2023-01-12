# Week 1 Lab Report <br /> 

This report will be about how to log in to your course specific ieng6 account. <br />

## Step 1 <br />
You will need to find your account username. In order to do this, go [here](https://sdacs.ucsd.edu/~icc/index.php) and find your username.
You will need to set up your password, so follow the instructions [here: PASSWORD SETUP](https://docs.google.com/document/d/1hs7CyQeh-MdUfM9uv99i8tqfneos6Y8bDU0uhn1wqho/edit) <br />

## Step 2 <br />
Install VSCode through their website. [https://code.visualstudio.com/](https://code.visualstudio.com/)
When you open VSCode, it should look like this: <br /> ![image](https://user-images.githubusercontent.com/122496000/211947223-ef7e06db-b82d-4c76-a72a-07429868b147.png)
 <br />

Next, use [these instructions](https://stackoverflow.com/questions/42606837/how-do-i-use-bash-on-windows-from-the-visual-studio-code-integrated-terminal/50527994#50527994) to use git bash in VSCode. <br />

## Step 3 <br />
Open up a terminal in VSCode with Ctrl or Command + `, or use the Terminal → New Terminal menu option. 
In order to login, you should use the command > ssh cs15lwi23zz@ieng6.ucsd.edu <br /> 
but with zz as your own login. The terminal will ask if you want continue connecting, and type in "yes". 
You will be prompted to type in your password, and it will not show (For security purposes). Type it in blind and hope it works. <br />
A succesful login will look like this: <br />
![image](https://user-images.githubusercontent.com/122496000/211947313-988632ca-d213-401e-b470-997db24011e9.png)
 <br />
## Step 4 <br />
Finally, try some commands.
* cd ~
* cd
* ls -lat
* ls -a
* ls <directory> where <directory> is /home/linux/ieng6/cs15lwi23/cs15lwi23abc, where the abc is one of the other group members’ username
* cp /home/linux/ieng6/cs15lwi23/public/hello.txt ~/
* cat /home/linux/ieng6/cs15lwi23/public/hello.txt
<br />
I tried ls - lat, which looked like this. <br />
![image](https://user-images.githubusercontent.com/122496000/211947483-665e44b8-15ff-4f0d-ae66-468bf23bf969.png)
<br />

This concludes the lab report.
