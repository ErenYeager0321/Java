package T8_String_RegEx_Matching;
/*
1-	. 		Any single character 				c.t 		cat
2-	.* 		Zero or more of any character		a.*z 		amazingz
3-	.+ 		One or more of any character 		go.+d 		good
4-	\d 		Any digit (0-9) 					\d\d 		42
5-	\w 		Any word char (a-z,A-Z,0-9,_) 		\w\w\w 		abc
6-	\s 		Any whitespace (space,tab,newline) 	a\s+b 		a b
7-	^abc 	Must start with abc 				^abc 		abcdef
8-	xyz$ 	Must end with xyz 					xyz$ 		123xyz
9-	[abc] 	One character: a OR b OR c 			[abc] 		c
10-	[^abc] 	Any char except a, b, c  			[^abc] 		d
11- [a-z] 	Any lowercase letter    			[a-z] 		m
12	[A-Z] 	Any uppercase letter				[A-Z] 		K
13	[0-9] 	Any digit (same as \d) 				[0-9] 		7
14	{n} 	Exactly n occurrences 				a{3} 		aaa
15	{n,} 	At least n occurrences 				a{2,} 		aaaa
16	{n,m} 	Between n and m occurrences 		a{2,4} 		aaa
17	? 		Zero or one occurrence (optional) 	colou?r 	color / colour
18	+ 		One or more occurrences 			ba+ 		baa
19	* 		Zero or more occurrences 			ba* 		b / baaa
20	() 		Capturing group 					(ab)+ 		abab

*/
public class About {
	
}
