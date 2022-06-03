f2()
{
echo "ak $3 $4"
}
f1()
{
echo "hello $1 $2"
f2
return 5
#return 4

}

f1 abc pqr
r=$?
echo $r
echo "the return value is:$r"
 
