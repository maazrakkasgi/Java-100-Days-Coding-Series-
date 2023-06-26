/*A string is called boring if all the characters of the string are same.

You are given a string S of length N, consisting of lowercase english alphabets. Find the length of the longest boring substring of S which occurs more than once.

Note that if there is no boring substring which occurs more than once in S, the answer will be 00.

A substring is obtained by deleting some (possibly zero) elements from the beginning of the string and some (possibly zero) elements from the end of the string. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Day73{
 public static void main(String[] args) throws IOException {
 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 int n = Integer.parseInt(in.readLine());
 int m = 0, currLength = 0, longest = 0;
 char lastChar;
 char[] c;
 int[] charCounter;
 while (n > 0) {
 m = Integer.parseInt(in.readLine());
 c = in.readLine().trim().toCharArray();
 charCounter = new int[30];
 longest = 0;

 lastChar = c[0];
 currLength = 1;
 for (int i = 1; i < c.length; i++) {
 if (c[i] == lastChar) {
 currLength++;
 } else {
 if (currLength >= charCounter[lastChar - 'a']) {
 if (currLength > longest) {
 if (currLength > charCounter[lastChar - 'a'] + 1) {
 longest = currLength - 1;
 } else {
 longest = charCounter[lastChar - 'a'];
 }
 }
 charCounter[lastChar - 'a'] = currLength;
 }
 lastChar = c[i];
 currLength = 1;
 }

 if (i == (c.length - 1) && currLength > longest) {
 if (currLength == c.length) {
 longest = currLength - 1;
 } else if (currLength >= charCounter[lastChar - 'a']) {
 if (currLength > charCounter[lastChar - 'a'] + 1) {
 longest = currLength - 1;
 } else {

 longest = charCounter[lastChar - 'a'];
 }
 }
 }
 }
 System.out.println(longest);
 n--;
 }
 }
}