# Read from the file file.txt and output all valid phone numbers to stdout.
while IFS= read -r data; do
  if [[ $data =~ ^([0-9]{3}-[0-9]{3}-[0-9]{4}|\([0-9]{3}\)\ [0-9]{3}-[0-9]{4})$ ]]; then
    echo "$data"
  fi
done < file.txt
