 a script to check whether a person is eligible to vote

echo "enter the age of a person"
read x
if [ $x -gt 18 ]
then 
	echo "eligible for vote"
else
	echo "not eligible for vote"
fi
