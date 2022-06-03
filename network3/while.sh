x=5
while [ $x -gt 2 ]
do
  echo "Welcome $x times"
  x=$(( $x + 1 ))
done
