# Read from the file file.txt and print its transposed content to stdout.
col=()

while IFS= read -r line
do
    i=1
    for word in $line
    do
        col[$i]="${col[$i]} $word"
        ((i++))
    done
done < file.txt

for line in "${col[@]}"
do
    echo $line
done
