>> This project contains 4 methods i.e. encrypt() , decrypt() , calmodInv() , and main(). Uses of each method is given below.



<----------------------------Encryption part---------------------------------->

i) First we take two inputs i.e. multiplicative key and additive key , then we initialize a string named chiptext
ii) We make three arrays named array , chiparray and index, array stores alphabet in small case and chiparray contains alphabet in uppercase and index contains integer elements.
iii) We run our first for loop from i = 0 to i = array.length then we run our second for loop from j = 0 to j = input message's length,
     now if message's character matches with elements in array named array then we perform a calculation and put the output in array named index.
iv) Then we make another for loop outside the previous loop , and run it from j = 0 to j = index.length , then we make a string out of it by taking the help to chiparray for example
     chiptext = chiptext + Character.toString(chipArray[index[j]]) ;
v) Then we return the encrypted message.


<---------------------------------calmodInv------------------------------------>

i) Calculated multiplicative inverse .


<----------------------------Dencryption part---------------------------------->

i) First we take two inputs i.e. multiplicative key and additive key , then we initialize a string named chiptext
ii) We make three arrays named array , plainArray and index, plainArray stores alphabet in small case and array contains alphabet in uppercase and index contains integer elements.
iii) We run our first for loop from i = 0 to i = input message's length then we run our second for loop from j = 0 to j = array.length,
     now if message's character matches with elements in array named array then we perform a calculation in another method "calmodInv()" and put the output in array named index.
iv) Then we make another for loop outside the previous loop , and run it from j = 0 to j = index.length , then we make a string out of it by taking the help to plainArray for example
     plainText = plainText + Character.toString(plainArray[index[j]]);
v) Then we return the dencrypted message.

<------------------------------MAIN METHOD---------------------------------------->

i)main method takes choices for encryption or decryption and the message to be encrypted or decrypted then it cointains if else statements to direct the choices to respective method.


<-------------------------------------OUTPUT------------------------------------>
     <-----------------------------Encryption------------------->


Press 1 for ENCRYPTION , 2 for DECRYPTION :  1
Enter the message  :  hello

Enter multiplicative key :  7
Enter additive key :  2

ENCRYPTED message is : ZEBBW

    <--------------------------Decryption------------------------>

Enter the message  :  ZEBBW

Enter multiplicative key :  7
Enter additive key :  2

DECRYPTED message is : hello
