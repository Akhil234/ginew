#for i in 1 2 3 4 5
#do
#echo $i
#done

#break
for i in  `seq 1 100`
do
if [[ $i -eq 3 ]]
then
break
fi
echo $i
done

#continue
for i in  `seq 1 100`
do
if [[ $i -eq 3 ]]
then
continue
fi
echo $i
done

