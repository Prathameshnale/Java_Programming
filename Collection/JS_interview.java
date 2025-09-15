var - functional scope, can be redeclared
let - block scope, cannot redeclared
const - block scope, cannot re-assigned

hoisting - declaring variable or function on the top of it's execution or before the execution.

==  loose equality  (value check only and before value checke try to convert into same data type
=== tight equality  (both value and data type check , no data converting


datatypes

primitive (immutable/cant be changed) - number (both integer and float)
			Bigint  ( used for extreme big value after the range of number type and appending at the end with letter 'n') e.g 268548646424268146846561655n;
			boolean
			String
			undefined    (declared but not initialized)
			null  (explicitly assigned no value)   
reference/non-primitive (mutable/can be changed)- Object (key value pair)
						 					e.g  let emp={
													name:"prathamesh",
													age:25
													};
						arrays -  array are the ordered collection of element of different datatype
						let color=[10,20.20,null,"black"];
							array methods - 1. color.length
											2. color.toString  (converting Object type array into String type array)
											3. color.join('_') (converting object type array into String type arrat with adding new character between each element
											4. color.pop()     (delete last element from array and return deleted element)
											5. color.push()    (add new element at the end of the array and returns new length)
											6. color.shift()    (delete first element form array and return deleted element)
											7. color.unshift()  (add new element at first in array and returns the new length of array
											8. color.concate(arr1,arr2)  (concate two or more array into single array)
											9. color.sort()   (sort the element in array by alphabates or by occurence until we don't provide acending or decending order method)
											10. color.reverse()  (reverse the original array)
											11. color.splice(3,2,111,222,333)   (it used to delete and add new element from array at the same time, and it       
											                                      returns the deleted elements)
											 e.g in above example 2 element will be deleted from color array from index 3 (index 3 included) and 111,222,333 will added
											      at the same place from element deleted.
										    12.color.slice()   it is used to divide the array but original array does not affected.
											 
						
						fucnctions -    fucntion in javascript are block of reusable code, treated as object, can be assigned to variable, can be return from another function

isNaN()  fucntion in js - 
					isNan() is javascript function which is basically used to to check given value is a number or not and return boolean value
					it will try to convert given value into number if possible and returns false if it is convertable into number otherwise return false
					e.g isNaN(4) - false
					    isNaN('3') - false   convert String to number
						isNaN('Three') - true 
					    isNaN(undefined) - true
						isNaN(null) - ture
						

typeOf() operator - used to determine datatype of the given value

ways of string declaration - 1. str = 'abc' (single quote)
                             2. str = "abc"  (double quote)
							 3. str = `abc 
							             xyz` (back tick or template litral)  it keep string as it is.
										
										
String interpulation  -  String interpulation is put variable with $ sign followed by {} inside String which has some value which will get after execution of String.
                         e.g  let boy = "Tom";
						          girl = "kiyara";
								  
								  str = `${boy} is a friend of ${girl}`;  

excape sequence character(\) =  backslash is used as excape sequence character, which excapes the real meaning of character present next to the backshlash.

                         e.g str = "i practice \"coding problems\" for interview";    
						 output  = i practice "coding problems for interview
						 
						 
String methods - 1. str.length  
			     2. str.toUpperCase()
				 3. str.toLowerCase()
				 4. str.slice()
				 5. str.trim()
				 6. str.replace()
				 7. str.concate()
				 
map() - map in js used to create new array with some operation/manipulate on elements in array.

		e.g 
		let arr = [10,20,30,40,50];

		let arr1= arr.map((a)=>{   
			return a+1;				//it will add 1 in each element in array
		})

		console.log("before = "+arr);
		console.log("after = "+arr1);
		
		output - 
		before = 10,20,30,40,50
        after = 11,21,31,41,51
		
		

filter()  - filter() method in js is basically used to filter the elements from the array by  
             applyed some condition/logic on it.
			 
			 e.g 
			 
			 arr = [1,5,98,65,32,45,75,62,15,23,45,51,23,21,82];

			let arr1 = arr.filter((element)=>{
				return element>=50;                 //it will returns element >= 50
			})

			console.log("before "+arr);
			console.log("after "+arr1);
			
			output - 
			
			before 1,5,98,65,32,45,75,62,15,23,45,51,23,21,82
		    after 98,65,75,62,51,82